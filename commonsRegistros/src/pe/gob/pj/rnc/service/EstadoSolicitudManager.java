package pe.gob.pj.rnc.service;

import java.util.ArrayList;
import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.EstadoSolicitudCertificadoDAO;
import pe.gob.pj.rnc.model.EstadoSolicitudCertificado;
import pe.gob.pj.rnc.model.EstadoSolicitudCertificadoExample;

import com.ibatis.dao.client.DaoManager;

public class EstadoSolicitudManager {

	private DaoManager daoManager;
	private EstadoSolicitudCertificadoDAO estadoSolicitudDAO;

	public EstadoSolicitudManager() {
		daoManager = DAOConfiguration.getDaoManager();
		estadoSolicitudDAO = (EstadoSolicitudCertificadoDAO) daoManager.getDao(EstadoSolicitudCertificadoDAO.class);
	}

	public ArrayList<EstadoSolicitudCertificado> getEstadosSolicitud(List<String> estados) {
		EstadoSolicitudCertificadoExample muestra = new EstadoSolicitudCertificadoExample();
		muestra.createCriteria().andCODG_ESTADOIn(estados);
		muestra.setOrderByClause("DESC_ESTADO");

		ArrayList<EstadoSolicitudCertificado> lista = (ArrayList<EstadoSolicitudCertificado>) estadoSolicitudDAO.selectByExample(muestra);
		return lista;
	}

	public ArrayList<EstadoSolicitudCertificado> getEstadosSolicitudTotal(List<String> estados) {
		EstadoSolicitudCertificadoExample muestra = new EstadoSolicitudCertificadoExample();
		muestra.createCriteria().andDESC_ESTADONotIn(estados);
		muestra.setOrderByClause("DESC_ESTADO");

		ArrayList<EstadoSolicitudCertificado> lista = (ArrayList<EstadoSolicitudCertificado>) estadoSolicitudDAO.selectByExample(muestra);
		return lista;
	}
}
