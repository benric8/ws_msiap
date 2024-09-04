// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VerificaRegistroDAOImpl.java

package pe.gob.pj.rnc.dao;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.lang.StringUtils;

import pe.gob.pj.rnc.criterio.CriterioVerificarNombresApellidos;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.Usuario;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.JdbcDaoTemplate;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            VerificaRegistroDAO

public class VerificaRegistroDAOImpl extends JdbcDaoTemplate implements VerificaRegistroDAO {

	static MyLogger logger = new MyLogger(VerificaRegistroDAOImpl.class.getName());

	private static final String CALL_SP = "{call ";

	private static final String USP_BUSQUEDA_OFICIO_MAT = "usp_busqueda_oficio_mat";

	private static final String USP_BUSQUEDA_OFICIO = "usp_busqueda_oficio";

	private static final String USP_BUSQ_OFI_APE_IGUAL = "usp_busq_ofi_ape_igual";
	//Erodriguezbu integración siap y msiap
	//** Las constantes estáticas tienes la terminación "_mag" para magistrado
	private static final String USP_BOL_BUSCA_BOLETIN_X_NOMBRE = "usp_bol_appaterno_parecido"; // "usp_bol_busca_boletin_x_nombre";

	// //
	// //"usp_bol_appaterno_parecido";
	private static final String USP_BOL_BUSCA_X_MATERNO = "usp_bol_apmaterno_parecido"; // "usp_bol_busca_x_materno";//

	// //"usp_bol_apmaterno_parecido";
	private static final String USP_BOL_BUSCA_BOLETIN_X_NOMB = "usp_bol_nombre_parecido"; // "usp_bol_busca_boletin_x_nomb";

	// //
	// //"usp_bol_nombre_parecido";
	private static final String BOLETIN_ID = "NUMR_BOLETN";

	private static final String REGISTRO_ID = "id_registro";

	MyLogger loger;

	public VerificaRegistroDAOImpl(DaoManager daoManager) {
		super(daoManager);
	}

	private boolean comparador(String nombresSolicitud[],
			String nombresDocumento[]) {// nombresDocumento
		// es
		// lo
		// que
		// se
		// trae
		// del
		// procedimiento
		// tabla
		// boleta
		// BigDecimal mitad = new BigDecimal(1);
		boolean hallazgo = false;

		try {
			String arr$[] = nombresSolicitud;
			int len$ = arr$.length;
			for (int i$ = 0; i$ < len$; i$++) {
				String nombre = arr$[i$];
				if (nombre == null || "".equals(nombre)) {
					continue;
				}
				nombre = nombre.trim();
				int longitudSolicitud = nombre.length();
				String mitadIzquierda;
				String mitadDerecha;
				if (longitudSolicitud > 1) {
					// BigDecimal _tmp = mitad;
					int longitudAnalizable = BigDecimal.valueOf(
							longitudSolicitud / 2).intValue();
					mitadIzquierda = nombre.substring(0, longitudAnalizable);
					mitadDerecha = StringUtils.reverse(StringUtils.reverse(
							nombre).substring(0, longitudAnalizable));
				} else {
					// int longitudAnalizable = 1;
					mitadIzquierda = nombre;
					mitadDerecha = nombre;
				}
				String arrD$[] = nombresDocumento;
				int lenD$ = arrD$.length;
				for (int j$ = 0; j$ < lenD$; j$++) {
					String nombreDocumento = arrD$[j$];
					if (nombreDocumento == null || "".equals(nombreDocumento))
						continue;
					nombreDocumento = nombreDocumento.trim();
					int diferencia = longitudSolicitud
							- nombreDocumento.length();
					/* if (1 < diferencia || diferencia < -1)continue; */
					if (-2 < diferencia && diferencia < 2) {
						if (nombreDocumento.startsWith(mitadIzquierda))
							return true;
						if (nombreDocumento.endsWith(mitadDerecha))
							return true;
					}
				}
			}
		} catch (Exception e) {
			logger.error("", e);

		}
		return hallazgo;
	}

