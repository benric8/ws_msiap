/*
 * MotivoSolicitudCertificadoDataProvider.java
 *
 * Created on May 22, 2007, 10:15 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificado;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.service.MotivoSolicitudCertificadoManager;
import pe.gob.pj.rnc.tipo.Lista;
import pe.gob.pj.rnc.tipo.Texto;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class MotivoSolicitudCertificadoDataProvider extends
		ObjectListDataProvider {

	public void establecerDescripcionDeMotivo(Solicitud solicitud) {
		if (Lista.contieneAlgo(lista) && solicitud != null) {
			String idMotivo = solicitud.getMOTI_SOLIC();
			if (Texto.contieneAlgo(idMotivo)) {
				MotivoSolicitudCertificado motivo = (MotivoSolicitudCertificado) Lista
						.obtener(lista, "getCodigo_del_motivo", idMotivo);
				solicitud.setMotivo(motivo!=null? motivo.getAbreviatura():null);
			}
		}
	}

	public void establecerTipoSolicitud(Solicitud solicitud) {
		if (Lista.contieneAlgo(lista) && solicitud != null) {
			String idMotivo = solicitud.getMOTI_SOLIC();
			if (Texto.contieneAlgo(idMotivo)) {
				MotivoSolicitudCertificado motivo = (MotivoSolicitudCertificado) Lista
						.obtener(lista, "getCodigo_del_motivo", idMotivo);
				solicitud.setTIPO_SOLIC(motivo.getCodigo_tipo_de_solicitud());
			}
		}
	}

	public String getCodigo_del_motivo() {
		String rst="";
		if (lista.size()>0) {
			MotivoSolicitudCertificado motivo = (MotivoSolicitudCertificado) lista.get(0);
			rst=motivo.getCodigo_del_motivo();
		}
		return rst;
	}

	public String getCodigo_tipo_de_solicitud() {
		String rst="";
		if (lista.size()==1) {
			MotivoSolicitudCertificado motivo = (MotivoSolicitudCertificado) lista.get(0);
			rst=motivo.getCodigo_tipo_de_solicitud();
		}
		return rst;
	}

	/**
	 *
	 */
	private static final long											serialVersionUID	= 1L;

	private ArrayList<MotivoSolicitudCertificado>	lista							= new ArrayList<MotivoSolicitudCertificado>();

	/** Creates a new instance of MotivoSolicitudCertificadoDataProvider */
	// @SuppressWarnings("unchecked")
	public MotivoSolicitudCertificadoDataProvider() {
		this.lista.add(new MotivoSolicitudCertificado());
		this.setList(this.lista);
	}

	public void refreshProvider(Usuario usuario, EntidadExterna entidadExterna)
			throws SQLException, NamingException {

		MotivoSolicitudCertificadoManager servicioMotivos = new MotivoSolicitudCertificadoManager();

		ArrayList<MotivoSolicitudCertificado> motivos = servicioMotivos.getMotivosSolicitud(usuario.getCOD_PERFIL(), entidadExterna);

		if (!(motivos == null || motivos.isEmpty())) {
			this.lista.clear();
			this.lista.addAll(motivos);
		}
	}
}
