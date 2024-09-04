package pe.gob.pj.rnc.service;

import java.sql.Connection;
import pe.gob.pj.rnc.dao.Aud_usuario_tablas_cabDAO;
import pe.gob.pj.rnc.dao.aud_usuario_tablas_cabDAOImpl;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab;

public class Aud_usuario_tablas_cabManager {
	private Aud_usuario_tablas_cabDAO aud_usuario_tablas_cabDAO;

	public Aud_usuario_tablas_cabManager() {
	}

	public void insert(Connection coneccion, Aud_usuario_tablas_cab aud_usuario_tablas_cab) {
		aud_usuario_tablas_cabDAO = new aud_usuario_tablas_cabDAOImpl();
		aud_usuario_tablas_cabDAO.insert(coneccion, aud_usuario_tablas_cab);
	}
}
