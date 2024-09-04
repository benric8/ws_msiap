// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoDocumentoDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.TipoDocumento;
import pe.gob.pj.rnc.model.TipoDocumentoExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            TipoDocumentoDAO

public class TipoDocumentoDAOImpl extends SqlMapDaoTemplate
    implements TipoDocumentoDAO
{

    public TipoDocumentoDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(TipoDocumento record)
    {
        insert("TIPO_DOCUMENTO.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(TipoDocumento record)
    {
        int rows = update("TIPO_DOCUMENTO.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(TipoDocumento record)
    {
        int rows = update("TIPO_DOCUMENTO.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(TipoDocumentoExample example)
    {
        List list = queryForList("TIPO_DOCUMENTO.abatorgenerated_selectByExample", example);
        return list;
    }

    public TipoDocumento selectByPrimaryKey(String C_CODG_TIPDOC)
    {
        TipoDocumento key = new TipoDocumento();
        key.setC_CODG_TIPDOC(C_CODG_TIPDOC);
        TipoDocumento record = (TipoDocumento)queryForObject("TIPO_DOCUMENTO.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(TipoDocumentoExample example)
    {
        int rows = delete("TIPO_DOCUMENTO.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String C_CODG_TIPDOC)
    {
        TipoDocumento key = new TipoDocumento();
        key.setC_CODG_TIPDOC(C_CODG_TIPDOC);
        int rows = delete("TIPO_DOCUMENTO.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
