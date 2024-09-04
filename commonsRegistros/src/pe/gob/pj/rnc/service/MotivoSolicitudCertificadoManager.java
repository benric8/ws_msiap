package pe.gob.pj.rnc.service;

import java.util.ArrayList;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.MotivoSolicitudCertificadoDAO;
import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificado;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificadoExample;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.TipoSolicitud;
import pe.gob.pj.rnc.tipo.Lista;

import com.ibatis.dao.client.DaoManager;

public class MotivoSolicitudCertificadoManager {
	private DaoManager daoManager;
	private MotivoSolicitudCertificadoDAO motivoSolicitudCertificadoDAO;

	public MotivoSolicitudCertificadoManager() {
		daoManager = DAOConfiguration.getDaoManager();
		motivoSolicitudCertificadoDAO = (MotivoSolicitudCertificadoDAO) daoManager
				.getDao(MotivoSolicitudCertificadoDAO.class);
	}

	public MotivoSolicitudCertificado selectMotivoSolicitudCertificado(String codigo_del_motivo) {
		return motivoSolicitudCertificadoDAO.selectByPrimaryKey(codigo_del_motivo);
	}

	public String obtenerCodgEntidadesExternas(String TipoSolicitud) {
		String rst = "";
		MotivoSolicitudCertificadoExample example = new MotivoSolicitudCertificadoExample();
		example.createCriteria().andCodigo_tipo_de_solicitudEqualTo(
				TipoSolicitud);
		@SuppressWarnings("unchecked")
		ArrayList<MotivoSolicitudCertificado> ls = (ArrayList<MotivoSolicitudCertificado>) motivoSolicitudCertificadoDAO
				.selectByExample(example);
		if (Lista.contieneAlgo(ls))
			for (MotivoSolicitudCertificado msc : ls) {
				rst += msc.getCODG_ENTIDADES_EXTERNAS() + ";";
			}
		return rst;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<MotivoSolicitudCertificado> getMotivosSolicitud(String perfil, EntidadExterna entidadExterna) {
		MotivoSolicitudCertificadoExample muestra = new MotivoSolicitudCertificadoExample();

		ArrayList<MotivoSolicitudCertificado> lista = new ArrayList<MotivoSolicitudCertificado>();
				
		if (Perfil.OPERADOR_JUDICIAL_ID.equals(perfil) || Perfil.SUPERVISOR_JUDICIAL_ID.equals(perfil)
				|| Perfil.MPFN_FISCAL.equals(perfil)) {//Se añade Fiscales a tipo de solicitudes jurisdiccionales
			muestra.createCriteria().andCodigo_tipo_de_solicitudEqualTo(TipoSolicitud.JURISDICCIONAL).andl_activo("S");
			lista = (ArrayList<MotivoSolicitudCertificado>) motivoSolicitudCertificadoDAO.selectByExample(muestra);
		} else {
			if(entidadExterna!=null){
				if(entidadExterna.isConsulado())
					muestra.createCriteria().andCODG_ENTIDADES_EXTERNASEqualTo(String.valueOf(EntidadExterna.MINISTERIO_RELACIONES_EXTERIORES_ID)).andl_activo("S");
				else
					//muestra.createCriteria().andCodigo_del_motivoEqualTo(entidadExterna.getCODG_MOTIVO_DEFECTO()).andl_activo("S");
					muestra.createCriteria().andCODG_ENTIDADES_EXTERNASEqualTo(String.valueOf(entidadExterna.getCODG_ENTIDAD_EXTERNA())).andl_activo("S");
				
				lista = (ArrayList<MotivoSolicitudCertificado>) motivoSolicitudCertificadoDAO.selectByExample(muestra);				
				
			}
		}

		return lista;
	}
}
