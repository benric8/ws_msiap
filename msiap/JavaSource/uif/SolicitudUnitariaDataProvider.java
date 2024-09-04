/*
 * SolicitudUnitariaDataProvider.java
 *
 * Created on June 4, 2007, 8:59 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import pe.gob.pj.rnc.model.Solicitud;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class SolicitudUnitariaDataProvider extends ObjectListDataProvider{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Solicitud> lista = new ArrayList<Solicitud>();

	public SolicitudUnitariaDataProvider() {
        this.lista.add(new Solicitud());
        this.setList(this.lista);
    }

	public void refreshProvider(List<Solicitud> list) throws SQLException, NamingException {

        if (!(list == null || list.isEmpty())){
            this.lista.clear();
            this.lista.addAll(list);
        }else{
            this.lista.clear();

        }

    }
}
