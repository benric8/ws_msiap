package pe.gob.pj.rnc.service;

import java.util.List;

import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.TipoDocumentoIdentidadDAO;
import pe.gob.pj.rnc.model.TipoDocumentoAutorizacion;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidad;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidadExample;

import com.ibatis.dao.client.DaoManager;

public class TipoDocumentoIdentidadManager {

	private DaoManager daoManager;
	private TipoDocumentoIdentidadDAO documentoDAO;

	public TipoDocumentoIdentidadManager() {
		daoManager = DAOConfiguration.getDaoManager();
		documentoDAO = (TipoDocumentoIdentidadDAO) daoManager.getDao(TipoDocumentoIdentidadDAO.class);
	}


	public List<TipoDocumentoIdentidad> getTiposDocumento() {
		TipoDocumentoIdentidadExample muestra = new TipoDocumentoIdentidadExample();
		muestra.createCriteria().andINDC_CONVENIOEqualTo("S");

		return documentoDAO.selectByExample(muestra);
	}
	
	public List<TipoDocumentoAutorizacion> getTiposDocumentoAutorizacion(){
		return documentoDAO.getTiposDocumentoAutorizacion();
	}

}
