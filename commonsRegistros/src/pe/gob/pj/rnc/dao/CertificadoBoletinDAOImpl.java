// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CertificadoBoletinDAOImpl.java

package pe.gob.pj.rnc.dao;

import java.util.List;

import pe.gob.pj.rnc.model.CertificadoBoletin;
import pe.gob.pj.rnc.model.CertificadoBoletinExample;
import pe.gob.pj.rnc.model.CertificadoBoletinKey;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;


// Referenced classes of package pe.gob.pj.rnc.dao:
//            CertificadoBoletinDAO

public class CertificadoBoletinDAOImpl extends SqlMapDaoTemplate
    implements CertificadoBoletinDAO
{

    public CertificadoBoletinDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(CertificadoBoletin record)
    {
        insert("CERTIFICADO_BOLETIN.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(CertificadoBoletin record)
    {
        int rows = update("CERTIFICADO_BOLETIN.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(CertificadoBoletin record)
    {
        int rows = update("CERTIFICADO_BOLETIN.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(CertificadoBoletinExample example)
    {
        List list = queryForList("CERTIFICADO_BOLETIN.abatorgenerated_selectByExample", example);
        return list;
    }

    public CertificadoBoletin selectByPrimaryKey(CertificadoBoletinKey key)
    {
        CertificadoBoletin record = (CertificadoBoletin)queryForObject("CERTIFICADO_BOLETIN.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(CertificadoBoletinExample example)
    {
        int rows = delete("CERTIFICADO_BOLETIN.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(CertificadoBoletinKey key)
    {
        int rows = delete("CERTIFICADO_BOLETIN.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
