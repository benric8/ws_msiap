// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaAuditoriaDAOImpl.java

package pe.gob.pj.rnc.dao;

import java.util.List;

import pe.gob.pj.rnc.model.SolicitudExternaAuditoria;
import pe.gob.pj.rnc.model.SolicitudExternaAuditoriaExample;
import pe.gob.pj.rnc.model.SolicitudExternaAuditoriaKey;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;


// Referenced classes of package pe.gob.pj.rnc.dao:
//            SolicitudExternaAuditoriaDAO

public class SolicitudExternaAuditoriaDAOImpl extends SqlMapDaoTemplate
    implements SolicitudExternaAuditoriaDAO
{

    public SolicitudExternaAuditoriaDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(SolicitudExternaAuditoria record)
    {
        insert("SOLICITUD_EXTERNA_AUDITORIA.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(SolicitudExternaAuditoria record)
    {
        int rows = update("SOLICITUD_EXTERNA_AUDITORIA.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(SolicitudExternaAuditoria record)
    {
        int rows = update("SOLICITUD_EXTERNA_AUDITORIA.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(SolicitudExternaAuditoriaExample example)
    {
        List list = queryForList("SOLICITUD_EXTERNA_AUDITORIA.abatorgenerated_selectByExample", example);
        return list;
    }

    public SolicitudExternaAuditoria selectByPrimaryKey(SolicitudExternaAuditoriaKey key)
    {
        SolicitudExternaAuditoria record = (SolicitudExternaAuditoria)queryForObject("SOLICITUD_EXTERNA_AUDITORIA.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(SolicitudExternaAuditoriaExample example)
    {
        int rows = delete("SOLICITUD_EXTERNA_AUDITORIA.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(SolicitudExternaAuditoriaKey key)
    {
        int rows = delete("SOLICITUD_EXTERNA_AUDITORIA.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
