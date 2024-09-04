// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SecuenciaSolicitudDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.SecuenciaSolicitud;
import pe.gob.pj.rnc.model.SecuenciaSolicitudExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            SecuenciaSolicitudDAO

public class SecuenciaSolicitudDAOImpl extends SqlMapDaoTemplate
    implements SecuenciaSolicitudDAO
{

    public SecuenciaSolicitudDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(SecuenciaSolicitud record)
    {
        insert("SECUENCIA.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(SecuenciaSolicitud record)
    {
        int rows = update("SECUENCIA.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(SecuenciaSolicitud record)
    {
        int rows = update("SECUENCIA.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(SecuenciaSolicitudExample example)
    {
        List list = queryForList("SECUENCIA.abatorgenerated_selectByExample", example);
        return list;
    }

    public SecuenciaSolicitud selectByPrimaryKey(String CODG_PREFI)
    {
        SecuenciaSolicitud key = new SecuenciaSolicitud();
        key.setCODG_PREFI(CODG_PREFI);
        SecuenciaSolicitud record = (SecuenciaSolicitud)queryForObject("SECUENCIA.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(SecuenciaSolicitudExample example)
    {
        int rows = delete("SECUENCIA.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_PREFI)
    {
        SecuenciaSolicitud key = new SecuenciaSolicitud();
        key.setCODG_PREFI(CODG_PREFI);
        int rows = delete("SECUENCIA.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
