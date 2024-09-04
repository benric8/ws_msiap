/*
 * UsuarioDataProvider.java
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

import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.UsuarioManager;
import pe.gob.pj.rnc.tipo.Lista;
import pe.gob.pj.rnc.util.comparador.ComparadorUsuario;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 * erodriguezbu migración: clase con todos los cambios de mag.
 * @author Administrador
 */
public class UsuarioDistritoJudicialDataProvider extends ObjectListDataProvider {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<Usuario> lista = new ArrayList<Usuario>();

	/** Creates a new instance of UsuarioDistritoJudicialDataProvider */
	public UsuarioDistritoJudicialDataProvider() {
		lista.add(new Usuario());
		setList(lista);
	}

	public void refreshProvider(Usuario usuario, String codDistritoJudicial) throws SQLException, NamingException {

		Usuario usuarioTodos = new Usuario();

		// 1.0.0.10 solo se mostrará el propio usuario a los magistrados
		if (usuario.isPerfilAdministrador()) {
			usuarioTodos.setCODG_USUAR("%");
			usuarioTodos.setAPLL_USUAR("TODOS LOS USUARIOS");

			lista.clear();
			lista.add(usuarioTodos);
		} else {
			lista.clear();
		}

		if (usuario != null) {
			UsuarioManager servicioUsuario = new UsuarioManager();
			ArrayList<Usuario> listado = new ArrayList<Usuario>();
			if (usuario.isPerfilSupervisorJudicial()) {
				listado.add(usuario);
			}else{
				List<String> perfiles = new ArrayList<String>();
				perfiles.add(Perfil.OPERADOR_JUDICIAL_ID);
				perfiles.add(Perfil.SUPERVISOR_JUDICIAL_ID);
				listado = servicioUsuario.getUsuariosDistritoJudicial(perfiles, codDistritoJudicial);
			}

			if (listado == null)
				listado = new ArrayList<Usuario>();

			Lista.ordenar(listado, new ComparadorUsuario());
			lista.addAll(listado);
		}
	}
}
