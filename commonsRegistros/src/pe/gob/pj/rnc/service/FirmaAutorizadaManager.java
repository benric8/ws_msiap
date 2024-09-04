package pe.gob.pj.rnc.service;

import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.FirmaAutorizadaDAO;
import pe.gob.pj.rnc.model.FirmaAutorizada;
import pe.gob.pj.rnc.model.FirmaAutorizadaExample;
import pe.gob.pj.rnc.tipo.Lista;

import com.ibatis.dao.client.DaoManager;

public class FirmaAutorizadaManager {

	private DaoManager daoManager;
	private FirmaAutorizadaDAO firmaDAO;

	public FirmaAutorizadaManager() {
		daoManager = DAOConfiguration.getDaoManager();
		firmaDAO = (FirmaAutorizadaDAO) daoManager.getDao(FirmaAutorizadaDAO.class);
	}

	public FirmaAutorizada selectJefeRnc() {
		FirmaAutorizadaExample muestra = new FirmaAutorizadaExample();
		muestra.createCriteria().andINDC_JEFE_RNCEqualTo("S").andINDC_ACTIVOEqualTo("S");
		muestra.setOrderByClause("NUMR_ORDEN");

		List<FirmaAutorizada> lista = firmaDAO.selectByExample(muestra);

		if(Lista.contieneAlgo(lista))
			return lista.get(0);
		else
			return null;
	}

}
