package uif;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.UsuarioManager;
import pe.gob.pj.rnc.tipo.Lista;
import pe.gob.pj.rnc.util.comparador.ComparadorUsuario;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class UsuarioDataProvider extends ObjectListDataProvider {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<Usuario> lista = new ArrayList<Usuario>();

	/** Creates a new instance of UsuarioDataProvider */
//	@SuppressWarnings("unchecked")
	public UsuarioDataProvider() {
		lista.add(new Usuario());
		setList(lista);
	}

	public void refreshProvider(Usuario usuario) throws SQLException, NamingException {

		Usuario usuarioTodos = new Usuario();
		usuarioTodos.setCODG_USUAR("%");
		usuarioTodos.setAPLL_USUAR("TODOS LOS USUARIOS");
		lista.clear();
		lista.add(usuarioTodos);

		List<String> perfil = new ArrayList<String>();
		UsuarioManager servicioUsuario = new UsuarioManager();


		if(usuario.isPerfilSupervisor()) {
			perfil.add("27");
		}else if(usuario.isPerfilAdministrador()) {
			perfil.add("26");
			perfil.add("27");
		}

		ArrayList<Usuario> listado = null;
		if(perfil.size()>0)
			listado = servicioUsuario.getUsuariosOperadores(perfil, usuario.getCODG_ENTIDAD_EXTERNA());

		if(listado==null) listado = new ArrayList<Usuario>();
		if(listado!=null) listado.add(usuario);
		Lista.ordenar(listado, new ComparadorUsuario());
		lista.addAll(listado);
	}
	
	public List<Usuario> consultarUsuarios(Integer codgEntidadExterna, String codgUsuario) throws SQLException, NamingException {

		List<Usuario> lista = new ArrayList<Usuario>();
		UsuarioManager servicioUsuario = new UsuarioManager();
		Usuario usuarioTodos = new Usuario();
		usuarioTodos.setCODG_USUAR("%");
		usuarioTodos.setAPLL_USUAR("TODOS LOS USUARIOS");
		lista.add(usuarioTodos);
		List<Usuario> listado = servicioUsuario.consultarUsuarios(codgEntidadExterna, codgUsuario);
		if (!(listado == null || listado.isEmpty())) {
			Lista.ordenar(listado, new ComparadorUsuario());
			lista.addAll(listado);
		}
		return lista;
	}
}
