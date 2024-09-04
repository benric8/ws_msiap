// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DocumentoIdentidadDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.DocumentoIdentidad;
import pe.gob.pj.rnc.model.DocumentoIdentidadExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            DocumentoIdentidadDAO

public class DocumentoIdentidadDAOImpl extends SqlMapDaoTemplate
    implements DocumentoIdentidadDAO
{

    public DocumentoIdentidadDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(DocumentoIdentidad record)
    {
        insert("documentos_de_identidad.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(DocumentoIdentidad record)
    {
        int rows = update("documentos_de_identidad.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(DocumentoIdentidad record)
    {
        int rows = update("documentos_de_identidad.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(DocumentoIdentidadExample example)
    {
        List list = queryForList("documentos_de_identidad.abatorgenerated_selectByExample", example);
        return list;
    }

    public DocumentoIdentidad selectByPrimaryKey(String codigo_tipo_documento)
    {
        DocumentoIdentidad key = new DocumentoIdentidad();
        key.setCodigo_tipo_documento(codigo_tipo_documento);
        DocumentoIdentidad record = (DocumentoIdentidad)queryForObject("documentos_de_identidad.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(DocumentoIdentidadExample example)
    {
        int rows = delete("documentos_de_identidad.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String codigo_tipo_documento)
    {
        DocumentoIdentidad key = new DocumentoIdentidad();
        key.setCodigo_tipo_documento(codigo_tipo_documento);
        int rows = delete("documentos_de_identidad.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
