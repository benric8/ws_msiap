// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   SolicitudManager.java
package pe.gob.pj.rnc.web.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import pe.gob.pj.cotejows.service.ServicioWSCotejo;
import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.criterio.CriterioListarSolicitudExterna;
import pe.gob.pj.rnc.criterio.CriterioListarSolicitudInterna;
import pe.gob.pj.rnc.criterio.CriterioVerificarNombresApellidos;
import pe.gob.pj.rnc.dao.AuditoriaMsiapDAO;
import pe.gob.pj.rnc.dao.BoletinDAO;
import pe.gob.pj.rnc.dao.ContadorWebDAO;
import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.DepartamentoDAO; //import pe.gob.pj.rnc.dao.DistritoJudicialDAO;
import pe.gob.pj.rnc.dao.SecuenciaSolicitudDAO;
import pe.gob.pj.rnc.dao.SolicitudDAO;
import pe.gob.pj.rnc.dao.SolicitudExternaAuditoriaDAO;
import pe.gob.pj.rnc.dao.SolicitudExternaDAO;
import pe.gob.pj.rnc.dao.SolicitudExternaItemDAO; 
//import pe.gob.pj.rnc.dao.UsuarioDAO; //import pe.gob.pj.rnc.dao.VerificaRegistroDAO;
import pe.gob.pj.rnc.log.MyLogger;
import pe.gob.pj.rnc.model.AuditoriaMsiap;
import pe.gob.pj.rnc.model.BoletinReporte;
import pe.gob.pj.rnc.model.ContadorWeb;
import pe.gob.pj.rnc.model.Departamento;
import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificado;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.SecuenciaSolicitud;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExample;
import pe.gob.pj.rnc.model.SolicitudExample.Criteria;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.SolicitudExternaAuditoria;
import pe.gob.pj.rnc.model.SolicitudExternaItem;
import pe.gob.pj.rnc.model.SolicitudExternaReporte;
import pe.gob.pj.rnc.model.SolicitudReporte;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidad;
import pe.gob.pj.rnc.model.TipoSolicitud;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.Soporte;
import pe.gob.pj.util.Constantes;
import uif.SessionBean1;
import uif.util.Funciones;

import com.ibatis.dao.client.DaoManager;

public class SolicitudManager {
	static MyLogger	logger	= new MyLogger(SolicitudManager.class.getName());

	private DaoManager daoManager;
	private SolicitudDAO solicitudDAO;
	private SecuenciaSolicitudDAO secuenciaSolicitudDAO;
	private SolicitudExternaDAO solicitudExternaDAO;
	private SolicitudExternaItemDAO solicitudExternaItemDAO;
	private SolicitudExternaAuditoriaDAO solicitudExternaAuditoriaDAO;
	private ContadorWebDAO contadorWebDAO;
	//private UsuarioDAO usuarioDAO;
	private DepartamentoDAO departamentoDAO;
	private BoletinDAO boletinDAO;
	private AuditoriaMsiapDAO auditoriaMsiapDAO;
	DataSource ds = null;
	Context ctx = null;
	private static final Object externoLock = new Object();

