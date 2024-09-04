// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   UsuarioManager.java

package pe.gob.pj.rnc.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pe.gob.pj.rnc.dao.AuditoriaMsiapDAO;
import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.UsuarioDAO;
import pe.gob.pj.rnc.model.AudAntecPenWs;
import pe.gob.pj.rnc.model.AuditoriaUsuario;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.PerfilMenuOpcion;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.model.UsuarioExample;
import pe.gob.pj.rnc.model.UsuarioExample.Criteria;
import pe.gob.pj.rnc.tipo.Lista;

import com.ibatis.dao.client.DaoManager;

public class UsuarioManager {

	private DaoManager daoManager;
	private UsuarioDAO usuarioDAO;
	private AuditoriaMsiapDAO auditoriaMsiapDAO;
	

//	public String abrirClave(Connection coneccion, String clave) {
//		return usuarioDAO.abrirClave(coneccion, clave);
//	}

//	public String cerrarCadena(Connection coneccion, String clave) {
//		return usuarioDAO.cerrarCadena(coneccion, clave);
//	}

	public boolean isUsuarioPuedeActualizarNroImpresion(Usuario usuario) {
		return !usuario.isPerfilAdministrador();
	}

	public UsuarioManager() {
		daoManager = DAOConfiguration.getDaoManager();
		usuarioDAO = (UsuarioDAO) daoManager.getDao(UsuarioDAO.class);
		auditoriaMsiapDAO = (AuditoriaMsiapDAO) daoManager.getDao(AuditoriaMsiapDAO.class);
	}

	public Usuario selecUsuario(String codigoUsuario) {
		return usuarioDAO.selectByPrimaryKey(codigoUsuario);
	}

	public Usuario obtenerSupervisor(Usuario usuario, SolicitudExterna solicitud) {
		if(usuario.isPerfilOperador()||usuario.isPerfilAdministrador()) {
			UsuarioExample muestra = new UsuarioExample();
			muestra.createCriteria().
				andESTD_USUAREqualTo(Usuario.ESTADO_ACTIVO).
				andC_PERFILEqualTo(Perfil.SUPERVISOR_ID).
				andCODG_ENTIDAD_EXTERNAEqualTo(solicitud.getCODG_ENTIDAD_EXTERNA());
			ArrayList<Usuario> lista = (ArrayList<Usuario>) usuarioDAO.selectByExample(muestra);
			//if(Lista.contieneSoloUno(lista)) //erodriguezbu 20170126
			if(Lista.contieneAlgo(lista))
				return lista.get(0);
			else
				return null;
		}
    	return usuario;
    }

	public String encriptarCadena(String input) throws SQLException{
		Map<String, String> map = new HashMap<String, String>();
		map.put("clave1", input);
		map = usuarioDAO.encriptarCadena(map);
		return map.get("clave2");
	}

	public Usuario selectUsuario(String usuario, String contrasenha) throws SQLException {
		UsuarioExample muestra = new UsuarioExample();
		contrasenha = encriptarCadena(contrasenha);
		//contrasenha = cerrarCadena(null, contrasenha);
		//contrasenha = usuarioDAO.getEncriptedPassword(contrasenha);

		muestra.createCriteria().andCODG_USUAREqualTo(usuario).andC_CLAVEEqualTo(contrasenha).andPREF_USUAREqualTo(Usuario.PREF_USUARIO_WEB_CODIGO);//.andESTD_USUAREqualTo(Usuario.ESTADO_ACTIVO);
		ArrayList<Usuario> lista = (ArrayList<Usuario>) usuarioDAO.selectByExample(muestra);
		if(Lista.contieneSoloUno(lista))
			return lista.get(0);
		return null;
	}

	//Inicio erodriguezbu
	@SuppressWarnings("unchecked")
	public ArrayList<Usuario> getUsuariosDistritoJudicial(List<String> perfiles, String codDistritoJudicial) {
		UsuarioExample muestra = new UsuarioExample();
		Criteria crit = muestra.createCriteria().andPREF_USUAREqualTo(Usuario.PREF_USUARIO_WEB_CODIGO).andESTD_USUAREqualTo("A").andC_PERFILIn(perfiles);

		if(!"%".equals(codDistritoJudicial))
			crit.andCODG_DISTRITO_JUDICIALEqualTo(codDistritoJudicial);
		crit.andCODG_DISTRITO_JUDICIALIsNotNull();
		return (ArrayList<Usuario>) usuarioDAO.selectByExample(muestra);
	}

	public ArrayList<Usuario> getUsuariosOperadores(List<String> perfiles, Integer codgEntidadExterna) {
		UsuarioExample muestra = new UsuarioExample();
		muestra.createCriteria().andPREF_USUAREqualTo(Usuario.PREF_USUARIO_WEB_CODIGO).andC_PERFILIn(perfiles).
			andCODG_ENTIDAD_EXTERNAEqualTo(codgEntidadExterna).andESTD_USUAREqualTo("A");
		return (ArrayList<Usuario>) usuarioDAO.selectByExample(muestra);
	}

