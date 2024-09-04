// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoUsuarioDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.TipoUsuario;
import pe.gob.pj.rnc.model.TipoUsuarioExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            TipoUsuarioDAO

public class TipoUsuarioDAOImpl extends SqlMapDaoTemplate
    implements TipoUsuarioDAO
{

    public TipoUsuarioDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(TipoUsuario record)
    {
        insert("TIPO_USUARIO.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(TipoUsuario record)
    {
        int rows = update("TIPO_USUARIO.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(TipoUsuario record)
    {
        int rows = update("TIPO_USUARIO.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(TipoUsuarioExample example)
    {
        List list = queryForList("TIPO_USUARIO.abatorgenerated_selectByExample", example);
        return list;
    }

    public TipoUsuario selectByPrimaryKey(String CODG_TIPO)
    {
        TipoUsuario key = new TipoUsuario();
        key.setCODG_TIPO(CODG_TIPO);
        TipoUsuario record = (TipoUsuario)queryForObject("TIPO_USUARIO.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(TipoUsuarioExample example)
    {
        int rows = delete("TIPO_USUARIO.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_TIPO)
    {
        TipoUsuario key = new TipoUsuario();
        key.setCODG_TIPO(CODG_TIPO);
        int rows = delete("TIPO_USUARIO.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