	public SolicitudManager() {
		daoManager = DAOConfiguration.getDaoManager();
		solicitudDAO = (SolicitudDAO) daoManager.getDao(SolicitudDAO.class);
		//usuarioDAO = (UsuarioDAO) daoManager.getDao(UsuarioDAO.class);
		secuenciaSolicitudDAO = (SecuenciaSolicitudDAO) daoManager.getDao(SecuenciaSolicitudDAO.class);
		solicitudExternaDAO = (SolicitudExternaDAO) daoManager.getDao(SolicitudExternaDAO.class);
		solicitudExternaItemDAO = (SolicitudExternaItemDAO) daoManager.getDao(SolicitudExternaItemDAO.class);
		boletinDAO = (BoletinDAO) daoManager.getDao(BoletinDAO.class);
		solicitudExternaAuditoriaDAO = (SolicitudExternaAuditoriaDAO) daoManager.getDao(SolicitudExternaAuditoriaDAO.class);
		contadorWebDAO = (ContadorWebDAO) daoManager.getDao(ContadorWebDAO.class); //erodriguezbu integración (comentado en mag.)
		departamentoDAO = (DepartamentoDAO) daoManager.getDao(DepartamentoDAO.class);//erodriguezbu integración (comentado en mag.)//erodriguezbu integración (comentado en mag.)
		auditoriaMsiapDAO = (AuditoriaMsiapDAO) daoManager.getDao(AuditoriaMsiapDAO.class);
		
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup(Soporte.ORIGEN_DE_DATOS);
		} catch (Exception e) {
			logger.error("No se pudo obtener la conexión en SolicitudManager", e);
		}
	}

	public SolicitudExterna selectSolicitudExternaByPrimaryKey(Integer codgCertiExterno) {
		return solicitudExternaDAO.selectByPrimaryKey(codgCertiExterno);
	}

	public List<SolicitudExternaReporte> reporteSolicitudExterna(Map<String, Object> params) {
		return solicitudExternaDAO.reporteSolicitudExterna(params);
	}

	public List<SolicitudExternaReporte> reporteSolicitudExternaBoletin(Map<String, Object> params) {
		List<SolicitudExternaReporte> lista = solicitudExternaDAO.reporteSolicitudExterna(params);

		boolean verRehabilitados = false;
		int count = 0;
		
		for(SolicitudReporte sol: lista.get(0).getSolicitudesList()){
			if(count==0) {
				verRehabilitados = Funciones.rehabilitado(sol.getTipo_solic());			
				lista.get(0).setVerRehabilitados(verRehabilitados);	
			}
			count ++;
			
			if("S".equals(sol.getIndc_registra()) || verRehabilitados)
				buscarBoletin(sol);
		}
		//Realizar el llenado de boletín
		return lista;
	}

	private void buscarBoletin(SolicitudReporte sol) {
		sol.setBoletinAntecedentes(new ArrayList<BoletinReporte>());
		sol.setBoletinRehabilitados(new ArrayList<BoletinReporte>());
		List<BoletinReporte> boletinList = boletinDAO.getBoletin(sol.getCodg_certi());

		for(BoletinReporte bol : boletinList){
			//TODO Se agrega los delitos para los boletines electronicos
			if("E".equals(bol.getTipo())) {
				bol.setDelito1(boletinDAO.consultarDelitoPorBoletinE(bol.getNumr_boletn()));
			}
			if("S".equals(bol.getIndc_rehabilitado()))
				sol.getBoletinRehabilitados().add(bol);
			else
				sol.getBoletinAntecedentes().add(bol);
		}
	}

	public List<SolicitudReporte> reporteSolicitudMagistrado(String codCertificado){
		List<SolicitudReporte> lista= solicitudDAO.reporteSolicitudMagistrado(codCertificado.trim());

		lista.get(0).setBoletinRehabilitados(new ArrayList<BoletinReporte>());
		List<BoletinReporte> boletinNoRehabilitados = new ArrayList<BoletinReporte>();

		for(BoletinReporte bol : lista.get(0).getBoletinAntecedentes()){
			bol.setOtrosDelitos(solicitudDAO.delitosPorBoletin(bol.getNumr_boletn()));
			//TODO Se agrega los delitos para los boletines electronicos
			if("E".equals(bol.getTipo())) {
				bol.setDelito1(boletinDAO.consultarDelitoPorBoletinE(bol.getNumr_boletn()));
			}
			if("S".equals(bol.getIndc_rehabilitado()))
				lista.get(0).getBoletinRehabilitados().add(bol);
			else
				boletinNoRehabilitados.add(bol);
		}

		lista.get(0).setBoletinAntecedentes(boletinNoRehabilitados);

		return lista;
	}

	public List<SolicitudReporte> reporteSolicitudMagistradoParams(Map<String, Object> params){
		List<SolicitudReporte> lista= solicitudDAO.reporteSolicitudMagistrado(params);

		if(lista!=null && lista.size()>0){
			lista.get(0).setBoletinRehabilitados(new ArrayList<BoletinReporte>());
			List<BoletinReporte> boletinNoRehabilitados = new ArrayList<BoletinReporte>();

			for(BoletinReporte bol : lista.get(0).getBoletinAntecedentes()){
				bol.setOtrosDelitos(solicitudDAO.delitosPorBoletin(bol.getNumr_boletn()));

				if("S".equals(bol.getIndc_rehabilitado()))
					lista.get(0).getBoletinRehabilitados().add(bol);
				else
					boletinNoRehabilitados.add(bol);
			}
			lista.get(0).setBoletinAntecedentes(boletinNoRehabilitados);
		}

		return lista;
	}

	public List<SolicitudReporte> reporteSolicitudesRangoFechas(Map<String,Object> params){
		List<SolicitudReporte> lista= solicitudDAO.reporteSolicitudesRangoFechas(params);
		return lista;
	}

	public Solicitud selectByPrimaryKeySolicitud(String codigoCertificado) {
		return solicitudDAO.selectByPrimaryKey(codigoCertificado);
	}

	public boolean insertSolicitudCompleta(SolicitudExterna solicitudExterna, ArrayList<Solicitud> solicitudes, Usuario usuario) throws Exception {
		boolean retorno = false;
		SecuenciaSolicitud secuencia = new SecuenciaSolicitud();
		secuencia.setCODG_PREFI(Usuario.PREF_USUARIO_WEB_CODIGO);
		Calendar cal = new GregorianCalendar();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Solicitud solicitud = null;
		SolicitudExternaAuditoria sea = new SolicitudExternaAuditoria();
		int contadorDescarte = 0;
		int contadorSinDescarte = 0;
		String num_certi = null;
		String anho = String.valueOf(cal.get(1));

		synchronized(externoLock){
		try {
			daoManager.startTransaction();
			solicitudExterna.setNUM_ANHO(String.valueOf(cal.get(1)));
			solicitudExternaDAO.insert(solicitudExterna);
			Integer codgCertiExterno = solicitudExterna.getCODG_CERTI_EXTERNO();
			ContadorWeb contadorWeb = contadorWebDAO.selectByPrimaryKey(Integer.valueOf(2));
			if (!anho.equals(contadorWeb.getNUM_ANHO())) {
				contadorWeb.setNUM_ANHO(anho);
				contadorWeb.setNUM_CORRELATIVO(Integer.valueOf(0));
			} else {
				contadorWeb.setNUM_CORRELATIVO(Integer.valueOf(contadorWeb.getNUM_CORRELATIVO().intValue() + 1));
			}
			contadorWebDAO.updateByPrimaryKey(contadorWeb);
			solicitudExterna.setNUM_CORRELATIVO_OFI(contadorWeb.getNUM_CORRELATIVO());
			solicitudExterna.setNUM_ANHO(contadorWeb.getNUM_ANHO());
			contadorWeb = contadorWebDAO.selectByPrimaryKey(Integer.valueOf(1));
			int correlativo_num_certi = contadorWeb.getNUM_CORRELATIVO().intValue();
			// solicitudExterna.setFECH_ENVIO(cal.getTime());
			SolicitudExternaItem solicitudExternaItem;

			for (Iterator<Solicitud> it = solicitudes.iterator(); it.hasNext(); solicitudExternaItemDAO.insert(solicitudExternaItem)) {
				Calendar fecha = Calendar.getInstance();
				correlativo_num_certi++;
				num_certi = (new StringBuilder()).append("0000000").append(String.valueOf(correlativo_num_certi)).toString();
				num_certi = num_certi.substring(num_certi.length() - 7, num_certi.length());
				solicitud = it.next();

				Integer idEntidadExterna = usuario.getCODG_ENTIDAD_EXTERNA();
				Departamento departamento = departamentoDAO.obtenerPorCodEntidadExterna(idEntidadExterna);
				String codigoLugar = departamento.getCODG_LUGAR();
				solicitud.setCODG_LUGAR(codigoLugar);
				String idDistritoJudicial = usuario.getCODG_DISTRITO_JUDICIAL();
				solicitud.setCODG_DISTRITO_JUDICIAL(idDistritoJudicial);
				solicitud.setDESC_TASA("SIN TASAS");
				solicitud.setNUME_CERTI(num_certi);
				solicitud.setFECH_REGISTRO(fecha.getTime());
				solicitud.setFECH_DIGIT_SOLIC(fecha.getTime());
				solicitud.setCODG_USU_ULT_MODI(usuario.getCODG_USUAR());
				solicitud.setFECH_ULT_MODI(fecha.getTime());
				
				//Se agrega c�digo de validaci�n a este campo por error en el sistema de CONDENAS al recibir un c�digo
				if(pe.gob.pj.util.Constantes.ENTIDAD_MINEDU_CODIGO_DJ.equals(usuario.getCODG_DISTRITO_JUDICIAL())) {
					String obs = (solicitud.getOBSERVACION() != null? solicitud.getOBSERVACION() : "") +
							" - Cod. de val.:" + solicitud.getNUME_EXPED_SOLIC();
					solicitud.setOBSERVACION(obs.length()>250?obs.substring(0,250):obs);
					//Campo a null porque el sistema de condenas arroja error al manejar la cadena con 40 caracteres
					solicitud.setNUME_EXPED_SOLIC(null);
				}
				
				String detalleAudit = dateFormat.format(fecha.getTime())+
						", "+usuario.getCODG_USUAR()+", "+solicitud.getCODG_ESTADO_SOLICITUD();
				solicitud.setDESC_FEC_USU_MODI(detalleAudit);
				//solicitudDAO.insert(solicitud);
				//INSERTAR SOLICITUD PROVINCIA
				insertSolicitudProvincia(solicitud); 
				secuencia.setCODG_CORRE(solicitud.getCODG_CERTI());
				secuenciaSolicitudDAO.updateByPrimaryKeySelective(secuencia);
				solicitudExternaItem = new SolicitudExternaItem();
				solicitudExternaItem.setCODG_CERTI(solicitud.getCODG_CERTI());
				solicitudExternaItem.setCODG_CERTI_EXTERNO(codgCertiExterno);

				if (solicitud.getMARCA().equals("S") || solicitud.getL_INDC_OFICIO().equals("S")) {
					solicitudExternaItem.setINDC_DESCARTE("S");
					contadorDescarte++;
				} else {
					solicitudExternaItem.setINDC_DESCARTE("N");
					contadorSinDescarte++;
				}
				//*** Inicio codigo de verificación
				//String codigoAlternativo = solicitudDAO.getPkAlternativo(solicitud.getCODG_CERTI());

				//Map<String, Object> map = new HashMap<String, Object>();
				//map.put("pk_alternativo", codigoAlternativo);
				//map.put("CODG_CERTI", solicitud.getCODG_CERTI());
				//int cont = solicitudDAO.updateByPrimaryKeySolicitudSelective(map);

				//if(cont ==0) {
					//logger.error("No se pudo actualizar pk_alternativo de solicitud");
					//throw new Exception("Error al guardar la solicitud. Intente de nuevo por favor.");
				//}
				//*** Fin código de verificación
			}
			Calendar fech = Calendar.getInstance();
			contadorWeb.setNUM_CORRELATIVO(Integer.valueOf(correlativo_num_certi));
			contadorWebDAO.updateByPrimaryKeySelective(contadorWeb);
			sea.setCODG_CERTI_EXTERNO(solicitudExterna.getCODG_CERTI_EXTERNO());
			sea.setCODG_USUAR(solicitudExterna.getCODG_USUAR());
			if (contadorDescarte == 0 && contadorSinDescarte > 0) {
				solicitudExterna.setCODG_ESTADO("ATE");
				solicitudExterna.setFECH_ATENCION(fech.getTime());
				String temporal = (new StringBuilder()).append("00000").append(solicitudExterna.getNUM_CORRELATIVO_OFI()).append("-").append(solicitudExterna.getNUM_ANHO())
						.append("-A").toString();
				temporal = temporal.substring(temporal.length() - 12, temporal.length());
				solicitudExterna.setV_OFI_RESPUESTA_A(temporal);
				sea.setDESC_ACCION("Enviada al RNC");
				sea.setFECH_ACCION(fech.getTime());
				solicitudExternaAuditoriaDAO.insert(sea);
				sea.setCODG_USUAR(null);
				sea.setCODG_CORRELATIVO(null);
				sea.setDESC_ACCION((new StringBuilder()).append("Atendida con oficio N\260 ").append(temporal).toString());
				sea.setFECH_ACCION(fech.getTime());
			} else if (contadorDescarte > 0 && contadorSinDescarte == 0) {
				solicitudExterna.setCODG_ESTADO("ENV");
				sea.setDESC_ACCION("Enviada al RNC");
				sea.setFECH_ACCION(fech.getTime());
			} else if (contadorSinDescarte > 0 && contadorDescarte > 0) {
				String temporal = (new StringBuilder()).append("00000").append(solicitudExterna.getNUM_CORRELATIVO_OFI()).append("-").append(solicitudExterna.getNUM_ANHO())
						.append("-A").toString();
				temporal = temporal.substring(temporal.length() - 12, temporal.length());
				solicitudExterna.setV_OFI_RESPUESTA_A(temporal);
				solicitudExterna.setCODG_ESTADO("RPA");
				sea.setDESC_ACCION("Enviada al RNC");
				sea.setFECH_ACCION(fech.getTime());
				solicitudExternaAuditoriaDAO.insert(sea);
				sea.setCODG_USUAR(null);
				sea.setCODG_CORRELATIVO(null);
				sea.setDESC_ACCION((new StringBuilder()).append("Respuesta Parcial del RNC con Oficio N\260 ").append(temporal).toString());
				sea.setFECH_ACCION(fech.getTime());
			}
			solicitudExterna.setNUM_REGISTROS_POR_ATENDER(new Integer(contadorDescarte));
			solicitudExterna.setNUM_REGISTROS_ATENDIDOS(Integer.valueOf(contadorSinDescarte));
			solicitudExterna.setFECH_ENVIO(cal.getTime());

			solicitudExternaDAO.updateByPrimaryKey(solicitudExterna);
			solicitudExternaAuditoriaDAO.insert(sea);
			daoManager.commitTransaction();
			retorno = true;
		} catch (Exception e) {
			logger.error("Error al insertar solicitud");
			e.printStackTrace();
			throw new Exception("ErrorInsercion");
		} finally {
			daoManager.endTransaction();
		}
		}
		return retorno;
	}

