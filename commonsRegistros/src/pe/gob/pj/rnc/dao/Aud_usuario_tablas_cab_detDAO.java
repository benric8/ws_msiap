package pe.gob.pj.rnc.dao;
import java.sql.Connection;
import pe.gob.pj.rnc.model.Aud_usuario_tablas_cab_det;

public interface Aud_usuario_tablas_cab_detDAO {
	public abstract void insert(Connection coneccion, Aud_usuario_tablas_cab_det aud_usuario_tablas_cab_det);
}
