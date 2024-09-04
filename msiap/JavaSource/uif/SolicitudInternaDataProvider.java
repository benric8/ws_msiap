package uif;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;
import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.rnc.web.service.SolicitudManager;

import com.sun.data.provider.impl.ObjectListDataProvider;


public class SolicitudInternaDataProvider extends ObjectListDataProvider{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<Solicitud> lista = new ArrayList<Solicitud>();


	public SolicitudInternaDataProvider() {
		this.lista.add(new Solicitud());
		this.setList(this.lista);
	}

	public void refreshProvider(List<Solicitud> registros) throws SQLException, NamingException {

		this.lista.clear();
		if (!(registros == null)) {
			this.lista.addAll(registros);
			 setList(registros);
		}
	}
	
	public void consultarSolicitudesInternas(Usuario usuario, CriterioListarSolicitud criterio) throws SQLException, NamingException {

		SolicitudManager servicioSol = new SolicitudManager();
		ArrayList<Solicitud> registros = (ArrayList<Solicitud>) servicioSol.consultarSolicitudesInternas(usuario, criterio);

		if (!(registros == null)) {
			this.lista.clear();
			this.lista.addAll(registros);
		}

	}
	
	public void limpiarSolicitudesInternas() {
		this.lista.clear();
	}

}
