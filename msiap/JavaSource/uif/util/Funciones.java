package uif.util;

import java.util.Arrays;
import java.util.Calendar;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import pe.gob.pj.rnc.model.AuditoriaMsiap;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.util.Constantes;

public class Funciones {

	public static boolean rehabilitado(String motivo_Codigo_tipo_de_solicitud) {
		boolean rehabilitado = false;
		/*String motivo_Codigo_tipo_de_solicitud = "";
		
		motivo_Codigo_tipo_de_solicitud = "";
		if ((solicitud.getCodigo_del_motivo() != null) && (solicitud.getCodigo_del_motivo().trim().length() > 0)) {
			MotivoSolicitudCertificadoManager m = new MotivoSolicitudCertificadoManager();
			MotivoSolicitudCertificado motivo = m.selectMotivoSolicitudCertificado(solicitud.getCodigo_del_motivo());
			m = null;
			motivo_Codigo_tipo_de_solicitud = motivo.getCodigo_tipo_de_solicitud();
		}*/
		
		rehabilitado = Arrays.asList(Constantes.ENTIDADES_REPORT_REHABILITADOS.trim().split(",")).contains(motivo_Codigo_tipo_de_solicitud);
		return rehabilitado;
	}
	
	public static AuditoriaMsiap auditoria(Solicitud solicitud, Usuario usuario, String respuesta, String indicaError) {
		AuditoriaMsiap auditoria = new AuditoriaMsiap();
		StringBuilder sbEnvio = new StringBuilder();
		Calendar fecha = Calendar.getInstance();
		
		try {			
			//IP
			FacesContext facesContext = FacesContext.getCurrentInstance();
			ExternalContext externalContext = facesContext.getExternalContext();
			HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
			String ipAddress = request.getHeader("X-FORWARDED-FOR");
			if (ipAddress == null) {
				ipAddress = request.getRemoteAddr();
			}

			sbEnvio.append(solicitud.getAPLL_PATER_SOLIC()).append("|").append(solicitud.getAPLL_MATER_SOLIC())
				.append("|").append(solicitud.getNOM1_SOLIC()).append("|").append(solicitud.getNOM2_SOLIC()).append("|").append(solicitud.getNOM3_SOLIC())
					.append("|").append(solicitud.getNUME_IDENT_SOLIC());

			auditoria.setX_datosEnviados(sbEnvio.length()>150?sbEnvio.substring(0, 150):sbEnvio.toString());
			auditoria.setX_datosRecibidos(respuesta!=null && respuesta.length()>150?respuesta.substring(0, 150):respuesta);
			ipAddress= ipAddress!=null && ipAddress.length()>45?ipAddress.substring(0,45):ipAddress;
			auditoria.setX_ip(ipAddress);
			auditoria.setX_nombrePc(request.getRemoteHost());
			auditoria.setX_perfil(usuario.getC_PERFIL());
			auditoria.setL_error(indicaError);
			//auditoria.setX_mac(direccionMAC);
			auditoria.setX_usuario(usuario.getCODG_USUAR());
			auditoria.setF_registro(fecha.getTime());
			
		} catch (Exception e){
			e.printStackTrace();
		}
		return auditoria;

	}

}