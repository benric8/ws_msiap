// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EstadoSolicitudCertificadoDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.EstadoSolicitudCertificado;
import pe.gob.pj.rnc.model.EstadoSolicitudCertificadoExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            EstadoSolicitudCertificadoDAO

public class EstadoSolicitudCertificadoDAOImpl extends SqlMapDaoTemplate
    implements EstadoSolicitudCertificadoDAO
{

    public EstadoSolicitudCertificadoDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(EstadoSolicitudCertificado record)
    {
        insert("ESTADO_SOLICITUD_CERTIFICADO.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(EstadoSolicitudCertificado record)
    {
        int rows = update("ESTADO_SOLICITUD_CERTIFICADO.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(EstadoSolicitudCertificado record)
    {
        int rows = update("ESTADO_SOLICITUD_CERTIFICADO.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List<EstadoSolicitudCertificado> selectByExample(EstadoSolicitudCertificadoExample example)
    {
        List<EstadoSolicitudCertificado> list = queryForList("ESTADO_SOLICITUD_CERTIFICADO.abatorgenerated_selectByExample", example);
        return list;
    }

    public EstadoSolicitudCertificado selectByPrimaryKey(String CODG_ESTADO)
    {
        EstadoSolicitudCertificado key = new EstadoSolicitudCertificado();
        key.setCODG_ESTADO(CODG_ESTADO);
        EstadoSolicitudCertificado record = (EstadoSolicitudCertificado)queryForObject("ESTADO_SOLICITUD_CERTIFICADO.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(EstadoSolicitudCertificadoExample example)
    {
        int rows = delete("ESTADO_SOLICITUD_CERTIFICADO.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_ESTADO)
    {
        EstadoSolicitudCertificado key = new EstadoSolicitudCertificado();
        key.setCODG_ESTADO(CODG_ESTADO);
        int rows = delete("ESTADO_SOLICITUD_CERTIFICADO.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