//	public void cotejar(ArrayList<Solicitud> solicitudes, Usuario usuario) throws Exception{
//		try{
//			for(Solicitud solicitud : solicitudes){
//				String respuesta = "";
//				if ((Arrays.asList(Constantes.ENTIDADES_REPORT_REHABIL).indexOf(String.valueOf(usuario.getCODG_ENTIDAD_EXTERNA())) >= 0)
//						&& (solicitud.getTIPO_SOLIC().equals(Constantes.TIPO_SOLICITUD_SUCAMEC))) {
//					respuesta = ServicioWSCotejo.cotejarPersonaSuc(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(), solicitud.getNOM1_SOLIC(),
//							solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
//									solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC());
//				} else {
//					respuesta = ServicioWSCotejo.cotejarPersona(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(), solicitud.getNOM1_SOLIC(),
//							solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
//									solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC());
//				}
//
//				if (respuesta == null || "".equals(respuesta)
//						|| !(respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_SIN_OFICIO)
//								|| respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_CON_OFICIO)
//								|| respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_CON_OFICIO) || respuesta
//								.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_SIN_OFICIO))) {
//					logger.error("Error del WS de Cotejo. La respuesta es nula.");
//					throw new Exception("Error de descarte, intente de nuevo");
//				} else {
//					if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_CON_OFICIO)) {
//						solicitud.setL_autoriza("N");
//						solicitud.setCODG_ESTADO_SOLICITUD("REG");
//						solicitud.setL_INDC_OFICIO("S");
//						solicitud.setMARCA("S");
//					} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_SIN_OFICIO)) {
//						solicitud.setL_autoriza("N");
//						solicitud.setCODG_ESTADO_SOLICITUD("REG");
//						solicitud.setL_INDC_OFICIO("N");
//						solicitud.setMARCA("S");
//					} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_CON_OFICIO)) {
//						solicitud.setL_autoriza("N");
//						solicitud.setCODG_ESTADO_SOLICITUD("REG");
//						solicitud.setL_INDC_OFICIO("S");
//						solicitud.setMARCA("N");
//					} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_SIN_OFICIO)) {
//						solicitud.setL_autoriza("S");
//						solicitud.setCODG_ESTADO_SOLICITUD("AUT");
//						solicitud.setMARCA("N");
//						solicitud.setL_INDC_OFICIO("N");
//					}
//				}
//
//				AudAntecPenWs aud = usuario.auditoria(solicitud.getNUME_IDENT_SOLIC()+"-"+respuesta);
//				if(aud!=null) usuarioDAO.guardarAuditoria(aud);
//			}
//
//		} catch (Exception e) {
//			logger.error("Error del WS Cotejo", e);
//			throw new Exception("errorDescarte");
//		}
//	}
	
	public void cotejar(EntidadExterna ee, Solicitud solicitud, Usuario usuario, boolean indicadorJur) throws Exception{	
		
		try{
			String respuesta = "";
			String tipoDocumento = solicitud.getDOCU_IDENT_SOLIC();
			String cadena="PATERNO:"+solicitud.getAPLL_PATER_SOLIC()+"|"+
					"MATERNO:"+solicitud.getAPLL_MATER_SOLIC()+"|NOMBRE1:"+solicitud.getNOM1_SOLIC()+"|"+
					"NOMBRE2:"+solicitud.getNOM2_SOLIC()+"|NOMBRE3:"+solicitud.getNOM3_SOLIC()+"|"+
					"DNI:"+solicitud.getNUME_IDENT_SOLIC()+"|TIPO:"+tipoDocumento;
			if(indicadorJur){
				if(tipoDocumento.equals(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI)) {
					respuesta = ServicioWSCotejo.cotejarPersonaJur(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(),
					 		solicitud.getNOM1_SOLIC(), solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC(),
							solicitud.getNUME_IDENT_SOLIC());					
				} else {
					respuesta = ServicioWSCotejo.cotejarPersonaJur(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(),
					 		solicitud.getNOM1_SOLIC(), solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC(),"");					
				}
				cadena="ServicioWSCotejo.cotejarPersonaJur "+cadena;
			} else if (TipoSolicitud.MINEDU.equals(solicitud.getTIPO_SOLIC())) {//SUNEDU tiene el mismo "tipo de solicitud" que MINEDU
				if(tipoDocumento.equals(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI)) {
					respuesta = ServicioWSCotejo.cotejarPersonaMINEDU(solicitud.getNUME_IDENT_SOLIC(),solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(),
					 		solicitud.getNOM1_SOLIC(), solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC());					
				} else {
					respuesta = ServicioWSCotejo.cotejarPersonaMINEDU("", solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(),
					 		solicitud.getNOM1_SOLIC(), solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC());
				}
				cadena="ServicioWSCotejo.cotejarPersonaMINEDU "+cadena;
			} else if (solicitud.getTIPO_SOLIC().equals(Constantes.TIPO_SOLICITUD_JNE)) {
				if(tipoDocumento.equals(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI)) {
					respuesta = ServicioWSCotejo.cotejarPersonaJNE(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(),
					 		solicitud.getNOM1_SOLIC(), solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC(), solicitud.getNUME_IDENT_SOLIC(),
							usuario.getCODG_USUAR(), usuario.getCODG_ENTIDAD_EXTERNA());
				} else {
					respuesta = ServicioWSCotejo.cotejarPersonaJNE(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(),
					 		solicitud.getNOM1_SOLIC(), solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC(), "", usuario.getCODG_USUAR(), 
							usuario.getCODG_ENTIDAD_EXTERNA());					
				}
				cadena="ServicioWSCotejo.cotejarPersonaJNE "+cadena;
			} else if (solicitud.getTIPO_SOLIC().equals(Constantes.TIPO_SOLICITUD_SUCAMEC)) {
				if(tipoDocumento.equals(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI)) {
					respuesta = ServicioWSCotejo.cotejarPersonaSuc(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(), solicitud.getNOM1_SOLIC(),
							solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC(),
							solicitud.getNUME_IDENT_SOLIC());
				} else {
					respuesta = ServicioWSCotejo.cotejarPersonaSuc(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(), solicitud.getNOM1_SOLIC(),
							solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC(),"");					
				}
				cadena="ServicioWSCotejo.cotejarPersonaSuc "+cadena;
			} else {
				if(tipoDocumento.equals(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI)) {
					respuesta = ServicioWSCotejo.cotejarPersona(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(), solicitud.getNOM1_SOLIC(),
							solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC(),
							solicitud.getNUME_IDENT_SOLIC());
					
				} else { 
					respuesta = ServicioWSCotejo.cotejarPersona(solicitud.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(), solicitud.getNOM1_SOLIC(),
							solicitud.getNOM2_SOLIC() == null || "".equals(solicitud.getNOM2_SOLIC().trim()) ? "***" : solicitud.getNOM2_SOLIC(),
							solicitud.getNOM3_SOLIC() == null || "".equals(solicitud.getNOM3_SOLIC().trim()) ? "***" : solicitud.getNOM3_SOLIC(),"");					
				}
				cadena="ServicioWSCotejo.cotejarPersona "+cadena;
			}	
			logger.info(cadena);
			logger.info(respuesta);
			if (respuesta == null || "".equals(respuesta)
					|| !(respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_SIN_OFICIO)
							|| respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_CON_OFICIO)
							|| respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_CON_OFICIO) || respuesta
							.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_SIN_OFICIO))) {
				logger.error("Error del WS de Cotejo. La respuesta es nula.");
				throw new Exception("Error de descarte. El webservice devolvió una respuesta nula o en blanco.");
			} else {
				if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_CON_OFICIO)) {
					solicitud.setL_autoriza("N");
					solicitud.setCODG_ESTADO_SOLICITUD("REG");
					solicitud.setL_INDC_OFICIO("S");
					solicitud.setMARCA("S");
					solicitud.setRptaValidacion("Solicitud Observada - Descarte Pendiente");
				} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_SIN_OFICIO)) {
					solicitud.setL_autoriza("N");
					solicitud.setCODG_ESTADO_SOLICITUD("REG");
					solicitud.setL_INDC_OFICIO("N");
					solicitud.setMARCA("S");
					solicitud.setRptaValidacion("Solicitud Observada - Descarte Pendiente");
				} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_CON_OFICIO)) {
					solicitud.setL_autoriza("N");
					solicitud.setCODG_ESTADO_SOLICITUD("REG");
					solicitud.setL_INDC_OFICIO("S");
					solicitud.setMARCA("N");
					solicitud.setRptaValidacion("Solicitud Observada - Descarte Pendiente");
				} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_SIN_OFICIO)) {
					solicitud.setL_autoriza("S");
					solicitud.setCODG_ESTADO_SOLICITUD("AUT");
					solicitud.setMARCA("N");
					solicitud.setL_INDC_OFICIO("N");
				}
			}

