// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaItemDAOImpl.java

package pe.gob.pj.rnc.dao;

import java.util.List;

import pe.gob.pj.rnc.model.SolicitudExternaItem;
import pe.gob.pj.rnc.model.SolicitudExternaItemExample;
import pe.gob.pj.rnc.model.SolicitudExternaItemKey;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;


// Referenced classes of package pe.gob.pj.rnc.dao:
//            SolicitudExternaItemDAO

public class SolicitudExternaItemDAOImpl extends SqlMapDaoTemplate
    implements SolicitudExternaItemDAO
{

    public SolicitudExternaItemDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(SolicitudExternaItem record)
    {
        insert("SOLICITUD_EXTERNA_ITEM.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(SolicitudExternaItem record)
    {
        int rows = update("SOLICITUD_EXTERNA_ITEM.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(SolicitudExternaItem record)
    {
        int rows = update("SOLICITUD_EXTERNA_ITEM.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(SolicitudExternaItemExample example)
    {
        List list = queryForList("SOLICITUD_EXTERNA_ITEM.abatorgenerated_selectByExample", example);
        return list;
    }

    public SolicitudExternaItem selectByPrimaryKey(SolicitudExternaItemKey key)
    {
        SolicitudExternaItem record = (SolicitudExternaItem)queryForObject("SOLICITUD_EXTERNA_ITEM.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(SolicitudExternaItemExample example)
    {
        int rows = delete("SOLICITUD_EXTERNA_ITEM.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(SolicitudExternaItemKey key)
    {
        int rows = delete("SOLICITUD_EXTERNA_ITEM.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
