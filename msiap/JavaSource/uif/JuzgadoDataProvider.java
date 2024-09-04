/*
 * JuzgadoDataProvider.java
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
import pe.gob.pj.rnc.model.Juzgado;

import pe.gob.pj.rnc.service.JuzgadoManager;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class JuzgadoDataProvider extends ObjectListDataProvider{


    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<Juzgado> lista = new ArrayList<Juzgado>();


	public JuzgadoDataProvider() {

    	this.lista.add(new Juzgado());
		this.setList(this.lista);
    }

	public void refreshProvider() throws SQLException, NamingException{

        this.lista.clear();
        JuzgadoManager servicioJuzgado = new JuzgadoManager();

        ArrayList<Juzgado> listado = (ArrayList<Juzgado>) servicioJuzgado.selectJuzgados();

        if (!(listado == null || listado.isEmpty())){

            this.lista.addAll(listado);
        }
    }

}
