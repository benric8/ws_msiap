// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ContadorWebDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.ContadorWeb;
import pe.gob.pj.rnc.model.ContadorWebExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            ContadorWebDAO

public class ContadorWebDAOImpl extends SqlMapDaoTemplate
    implements ContadorWebDAO
{

    public ContadorWebDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(ContadorWeb record)
    {
        insert("CONTADOR_WEB.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(ContadorWeb record)
    {
        int rows = update("CONTADOR_WEB.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(ContadorWeb record)
    {
        int rows = update("CONTADOR_WEB.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(ContadorWebExample example)
    {
        List list = queryForList("CONTADOR_WEB.abatorgenerated_selectByExample", example);
        return list;
    }

    public ContadorWeb selectByPrimaryKey(Integer COD_TABLA)
    {
        ContadorWeb key = new ContadorWeb();
        key.setCOD_TABLA(COD_TABLA);
        ContadorWeb record = (ContadorWeb)queryForObject("CONTADOR_WEB.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(ContadorWebExample example)
    {
        int rows = delete("CONTADOR_WEB.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer COD_TABLA)
    {
        ContadorWeb key = new ContadorWeb();
        key.setCOD_TABLA(COD_TABLA);
        int rows = delete("CONTADOR_WEB.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
