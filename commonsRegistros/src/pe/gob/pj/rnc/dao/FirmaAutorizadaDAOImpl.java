// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FirmaAutorizadaDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.FirmaAutorizada;
import pe.gob.pj.rnc.model.FirmaAutorizadaExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            FirmaAutorizadaDAO

public class FirmaAutorizadaDAOImpl extends SqlMapDaoTemplate
    implements FirmaAutorizadaDAO
{

    public FirmaAutorizadaDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(FirmaAutorizada record)
    {
        insert("FIRMA_AUTORIZADA.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(FirmaAutorizada record)
    {
        int rows = update("FIRMA_AUTORIZADA.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(FirmaAutorizada record)
    {
        int rows = update("FIRMA_AUTORIZADA.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(FirmaAutorizadaExample example)
    {
        List list = queryForList("FIRMA_AUTORIZADA.abatorgenerated_selectByExample", example);
        return list;
    }

    public FirmaAutorizada selectByPrimaryKey(String CODG_USU_FIRMA)
    {
        FirmaAutorizada key = new FirmaAutorizada();
        key.setCODG_USU_FIRMA(CODG_USU_FIRMA);
        FirmaAutorizada record = (FirmaAutorizada)queryForObject("FIRMA_AUTORIZADA.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(FirmaAutorizadaExample example)
    {
        int rows = delete("FIRMA_AUTORIZADA.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_USU_FIRMA)
    {
        FirmaAutorizada key = new FirmaAutorizada();
        key.setCODG_USU_FIRMA(CODG_USU_FIRMA);
        int rows = delete("FIRMA_AUTORIZADA.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
