// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DepartamentoDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.Departamento;
import pe.gob.pj.rnc.model.DepartamentoExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            DepartamentoDAO

public class DepartamentoDAOImpl extends SqlMapDaoTemplate
    implements DepartamentoDAO
{

    public DepartamentoDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(Departamento record)
    {
        insert("DEPARTAMENTO.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(Departamento record)
    {
        int rows = update("DEPARTAMENTO.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(Departamento record)
    {
        int rows = update("DEPARTAMENTO.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(DepartamentoExample example)
    {
        List list = queryForList("DEPARTAMENTO.abatorgenerated_selectByExample", example);
        return list;
    }

    public Departamento selectByPrimaryKey(String CODG_LUGAR)
    {
        Departamento key = new Departamento();
        key.setCODG_LUGAR(CODG_LUGAR);
        Departamento record = (Departamento)queryForObject("DEPARTAMENTO.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(DepartamentoExample example)
    {
        int rows = delete("DEPARTAMENTO.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_LUGAR)
    {
        Departamento key = new Departamento();
        key.setCODG_LUGAR(CODG_LUGAR);
        int rows = delete("DEPARTAMENTO.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

	public Departamento obtenerPorCodEntidadExterna(Integer codigoEntidadExterna) {
		DepartamentoExample ejemplo = new DepartamentoExample();
		ejemplo.createCriteria().andCod_entidad_externaAIgualA(codigoEntidadExterna);
		List lista = selectByExample(ejemplo);
		if(lista!=null && 0<lista.size()) return (Departamento) lista.get(0);
		return new Departamento();
	}
}
