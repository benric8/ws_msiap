// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   Usuario.java

package pe.gob.pj.rnc.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.service.AudAntecPenWsManager;
import pe.gob.pj.rnc.service.Aud_usuario_tablas_cab_detManager;
import pe.gob.pj.rnc.tipo.Texto; //import uif.login;
import pe.gob.pj.util.Constantes;

public class Usuario {
	public static final String		PREF_USUARIO_WEB_CODIGO	= "WEB";
	public static final String		ESTADO_ACTIVO						= "A";
	public static final String		ESTADO_INACTIVO					= "I";
	public static final String		APLICACION_MAGISTRADO		= "002";
	public static final String		APLICACION_MSIAP				= "001";
	private final static MyLogger	logger									= new MyLogger(Usuario.class.getName());
	private UsuarioCamposAud		camposAudit;

	private String	CODG_USUAR;
	private String	NOMB_USUAR;
	private String	APLL_USUAR;
	private String	ESTD_USUAR;
	private String	PREF_USUAR;
	private String	CONE_USUAR;
	private String	C_CLAVE;
	private String	L_DENTRY;
	private String	C_DISTRITO;
	private String	L_TIP_CERTIF;
	private String	CODG_DISTRITO_JUDICIAL;
	private Date		FECH_NACIMIENTO;
	private String	DESC_DIRECCION;
	private String	NUMR_TELEFONO;
	private String	NUMR_CELULAR;
	private String	DESC_COREEO;
	private String	DESC_OBSERVACIONES;
	private String	L_INGRESO;
	private Integer	CODG_ENTIDAD_EXTERNA;
	private String	DESC_TITULO;
	private String	CODG_TIPO;
	private String	COD_PERFIL;
	private String	C_PERFIL;
	private String	AUD_CODG_USUAR;
	private String	C_NUMDOCIDT;
	private String	DESC_MOTIVO;
	private String	CODG_JUZGAD;
	private String	NUME_JUZGA;

	private String	COD_CLAVE;
	// Atributos para la consulta
	private String	x_perfil;
	private String	DESC_ENTIDAD_EXTERNA;
	private String	DESC_DISTRITO_JUDICIAL;
	private String	DESC_JUZGAD;
	private String	FLAG_MANT;
	private String	CODG_LUGAR;
	private String	COD_APLICACION;

	private String	CODG_DISTRITO_JUDICIAL_MAG;	;

	private Date		FECH_VENCI;
	private String TIPO_DOC_IDENT;
	//campos utilizados para recuperar contraseña
	private String codUsuEncriptado;
	private String toquen;
	private Date fechaRecuperacion;
	private Date fechaCambio;
	private Timestamp fechaActual;
	private boolean esCorreoModificado;
	private String link;
	private Date fechaAceptaTerminos;
	private String indicadorAceptaTerminos;

	// private static final String[] HEADERS_TO_TRY = { "X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP",
	// "HTTP_X_FORWARDED_FOR", "HTTP_X_FORWARDED", "HTTP_X_CLUSTER_CLIENT_IP", "HTTP_CLIENT_IP", "HTTP_FORWARDED_FOR",
	// "HTTP_FORWARDED", "HTTP_VIA", "REMOTE_ADDR" };

	public boolean isDeCorteSuprema() {
		return EntidadExterna.CORTE_SUPREMA_ID.equals(getCODG_ENTIDAD_EXTERNA());
	}

	public String getAPELLIDOSNOMBRES() {
		if (!"%".equals(getCODG_USUAR())) {
			String resultado = "";
			if (Texto.contieneAlgo(getAPLL_USUAR()))
				resultado = resultado + getAPLL_USUAR() + ", ";
			if (Texto.contieneAlgo(getNOMB_USUAR()))
				resultado = resultado + getNOMB_USUAR() + "";
			return resultado;
		}
		return "TODOS LOS USUARIOS";
	}

	public boolean isInterno() {
		return DistritoJudicial.CORTE_SUPREMA_ID.equals(getCODG_DISTRITO_JUDICIAL());
	}

	public boolean isExterno() {
		return DistritoJudicial.RELACIONES_EXTERIORES_ID.equals(getCODG_DISTRITO_JUDICIAL());
	}

	public boolean isPerfilAdministrador() {
		return Perfil.ADMINISTRADOR_ID.equals(getCOD_PERFIL());
	}

	public boolean isPerfilOperador() {
		return Perfil.OPERADOR_ID.equals(getCOD_PERFIL());
	}

