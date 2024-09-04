/*
 * SolicitudExternaDataProvider.java
 *
 * Created on May 22, 2007, 8:47 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.util.ArrayList;
import java.util.List;
import pe.gob.pj.rnc.model.AuditoriaUsuario;
import pe.gob.pj.rnc.service.UsuarioManager;

import com.sun.data.provider.impl.ObjectListDataProvider;

public class ConsultaAuditoriaUsuarioDataProvider extends ObjectListDataProvider {

	private static final long serialVersionUID = 1L;

	private ArrayList<AuditoriaUsuario> lista = new ArrayList<AuditoriaUsuario>();

	public ConsultaAuditoriaUsuarioDataProvider() {	
		setList(lista);
	}
	
	public void refreshProvider(String codigoUsuario) throws Exception{
		UsuarioManager servicioUsuario = new UsuarioManager();
		List<AuditoriaUsuario> registros = servicioUsuario.consultaAuditoriaUsuario(codigoUsuario);
		this.lista.clear();
		if (registros != null) {
			this.lista.addAll(registros);
			setList(registros);
		}
	}
}
