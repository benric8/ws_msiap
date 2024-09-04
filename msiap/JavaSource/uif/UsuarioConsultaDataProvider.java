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
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pe.gob.pj.rnc.criterio.CriterioListarUsuario;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.Soporte;
import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 * 
 * @author Administrador
 */
public class UsuarioConsultaDataProvider extends ObjectListDataProvider {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<Usuario> lista = new ArrayList<Usuario>();
	CriterioListarUsuario criterioSesion = new CriterioListarUsuario();


	/** Creates a new instance of SolicitudExternaDataProvider */
//	@SuppressWarnings("unchecked")
	public UsuarioConsultaDataProvider() {
		//this.lista.add(new Usuario());
		this.setList(this.lista);
	}

	@SuppressWarnings("unchecked")
	public void refreshProvider(Usuario usuario, CriterioListarUsuario criterio) throws SQLException, NamingException {
		
		if(criterio==null)
			criterio = criterioSesion;
		
		javax.naming.Context ctx = null;
		DataSource ds = null;
		ctx = new javax.naming.InitialContext();
		ds = (DataSource) ctx.lookup(Soporte.ORIGEN_DE_DATOS);		
		StringBuffer sqlSelect=new StringBuffer();		
		StringBuffer sqlWhere=new StringBuffer();		
		
		sqlSelect.append(" SELECT U.CODG_USUAR, U.NOMB_USUAR, U.APLL_USUAR, U.TIPO_DOC_IDENT,");
		sqlSelect.append(" ESTD_USUAR = CASE WHEN U.ESTD_USUAR='I' THEN 'INACTIVO' WHEN U.ESTD_USUAR='A' THEN 'ACTIVO' ELSE U.ESTD_USUAR END ,E.DESC_ENTIDAD_EXTERNA,P.x_perfil, U.CODG_ENTIDAD_EXTERNA, ");
		sqlSelect.append(" DJ.DESC_DISTRITO_JUDICIAL, J.DESC_JUZGAD  ");
		sqlSelect.append(" FROM USUARIO U ");
		sqlSelect.append(" join perfil P on U.C_PERFIL = P.c_perfil ");
		sqlSelect.append(" left outer join ENTIDAD_EXTERNA E on U.CODG_ENTIDAD_EXTERNA = E.CODG_ENTIDAD_EXTERNA ");		
		sqlSelect.append(" left outer join DISTRITO_JUDICIAL DJ ON (DJ.CODG_DISTRITO_JUDICIAL= U.CODG_DISTRITO_JUDICIAL) ");
		sqlSelect.append(" left outer join JUZGADO J ON (J.CODG_JUZGAD = U.CODG_JUZGAD) ");
		sqlSelect.append(" WHERE ");	
		
		sqlWhere.append(" U.PREF_USUAR = 'WEB'  ");	
		
		if(criterio.getCodEntidadExterna()!=null){
			Integer num=new Integer(criterio.getCodEntidadExterna().toString());
			if (num!=0)
				sqlWhere.append(" and U.CODG_ENTIDAD_EXTERNA = " + new Integer(criterio.getCodEntidadExterna().toString()) + "  ");		
		}
		
		if(criterio.getCodDistritoJudicial()!=null){
			String codigo=criterio.getCodDistritoJudicial().toString();
			if (!codigo.equals("%"))
				sqlWhere.append(" and U.CODG_DISTRITO_JUDICIAL = '" + criterio.getCodDistritoJudicial().toString() + "'  ");		
		}
		
		if(criterio.getNombres() !=null)
			sqlWhere.append(" and U.NOMB_USUAR LIKE '%" + criterio.getNombres().toString().trim().toUpperCase() + "%'  ");
		
		if(criterio.getApellidos() !=null)
			sqlWhere.append(" and U.APLL_USUAR LIKE '%" + criterio.getApellidos().toString().trim().toUpperCase() + "%'  ");
		
		if(criterio.getCodPerfil()!=null)
			if(!(criterio.getCodPerfil().toString()).equals("%"))
				sqlWhere.append(" and U.C_PERFIL = '" + criterio.getCodPerfil().toString() + "'  ");
				
		sqlWhere.append(" ORDER BY U.CODG_USUAR ASC ");		
		
		
		QueryRunner run = new QueryRunner(ds);
		ResultSetHandler handler = new BeanListHandler(pe.gob.pj.rnc.model.Usuario.class);
		ArrayList<Usuario> registros = (ArrayList<Usuario>) run.query(sqlSelect.toString()+sqlWhere.toString(), handler);
		
		this.lista.clear();
		if (!(registros == null)) {
			this.lista.addAll(registros);
			setList(registros);
		}
		
		criterioSesion = criterio;
		
	}

}
