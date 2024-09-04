package pe.gob.pj.rnc.dao;

import java.util.List;

import pe.gob.pj.rnc.model.AuditoriaMsiap;
import pe.gob.pj.rnc.model.AuditoriaUsuario;

public interface AuditoriaMsiapDAO {
	
	public abstract void insert(AuditoriaMsiap bean);
	
	public List<AuditoriaUsuario> consultaAuditoriaUsuario(String codigoUsuario) throws Exception;

}