	private boolean filtroBoletines(String nombresBoletin, String nombre1,
			String nombre2, String nombre3) {

		String nombresBol[] = (String[]) nombresBoletin.split("[,]{1,15}");
		nombresBol = (String[]) nombresBol[1].trim().split("[ ]{1,150}");
		String nombresSolicitud[] = (String[]) (String[]) Array.newInstance(
				String.class, 3);
		nombresSolicitud[0] = nombre1;
		nombresSolicitud[1] = nombre2;
		nombresSolicitud[2] = nombre3;
		return comparador(nombresSolicitud, nombresBol);
	}

	private boolean filtroOficios(String nombre1Oficio, String nombre2Oficio,
			String nombre1, String nombre2) {

		String nombresOfi[] = (String[]) (String[]) Array.newInstance(
				String.class, 10);
		String nombresSolicitud[] = (String[]) (String[]) Array.newInstance(
				String.class, 2);
		String nomb1[] = null;
		String nomb2[] = null;
		if (nombre1Oficio != null)
			nomb1 = (String[]) nombre1Oficio.trim().split("[ ]{1,150}");
		if (nombre2Oficio != null)
			nomb2 = (String[]) nombre2Oficio.trim().split("[ ]{1,150}");

		if (nomb1 != null) {
			for (int i = 0; i < nomb1.length; i++) {
				nombresOfi[i] = nomb1[i];
			}
		}
		if (nomb2 != null) {
			for (int i = 0; i < nomb2.length; i++) {
				nombresOfi[nomb1.length + i] = (String) nomb2[i];
			}
		}
		nombresSolicitud[0] = nombre1;
		nombresSolicitud[1] = nombre2;
		return comparador(nombresSolicitud, nombresOfi);
	}

	private void logerInfo(String procedimiento, String campoNombre,
			String valor, CriterioVerificarNombresApellidos criterio) {
		String texto = "";
		texto = texto + "[ST:" + procedimiento + "]";
		texto = texto + "[" + campoNombre + ":" + valor + "]";
		texto = texto + criterio.getPropiedades();
		loger.info(texto);
	}

