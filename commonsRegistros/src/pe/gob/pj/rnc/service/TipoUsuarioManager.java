package pe.gob.pj.rnc.service;

import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.TipoUsuarioDAO;
import pe.gob.pj.rnc.model.TipoUsuario;
import pe.gob.pj.rnc.model.TipoUsuarioExample;

import com.ibatis.dao.client.DaoManager;

public class TipoUsuarioManager {

	private DaoManager daoManager;
	private TipoUsuarioDAO tipoUsuarioDAO;

	public TipoUsuarioManager() {
		daoManager = DAOConfiguration.getDaoManager();
		tipoUsuarioDAO = (TipoUsuarioDAO) daoManager.getDao(TipoUsuarioDAO.class);
	}

	public List<TipoUsuario> selectTipoUsuario() {
		TipoUsuarioExample example = new TipoUsuarioExample();
		return tipoUsuarioDAO.selectByExample(example);
	}

}
