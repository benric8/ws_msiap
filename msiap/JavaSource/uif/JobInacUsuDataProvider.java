/*
 * AuditoriaExternaDataProvider.java
 *
 * Created on June 27, 2007, 7:03 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

//import java.lang.reflect.Array;
//import java.net.InetAddress;
//import java.net.NetworkInterface;
//import java.net.SocketException;
//import java.net.UnknownHostException;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException; //import java.sql.CallableStatement; //import java.sql.Connection;
//import java.sql.Connection; //import java.sql.ResultSet;
import java.sql.CallableStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException; //import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Enumeration; //import java.util.Hashtable;

//import javax.faces.context.ExternalContext;
//import javax.faces.context.FacesContext;
//import javax.faces.context.ExternalContext;
//import javax.faces.context.FacesContext;
//import javax.naming.Context;
import javax.naming.NamingException; //import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner; //import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.ResultSetHandler; //import org.apache.commons.dbutils.handlers.BeanListHandler; //import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab_det; //import pe.gob.pj.rnc.model.SolicitudExternaAuditoria;
import pe.gob.pj.rnc.model.UsuarioCamposAud; //import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.Usuario; //import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.Soporte; //import pe.gob.pj.util.Constantes;

//import com.ibm.security.auth.module.NTSystem;
import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 * @author Administrador
 */
public class JobInacUsuDataProvider extends ObjectListDataProvider implements Job {
	/**
	 * 
	 */
	static MyLogger						logger						= new MyLogger(JobInacUsuDataProvider.class.getName());
	
	private static final long	serialVersionUID	= 1L;
	
	// private ArrayList lista = new ArrayList();
	
	/** Creates a new instance of AuditoriaExternaDataProvider */
	// @SuppressWarnings("unchecked")
	public JobInacUsuDataProvider() {
		// this.lista.add(new SolicitudExternaAuditoria());
		// this.setList(this.lista);
	}
	
	//	// @SuppressWarnings("unchecked")
	//	public void refreshProvider_0() throws SQLException, NamingException {
	//		javax.naming.Context ctx = null;
	//		DataSource ds = null;
	////		Hashtable<String, String> env = new Hashtable<String, String>();
	////		env.put(Context.INITIAL_CONTEXT_FACTORY, Constantes.ETIQUETA_HANDLER_CLASE_CONTEXTO_WAS);
	////		ctx = new javax.naming.InitialContext(env);
	//		ctx = new javax.naming.InitialContext();
	//		ds = (DataSource) ctx.lookup(Soporte.ORIGEN_DE_DATOS);
	//		// Connection conexion = null;
	//		// conexion = ds.getConnection();
	//		// if (conexion == null) {
	//		// logger.error("refreshProvider.1. Error conección de base de datos.");
	//		// return;
	//		// } else
	//		// logger.info("********** refreshProvider .1.....");
	//		// conexion = null;
	//		// System.out.println("conexion.....");
	//		// String sql =
	//		// " UPDATE USUARIO SET ESTD_USUAR = 'I' WHERE PREF_USUAR='WEB' AND (C_PERFIL='30' OR C_PERFIL='20')AND FECH_VENCI<GETDATE()  ";
	//		// String sql =
	//		// " UPDATE USUARIO SET ESTD_USUAR = 'I' WHERE PREF_USUAR='WEB' AND (C_PERFIL='30' OR C_PERFIL='20')AND FECH_VENCI<GETDATE() AND ESTD_USUAR = 'A' ";
	//		// String sql =
	//		// " UPDATE USUARIO SET ESTD_USUAR = 'I' WHERE PREF_USUAR='WEB' AND (C_PERFIL='30' OR C_PERFIL='20')AND FECH_VENCI<GETDATE() AND ESTD_USUAR = 'A' ";
	//		String sql = " UPDATE USUARIO SET ESTD_USUAR = 'I' WHERE PREF_USUAR='WEB' AND (C_PERFIL='30' OR C_PERFIL='20')AND FECH_VENCI<GETDATE() AND ESTD_USUAR = 'A' ";
	//		// SELECT CODG_USUAR FROM USUARIO WHERE PREF_USUAR='WEB' AND (C_PERFIL='30' OR C_PERFIL='20')AND
	//		// FECH_VENCI<GETDATE() AND ESTD_USUAR = 'A'
	//		logger.info("job sql= " + sql);
	//		QueryRunner run = null;
	//		try {
	//			run = new QueryRunner(ds);
	//			run.update(sql);
	//		} catch (Exception e) {
	//			logger.error("", e);
	//			e.printStackTrace();
	//		} finally {
	//			ctx.close();
	//			ctx = null;
	//			ds = null;
	//			sql = null;
	//			run = null;
	//		}
	//	}
	
