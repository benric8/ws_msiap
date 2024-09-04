// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DistritoJudicialDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.DistritoJudicial;
import pe.gob.pj.rnc.model.DistritoJudicialExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            DistritoJudicialDAO

public class DistritoJudicialDAOImpl extends SqlMapDaoTemplate
    implements DistritoJudicialDAO
{

    public DistritoJudicialDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(DistritoJudicial record)
    {
        insert("DISTRITO_JUDICIAL.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(DistritoJudicial record)
    {
        int rows = update("DISTRITO_JUDICIAL.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(DistritoJudicial record)
    {
        int rows = update("DISTRITO_JUDICIAL.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(DistritoJudicialExample example)
    {
        List list = queryForList("DISTRITO_JUDICIAL.abatorgenerated_selectByExample", example);
        return list;
    }

    public DistritoJudicial selectByPrimaryKey(String CODG_DISTRITO_JUDICIAL)
    {
        DistritoJudicial key = new DistritoJudicial();
        key.setCODG_DISTRITO_JUDICIAL(CODG_DISTRITO_JUDICIAL);
        DistritoJudicial record = (DistritoJudicial)queryForObject("DISTRITO_JUDICIAL.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(DistritoJudicialExample example)
    {
        int rows = delete("DISTRITO_JUDICIAL.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_DISTRITO_JUDICIAL)
    {
        DistritoJudicial key = new DistritoJudicial();
        key.setCODG_DISTRITO_JUDICIAL(CODG_DISTRITO_JUDICIAL);
        int rows = delete("DISTRITO_JUDICIAL.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
