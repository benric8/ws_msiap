/*
 * TipoUsuarioDataProvider.java
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
import pe.gob.pj.rnc.model.TipoUsuario;
import pe.gob.pj.rnc.service.TipoUsuarioManager;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class TipoUsuarioDataProvider extends ObjectListDataProvider{


    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<TipoUsuario> lista = new ArrayList<TipoUsuario>();


    /** Creates a new instance of TipoUsuarioDataProvider */
//    @SuppressWarnings("unchecked")
	public TipoUsuarioDataProvider() {

    	this.lista.add(new TipoUsuario());
		this.setList(this.lista);
    }

	public void refreshProvider() throws SQLException, NamingException{
        TipoUsuarioManager servicioTipoUsuario = new TipoUsuarioManager();
        ArrayList<TipoUsuario> listado = (ArrayList<TipoUsuario>) servicioTipoUsuario.selectTipoUsuario();

        if (!(listado == null || listado.isEmpty())){
            this.lista.clear();
            this.lista.addAll(listado);
        }
    }

}