	public ArrayList<Usuario> selectUsuarioByCodigoAndEmail(String user, String email) {
		UsuarioExample muestra = new UsuarioExample();
		muestra.createCriteria().andCODG_USUAREqualTo(user).andDESC_COREEOEqualToUpper(email).andESTD_USUAREqualTo(Usuario.ESTADO_ACTIVO);
		ArrayList<Usuario> lista = (ArrayList<Usuario>) usuarioDAO.selectByExample(muestra);
		return lista;
	}

	public int updateUsuarioSelective(Usuario usuario) {
		int i = usuarioDAO.updateUsuarioByPrimaryKeySelective(usuario);
		return i;
	}

	public Usuario selectUsuarioByEncriptedId(String id){
		return usuarioDAO.selectByEncriptedId(id);
	}

	public boolean isEmailAuthorized(String domain){
		return usuarioDAO.isEmailAuthorized(domain);
	}

	public boolean existeSupervisor(Usuario usuario) {
		UsuarioExample muestra = new UsuarioExample();
		muestra.createCriteria().
			andESTD_USUAREqualTo(Usuario.ESTADO_ACTIVO).
			andC_PERFILEqualTo(Perfil.SUPERVISOR_ID).
			andCODG_ENTIDAD_EXTERNAEqualTo(usuario.getCODG_ENTIDAD_EXTERNA()).
			andCODG_USUARNotEqualTo(usuario.getCODG_USUAR());

		ArrayList<Usuario> lista = (ArrayList<Usuario>) usuarioDAO.selectByExample(muestra);
		if(Lista.contieneAlgo(lista))
			return true;
		else
			return false;
    }

	public boolean existeUsuarioDni(Usuario usuario) {
		UsuarioExample muestra = new UsuarioExample();
		muestra.createCriteria().andC_NUMDOCIDTEqualTo(usuario.getC_NUMDOCIDT());

		ArrayList<Usuario> lista = (ArrayList<Usuario>) usuarioDAO.selectByExample(muestra);
		if(Lista.contieneAlgo(lista))
			return true;
		else
			return false;
    }
	
	public List<PerfilMenuOpcion> getOpcionesMenu(Usuario user) throws SQLException{
		List<PerfilMenuOpcion> listadoFinal= new ArrayList<PerfilMenuOpcion>();
		List<PerfilMenuOpcion> listado =  usuarioDAO.getOpcionesMenu(user);
        int cant=listado.size();

        for (int i=0;i<cant;i++){
        	PerfilMenuOpcion perfilMenuOpcion= (PerfilMenuOpcion)listado.get(i);
        	ArrayList<PerfilMenuOpcion> lista=new ArrayList<PerfilMenuOpcion>();
        	int x=0;
        	for (int j=0; j<cant; j++){
        		PerfilMenuOpcion perfilMenuOpcionComp= (PerfilMenuOpcion)listado.get(j);
        		if(perfilMenuOpcion.getCODIGO_MENU()==perfilMenuOpcionComp.getCODIGO_MENU()){
        			x++;
        			lista.add(perfilMenuOpcionComp);
        		}
        	}
        	if(x>1)
        		perfilMenuOpcion.setSubMenu(lista);

        	perfilMenuOpcion.setFlag('S');

        	listadoFinal.add(perfilMenuOpcion);
        	if(x!=0)
        		i=i+x-1;
        }
		return listadoFinal;
	}

	public void guardarAuditoria(AudAntecPenWs datos) throws Exception{
		usuarioDAO.guardarAuditoria(datos);
	}

	public int updateUsuario(Usuario usuario) {
		String clave;
		int result = 0;
		try {
			clave = encriptarCadena(usuario.getC_CLAVE());
			usuario.setC_CLAVE(clave);
			result = usuarioDAO.updateByPrimaryKeySelective(usuario);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			usuario.setC_CLAVE("");
			usuario.setCOD_CLAVE("");
		}
		return result;
	}

	public void insertUsuario(Usuario usuario) throws Exception{
		String clave = encriptarCadena(usuario.getC_CLAVE());
		usuario.setC_CLAVE(clave);
		usuarioDAO.insert(usuario);
	}
	//Fin erodriguezbu
	
	public List<AuditoriaUsuario> consultaAuditoriaUsuario(String codigoUsuario) throws Exception{
		List<AuditoriaUsuario> lista = auditoriaMsiapDAO.consultaAuditoriaUsuario(codigoUsuario);
		return lista;
	}
	
	public List<Usuario> consultarUsuarios(Integer codgEntidadExterna, String codgUsuario) {
		Usuario key = new Usuario();
		key.setCODG_ENTIDAD_EXTERNA(codgEntidadExterna);
		key.setCODG_USUAR(codgUsuario);
		List<Usuario> lista = (List<Usuario>) usuarioDAO.consultarUsuarios(key);
		return lista;
	}
}
