// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoDocumentoIdentidadDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;

import pe.gob.pj.rnc.model.TipoDocumentoAutorizacion;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidad;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidadExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            TipoDocumentoIdentidadDAO

public class TipoDocumentoIdentidadDAOImpl extends SqlMapDaoTemplate
    implements TipoDocumentoIdentidadDAO
{

    public TipoDocumentoIdentidadDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(TipoDocumentoIdentidad record)
    {
        insert("documentos_de_identidad.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(TipoDocumentoIdentidad record)
    {
        int rows = update("documentos_de_identidad.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(TipoDocumentoIdentidad record)
    {
        int rows = update("documentos_de_identidad.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(TipoDocumentoIdentidadExample example)
    {
        List list = queryForList("documentos_de_identidad.abatorgenerated_selectByExample", example);
        return list;
    }

    public TipoDocumentoIdentidad selectByPrimaryKey(String codigo_tipo_documento)
    {
        TipoDocumentoIdentidad key = new TipoDocumentoIdentidad();
        key.setCodigo_tipo_documento(codigo_tipo_documento);
        TipoDocumentoIdentidad record = (TipoDocumentoIdentidad)queryForObject("documentos_de_identidad.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(TipoDocumentoIdentidadExample example)
    {
        int rows = delete("documentos_de_identidad.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String codigo_tipo_documento)
    {
        TipoDocumentoIdentidad key = new TipoDocumentoIdentidad();
        key.setCodigo_tipo_documento(codigo_tipo_documento);
        int rows = delete("documentos_de_identidad.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
    
    public List<TipoDocumentoAutorizacion> getTiposDocumentoAutorizacion(){
    	return queryForList("documentos_de_identidad.getTiposDocumentoAutorizacion");
    }
}
