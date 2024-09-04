/*
 * DistritoJudicialInternoDataProvider.java
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
public class DistritoJudicialInternoDataProvider extends ObjectListDataProvider{


    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<DistritoJudicial> lista = new ArrayList<DistritoJudicial>();


    /** Creates a new instance of DistritoJudicialInternoDataProvider */
//    @SuppressWarnings("unchecked")
	public DistritoJudicialInternoDataProvider() {

    	this.lista.add(new DistritoJudicial());
		this.setList(this.lista);
    }

	public void refreshProvider() throws SQLException, NamingException{
    	DistritoJudicialManager servicioDistritoJudicial = new DistritoJudicialManager();
        DistritoJudicial distritoJudicial=new DistritoJudicial();
        distritoJudicial.setCODG_DISTRITO_JUDICIAL("%");
        distritoJudicial.setDESC_DISTRITO_JUDICIAL("  SELECCIONE DISTRITO  ");
        this.lista.clear();
        this.lista.add(distritoJudicial);

        ArrayList<DistritoJudicial> listado = (ArrayList<DistritoJudicial>) servicioDistritoJudicial.getDistritosJudiciales();

        if (!(listado == null || listado.isEmpty())){
            this.lista.addAll(listado);
        }
    }

	public DistritoJudicial buscarDistritoJudicial(String codgDistrito) throws SQLException, NamingException{
		DistritoJudicial bean = new DistritoJudicial();
		for(DistritoJudicial dist:this.lista){
			if(dist.getCODG_DISTRITO_JUDICIAL().trim().equals(codgDistrito))
				return dist;
		}

    	DistritoJudicialManager servicioDistritoJudicial = new DistritoJudicialManager();
    	bean = servicioDistritoJudicial.selectDistritoJudicial(codgDistrito);
		return bean;
    }

}
