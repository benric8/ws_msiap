/*
 * SolicitudExternaDataProvider.java
 *
 * Created on May 22, 2007, 8:47 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.criterio.CriterioListarSolicitudExterna;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.SolicitudExternaManager;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class SolicitudExternaDataProvider extends ObjectListDataProvider {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<SolicitudExterna> lista = new ArrayList<SolicitudExterna>();


	public SolicitudExternaDataProvider() {
		this.lista.add(new SolicitudExterna());
		this.setList(this.lista);
	}

	public void refreshProvider(Usuario usuario, CriterioListarSolicitudExterna criterio) throws SQLException, NamingException {

		SolicitudExternaManager servicioSolExt = new SolicitudExternaManager();
		ArrayList<SolicitudExterna> registros = (ArrayList<SolicitudExterna>) servicioSolExt.selectSolicitudes(usuario, criterio);

		if (!(registros == null)) {
			this.lista.clear();
			this.lista.addAll(registros);
		}

	}
	
	public void consultarSolicitudesExternas(Usuario usuario, CriterioListarSolicitud criterio) throws SQLException, NamingException {

		SolicitudExternaManager servicioSolExt = new SolicitudExternaManager();
		ArrayList<SolicitudExterna> registros = (ArrayList<SolicitudExterna>) servicioSolExt.consultarSolicitudesExternas(usuario, criterio);

		if (!(registros == null)) {
			this.lista.clear();
			this.lista.addAll(registros);
		}

	}
	
	public void limpiarSolicitudesExternas() {
		this.lista.clear();
	}
}
