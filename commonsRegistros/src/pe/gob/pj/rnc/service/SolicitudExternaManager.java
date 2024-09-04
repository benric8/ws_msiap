package pe.gob.pj.rnc.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.criterio.CriterioListarSolicitudExterna;
import pe.gob.pj.rnc.dao.DAOConfiguration;
import pe.gob.pj.rnc.dao.SolicitudExternaDAO;
import pe.gob.pj.rnc.model.Perfil;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.Usuario;
import pe.gob.pj.util.Mensaje;

import com.ibatis.dao.client.DaoManager;

public class SolicitudExternaManager {

	private DaoManager daoManager;
	private SolicitudExternaDAO solicitudExternaDAO;

	public SolicitudExternaManager() {
		daoManager = DAOConfiguration.getDaoManager();
		solicitudExternaDAO = (SolicitudExternaDAO) daoManager.getDao(SolicitudExternaDAO.class);
	}

	public List<SolicitudExterna> selectSolicitudes(Usuario usuario, CriterioListarSolicitudExterna criterio) {

		Calendar calendar = Calendar.getInstance();

		if("%".equals(criterio.getCodigoUsuario()))
			criterio.setCodigoUsuario(null);
		if(Perfil.ADMINISTRADOR_ID.equals(usuario.getCOD_PERFIL()))
			criterio.setIdEntidadExterna(null);
		else
			criterio.setIdEntidadExterna(usuario.getCODG_ENTIDAD_EXTERNA());
		if (criterio.getEstado().equals("%"))
			criterio.setEstado(null);
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
		//TODO Agregar filtro de numero de oficio
		String strNroOficio = (String) criterio.getNroOficio();
		if(strNroOficio!=null) {
			String[] detCodigo = strNroOficio.split("-");
			if(detCodigo[0].length() < 5 ){
				String codCeros = Mensaje.completarCerosIzquierda( 5, detCodigo[0] );
				String strNroOficioTemp = strNroOficio.replaceAll(detCodigo[0], codCeros);
				criterio.setNroOficio(strNroOficioTemp.toString()+"%");
			}else {
				criterio.setNroOficio(strNroOficio.toString()+"%");
			}
		}

		return solicitudExternaDAO.seleccionarSolicitudes(criterio);
	}

	public List<SolicitudExterna> consultarSolicitudesExternas(Usuario usuario, CriterioListarSolicitud criterio) {

		Calendar calendar = Calendar.getInstance();
		Integer idEntidad = (Integer) criterio.getIdEntidadExterna(); 

		if("%".equals(criterio.getCodigoUsuario()))
			criterio.setCodigoUsuario(null);
		if(idEntidad.intValue()==0)
			criterio.setIdEntidadExterna(null);
		if (criterio.getEstado().equals("%"))
			criterio.setEstado(null);
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
		String strNroOficio = (String) criterio.getNroOficio();
		if(strNroOficio!=null) criterio.setNroOficio("%"+strNroOficio.toString()+"%");
		/*if(strNroOficio!=null) {
			String[] detCodigo = strNroOficio.split("-");
			if(detCodigo[0].length() < 5 ){
				String codCeros = Mensaje.completarCerosIzquierda( 5, detCodigo[0] );
				String strNroOficioTemp = strNroOficio.replaceAll(detCodigo[0], codCeros);
				criterio.setNroOficio(strNroOficioTemp.toString()+"%");
			}else {
				criterio.setNroOficio(strNroOficio.toString()+"%");
			}
		}*/
		return solicitudExternaDAO.consultarSolicitudesExternas(criterio);
	}
}
