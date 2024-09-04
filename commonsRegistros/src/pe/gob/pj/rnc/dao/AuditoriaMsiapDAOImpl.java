package pe.gob.pj.rnc.dao;

import java.util.List;
import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import pe.gob.pj.rnc.model.AuditoriaMsiap;
import pe.gob.pj.rnc.model.AuditoriaUsuario;

public class AuditoriaMsiapDAOImpl extends SqlMapDaoTemplate implements AuditoriaMsiapDAO{

	public AuditoriaMsiapDAOImpl(DaoManager daoManager) {
		super(daoManager);
	}

	@Override
	public void insert(AuditoriaMsiap bean) {
		insert("AuditoriaMsiap.insert", bean);
	}
	
	public List<AuditoriaUsuario> consultaAuditoriaUsuario(String codigoUsuario) throws Exception{
		List<AuditoriaUsuario> lista =null;
		lista = (List<AuditoriaUsuario>) queryForList("AuditoriaMsiap.consultaAuditoriaUsuario", codigoUsuario);
		return lista;
	}
	
}
