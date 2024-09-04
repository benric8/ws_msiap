// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   UsuarioDAOImpl.java

package pe.gob.pj.rnc.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.AudAntecPenWs;
import pe.gob.pj.rnc.model.PerfilMenuOpcion;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.model.UsuarioExample;
import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

public class UsuarioDAOImpl extends SqlMapDaoTemplate implements UsuarioDAO {
	MyLogger logger= new MyLogger(DAOConfiguration.class.getName());

//	public String abrirClave(Connection coneccion, String clave) {
//		String claveAbierta = null;
//		try {
//			CallableStatement procedimiento = coneccion.prepareCall("{call usp_general_decriptar_cadena(?,?)}");
//			procedimiento.setString(1, clave);
//			procedimiento.registerOutParameter(2, java.sql.Types.VARCHAR);
//			procedimiento.execute();
//			claveAbierta = procedimiento.getString(2);
//			procedimiento.close();
//		} catch (SQLException e) {
//			logger.error("",e);
//			e.printStackTrace();
//		}
//		return claveAbierta;
//	}

	/**
	 * Método que permite encriptar una cadena alfanumerica.
	 *
	 * @param coneccion	:	Conexion con la base de datos
	 * @param clave		:	Cadena no encriptada
	 * @return
	 */
//	public String cerrarCadena(Connection coneccion, String clave) {
//		String claveAbierta = null;
//		try {
//			CallableStatement procedimiento = coneccion.prepareCall("{call usp_general_encriptar_cadena(?,?)}");
//			procedimiento.setString(1, clave);
//			procedimiento.registerOutParameter(2, java.sql.Types.VARCHAR);
//			procedimiento.execute();
//			claveAbierta = procedimiento.getString(2);
//			procedimiento.close();
//		} catch (SQLException e) {
//			logger.error("",e);
//			e.printStackTrace();
//		}
//		return claveAbierta;
//	}

	public UsuarioDAOImpl(DaoManager daoManager) {
		super(daoManager);
	}

	public void insert(Usuario record) {
		insert("USUARIO.abatorgenerated_insert", record);
	}

	public int updateByPrimaryKey(Usuario record) {
		int rows = update("USUARIO.abatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	public int updateByPrimaryKeySelective(Usuario record) {
		int rows = update("USUARIO.abatorgenerated_updateByPrimaryKeySelective", record);
		return rows;
	}

	public List selectByExample(UsuarioExample example) {
		List list = queryForList("USUARIO.abatorgenerated_selectByExample", example);
		return list;
	}

	public Usuario selectByPrimaryKey(String CODG_USUAR) {
		Usuario key = new Usuario();
		key.setCODG_USUAR(CODG_USUAR);
		Usuario record = (Usuario) queryForObject("USUARIO.abatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	public int deleteByExample(UsuarioExample example) {
		int rows = delete("USUARIO.abatorgenerated_deleteByExample", example);
		return rows;
	}

	public int deleteByPrimaryKey(String CODG_USUAR) {
		Usuario key = new Usuario();
		key.setCODG_USUAR(CODG_USUAR);
		int rows = delete("USUARIO.abatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	//Inicio erodriguezbu
//	public String getEncriptedPassword(String clave) throws SQLException{
//		return cerrarCadena(this.getSqlMapTransactionManager().getDataSource().getConnection(), clave);
//	}

	public int updateUsuarioByPrimaryKeySelective(Usuario record) {
		int rows = update("USUARIO.updateUsuarioByPrimaryKeySelective", record);
		return rows;
	}

	public Usuario selectByEncriptedId(String id){
		Usuario key = new Usuario();
		key.setCodUsuEncriptado(id);
		Usuario record = (Usuario) queryForObject("USUARIO.selectByEncriptedId", key);
		return record;
	}

	public boolean isEmailAuthorized(String domain){
		Object result = queryForObject("USUARIO.checkAuthEmail", domain);
		if(result == null) return false;
		else return true;
	}

	public List<PerfilMenuOpcion> getOpcionesMenu(Usuario user) throws SQLException{
		return (List<PerfilMenuOpcion>) queryForList("USUARIO.getOpcionesMenu", user);
	}

	public Map<String,String> encriptarCadena(Map<String,String> datos) throws SQLException{
		boolean autoCommitValue = false;
		try{
			autoCommitValue = this.getSqlMapTransactionManager().getCurrentConnection().getAutoCommit();
			if(!autoCommitValue)
				this.getSqlMapTransactionManager().getCurrentConnection().setAutoCommit(true);
			queryForObject("USUARIO.encriptarCadena", datos);
		}finally{
			this.getSqlMapTransactionManager().getCurrentConnection().setAutoCommit(autoCommitValue);
		}
		return datos;
	}
	//Fin erodriguezbu

	@Override
	public void guardarAuditoria(AudAntecPenWs datos) throws Exception {
		if(datos.getPs_paterno()==null) datos.setPs_paterno("");
		if(datos.getPs_materno()==null) datos.setPs_materno("");
		if(datos.getPs_nom3()==null) datos.setPs_nom3("");
		if(datos.getPs_nom2()==null) datos.setPs_nom2("");
		if(datos.getPs_nom1()==null) datos.setPs_nom1("");
		if(datos.getPs_aud_pc()==null) datos.setPs_aud_pc("");
		if(datos.getPs_aud_ip()==null) datos.setPs_aud_ip("");
		if(datos.getPs_aud_mcaddr()==null) datos.setPs_aud_mcaddr("");
		if(datos.getPi_aud_cod_entidad()==null) datos.setPi_aud_cod_entidad(0);
		if(datos.getX_resp_ws()==null) datos.setX_resp_ws("");
		if(datos.getPs_aud_dni()==null) datos.setPs_aud_dni("");
		if(datos.getPs_aud_cod_usuario()==null) datos.setPs_aud_cod_usuario("");

		boolean autoCommitValue = false;
		try{
			autoCommitValue = this.getSqlMapTransactionManager().getCurrentConnection().getAutoCommit();
			if(!autoCommitValue)
				this.getSqlMapTransactionManager().getCurrentConnection().setAutoCommit(true);
			Object result = queryForObject("USUARIO.insertAuditoriaProcedure", datos);
		}finally{
			this.getSqlMapTransactionManager().getCurrentConnection().setAutoCommit(autoCommitValue);
		}
	}
	
	public List<Usuario> consultarUsuarios(Usuario key) {
		List<Usuario> list = queryForList("USUARIO.consultarUsuarios", key);
		return list;
	}

}