//			if(!indicadorJur){
//				AudAntecPenWs aud = usuario.auditoria(solicitud.getNUME_IDENT_SOLIC()+"-"+respuesta);
//				if(aud!=null) usuarioDAO.guardarAuditoria(aud);	
//			}
			AuditoriaMsiap bean = Funciones.auditoria(solicitud, usuario, respuesta, "0");
			auditoriaMsiapDAO.insert(bean);

		} catch (Exception e) {
			
			AuditoriaMsiap bean = Funciones.auditoria(solicitud, usuario, e.getMessage(), "1");
			auditoriaMsiapDAO.insert(bean);
			
			logger.error("Error del WS Cotejo", e);
			throw new Exception("errorDescarte");
		}
	}

	@SuppressWarnings("unchecked")
	public boolean actualizaEstadoCertificado(Integer codSolicitudExterna, String estado, String indcDescarte) {
		Map map = new HashMap();
		map.put("CODG_ESTADO_SOLICITUD", estado);
		map.put("CODG_CERTI_EXTERNO", codSolicitudExterna);
		map.put("INDC_DESCARTE", indcDescarte);
		solicitudDAO.updateByPrimaryCertificadoExterno(map);
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean actualizaNroImpresion(boolean isTipoOficioA, Integer codSolicitudExterna, Usuario usuario) {
		Map map = new HashMap();
		SolicitudExternaAuditoria sea = new SolicitudExternaAuditoria();
		Date fechaActual = new Date();
		map.put("CODG_ESTADO_SOLICITUD", "IMP");
		map.put("CODG_USU_ULT_MODI", usuario.getCODG_USUAR());
		map.put("CODG_CERTI_EXTERNO", codSolicitudExterna);
		// Inicio erodriguezbu
		map.put("FECH_IMPRESION", fechaActual);
		// Fin erodriguezbu
		SolicitudExterna solicitudExterna = solicitudExternaDAO.selectByPrimaryKey(codSolicitudExterna);
		sea.setCODG_USUAR(usuario.getCODG_USUAR());
		sea.setCODG_CERTI_EXTERNO(solicitudExterna.getCODG_CERTI_EXTERNO());
		// Inicio erodriguezbu
		sea.setFECH_ACCION(fechaActual);
		//sea.setFECH_ACCION(new Date());
		// Fin erodriguezbu
		int acum = 0;
		if (isTipoOficioA) {
			map.put("INDC_DESCARTE", "N");
			if (solicitudExterna.getNUM_VISTAS_OFI_RESPUESTA_A() != null)
				acum = solicitudExterna.getNUM_VISTAS_OFI_RESPUESTA_A().intValue();
			solicitudExterna.setNUM_VISTAS_OFI_RESPUESTA_A(Integer.valueOf(++acum));
			sea.setDESC_ACCION((new StringBuilder()).append("Oficio A impreso por ").append(String.valueOf(acum)).append("\260 vez").toString());
		} else {
			map.put("INDC_DESCARTE", "S");
			if (solicitudExterna.getNUM_VISTAS_OFI_RESPUESTA_B() != null)
				acum = solicitudExterna.getNUM_VISTAS_OFI_RESPUESTA_B().intValue();
			solicitudExterna.setNUM_VISTAS_OFI_RESPUESTA_B(Integer.valueOf(++acum));
			sea.setDESC_ACCION((new StringBuilder()).append("Oficio B impreso por ").append(String.valueOf(acum)).append("\260 vez").toString());
		}
		solicitudExternaAuditoriaDAO.insert(sea);
		solicitudExternaDAO.updateByPrimaryKeySelective(solicitudExterna);
		solicitudDAO.updateByPrimaryCertificadoExterno(map);
		sea = null;
		map = null;
		solicitudExterna = null;
		return true;
	}

	public Connection getConnectionManager() throws SQLException {
		Connection conexion = ds.getConnection();

		if (conexion == null) logger.error("SolicitudManager. Error conección de base de datos.");

		return conexion;
	}

	/**
	 * Metodo sincronizado que permite que solamente un subproceso puede acceder a dicho m�todo a la vez. Cuando un subproceso intente acceder al m�todo sincronizado mirar� si
	 * la llave esta abierta o cerrada, si esta cerrada no podr� accederlo. Si el m�todo no tiene puesta la llave entonces el subproceso puede acceder al c�digo sincronizado.
	 *
	 * @param sessionBean1
	 * @param usuario
	 * @param solicitudExterna
	 * @param solicitudes
	 * @param criterio
	 * @throws Exception
	 */
	public void enviarSolicitud(SessionBean1 sessionBean1, Usuario usuario, SolicitudExterna solicitudExterna, ArrayList<Solicitud> solicitudes,
			CriterioListarSolicitudExterna criterio) throws Exception {
		try {
			//cotejar(solicitudes, usuario);
			//long endTime = System.currentTimeMillis();
			//System.out.println("Cotejo Duration: " + (endTime - startTime));
			insertSolicitudCompleta(solicitudExterna, solicitudes, usuario);
			//long endInsertTime = System.currentTimeMillis();
			//System.out.println("Insert duration : " + (endInsertTime -endTime));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		try {
			sessionBean1.getSolicitudesExternas().refreshProvider(usuario, criterio);
			sessionBean1.getSolicitudesUnitarias().getList().clear();
			sessionBean1.getSolicitudes().clear();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("errorSeleccion");
		}
	}

	synchronized public void enviarSolicitudInterna(Usuario usuario, Solicitud solicitud) throws Exception {
		try {
			if (solicitud.getFLAG_MANT().equals("MOD"))
				updateSolicitudCompletaInterna(solicitud, usuario);
			else
				insertSolicitudCompletaInterna(solicitud, usuario);

		} catch (Exception e) {
			logger.error("class enviarSolicitudInterna", e);
			e.printStackTrace();
			throw new Exception("errorEnvio");
		}
	}

	synchronized public boolean insertSolicitudCompletaInterna(Solicitud solicitud, Usuario usuario) throws Exception {
		boolean retorno = false;
		// boolean descarte[] = new boolean[2];
		Calendar fecha = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String num_certi = null;
		solicitud.setCODG_USUAR(usuario.getCODG_USUAR());
		solicitud.setCODG_USU_REGISTRO(usuario.getCODG_USUAR());
		solicitud.setF_aud(fecha.getTime());
		solicitud.setC_aud_uid(usuario.getCODG_USUAR());
		solicitud.setVENTANILLA("1");
		solicitud.setINDC_MAGISTRADO("S");
		solicitud.setCODG_ESTADO_FOTO("P");

		try {
			daoManager.startTransaction();

			SecuenciaSolicitud secuencia = secuenciaSolicitudDAO.selectByPrimaryKey("JUR");
			Integer correlativo_num_certi = Integer.parseInt(secuencia.getCODG_CORRE().trim());
			correlativo_num_certi = correlativo_num_certi + new Integer("1");
			num_certi = (new StringBuilder()).append("0000000").append(String.valueOf(correlativo_num_certi)).toString();
			num_certi = num_certi.substring(num_certi.length() - 7, num_certi.length());

			solicitud.setCODG_LUGAR(usuario.getCODG_LUGAR());

			String idDistritoJudicial = usuario.getCODG_DISTRITO_JUDICIAL();
			solicitud.setCODG_DISTRITO_JUDICIAL(idDistritoJudicial);

			solicitud.setDESC_TASA("SIN TASAS");
			solicitud.setNUME_CERTI(num_certi);
			secuencia.setCODG_CORRE(num_certi);

			secuenciaSolicitudDAO.updateByPrimaryKeySelective(secuencia);
			solicitud.setL_nro_modifica(new Integer("0"));
			solicitud.setFECH_REGISTRO(fecha.getTime());
			solicitud.setFECH_DIGIT_SOLIC(fecha.getTime());
			solicitud.setCODG_USU_ULT_MODI(usuario.getCODG_USUAR());
			solicitud.setFECH_ULT_MODI(fecha.getTime());
			String detalleAudit = dateFormat.format(fecha.getTime())+
					", "+usuario.getCODG_USUAR()+", "+solicitud.getCODG_ESTADO_SOLICITUD();
			solicitud.setDESC_FEC_USU_MODI(detalleAudit);
			//solicitudDAO.insert(solicitud);
			insertSolicitudProvincia(solicitud);

			SecuenciaSolicitud secu = new SecuenciaSolicitud();
			secu.setCODG_PREFI(Usuario.PREF_USUARIO_WEB_CODIGO);
			secu.setCODG_CORRE(solicitud.getCODG_CERTI());
			secuenciaSolicitudDAO.updateByPrimaryKeySelective(secu);

			daoManager.commitTransaction();
			retorno = true;
		} catch (Exception e) {
			logger.error("error insertSolicitudCompletaInterna: ", e);
			e.printStackTrace();
			throw new Exception(e);
		} finally {
			daoManager.endTransaction();
		}
		return retorno;
	}

	private void insertSolicitudProvincia(Solicitud solicitud) throws Exception{
		synchronized (externoLock) {
			solicitudDAO.insert(solicitud);
		}
	}

	synchronized public boolean updateSolicitudCompletaInterna(Solicitud solicitud, Usuario usuario) throws Exception {
		boolean retorno = false;
		// boolean descarte[] = new boolean[2];

		try {
			daoManager.startTransaction();
			CriterioVerificarNombresApellidos criterio = new CriterioVerificarNombresApellidos(solicitud
					.getAPLL_PATER_SOLIC(), solicitud.getAPLL_MATER_SOLIC(), solicitud.getNOM1_SOLIC(),
					solicitud.getNOM2_SOLIC(), solicitud.getNOM3_SOLIC());

			String respuesta = null;
			String tipo = solicitud.getDOCU_IDENT_SOLIC();
			String cadena;
			try {
				cadena="ServicioWSCotejo.cotejarPersonaJur PATERNO:"+criterio.getApellidoPaterno()+"|"+
							"MATERNO:"+criterio.getApellidoMaterno()+"|NOMBRE1:"+criterio.getNombre1()+"|"+
							"NOMBRE2:"+criterio.getNombre2()+"|NOMBRE3:"+criterio.getNombre3()+"|"+
							"DNI:"+solicitud.getNUME_IDENT_SOLIC()+"|TIPO:"+solicitud.getDOCU_IDENT_SOLIC();
				if(tipo.equals(TipoDocumentoIdentidad.COD_TIPO_DOCUMENTO_DNI)) {
					respuesta = ServicioWSCotejo.cotejarPersonaJur(criterio.getApellidoPaterno(), criterio.getApellidoMaterno(),
							criterio.getNombre1(), criterio.getNombre2() == null || "".equals(criterio.getNombre2().trim()) ? "***": criterio.getNombre2(),
							criterio.getNombre3() == null || "".equals(criterio.getNombre3().trim()) ? "***" : criterio.getNombre3(),solicitud.getNUME_IDENT_SOLIC());
				} else {
					respuesta = ServicioWSCotejo.cotejarPersonaJur(criterio.getApellidoPaterno(), criterio.getApellidoMaterno(),
							criterio.getNombre1(), criterio.getNombre2() == null || "".equals(criterio.getNombre2().trim()) ? "***": criterio.getNombre2(),
							criterio.getNombre3() == null || "".equals(criterio.getNombre3().trim()) ? "***" : criterio.getNombre3(), "");
				}
				logger.info(cadena);
				logger.info(respuesta);
				
				if (respuesta == null
						|| "".equals(respuesta)
						|| !(respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_SIN_OFICIO)
								|| respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_CON_OFICIO)
								|| respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_CON_OFICIO) || respuesta
								.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_SIN_OFICIO))) {
					logger.error("Error del WS de Cotejo");
					throw new Exception("Error de descarte, intente de nuevo");
				} else {
					if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_CON_OFICIO)) {
						solicitud.setL_autoriza("N");
						solicitud.setL_INDC_OFICIO("S");
						solicitud.setMARCA("S");
						solicitud.setRptaValidacion("Solicitud Observada - Descarte Pendiente");
					} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_CON_HOMONIMIA_SIN_OFICIO)) {
						solicitud.setL_autoriza("N");
						solicitud.setL_INDC_OFICIO("N");
						solicitud.setMARCA("S");
						solicitud.setRptaValidacion("Solicitud Observada - Descarte Pendiente");
					} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_CON_OFICIO)) {
						solicitud.setL_INDC_OFICIO("S");
						solicitud.setMARCA("N");
						solicitud.setRptaValidacion("Solicitud Observada - Descarte Pendiente");
					} else if (respuesta.equals(Constantes.MENSAJE_COTEJO_WS_SIN_HOMONIMIA_SIN_OFICIO)) {
						solicitud.setL_autoriza("S");
						solicitud.setMARCA("N");
						solicitud.setL_INDC_OFICIO("N");

					}
				}
			} catch (Exception e) {
				logger.error("Error del WS Cotejo", e);
				throw new Exception("Error de descarte, intente de nuevo");
			}

			solicitud.setCODG_ESTADO_SOLICITUD("CCC");
			solicitud.setCODG_USU_ULT_MODI(usuario.getCODG_USUAR());
			solicitud.setL_nro_modifica((solicitud.getL_nro_modifica() == null ? 0 : solicitud.getL_nro_modifica()) + 1);
			Date fechActual = new Date();
			solicitud.setFECH_ULT_MODI(fechActual);
			solicitudDAO.updateByPrimaryKey(solicitud);
			daoManager.commitTransaction();
			retorno = true;
		} catch (Exception e) {
			logger.error("iSolicitudCI ", e);
			throw new Exception(e);
		} finally {
			daoManager.endTransaction();
		}
		return retorno;
	}


	public boolean updateSolicitudInterna(String codCerti, Usuario usuario) throws Exception {
		boolean retorno = false;
		Map<String, Object> map = new HashMap<String, Object>();

		Solicitud solicitud = solicitudDAO.selectByPrimaryKey(codCerti);
		Integer nro = (solicitud.getNUMR_IMPRESION() == null ? new Integer("0") : solicitud.getNUMR_IMPRESION()) + 1;
		map.put("CODG_ESTADO_SOLICITUD", "IMP");
		map.put("CODG_USU_ULT_MODI", usuario.getCODG_USUAR());
		map.put("CODG_CERTI", codCerti);
		//map.put("CODG_USU_FIRMA", Soporte.CODG_USU_FIRMA);
		map.put("CODG_USU_IMPRESION", usuario.getCODG_USUAR());
		map.put("NUMR_IMPRESION", nro);
		Date fechActual = new Date();
		map.put("FECH_ULT_MODI", fechActual);
		map.put("FECH_IMPRESION", fechActual);
		// int rpt = solicitudDAO.updateByPrimarySolicitud(map);
		solicitudDAO.updateByPrimarySolicitud(map);
		return retorno;
	}

	public List<Solicitud> selectSolicitudes(Usuario usuario, CriterioListarSolicitudInterna criterio, List<MotivoSolicitudCertificado> list) {

		Calendar calendar = Calendar.getInstance();
		SolicitudExample muestra = new SolicitudExample();
		Criteria crit = muestra.createCriteria();

		if(!"%".equals(criterio.getCodigoUsuario()))
			crit.andCODG_USUAREqualTo((String) criterio.getCodigoUsuario());

		if(list!=null && list.size()>0){
			MotivoSolicitudCertificado motivo = (MotivoSolicitudCertificado) list.get(0);
			crit.andTIPO_SOLICEqualTo(motivo.getCodigo_tipo_de_solicitud());
		}

		crit.andINDC_MAGISTRADOEqualTo("S");

		if(!Perfil.ADMINISTRADOR_ID.equals(usuario.getCOD_PERFIL())){
			if(usuario.getNUME_JUZGA()!=null)
				crit.andNUME_JUZGAEqualTo(usuario.getNUME_JUZGA().trim());

			if(criterio.getCodigoJuzgado()!=null)
				crit.andCODG_JUZGADEqualTo(criterio.getCodigoJuzgado());

			crit.andCODG_DISTRITO_JUDICIALEqualTo(usuario.getCODG_DISTRITO_JUDICIAL());//Distritos juris. o fiscalía

			if(usuario.getCODG_LUGAR()!=null)
				crit.andCODG_LUGAREqualTo(usuario.getCODG_LUGAR());
		}

		if(Perfil.ADMINISTRADOR_ID.equals(usuario.getCOD_PERFIL()))
			crit.andCODG_DISTRITO_JUDICIALLike(criterio.getCodDistritoJudicial());

		if (criterio.getCodigoCerti()!=null)
			crit.andCODG_CERTIEqualTo(criterio.getCodigoCerti().trim());

		if (criterio.getFechaInicial() != null){
			calendar.setTime((Date) criterio.getFechaInicial());
	        calendar.set(Calendar.MILLISECOND, 0);
	        calendar.set(Calendar.SECOND, 0);
	        calendar.set(Calendar.MINUTE, 0);
	        calendar.set(Calendar.HOUR_OF_DAY, 0);

			crit.andFECH_DIGIT_SOLICGreaterThanOrEqualTo(calendar.getTime());
		}

		if(criterio.getFechaFinal()!=null){
			calendar.setTime((Date) criterio.getFechaFinal());
	        calendar.set(Calendar.MILLISECOND, 0);
	        calendar.set(Calendar.SECOND, 0);
	        calendar.set(Calendar.MINUTE, 0);
	        calendar.set(Calendar.HOUR_OF_DAY, 0);
	        calendar.add(Calendar.DATE, 1);

	        crit.andFECH_DIGIT_SOLICLessThan(calendar.getTime());
		}

		if (criterio.getApellidoPaterno() != null)
			crit.andAPLL_PATER_SOLICLike("%"+String.valueOf(criterio.getApellidoPaterno())+"%");

		if (criterio.getApellidoMaterno() != null)
			crit.andAPLL_MATER_SOLICLike("%"+String.valueOf(criterio.getApellidoMaterno())+"%");

		if (criterio.getNombre() != null)
			crit.andNombresLike((String) criterio.getNombre());

		if(criterio.getNroExpediente()!=null)
			crit.andNUME_EXPED_SOLICEqualTo(String.valueOf(criterio.getNroExpediente()).trim());

		if(criterio.getNroSolicitud()!=null)
			crit.andNUME_CERTIEqualTo(String.valueOf(criterio.getNroSolicitud()).trim());

		if(criterio.isImpreso())
			crit.andCODG_ESTADO_SOLICITUDEqualTo("IMP");

		if(criterio.isObservado())
			crit.andSolicitudObservada();

		if(criterio.isPendienteImpresion())
			crit.andPendienteImpresion();

		muestra.setOrderByClause("FECH_REGISTRO DESC");

		return solicitudDAO.selectByExample(muestra);
	}

	public List<Solicitud> getSolicitudesPorCertifExt(Integer codCertificado){
		return solicitudDAO.getSolicitudesPorCertifExt(codCertificado);
	}
	
	
	synchronized public String buscarSolicitudPorNombreUsuarioFechaSolicitudExterna(Solicitud solicitud) throws Exception {
		
		String sol ="";
		
		List<SolicitudExterna> solicitudes= solicitudExternaDAO.getSolicitudByNombreUsuarioFecha(solicitud);
		
		if (solicitudes!=null && !solicitudes.isEmpty()){
			sol=solicitudes.get(0).getCODG_CERTI_EXTERNO().toString();
		}
		
		return sol;
	}
	
	synchronized public String buscarSolicitudPorNombreUsuarioFechaSolicitudInterna(Solicitud solicitud) throws Exception {
		
		String sol ="";
		
		List<Solicitud> solicitudes= solicitudDAO.getSolicitudByNombreUsuarioFecha(solicitud);
		
		if (solicitudes!=null && !solicitudes.isEmpty()){
			sol=solicitudes.get(0).getNUME_CERTI();
		}
		
		return sol;
	}
	
	public List<Solicitud> consultarSolicitudesInternas(Usuario usuario, CriterioListarSolicitud criterio) {

		Calendar calendar = Calendar.getInstance();
		if("%".equals(criterio.getCodigoUsuario()))
			criterio.setCodigoUsuario(null);
		if (criterio.getEstadoSolicitud().equals("%"))
			criterio.setEstadoSolicitud(null);
		if(criterio.getFechaFinal()!=null){
			calendar.setTime((Date) criterio.getFechaFinal());
	        calendar.set(Calendar.MILLISECOND, 0);
	        calendar.set(Calendar.SECOND, 0);
	        calendar.set(Calendar.MINUTE, 0);
	        calendar.set(Calendar.HOUR_OF_DAY, 0);
	        calendar.add(Calendar.DATE, 1);
	        criterio.setFechaFinal(calendar.getTime());
		}
		if(criterio.getApellidoPaterno()!=null) criterio.setApellidoPaterno(criterio.getApellidoPaterno().toString().trim()+"%");
		if(criterio.getApellidoMaterno()!=null) criterio.setApellidoMaterno(criterio.getApellidoMaterno().toString().trim()+"%");
		if(criterio.getNombre()!=null) criterio.setNombre("%"+criterio.getNombre().toString()+"%");
		criterio.setIndicador("S");
		
		//TODO Agregar filtro de numero de certificado
		//criterio.setNroCertificado(strNroCertificado);
		return solicitudDAO.consultarSolicitudesInternas(criterio);
	}
}