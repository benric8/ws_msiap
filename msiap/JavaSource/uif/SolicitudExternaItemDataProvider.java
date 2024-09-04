/*
 * SolicitudExternaItemDataProvider.java
 *
 * Created on May 22, 2007, 11:06 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.util.ArrayList;


import pe.gob.pj.rnc.model.Solicitud;
import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 * 
 * @author Administrador
 */
public class SolicitudExternaItemDataProvider extends ObjectListDataProvider {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<Solicitud> lista = new ArrayList<Solicitud>();

	public SolicitudExternaItemDataProvider() {
		this.lista.add(new Solicitud());
		this.setList(this.lista);
	}

	public void refreshProviderSession(ArrayList<Solicitud> solicitudes) {
		this.lista.clear();
		if (solicitudes != null && !solicitudes.isEmpty()) {
			this.lista.addAll(solicitudes);
		}
	}

}