	public boolean isPerfilSupervisor() {
		return Perfil.SUPERVISOR_ID.equals(getCOD_PERFIL());
	}

	public boolean isPerfilOperadorJudicial() {
		return Perfil.OPERADOR_JUDICIAL_ID.equals(getCOD_PERFIL());
	}

	public boolean isPerfilSupervisorJudicial() {
		return Perfil.SUPERVISOR_JUDICIAL_ID.equals(getCOD_PERFIL());
	}

	public Usuario() {
	}

	public String getCODG_USUAR() {
		return CODG_USUAR;
	}

	public void setCODG_USUAR(String CODG_USUAR) {
		this.CODG_USUAR = CODG_USUAR;
	}

	public String getNOMB_USUAR() {
		return NOMB_USUAR;
	}

	public void setNOMB_USUAR(String NOMB_USUAR) {
		this.NOMB_USUAR = NOMB_USUAR;
	}

	public String getAPLL_USUAR() {
		return APLL_USUAR;
	}

	public void setAPLL_USUAR(String APLL_USUAR) {
		this.APLL_USUAR = APLL_USUAR;
	}

	public String getESTD_USUAR() {
		return ESTD_USUAR;
	}

	public void setESTD_USUAR(String ESTD_USUAR) {
		this.ESTD_USUAR = ESTD_USUAR;
	}

	public String getPREF_USUAR() {
		return PREF_USUAR;
	}

	public void setPREF_USUAR(String PREF_USUAR) {
		this.PREF_USUAR = PREF_USUAR;
	}

	public String getCONE_USUAR() {
		return CONE_USUAR;
	}

	public void setCONE_USUAR(String CONE_USUAR) {
		this.CONE_USUAR = CONE_USUAR;
	}

	public String getC_CLAVE() {
		return C_CLAVE;
	}

	public void setC_CLAVE(String C_CLAVE) {
		if (C_CLAVE != null)
			C_CLAVE = C_CLAVE.trim();
		this.C_CLAVE = C_CLAVE;
	}

	public String getL_DENTRY() {
		return L_DENTRY;
	}

	public void setL_DENTRY(String L_DENTRY) {
		this.L_DENTRY = L_DENTRY;
	}

	public String getC_DISTRITO() {
		return C_DISTRITO;
	}

	public void setC_DISTRITO(String C_DISTRITO) {
		this.C_DISTRITO = C_DISTRITO;
	}

	public String getL_TIP_CERTIF() {
		return L_TIP_CERTIF;
	}

	public void setL_TIP_CERTIF(String L_TIP_CERTIF) {
		this.L_TIP_CERTIF = L_TIP_CERTIF;
	}

	public String getCODG_DISTRITO_JUDICIAL() {
		return CODG_DISTRITO_JUDICIAL;
	}

	public void setCODG_DISTRITO_JUDICIAL(String CODG_DISTRITO_JUDICIAL) {
		this.CODG_DISTRITO_JUDICIAL = CODG_DISTRITO_JUDICIAL;

	}

	public Date getFECH_NACIMIENTO() {
		return FECH_NACIMIENTO;
	}

	public void setFECH_NACIMIENTO(Date FECH_NACIMIENTO) {
		this.FECH_NACIMIENTO = FECH_NACIMIENTO;
	}

	public String getDESC_DIRECCION() {
		return DESC_DIRECCION;
	}

	public void setDESC_DIRECCION(String DESC_DIRECCION) {
		this.DESC_DIRECCION = DESC_DIRECCION;
	}

	public String getDESC_COREEO() {
		return DESC_COREEO;
	}

	public void setDESC_COREEO(String DESC_COREEO) {
		this.DESC_COREEO = DESC_COREEO;
	}

	public String getDESC_OBSERVACIONES() {
		return DESC_OBSERVACIONES;
	}

	public void setDESC_OBSERVACIONES(String DESC_OBSERVACIONES) {
		this.DESC_OBSERVACIONES = DESC_OBSERVACIONES;
	}

	public String getL_INGRESO() {
		return L_INGRESO;
	}

	public void setL_INGRESO(String L_INGRESO) {
		this.L_INGRESO = L_INGRESO;
	}

	public Integer getCODG_ENTIDAD_EXTERNA() {

		return CODG_ENTIDAD_EXTERNA;
	}

