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

import javax.naming.NamingException;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.EntidadExterna;

import pe.gob.pj.rnc.service.EntidadExternaManager;
import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class EntidadExternaFilterDataProvider extends ObjectListDataProvider {
	/**
	 *
	 */
	static MyLogger logger= new MyLogger(EntidadExternaFilterDataProvider.class.getName());

	private static final long serialVersionUID = 1L;

	private ArrayList<EntidadExterna> lista = new ArrayList<EntidadExterna>();

	public EntidadExternaFilterDataProvider() {
		lista.add(new EntidadExterna());
		setList(lista);
	}

	public void refreshProvider(String codDistritoJudicial)
			throws SQLException, NamingException {

		EntidadExterna entidadExternaTodos = new EntidadExterna();
		ArrayList<EntidadExterna> listado = null;
		entidadExternaTodos.setCODG_ENTIDAD_EXTERNA(0);
		entidadExternaTodos
				.setDESC_ENTIDAD_EXTERNA("--- SELECCIONE ENTIDAD ---");

		lista.clear();
		lista.add(entidadExternaTodos);

		if (codDistritoJudicial != null) {
			if (!codDistritoJudicial.equals("0")) {
				EntidadExternaManager servicioEE = new EntidadExternaManager();
				listado = (ArrayList<EntidadExterna>) servicioEE.selectEntExtPorCodigoDistrito(codDistritoJudicial);
			}
		}
		if (!(listado == null || listado.isEmpty())) {
			this.lista.addAll(listado);
		}
	}
}