	@SuppressWarnings("unchecked")
	private int usuariosBaja() {
		int rst = 0;
		javax.naming.Context ctx = null;
		DataSource ds = null;
		try {
			ctx = new javax.naming.InitialContext();
			ds = (DataSource) ctx.lookup(Soporte.ORIGEN_DE_DATOS);
			QueryRunner run = new QueryRunner(ds);
			ResultSetHandler handler = new BeanListHandler(pe.gob.pj.rnc.model.Usuario.class);
			ArrayList<Usuario> registros = (ArrayList<Usuario>) run
					.query(
							"SELECT CODG_USUAR FROM USUARIO WHERE PREF_USUAR='WEB' AND (C_PERFIL='30' OR C_PERFIL='20') AND FECH_VENCI<GETDATE() AND ESTD_USUAR = 'A'",
							handler);
			if (!(registros == null)) {
				rst = registros.size();
			}
		} catch (NamingException e) {
			logger.error(e);
			System.out.println("Error : " + e.getMessage());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return rst;
	}
	
	// @SuppressWarnings("unchecked")
	public void refreshProvider() throws SQLException, NamingException {
		int tb = usuariosBaja();
		if (tb > 0) {
			System.out.println("Usuarios de baja : " + tb);
			logger.info("Usuarios de baja : " + tb);
			// MyLogger logger = new MyLogger(this.getClass().getName());
			javax.naming.Context ctx = null;
			DataSource ds = null;
			// CallableStatement st = null;
			try {
				ctx = new javax.naming.InitialContext();
				ds = (DataSource) ctx.lookup(Soporte.ORIGEN_DE_DATOS);
				// if (ds.getConnection() == null) {
				// logger.error("refreshProvider. Error conección de base de datos.");
				// return;
				// } else
				// logger.info("********** refreshProvider ......");
				Aud_usuario_tablas_cab_det audCD = new Aud_usuario_tablas_cab_det();
				datos_Aud_usuario_tablas_cab_det(audCD);
				/*
				 * @c_usuario
				 * @motivo
				 * @c_usuario_red
				 * @c_ipaddr
				 * @c_pcname
				 * @c_mcaddr
				 */
//				String sql = " EXECUTE usp_insert_aud_ut_JOB ?,?,?,?,?,?,? ";
				Object[] parms = (Object[]) Array.newInstance(Object.class, 7);
				parms[0] = audCD.getC_usuario() == null ? "" : audCD.getC_usuario();
				parms[1] = audCD.getMotivo() == null ? "" : audCD.getMotivo();
				parms[2] = audCD.getC_usuario_red() == null ? "" : audCD.getC_usuario_red();
				parms[3] = audCD.getC_ipaddr() == null ? "" : audCD.getC_ipaddr();
				parms[4] = audCD.getC_pcname() == null ? "" : audCD.getC_pcname();
				parms[5] = audCD.getC_mcaddr() == null ? "" : audCD.getC_mcaddr();
				parms[6] = "";
//				System.out.println("1.");
//				QueryRunner run = new QueryRunner(ds);
				// ResultSetHandler handler = new BeanListHandler(String.class);
				// String rst = run.query(sql, parms, handler).toString();
//				ResultSetHandler h = new ResultSetHandler() {
//					public Object[] handle(ResultSet rs) throws SQLException {
//						if (!rs.next()) {
//							return null;
//						}
//						ResultSetMetaData meta = rs.getMetaData();
//						int cols = meta.getColumnCount();
//						Object[] result = new Object[cols];
//						for (int i = 0; i < cols; i++) {
//							result[i] = rs.getObject(i + 1);
//						}
//						return result;
//					}
//				};
//				System.out.println("2..");
				//			System.out.println("5.... " + " - h - " + (h == null) + " - parms - " + parms.length);
				//			System.out.println(sql);
				//			run.query(sql, parms, h);
//				Object[] rst = (Object[]) run.query(sql, parms, h);
//				ResultSetHandler handler = new BeanListHandler(pe.gob.pj.rnc.model.Usuario.class);
//				ArrayList<Usuario> rst = (ArrayList<Usuario>) run.query(sql, parms, handler);
//				System.out.println("rst : " + rst == null);
				//			System.out.println("6....");
				//			System.out.println("rst: " + rst.length + " - " + (rst.length > 0 ? rst[0].toString() : "*"));
//				System.out.println("rst: " + rst.length + " - " + (rst.length > 0 ? rst[rst.length - 1].toString() : "*"));
//				logger.info("rst: " + rst.length + " - " + (rst.length > 0 ? rst[rst.length - 1].toString() : "*"));
//				System.out.println("rst: " + rst.size() + " - " + (rst.size() > 0 ? rst.get(rst.size() - 1).toString() : "*"));
//				logger.info("rst: " + rst.size() + " - " + (rst.size() > 0 ? rst.get(rst.size() - 1).toString() : "*"));
				String rstSP = "....|...";
				try {
					CallableStatement procedimiento = ds.getConnection().prepareCall("{call usp_insert_aud_ut_JOB(?,?,?,?,?,?,?)}");
					procedimiento.setString(1, parms[0].toString());
					procedimiento.setString(2, parms[1].toString());
					procedimiento.setString(3, parms[2].toString());
					procedimiento.setString(4, parms[3].toString());
					procedimiento.setString(5, parms[4].toString());
					procedimiento.setString(6, parms[5].toString());
					procedimiento.registerOutParameter(7, java.sql.Types.VARCHAR);
					procedimiento.execute();
					rstSP = procedimiento.getString(7);
					procedimiento.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				logger.info(rstSP);
				System.out.println("rstSP : " + rstSP);
				//			 logger.info(st.getString(7));
				//			System.out.println(parms[6].toString());
				//			logger.info("parms[6] : " + parms[6].toString());
				// ResultSet rs;
				// int i;
				// while (st.getMoreResults()) {
				// rs = st.getResultSet();
				// while (rs.next()) {
				// i = rs.getInt(1);
				// System.out.println("Value from result set = " + i);
				// logger.info("Value from result set = " + i);
				// }
				// }
				// st.close();
				// logger.info("st.close()");
//			} catch (SQLException e) {
//				logger.info("SQLException:" + e.getMessage());
//				logger.error("SQLException:" + e.getMessage(), e);
//				System.out.println("E1.");
//				System.out.println(e.getMessage());
			} catch (Exception e) {
				logger.error("Exception.", e);
				System.out.println("E2.");
				System.out.println(e.getMessage());
			} finally {
				System.out.println("F1.");
				ctx.close();
				ctx = null;
				ds = null;
				// if (st != null) {
				// try {
				// if (!st.isClosed())
				// st.close();
				// st = null;
				// } catch (Exception e2) {
				// logger.error(e2.getMessage());
				// }
				// }
			}
		} else {
			System.out.println("No existen usuarios a dar de Baja");
			logger.info("No existen usuarios a dar de Baja");
		}
	}
	
	//	// @SuppressWarnings("unchecked")
	//	public void refreshProvider_2() throws SQLException, NamingException {
	//		javax.naming.Context ctx = null;
	//		DataSource ds = null;
	//		// if (ds==null) {
	//		// return;
	//		// }
	//		ctx = new javax.naming.InitialContext();
	//		ds = (DataSource) ctx.lookup(Soporte.ORIGEN_DE_DATOS);
	//		// if (ds.getConnection() == null) {
	//		// logger.error("refreshProvider. Error conección de base de datos.");
	//		// return;
	//		// } else
	//		// logger.info("********** refreshProvider ......");
	//		Aud_usuario_tablas_cab_det audCD = new Aud_usuario_tablas_cab_det();
	//		datos_Aud_usuario_tablas_cab_det(audCD);
	//		logger.info("--> execute usp_insert_aud_ut_JOB '" + audCD.getC_usuario() + "', '" + audCD.getMotivo() + "', '"
	//				+ (audCD.getC_usuario_red() + "") + "', '" + audCD.getC_ipaddr() + "', '" + audCD.getC_pcname() + "', '"
	//				+ audCD.getC_mcaddr() + "'");
	//		String ret = "";
	//		String sql = " execute usp_insert_aud_ut_JOB '" + audCD.getC_usuario() + "', '" + audCD.getMotivo() + "', '"
	//				+ (audCD.getC_usuario_red() + "") + "', '" + audCD.getC_ipaddr() + "', '" + audCD.getC_pcname() + "', '"
	//				+ audCD.getC_mcaddr() + "', " + ret;
	//		
	//		logger.info("job sql= " + sql);
	//		logger.info("job ret= " + ret);
	//		QueryRunner run = null;
	//		try {
	//			run = new QueryRunner(ds);
	//			run.update(sql);
	//		} catch (Exception e) {
	//			logger.error("", e);
	//			e.printStackTrace();
	//			System.out.println(".......");
	//		} finally {
	//			ctx.close();
	//			ctx = null;
	//			ds = null;
	//			sql = null;
	//			run = null;
	//			System.out.println(".........................");
	//		}
	//	}
	
	private void datos_Aud_usuario_tablas_cab_det(Aud_usuario_tablas_cab_det audCD) {
		// InetAddress lh;
		System.out.println("datos_Aud_usuario_tablas_cab_det.....");
		try {
			// lh = InetAddress.getLocalHost();
			// System.out.println(lh.getHostName());
			// System.out.println(lh.getHostAddress());
			// cod_registro, fecha_aud, c_usuario, c_tabla, c_accion, cod_modificado, motivo,
			// c_usuario_red, c_ipaddr, c_pcname, c_mcaddr
			// ap.setCod_registro(0);
			// ap.setFecha_aud();
			audCD.setC_usuario("JOB MAGIST");
			// audCD.setC_tabla("USUARIO");
			audCD.setC_accion(audCD.ACTUALIZA);
			// audCD.setCod_modificado("");
			audCD.setMotivo("Usuario ha sido desactivado por pasar la fecha la vencimiento --- MSIAP Magistrado");
			/*
			 * FacesContext facesContext = FacesContext.getCurrentInstance(); ExternalContext externalContext =
			 * facesContext.getExternalContext(); // ExternalContext externalContext = getExternalContext();
			 * HttpServletRequest request = (HttpServletRequest) externalContext.getRequest(); String ipAddress =
			 * request.getHeader("X-FORWARDED-FOR"); // ap.setPs_nom2(ipAddress); if (ipAddress == null) { ipAddress =
			 * request.getRemoteAddr(); }
			 */
			InetAddress ips;
			Enumeration<NetworkInterface> en;
			InetAddress ia = null;
			try {
				en = NetworkInterface.getNetworkInterfaces();
				Boolean salir = false;
				while (en.hasMoreElements()) {
					NetworkInterface ni = (NetworkInterface) en.nextElement();
					Enumeration<InetAddress> ee = ni.getInetAddresses();
					while (ee.hasMoreElements()) {
						ia = (InetAddress) ee.nextElement();
						// logger.info("--> " + ia.getHostAddress());
						//						logger.info("1 --> " + ia.getHostAddress() + " - " + ia.getHostName());
						//						System.out.println("1 --> " + ia.getHostAddress() + " - " + ia.getHostName());
						if (!ia.isLinkLocalAddress() && !ia.isLoopbackAddress() && ia instanceof Inet4Address) {
							salir = true;
							break;
						}
					}
					if (salir) {
						break;
					}
				}
			} catch (SocketException e) {
				e.printStackTrace();
			}
			ips = ia == null ? InetAddress.getLocalHost() : ia;
			// System.out.println(ips.getHostAddress());
			// System.out.println(ips.getHostName());
			NetworkInterface network;
			StringBuilder sb = new StringBuilder();
			//			logger.info("ips... " + ips);
			//			System.out.println("ips... " + ips);
			byte[] mac = null;
			try {
				network = NetworkInterface.getByInetAddress(ips);
				// System.out.println("network : " + network.getDisplayName());
				// logger.info("network " + network.getDisplayName());
				mac = network.getHardwareAddress();
				// logger.info("mac " + mac.length + " - " + mac.toString());
			} catch (SocketException e1) {
				logger.error(e1.getMessage());
				e1.printStackTrace();
			} catch (Exception e1) {
				logger.error(e1.getMessage());
				e1.printStackTrace();
			}
			// System.out.println(sb.toString());
			// System.out.println("1....");
			if (mac != null) {
				// System.out.println("2.....");
				//				System.out.println("mac.length " + mac.length);
				if (mac.length > 0) {
					for (int i = 0; i < mac.length; i++) {
						sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
					}
				}
			}
			// System.out.println(sb.toString());
			// audCD.setC_usuario_red(request.getLocalName());
			// audCD.setC_ipaddr(ipAddress);
			// audCD.setC_pcname(request.getRemoteHost());
			// audCD.setC_usuario_red(System.getenv("USERNAME"));
			//			System.out.println("A....");
			audCD.setC_usuario_red(System.getProperty("user.name"));
			//			System.out.println("B....");
			// audCD.setC_ipaddr(InetAddress.getLocalHost().getHostAddress());
			audCD.setC_ipaddr(ia.getHostAddress());
			//			System.out.println("C....");
			// audCD.setC_pcname(InetAddress.getLocalHost().getHostName());
			audCD.setC_pcname(InetAddress.getLocalHost().getHostName());// + "-" + ia.getHostName());
			//			System.out.println("D....");
			// audCD.setC_mcaddr(sb.toString());
			audCD.setC_mcaddr(Usuario.leeMAC());
			//			System.out.println("E....");
			audCD.setCampo_modificado("ESTD_USUAR");
			audCD.setValor_anterior("A");
			UsuarioCamposAud cau = new UsuarioCamposAud();
			cau.setESTD_USUAR("A");
			audCD.setCamposAudit(cau);
		} catch (UnknownHostException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} finally {
			System.out.println("...........datos_Aud_usuario_tablas_cab_det");
		}
	}
	
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		try {
			// logger.info("execute......refreshProvider");
			refreshProvider();
		} catch (SQLException sql) {
			logger.error("", sql);
			sql.printStackTrace();
			
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
		}
	}
}
