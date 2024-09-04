package pe.gob.pj.rnc.service;

import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.SolicitudExternaAuditoriaDAO;
import pe.gob.pj.rnc.model.SolicitudExternaAuditoria;
import pe.gob.pj.rnc.model.SolicitudExternaAuditoriaExample;

import com.ibatis.dao.client.DaoManager;

public class SolicitudExternaAuditoriaManager {

	private DaoManager daoManager;
	private SolicitudExternaAuditoriaDAO auditoriaDAO;

	public SolicitudExternaAuditoriaManager() {
		daoManager = DAOConfiguration.getDaoManager();
		auditoriaDAO = (SolicitudExternaAuditoriaDAO) daoManager.getDao(SolicitudExternaAuditoriaDAO.class);
	}

	public List<SolicitudExternaAuditoria> selectAuditoria(Integer codigo) {
		SolicitudExternaAuditoriaExample muestra = new SolicitudExternaAuditoriaExample();
		muestra.createCriteria().andCODG_CERTI_EXTERNOEqualTo(codigo);
		muestra.setOrderByClause("CODG_CORRELATIVO");
		return auditoriaDAO.selectByExample(muestra);
	}

}
