/*
 * AuditoriaExternaDataProvider.java
 *
 * Created on June 27, 2007, 7:03 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import pe.gob.pj.rnc.model.SolicitudExternaAuditoria;
import pe.gob.pj.rnc.service.SolicitudExternaAuditoriaManager;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class AuditoriaExternaDataProvider extends ObjectListDataProvider {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<SolicitudExternaAuditoria> lista = new ArrayList<SolicitudExternaAuditoria>();

	public AuditoriaExternaDataProvider() {
        this.lista.add(new SolicitudExternaAuditoria());
        this.setList(this.lista);
    }

	public void refreshProvider(Integer codgCertiExterno) throws SQLException, NamingException{
    	SolicitudExternaAuditoriaManager servicioAuditoria = new SolicitudExternaAuditoriaManager();

        ArrayList<SolicitudExternaAuditoria> registrosAuditoria =
        		(ArrayList<SolicitudExternaAuditoria>) servicioAuditoria.selectAuditoria(codgCertiExterno);
            this.lista.clear();
            this.lista.addAll(registrosAuditoria);
    }

}