	public void setCODG_ENTIDAD_EXTERNA(Integer CODG_ENTIDAD_EXTERNA) {
		if (CODG_ENTIDAD_EXTERNA != null)
			if (CODG_ENTIDAD_EXTERNA.equals(new Integer("0")))
				CODG_ENTIDAD_EXTERNA = null;

		this.CODG_ENTIDAD_EXTERNA = CODG_ENTIDAD_EXTERNA;

	}

	public String getDESC_TITULO() {
		return DESC_TITULO;
	}

	public void setDESC_TITULO(String DESC_TITULO) {
		this.DESC_TITULO = DESC_TITULO;
	}

	public String getC_NUMDOCIDT() {
		return C_NUMDOCIDT;
	}

	public void setC_NUMDOCIDT(String c_numdocidt) {
		C_NUMDOCIDT = c_numdocidt;
	}

	public String getDESC_ENTIDAD_EXTERNA() {
		return DESC_ENTIDAD_EXTERNA;
	}

	public void setDESC_ENTIDAD_EXTERNA(String desc_entidad_externa) {
		DESC_ENTIDAD_EXTERNA = desc_entidad_externa;
	}

	public String getX_perfil() {
		return x_perfil;
	}

	public void setX_perfil(String x_perfil) {
		this.x_perfil = x_perfil;
	}

	public String getCOD_PERFIL() {
		if (COD_PERFIL == null && C_PERFIL != null)
			COD_PERFIL = C_PERFIL;
		return COD_PERFIL;
	}

	public void setCOD_PERFIL(String c_perfil) {
		COD_PERFIL = c_perfil;
	}

	public String getCODG_TIPO() {
		return CODG_TIPO;
	}

	public void setCODG_TIPO(String codg_tipo) {
		CODG_TIPO = codg_tipo;
	}

	public String getC_PERFIL() {

		if (C_PERFIL == null && COD_PERFIL != null)
			C_PERFIL = COD_PERFIL;

		return C_PERFIL;
	}

	public void setC_PERFIL(String c_perfil) {
		C_PERFIL = c_perfil;
	}

	public String getFLAG_MANT() {
		return FLAG_MANT;
	}

	public void setFLAG_MANT(String flag_mant) {
		FLAG_MANT = flag_mant;
	}

	public String getAUD_CODG_USUAR() {
		return AUD_CODG_USUAR;
	}

	public void setAUD_CODG_USUAR(String aud_codg_usuar) {
		AUD_CODG_USUAR = aud_codg_usuar;
	}

	public String getCOD_CLAVE() {

		if (COD_CLAVE == null && C_CLAVE != null)
			COD_CLAVE = C_CLAVE;

		return COD_CLAVE;
	}

	public void setCOD_CLAVE(String C_CLAVE) {
		COD_CLAVE = C_CLAVE;
	}

	public String getCODG_JUZGAD() {

		if (CODG_JUZGAD != null)
			CODG_JUZGAD = CODG_JUZGAD.trim();

		return CODG_JUZGAD;
	}

	public void setCODG_JUZGAD(String codg_juzgad) {

		if (CODG_JUZGAD != null)
			CODG_JUZGAD = CODG_JUZGAD.trim();

		CODG_JUZGAD = codg_juzgad;
	}

	public String getNUME_JUZGA() {
		if (NUME_JUZGA != null)
			NUME_JUZGA = NUME_JUZGA.trim();

		return NUME_JUZGA;
	}

	public void setNUME_JUZGA(String nume_juzga) {
		NUME_JUZGA = nume_juzga;
	}

	public String getDESC_DISTRITO_JUDICIAL() {
		return DESC_DISTRITO_JUDICIAL;
	}

	public void setDESC_DISTRITO_JUDICIAL(String desc_distrito_judicial) {
		DESC_DISTRITO_JUDICIAL = desc_distrito_judicial;
	}

	public String getDESC_JUZGAD() {
		return DESC_JUZGAD;
	}

	public void setDESC_JUZGAD(String desc_juzgad) {
		DESC_JUZGAD = desc_juzgad;
	}

	public String getCODG_LUGAR() {
		if (CODG_LUGAR != null) {
			CODG_LUGAR = CODG_LUGAR.trim();
		}
		return CODG_LUGAR;
	}

	public void setCODG_LUGAR(String codg_lugar) {
		CODG_LUGAR = codg_lugar;
	}

