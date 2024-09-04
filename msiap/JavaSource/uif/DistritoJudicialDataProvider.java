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
import pe.gob.pj.rnc.model.DistritoJudicial;
import pe.gob.pj.rnc.service.DistritoJudicialManager;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class DistritoJudicialDataProvider extends ObjectListDataProvider{


    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<DistritoJudicial> lista = new ArrayList<DistritoJudicial>();


	public DistritoJudicialDataProvider() {

    	this.lista.add(new DistritoJudicial());
		this.setList(this.lista);
    }

	public void refreshProvider() throws SQLException, NamingException{

    	DistritoJudicialManager servicioDJ = new DistritoJudicialManager();

        ArrayList<DistritoJudicial> listado = (ArrayList<DistritoJudicial>) servicioDJ.getDistritosJudicialesConvenio();

        if (!(listado == null || listado.isEmpty())){
            this.lista.addAll(listado);
        }
    }

}
