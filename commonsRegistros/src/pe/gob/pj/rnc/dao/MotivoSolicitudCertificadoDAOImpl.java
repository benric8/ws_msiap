// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MotivoSolicitudCertificadoDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificado;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificadoExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            MotivoSolicitudCertificadoDAO

public class MotivoSolicitudCertificadoDAOImpl extends SqlMapDaoTemplate
    implements MotivoSolicitudCertificadoDAO
{

    public MotivoSolicitudCertificadoDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(MotivoSolicitudCertificado record)
    {
        insert("motivos_solicitud_certificados.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(MotivoSolicitudCertificado record)
    {
        int rows = update("motivos_solicitud_certificados.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(MotivoSolicitudCertificado record)
    {
        int rows = update("motivos_solicitud_certificados.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(MotivoSolicitudCertificadoExample example)
    {
        List list = queryForList("motivos_solicitud_certificados.abatorgenerated_selectByExample", example);
        return list;
    }

    public MotivoSolicitudCertificado selectByPrimaryKey(String codigo_del_motivo)
    {
        MotivoSolicitudCertificado key = new MotivoSolicitudCertificado();
        key.setCodigo_del_motivo(codigo_del_motivo);
        MotivoSolicitudCertificado record = (MotivoSolicitudCertificado)queryForObject("motivos_solicitud_certificados.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(MotivoSolicitudCertificadoExample example)
    {
        int rows = delete("motivos_solicitud_certificados.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String codigo_del_motivo)
    {
        MotivoSolicitudCertificado key = new MotivoSolicitudCertificado();
        key.setCodigo_del_motivo(codigo_del_motivo);
        int rows = delete("motivos_solicitud_certificados.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
