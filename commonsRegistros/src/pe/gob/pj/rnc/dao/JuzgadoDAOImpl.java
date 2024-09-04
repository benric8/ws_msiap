// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JuzgadoDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.Juzgado;
import pe.gob.pj.rnc.model.JuzgadoExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            JuzgadoDAO

public class JuzgadoDAOImpl extends SqlMapDaoTemplate
    implements JuzgadoDAO
{

    public JuzgadoDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(Juzgado record)
    {
        insert("JUZGADO.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(Juzgado record)
    {
        int rows = update("JUZGADO.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(Juzgado record)
    {
        int rows = update("JUZGADO.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(JuzgadoExample example)
    {
        List list = queryForList("JUZGADO.abatorgenerated_selectByExample", example);
        return list;
    }

    public Juzgado selectByPrimaryKey(String CODG_JUZGAD)
    {
        Juzgado key = new Juzgado();
        key.setCODG_JUZGAD(CODG_JUZGAD);
        Juzgado record = (Juzgado)queryForObject("JUZGADO.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(JuzgadoExample example)
    {
        int rows = delete("JUZGADO.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_JUZGAD)
    {
        Juzgado key = new Juzgado();
        key.setCODG_JUZGAD(CODG_JUZGAD);
        int rows = delete("JUZGADO.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
