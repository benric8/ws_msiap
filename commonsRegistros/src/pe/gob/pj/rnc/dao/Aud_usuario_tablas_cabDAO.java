package pe.gob.pj.rnc.dao;

import java.sql.Connection;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab;

public interface Aud_usuario_tablas_cabDAO {
	public abstract void insert(Connection coneccion, Aud_usuario_tablas_cab aud_usuario_tablas_cab);
}
