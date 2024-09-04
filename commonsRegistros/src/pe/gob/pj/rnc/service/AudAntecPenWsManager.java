package pe.gob.pj.rnc.service;

import java.sql.Connection;

import pe.gob.pj.rnc.dao.AudAntecPenWsDAO;
import pe.gob.pj.rnc.dao.AudAntecPenWsDAOImpl;
//import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.model.AudAntecPenWs;

public class AudAntecPenWsManager {
	//private DaoManager daoManager;
	private AudAntecPenWsDAO antecPenWsDAO;

	public AudAntecPenWsManager() {
		/*daoManager = DAOConfiguration.getDaoManager();
		antecPenWsDAO = (AudAntecPenWsDAO) daoManager
				.getDao(AudAntecPenWsDAO.class);*/
	}
	public void insert(Connection coneccion, AudAntecPenWs audAntecPenWs) {
		antecPenWsDAO = new AudAntecPenWsDAOImpl();
		antecPenWsDAO.insert(coneccion, audAntecPenWs);
	}
}
