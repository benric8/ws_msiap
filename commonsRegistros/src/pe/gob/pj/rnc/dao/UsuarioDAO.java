// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   UsuarioDAO.java

package pe.gob.pj.rnc.dao;

//import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.gob.pj.rnc.model.AudAntecPenWs;
import pe.gob.pj.rnc.model.PerfilMenuOpcion;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.model.UsuarioExample;

public interface UsuarioDAO
{

    public abstract void insert(Usuario usuario);

    public abstract int updateByPrimaryKey(Usuario usuario);

    public abstract int updateByPrimaryKeySelective(Usuario usuario);

    public abstract List selectByExample(UsuarioExample usuarioexample);

    public abstract Usuario selectByPrimaryKey(String s);

    public abstract int deleteByExample(UsuarioExample usuarioexample);

    public abstract int deleteByPrimaryKey(String s);

//	public abstract String abrirClave(Connection conexion, String clave);

//	public abstract String cerrarCadena(Connection coneccion, String clave);

	public abstract int updateUsuarioByPrimaryKeySelective(Usuario record);

	public abstract Usuario selectByEncriptedId(String id);

	public boolean isEmailAuthorized(String domain);

	public List<PerfilMenuOpcion> getOpcionesMenu(Usuario user) throws SQLException;

	public abstract void guardarAuditoria(AudAntecPenWs datos) throws Exception;

	public Map<String,String> encriptarCadena(Map<String,String> datos) throws SQLException;
	
	public List<Usuario> consultarUsuarios(Usuario key);
}
