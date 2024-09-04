package pe.gob.pj.rnc.service;

import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.EntidadExternaDAO;
import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.EntidadExternaExample;

import com.ibatis.dao.client.DaoManager;

public class EntidadExternaManager {

	private DaoManager daoManager;
	private EntidadExternaDAO entidadExternaDAO;

	public EntidadExternaManager() {
		daoManager = DAOConfiguration.getDaoManager();
		entidadExternaDAO = (EntidadExternaDAO) daoManager.getDao(EntidadExternaDAO.class);
	}

	public EntidadExterna selectEntidadExternaByPrimaryKey(Integer idEntidadExterna) {
		return entidadExternaDAO.selectByPrimaryKey(idEntidadExterna);
	}

	public List<EntidadExterna> selectEntidadesExternas() {
		EntidadExternaExample muestra = new EntidadExternaExample();
		muestra.createCriteria().andINDC_ACTIVOEqualTo("A");
		muestra.setOrderByClause("DESC_ENTIDAD_EXTERNA");
		return entidadExternaDAO.selectByExample(muestra);
	}

	public List<EntidadExterna> selectEntExtPorCodigoDistrito(String codDistritoJudicial) {
		EntidadExternaExample muestra = new EntidadExternaExample();
		muestra.createCriteria().andINDC_ACTIVOEqualTo("A").andCODG_DISTRITO_JUDICIALEqualTo(codDistritoJudicial);
		muestra.setOrderByClause("DESC_ENTIDAD_EXTERNA");
		return entidadExternaDAO.selectByExample(muestra);
	}
	
	public List<EntidadExterna> consultarEntidades(Integer codgEntidadExterna) {
		EntidadExterna key = new EntidadExterna();
		key.setCODG_ENTIDAD_EXTERNA(codgEntidadExterna);
		key.setINDC_ACTIVO("A");
		return entidadExternaDAO.consultarEntidades(key);
	}
}
