package pe.gob.pj.rnc.service;

import java.sql.Connection;
import pe.gob.pj.rnc.dao.Aud_usuario_tablas_cab_detDAO;
import pe.gob.pj.rnc.dao.Aud_usuario_tablas_cab_detDAOImpl;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab_det;

public class Aud_usuario_tablas_cab_detManager {
	private Aud_usuario_tablas_cab_detDAO	aud_usuario_tablas_cab_detDAO;
	
	public Aud_usuario_tablas_cab_detManager() {
	}
	
	public void insert(Connection coneccion, Aud_usuario_tablas_cab_det aud_usuario_tablas_cab_det) {
		aud_usuario_tablas_cab_detDAO = new Aud_usuario_tablas_cab_detDAOImpl();
		aud_usuario_tablas_cab_detDAO.insert(coneccion, aud_usuario_tablas_cab_det);
	}
}
