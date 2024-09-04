// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   SolicitudExternaDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import java.util.Map;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.criterio.CriterioListarSolicitudExterna;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.SolicitudExternaExample;
import pe.gob.pj.rnc.model.SolicitudExternaReporte;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            SolicitudExternaDAO

public class SolicitudExternaDAOImpl extends SqlMapDaoTemplate
    implements SolicitudExternaDAO
{

    public SolicitudExternaDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public Integer insert(SolicitudExterna record)
    {
        Object newKey = insert("SOLICITUD_EXTERNA.abatorgenerated_insert", record);
        return (Integer)newKey;
    }

    public int updateByPrimaryKey(SolicitudExterna record)
    {
        int rows = update("SOLICITUD_EXTERNA.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(SolicitudExterna record)
    {
        int rows = update("SOLICITUD_EXTERNA.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List<SolicitudExterna> selectByExample(SolicitudExternaExample example)
    {
        List<SolicitudExterna> list = queryForList("SOLICITUD_EXTERNA.abatorgenerated_selectByExample", example);
        return list;
    }

    public SolicitudExterna selectByPrimaryKey(Integer CODG_CERTI_EXTERNO)
    {
        SolicitudExterna key = new SolicitudExterna();
        key.setCODG_CERTI_EXTERNO(CODG_CERTI_EXTERNO);
        SolicitudExterna record = (SolicitudExterna)queryForObject("SOLICITUD_EXTERNA.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(SolicitudExternaExample example)
    {
        int rows = delete("SOLICITUD_EXTERNA.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer CODG_CERTI_EXTERNO)
    {
        SolicitudExterna key = new SolicitudExterna();
        key.setCODG_CERTI_EXTERNO(CODG_CERTI_EXTERNO);
        int rows = delete("SOLICITUD_EXTERNA.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

	@Override
	public List<SolicitudExterna> seleccionarSolicitudes(CriterioListarSolicitudExterna criterio) {
		return queryForList("SOLICITUD_EXTERNA.seleccionarSolicitudes", criterio);
	}

	public List<SolicitudExternaReporte> reporteSolicitudExterna(Map<String, Object> params) {
		return queryForList("SOLICITUD_EXTERNA.reporteSolicitudExterna", params);
	}

	@Override
	public List<SolicitudExterna> getSolicitudByNombreUsuarioFecha(Solicitud solicitud) {
		List<SolicitudExterna> list = queryForList("SOLICITUD_EXTERNA.buscarSolicitudPorNombreUsuarioFecha", solicitud);
        return list;
	}

	@Override
	public List<SolicitudExterna> consultarSolicitudesExternas(CriterioListarSolicitud criterio) {
		return queryForList("SOLICITUD_EXTERNA.consultarSolicitudesExternas", criterio);
	}
	
}
