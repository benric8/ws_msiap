// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   SolicitudDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.model.BoletinReporte;
import pe.gob.pj.rnc.model.DelitoReporte;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExample;
import pe.gob.pj.rnc.model.SolicitudReporte;

public class SolicitudDAOImpl extends SqlMapDaoTemplate
    implements SolicitudDAO
{

    public SolicitudDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(Solicitud record)
    {
        insert("SOLICITUDES_PROVINCIA.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(Solicitud record)
    {
        int rows = update("SOLICITUDES_PROVINCIA.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(Solicitud record)
    {
        int rows = update("SOLICITUDES_PROVINCIA.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List<Solicitud> selectByExample(SolicitudExample example)
    {
        List<Solicitud> list = queryForList("SOLICITUDES_PROVINCIA.abatorgenerated_selectByExample", example);
        return list;
    }

    public Solicitud selectByPrimaryKey(String CODG_CERTI)
    {
        Solicitud key = new Solicitud();
        key.setCODG_CERTI(CODG_CERTI);
        Solicitud record = (Solicitud)queryForObject("SOLICITUDES_PROVINCIA.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(SolicitudExample example)
    {
        int rows = delete("SOLICITUDES_PROVINCIA.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_CERTI)
    {
        Solicitud key = new Solicitud();
        key.setCODG_CERTI(CODG_CERTI);
        int rows = delete("SOLICITUDES_PROVINCIA.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    public int updateByPrimaryCertificadoExterno(Map map)
    {
        int rows = update("SOLICITUDES_PROVINCIA.usergenerated_updateByPrimaryKeySolicitudesProvincia", map);
        return rows;
    }

    public int updateByPrimarySolicitud(Map map)
    {
        int rows = update("SOLICITUDES_PROVINCIA.usergenerated_updateByPrimaryKeySoli", map);
        return rows;
    }

    //Inicio erodriguezbu
//    public String getPkAlternativo(String codg_certi) throws SQLException{
//    	Connection coneccion = this.getSqlMapTransactionManager().getDataSource().getConnection();
//		String codigoAlternativo;
//
//		CallableStatement procedimiento = coneccion.prepareCall("{call uspc_get_cod_alternativo(?,?)}");
//		procedimiento.setString(1, codg_certi);
//		procedimiento.registerOutParameter(2, java.sql.Types.VARCHAR);
//		procedimiento.execute();
//		codigoAlternativo = procedimiento.getString(2);
//		procedimiento.close();
//
//		return codigoAlternativo;
//	}

    public int updateByPrimaryKeySolicitudSelective(Map map) throws SQLException{
        int rows = update("SOLICITUDES_PROVINCIA.updateByPrimaryKeySolicitudSelective", map);
        return rows;
    }

    public List<Solicitud> getSolicitudesPorCertifExt(Integer codCertificado)
    {
        List<Solicitud> list = queryForList("SOLICITUDES_PROVINCIA.solicitudesPorCertifExt", codCertificado);
        return list;
    }

    public List<SolicitudReporte> reporteSolicitudMagistrado(String codCertificado)
    {
        //List<SolicitudReporte> list = queryForList("SOLICITUDES_PROVINCIA.reporteSolicitudMagistrado", codCertificado);
    	List<SolicitudReporte> lista = queryForList("SOLICITUDES_PROVINCIA.reporteSolicitudMagistradoCab", codCertificado);
    	List<BoletinReporte> condenas = null;
    	if(lista!=null && lista.size()>0) {
    		condenas = queryForList("SOLICITUDES_PROVINCIA.reporteSolicitudMagistradoDet", codCertificado);
    		lista.get(0).setBoletinAntecedentes(condenas);
    	}
        return lista;
    }

    public List<DelitoReporte> delitosPorBoletin(Integer boletin)
    {
        List<DelitoReporte> list = queryForList("SOLICITUDES_PROVINCIA.delitosPorBoletin", boletin);
        return list;
    }

	@Override
	public List<SolicitudReporte> reporteSolicitudMagistrado(Map<String, Object> params) {
		//List<SolicitudReporte> list = queryForList("SOLICITUDES_PROVINCIA.reporteSolicitudMagistradoParams", params);
		List<SolicitudReporte> lista = queryForList("SOLICITUDES_PROVINCIA.reporteSolicitudMagistradoBusq", params);
    	List<BoletinReporte> condenas = null;
    	if(lista!=null && lista.size()>0) {
    		String codCertificado = (String) lista.get(0).getCodg_certi();
    		condenas = queryForList("SOLICITUDES_PROVINCIA.reporteSolicitudMagistradoDet", codCertificado);
    		lista.get(0).setBoletinAntecedentes(condenas);
    	}
        return lista;
	}

	@Override
	public List<SolicitudReporte> reporteSolicitudesRangoFechas(Map<String, Object> params) {
		List<SolicitudReporte> list = queryForList("SOLICITUDES_PROVINCIA.reporteSolicitudesRangoFechas", params);
        return list;
	}

	@Override
	public List<Solicitud>  getSolicitudByNombreUsuarioFecha(Solicitud solicitud) {
		List<Solicitud> list = queryForList("SOLICITUDES_PROVINCIA.buscarSolicitudPorNombreUsuarioFecha", solicitud);
        return list;
	} 
	
	@Override
    public List<Solicitud> consultarSolicitudesInternas(CriterioListarSolicitud criterio){
        List<Solicitud> list = queryForList("SOLICITUDES_PROVINCIA.consultarSolicitudesInternas", criterio);
        return list;
    }
}
