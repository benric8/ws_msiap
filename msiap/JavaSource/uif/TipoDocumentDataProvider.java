/*
 * TipoDocumentDataProvider.java
 *
 * Created on May 22, 2007, 1:25 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidad;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.TipoDocumentoIdentidadManager;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class TipoDocumentDataProvider extends ObjectListDataProvider{


    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<TipoDocumentoIdentidad> lista = new ArrayList<TipoDocumentoIdentidad>();

    /** Creates a new instance of TipoDocumentDataProvider */
//    @SuppressWarnings("unchecked")
	public TipoDocumentDataProvider() {
    	this.lista.clear();
    }

    @SuppressWarnings("unchecked")
	public void refreshProvider( Usuario usuario) throws SQLException, NamingException{
    	this.lista.clear();
    	TipoDocumentoIdentidadManager servicioTipoDoc = new TipoDocumentoIdentidadManager();

		if (usuario.isPerfilOperadorJudicial() || usuario.isPerfilSupervisorJudicial()){
			TipoDocumentoIdentidad tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
			tipoDocumentoIdentidad.setCodigo_tipo_documento("0001");
			tipoDocumentoIdentidad.setDescripcion("SIN DOCUMENTACION");
	    	this.lista.add(tipoDocumentoIdentidad);
		}

		ArrayList<TipoDocumentoIdentidad> listado = new ArrayList<TipoDocumentoIdentidad>();
		
		/*if(Constantes.ENTIDAD_MINEDU_CODIGO_DJ.equals(usuario.getCODG_DISTRITO_JUDICIAL())) {
			TipoDocumentoIdentidad td = new TipoDocumentoIdentidad();
			td.setCodigo_tipo_documento(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI);
			td.setDescripcion("DNI - DOCUMENTO NACIONAL DE IDENTIDAD");
			this.lista.add(td);
		}else {
			listado = (ArrayList<TipoDocumentoIdentidad>) servicioTipoDoc.getTiposDocumento();
		}*/	
		listado = (ArrayList<TipoDocumentoIdentidad>) servicioTipoDoc.getTiposDocumento();

        if (!(listado == null || listado.isEmpty()))
            this.lista.addAll(listado);
         
        this.setList(lista);
    }

}
