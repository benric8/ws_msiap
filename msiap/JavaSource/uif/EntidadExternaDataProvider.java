/*
 * EntidadExternaDataProvider.java
 *
 * Created on July 4, 2007, 12:46 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.EntidadExterna;

import pe.gob.pj.rnc.service.EntidadExternaManager;
import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class EntidadExternaDataProvider extends ObjectListDataProvider {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	static MyLogger logger= new MyLogger(EntidadExternaDataProvider.class.getName());

	private ArrayList<EntidadExterna> lista = new ArrayList<EntidadExterna>();

	public EntidadExternaDataProvider() {
		lista.add(new EntidadExterna());
		setList(lista);
	}

	public void refreshProvider( ) throws SQLException, NamingException {

		EntidadExternaManager servicioEE = new EntidadExternaManager();
		EntidadExterna entidadExternaTodos = new EntidadExterna();
		entidadExternaTodos.setCODG_ENTIDAD_EXTERNA(0);
		entidadExternaTodos.setDESC_ENTIDAD_EXTERNA("--- SELECCIONE ENTIDAD ---");

		lista.clear();
		lista.add(entidadExternaTodos);

		ArrayList<EntidadExterna> listado = (ArrayList<EntidadExterna>) servicioEE.selectEntidadesExternas();

		if (!(listado == null || listado.isEmpty())) {
			this.lista.addAll(listado);
		}
	}
	
	public void consultarEntidades(Integer codgEntidadExterna) throws SQLException, NamingException {

		EntidadExternaManager servicioEE = new EntidadExternaManager();
		EntidadExterna entidadExternaTodos = new EntidadExterna();
		entidadExternaTodos.setCODG_ENTIDAD_EXTERNA(0);
		entidadExternaTodos.setDESC_ENTIDAD_EXTERNA("--- SELECCIONE ENTIDAD ---");
		lista.clear();
		lista.add(entidadExternaTodos);
		List<EntidadExterna> listado = (List<EntidadExterna>) servicioEE.consultarEntidades(codgEntidadExterna);
		if (!(listado == null || listado.isEmpty())) {
			lista.addAll(listado);
		}
	}

}