	public boolean[] verificaNombresApellidos(Connection conexion,
			CriterioVerificarNombresApellidos criterio, Usuario usuario)
			throws SQLException {

		loger = new MyLogger(usuario, this.getClass().getName());

		boolean resultado[] = new boolean[2];
		resultado[0] = false;
		resultado[1] = false;
		Connection con = null;
		boolean resultadoTemporal = false;
		int longitudSolicitud = 0;
		int longitudAnalizable = 0;
		String mitadIzquierda = null;
		String mitadDerecha = null;
		CallableStatement cs;
		ResultSet result;
		try {
			if (criterio.getNombre1() != null) {
				longitudSolicitud = criterio.getNombre1().length();
				longitudAnalizable = BigDecimal.valueOf(longitudSolicitud / 2).intValue();
				mitadIzquierda = criterio.getNombre1().substring(0,longitudAnalizable);
				mitadDerecha = StringUtils.reverse(StringUtils.reverse(criterio.getNombre1()).substring(0, longitudAnalizable));
				
			} else {
				mitadIzquierda = "***";
				mitadDerecha = "***";
			}
			con = conexion;
			cs = con.prepareCall(CALL_SP + USP_BOL_BUSCA_BOLETIN_X_NOMB+ " (?,?,?,?,?,?)}");
			cs.setString(1, (criterio.getApellidoPaterno() != null ? criterio.getApellidoPaterno() : "***"));
			cs.setString(2, (criterio.getApellidoMaterno() != null ? criterio.getApellidoMaterno() : "***"));
			cs.setString(3, mitadIzquierda);
			cs.setString(4, mitadDerecha);

			if (criterio.getNombre2() != null) {
				longitudSolicitud = criterio.getNombre2().length();
				longitudAnalizable = BigDecimal.valueOf(longitudSolicitud / 2).intValue();
				mitadIzquierda = criterio.getNombre2().substring(0,longitudAnalizable);
				mitadDerecha = StringUtils.reverse(StringUtils.reverse(criterio.getNombre2()).substring(0, longitudAnalizable));
				
			} else {
				mitadIzquierda = "***";
				mitadDerecha = "***";
			}
			cs.setString(5, mitadIzquierda);
			cs.setString(6, mitadDerecha);
			// cs.registerOutParameter(7, 4);
			result = cs.executeQuery();

			do {
				if (!result.next())
					break;

				try {
					resultado[0] = filtroBoletines(","+ result.getString("NOMBRE"),	criterio.getNombre1(), criterio.getNombre2(),criterio.getNombre3());

				} catch (Exception e) {
					logger.error("", e);
					e.printStackTrace();
				}
				if (resultado[0])
					logerInfo(USP_BOL_BUSCA_BOLETIN_X_NOMB, BOLETIN_ID, "",	criterio);

			} while (!resultado[0]);
			result = null;
			
			if (!resultado[0]) { 
				if (criterio.getApellidoMaterno() != null) {
					longitudSolicitud = criterio.getApellidoMaterno().length();
					longitudAnalizable = (int) Math.round(longitudSolicitud * 0.5);
	
					mitadIzquierda = criterio.getApellidoMaterno().substring(0,longitudAnalizable);
					if ((longitudSolicitud % 2) != 0)
						longitudAnalizable = longitudAnalizable - 1;
					mitadDerecha = StringUtils.reverse(StringUtils.reverse(criterio.getApellidoMaterno()).substring(0,longitudAnalizable));
				} else {
					mitadIzquierda = "***";
					mitadDerecha = "***";
				}
				
	
				cs = con.prepareCall(CALL_SP + USP_BOL_BUSCA_X_MATERNO+ " (?,?,?,?,?,?)}");
				cs.setString(1, mitadIzquierda);
				cs.setString(2, mitadDerecha);
				cs.setString(3, (criterio.getApellidoPaterno() != null ? criterio.getApellidoPaterno() : "***"));
				cs.setString(4, (criterio.getNombre1() != null ? criterio.getNombre1() : "***"));
				cs.setString(5, (criterio.getNombre2() != null ? criterio.getNombre2() : "***"));
				cs.setInt(6, longitudSolicitud);
				// cs.registerOutParameter(6, 4);
				result = cs.executeQuery();

			
				do {
					if (!result.next())
						break;

					resultadoTemporal = filtroBoletines(","+ result.getString("NOMBRE"),criterio.getNombre1(), criterio.getNombre2(),
							criterio.getNombre3());
					if (resultadoTemporal)
						logerInfo(USP_BOL_BUSCA_X_MATERNO, BOLETIN_ID, "",criterio);
				} while (!resultadoTemporal);
				if (resultadoTemporal)
					resultado[0] = resultadoTemporal;
			}
			result = null;
			if (!resultado[0]) {
				if (criterio.getApellidoPaterno() != null) {
					longitudSolicitud = criterio.getApellidoPaterno().length();
					longitudAnalizable = (int) Math.round(longitudSolicitud * 0.5);
					
					mitadIzquierda = criterio.getApellidoPaterno().substring(0,longitudAnalizable);
					if ((longitudSolicitud % 2) != 0)
						longitudAnalizable = longitudAnalizable - 1;
					mitadDerecha = StringUtils.reverse(StringUtils.reverse(criterio.getApellidoPaterno()).substring(0,longitudAnalizable));
					
				} else {
					mitadIzquierda = "***";
					mitadDerecha = "***";
				}
				cs = con.prepareCall(CALL_SP + USP_BOL_BUSCA_BOLETIN_X_NOMBRE+ " (?,?,?,?,?,?)}");
				cs.setString(1, mitadIzquierda);
				cs.setString(2, mitadDerecha);
				cs.setString(3, (criterio.getApellidoMaterno() != null ? criterio.getApellidoMaterno() : "***"));
				cs.setString(4, (criterio.getNombre1() != null ? criterio.getNombre1() : "***"));
				cs.setString(5, (criterio.getNombre2() != null ? criterio.getNombre2() : "***"));
				cs.setInt(6, longitudSolicitud);
				// cs.registerOutParameter(6, 4);
				result = cs.executeQuery();
				
				do {
					if (!result.next())
						break;

					resultadoTemporal = filtroBoletines(","+ result.getString("NOMBRE"),criterio.getNombre1(), criterio.getNombre2(),
							criterio.getNombre3());
					if (resultadoTemporal)
						logerInfo(USP_BOL_BUSCA_BOLETIN_X_NOMBRE, BOLETIN_ID,"", criterio);
				} while (!resultadoTemporal);
				if (resultadoTemporal)
					resultado[0] = resultadoTemporal;
			}

			resultadoTemporal = false;
			result = null;

			cs = con.prepareCall(CALL_SP + USP_BUSQ_OFI_APE_IGUAL+ " (?,?,?,?)}");
			cs.setString(1, criterio.getApellidoPaterno());
			cs.setString(2, criterio.getApellidoMaterno());
			cs.setString(3, criterio.getNombre1());
			cs.setString(4, criterio.getNombre2());
			result = cs.executeQuery();

			do {
				if (!result.next())
					break;

				resultadoTemporal = filtroOficios(result.getString("nombre1"),result.getString("nombre2"), criterio.getNombre1(),criterio.getNombre2());
				if (resultadoTemporal)
					logerInfo(USP_BUSQ_OFI_APE_IGUAL, REGISTRO_ID, "", criterio);
			} while (!resultadoTemporal);
			if (resultadoTemporal) {
				resultado[1] = resultadoTemporal;
				return resultado;
			}
		} catch (SQLException e) {
			logger.error("", e);
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			logger.error("", e);
			return null;
		}
		result = null;
		
		if (!resultado[1]) {
			cs = con.prepareCall(CALL_SP + USP_BUSQUEDA_OFICIO + " (?,?,?,?)}");
			cs.setString(1, criterio.getApellidoPaterno());
			cs.setString(2, criterio.getApellidoMaterno());
			cs.setString(3, criterio.getNombre1());
			cs.setString(4, criterio.getNombre2());
			result = cs.executeQuery();
			
			do {
				if (!result.next())
					break;

				resultadoTemporal = filtroOficios(result.getString("nombre1"),result.getString("nombre2"), criterio.getNombre1(),
						criterio.getNombre2());
				if (resultadoTemporal)
					logerInfo(USP_BUSQUEDA_OFICIO, REGISTRO_ID, "", criterio);
			} while (!resultadoTemporal);
			if (resultadoTemporal) {
				resultado[1] = resultadoTemporal;
				return resultado;
			}
		}
		result = null;
		if (!resultado[1]) {
			cs = con.prepareCall(CALL_SP + USP_BUSQUEDA_OFICIO_MAT + " (?,?,?,?)}");
			cs.setString(1, criterio.getApellidoPaterno());
			cs.setString(2, criterio.getApellidoMaterno());
			cs.setString(3, criterio.getNombre1());
			cs.setString(4, criterio.getNombre2());
			result = cs.executeQuery();
			
			do {
				if (!result.next())
					break;

				resultadoTemporal = filtroOficios(result.getString("nombre1"),result.getString("nombre2"), criterio.getNombre1(),
						criterio.getNombre2());
				if (resultadoTemporal)
					logerInfo(USP_BUSQUEDA_OFICIO_MAT, REGISTRO_ID, "",	criterio);
			} while (!resultadoTemporal);
			if (resultadoTemporal) {
				resultado[1] = resultadoTemporal;
				return resultado;
			}
		}

		return resultado;
	}

}