	public String getCODG_DISTRITO_JUDICIAL_MAG() {

		if (CODG_DISTRITO_JUDICIAL_MAG == null)
			CODG_DISTRITO_JUDICIAL_MAG = CODG_DISTRITO_JUDICIAL;
		return CODG_DISTRITO_JUDICIAL_MAG;
	}

	public void setCODG_DISTRITO_JUDICIAL_MAG(String codg_distrito_judicial_mag) {

		CODG_DISTRITO_JUDICIAL_MAG = codg_distrito_judicial_mag;
	}

	public String getCOD_APLICACION() {
		return COD_APLICACION;
	}

	public void setCOD_APLICACION(String cod_aplicacion) {
		COD_APLICACION = cod_aplicacion;
	}

	public Date getFECH_VENCI() {

		return FECH_VENCI;

	}

	public void setFECH_VENCI(Date fech_venci) {
		FECH_VENCI = fech_venci;

	}

	// private void auditoria(Usuario usuario) {
	public AudAntecPenWs auditoria(String respuesta) {
		InetAddress lh;
		AudAntecPenWs ap = null;
		try {
			lh = InetAddress.getLocalHost();
			ap = new AudAntecPenWs();
			String app = this.getAPLL_USUAR();
			if (app.contains(" ")) {
				app = app.split(" ")[0].trim();
				ap.setPs_paterno(app);
				ap.setPs_materno(this.getAPLL_USUAR().substring(app.length() + 1).trim());
			} else {
				ap.setPs_paterno(this.getAPLL_USUAR());
			}
			ap.setPs_nom1(this.getNOMB_USUAR());
			ap.setPs_aud_cod_usuario(this.getCODG_USUAR());
			ap.setPi_aud_cod_entidad(this.getCODG_ENTIDAD_EXTERNA());

			FacesContext facesContext = FacesContext.getCurrentInstance();
			ExternalContext externalContext = facesContext.getExternalContext();
			HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
			String ipAddress = request.getHeader("X-FORWARDED-FOR");
			if (ipAddress == null) {
				ipAddress = request.getRemoteAddr();
			}
			ap.setPs_aud_ip(ipAddress);
			InetAddress ips;
			ips = InetAddress.getLocalHost();

			NetworkInterface network;
			StringBuilder sb = new StringBuilder();
			byte[] mac = null;
			try {
				network = NetworkInterface.getByInetAddress(ips);
				mac = network.getHardwareAddress();
			} catch (SocketException e1) {
				e1.printStackTrace();
			}

			if (mac != null) {
				if (mac.length > 0) {
					for (int i = 0; i < mac.length; i++) {
						sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
					}
				}
			}
			ap.setPs_aud_pc(request.getRemoteHost());
			if ((sb.toString() + "").length() > 16)
				ap.setPs_aud_mcaddr((sb.toString() + ""));
			else ap.setPs_aud_mcaddr(leeMAC());
			ap.setX_resp_ws("");
			ap.setPs_aud_dni(this.getC_NUMDOCIDT() == null ? "" : this.getC_NUMDOCIDT());
			ap.setX_resp_ws((respuesta + "").trim().length() > 0 ? (respuesta + "").trim() : "SIN RESPUESTA");
			if(ap.getX_resp_ws().length()>50) ap.setX_resp_ws(ap.getX_resp_ws().substring(0,50));
			//if (!insertAuditoria(connection, ap)) {
			//	logger.error("auditoria : Error al guardar auditoría.");
			//}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		return ap;

	}

	private boolean insertAuditoria(Connection connection, AudAntecPenWs ap) {
		AudAntecPenWsManager audAntecPenWs = new AudAntecPenWsManager();
		try {
			// audAntecPenWs.insert(getApplicationBean1().getManager()
			// .getConnectionManager(), ap);
			audAntecPenWs.insert(connection, ap);
		} catch (Exception e) {
			//System.out.println("insertAuditoria : Error al guardar auditoria ..... :(");
			logger.info("insertAuditoria : Error al guardar auditoria ..... :(");
			// logger.error("Error : insertAuditoria --> " + e.toString());
			// logger.severe("Error : insertAuditoria --> " + e.toString());
			logger.error("Error : insertAuditoria", e);
			return false;
		}
		return true;
	}

	/*
	 * public static String leeMAC_x() { String sMAC = ""; String command = "/sbin/ifconfig"; String sOsName =
	 * System.getProperty("os.name"); if (sOsName.startsWith("Windows")) { command = "ipconfig /all"; } else { if
	 * ((sOsName.startsWith("Linux")) || (sOsName.startsWith("Mac")) || (sOsName.startsWith("HP-UX"))) { command =
	 * "/sbin/ifconfig"; } else { // System.out.println("The current operating system '" + sOsName +
	 * "' is not supported."); return sMAC; } } Pattern p = Pattern.compile("([a-fA-F0-9]{1,2}(-|:)){5}[a-fA-F0-9]{1,2}");
	 * try { Process pa = Runtime.getRuntime().exec(command); pa.waitFor(); BufferedReader reader = new BufferedReader(new
	 * InputStreamReader(pa.getInputStream())); String line; Matcher m; while ((line = reader.readLine()) != null) { m =
	 * p.matcher(line); if (!m.find()) continue; line = m.group(); sMAC = line; break; } // System.out.println("MAC : " +
	 * line + " command : " + command); } catch (Exception e) { e.printStackTrace(); } return sMAC; }
	 */
	public void auditoria(Connection connection, Aud_usuario_tablas_cab_det audCD) {
		/*try {
			if ((audCD.getC_usuario() + "").trim().length() == 0)
				audCD.setC_usuario(getCODG_USUAR());
			audCD.setC_tabla("USUARIO");
			if ((audCD.getC_accion() + "").trim().length() == 0)
				audCD.setC_accion(audCD.ACTUALIZA);
			audCD.setCod_modificado(getCODG_USUAR());
			FacesContext facesContext = FacesContext.getCurrentInstance();
			ExternalContext externalContext = facesContext.getExternalContext();
			HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
			String ipAddress = request.getHeader("X-FORWARDED-FOR");
			if (ipAddress == null) {
				ipAddress = request.getRemoteAddr();
			}
			InetAddress ips;
			ips = InetAddress.getLocalHost();
			NetworkInterface network;
			StringBuilder sb = new StringBuilder();
			byte[] mac = null;
			try {
				network = NetworkInterface.getByInetAddress(ips);
				mac = network.getHardwareAddress();
			} catch (SocketException e1) {
				e1.printStackTrace();
			}
			logger.info("MAC " + mac == null);
			System.out.println(sb.toString());
			if (mac != null) {
				for (int i = 0; i < mac.length; i++) {
					sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
				}
			}
			Properties props = System.getProperties();
			String userName;
			if ((props.getProperty("os.arch").equals("x86") || props.getProperty("os.arch").equals("amd64"))
					&& props.getProperty("os.name").startsWith("Windows")) {
				userName = System.getProperty("user.name");
			} else {
				userName = System.getProperty("user.name");
			}
			audCD.setC_usuario_red(userName);
			audCD.setC_ipaddr(ipAddress);
			audCD.setC_pcname(InetAddress.getLocalHost().getHostName());// + "-" + ia.getHostName());
			audCD.setC_mcaddr(leeMAC()); //erodriguezbu quitar comentario
			if (!insertAuditoria(connection, audCD)) {
				System.out.println("auditoria : Error al guardar auditoria C_D ... :(");
				logger.info("auditoria : Error al guardar auditoria C_D .... :(");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}*/
	}

	private boolean insertAuditoria(Connection connection, Aud_usuario_tablas_cab_det audCD) {
		Aud_usuario_tablas_cab_detManager audTabCD = new Aud_usuario_tablas_cab_detManager();
		try {
			audTabCD.insert(connection, audCD);
		} catch (Exception e) {
			System.out.println("insertAuditoria : Error al guardar auditoria C_D ..... :(");
			logger.info("insertAuditoria : Error al guardar auditoria C_D ..... :(");
			logger.error("Error : insertAuditoria C_D", e);
			return false;
		}
		return true;
	}

	public static String leeMAC() {
		long li = System.currentTimeMillis();
		// System.out.println("leeMAC....");
		String sMAC = "";
		sMAC = Constantes.M_A_C.trim();
		if (sMAC.length() > 0) {
			// System.out.println(".....---............leeMAC");
			long lf = System.currentTimeMillis();
			// System.out.println("Proceso leeMAC: " + (lf - li));
			// System.out.println("sMAC : " + sMAC);
			logger.info("Proceso 0 leeMAC: " + (lf - li));
			return sMAC;
		}
		String command = "/sbin/ifconfig";
		String sOsName = System.getProperty("os.name");
		// System.out.println("sOsName : " + sOsName);
		if (sOsName.startsWith("Windows")) {
			command = "ipconfig /all";
		} else {
			if ((sOsName.startsWith("Linux")) || (sOsName.startsWith("Mac")) || (sOsName.startsWith("HP-UX"))) {
				command = "/sbin/ifconfig";
			} else {
				// System.out.println("The current operating system '" + sOsName + "' is not supported.");
				return sMAC;
			}
		}
		// System.out.println("command : " + command);
		Pattern p = Pattern.compile("([a-fA-F0-9]{1,2}(-|:)){5}[a-fA-F0-9]{1,2}");
		try {
			Process pa = Runtime.getRuntime().exec(command);
			// System.out.println("pa.waitFor().............");
			BufferedReader reader = new BufferedReader(new InputStreamReader(pa.getInputStream()));
			// System.out.println("reader.readLine()....");
			// while ((reader.readLine()) != null) {System.out.println(reader.readLine());}
			// pa.waitFor();
			// System.out.println("..........reader.readLine()");
			// System.out.println("............pa.waitFor()");
			String line;
			Matcher m;
			// System.out.println("reader.readLine...........");
			while ((line = reader.readLine()) != null) {
				// System.out.println("line --> " + line);
				m = p.matcher(line);
				if (!m.find())
					continue;
				line = m.group();
				sMAC = line;
				break;
			}
			pa.waitFor();
			// System.out.println("...........reader.readLine");
			// System.out.println("............pa.waitFor()");
			// System.out.println("MAC : " + line + " command : " + command);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// System.out.println(".................leeMAC");
			long lf = System.currentTimeMillis();
			// System.out.println("sMAC : " + sMAC);
			// System.out.println("Proceso leeMAC: " + (lf - li));
			Constantes.M_A_C = sMAC.trim();
			logger.info("Proceso 1 leeMAC: " + (lf - li));
		}
		return sMAC;
	}

	public UsuarioCamposAud getCamposAudit() {
		return camposAudit;
	}

	public void setCamposAudit(UsuarioCamposAud camposAudit) {
		this.camposAudit = camposAudit;
	}

	public String getDESC_MOTIVO() {
		return DESC_MOTIVO;
	}

	public void setDESC_MOTIVO(String desc_motivo) {
		DESC_MOTIVO = desc_motivo;
	}

	public String getCodUsuEncriptado() {
		return codUsuEncriptado;
	}

	public void setCodUsuEncriptado(String codUsuEncriptado) {
		this.codUsuEncriptado = codUsuEncriptado;
	}

	public String getToquen() {
		return toquen;
	}

	public void setToquen(String toquen) {
		this.toquen = toquen;
	}

	public Date getFechaRecuperacion() {
		return fechaRecuperacion;
	}

	public void setFechaRecuperacion(Date fechaRecuperacion) {
		this.fechaRecuperacion = fechaRecuperacion;
	}

	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public Timestamp getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(Timestamp fechaActual) {
		this.fechaActual = fechaActual;
	}

	public boolean isEsCorreoModificado() {
		return esCorreoModificado;
	}

	public void setEsCorreoModificado(boolean esCorreoModificado) {
		this.esCorreoModificado = esCorreoModificado;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getNUMR_TELEFONO() {
		return NUMR_TELEFONO;
	}

	public void setNUMR_TELEFONO(String nUMR_TELEFONO) {
		NUMR_TELEFONO = nUMR_TELEFONO;
	}

	public String getNUMR_CELULAR() {
		return NUMR_CELULAR;
	}

	public void setNUMR_CELULAR(String nUMR_CELULAR) {
		NUMR_CELULAR = nUMR_CELULAR;
	}

	public String getTIPO_DOC_IDENT() {
		return TIPO_DOC_IDENT;
	}

	public void setTIPO_DOC_IDENT(String tIPO_DOC_IDENT) {
		TIPO_DOC_IDENT = tIPO_DOC_IDENT;
	}

	public Date getFechaAceptaTerminos() {
		return fechaAceptaTerminos;
	}

	public void setFechaAceptaTerminos(Date fechaAceptaTerminos) {
		this.fechaAceptaTerminos = fechaAceptaTerminos;
	}

	public String getIndicadorAceptaTerminos() {
		return indicadorAceptaTerminos;
	}

	public void setIndicadorAceptaTerminos(String indicadorAceptaTerminos) {
		this.indicadorAceptaTerminos = indicadorAceptaTerminos;
	}

}
