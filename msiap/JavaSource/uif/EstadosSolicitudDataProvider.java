/*
 * EstadosSolicitudDataProvider.java
 *
 * Created on May 22, 2007, 12:11 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package uif;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import pe.gob.pj.rnc.model.EstadoSolicitudCertificado;
import pe.gob.pj.rnc.service.EstadoSolicitudManager;

import com.sun.data.provider.impl.ObjectListDataProvider;

/**
 *
 * @author Administrador
 */
public class EstadosSolicitudDataProvider extends ObjectListDataProvider{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<EstadoSolicitudCertificado> lista = new ArrayList<EstadoSolicitudCertificado>();

	public EstadosSolicitudDataProvider() {
        this.lista.add(new EstadoSolicitudCertificado());
        this.setList(this.lista);
    }

	public void refreshProvider() throws SQLException, NamingException{
    	EstadoSolicitudManager estadoSolicitudService = new EstadoSolicitudManager();
        EstadoSolicitudCertificado estado = new EstadoSolicitudCertificado();

        estado.setCODG_ESTADO("%");
        estado.setDESC_ESTADO("TODOS LOS ESTADOS");

        List<String> estados = new ArrayList<String>();
        estados.add("RPA");
        estados.add("ATE");
        estados.add("ENV");
        ArrayList<EstadoSolicitudCertificado> estadosSolicitud = estadoSolicitudService.getEstadosSolicitud(estados);

        if (!(estadosSolicitud == null || estadosSolicitud.isEmpty())){
            this.lista.clear();
            lista.add(estado);
            this.lista.addAll(estadosSolicitud);
            estado = null;
        }else{
            lista.add(estado);
            estado = null;
        }
    }
}
