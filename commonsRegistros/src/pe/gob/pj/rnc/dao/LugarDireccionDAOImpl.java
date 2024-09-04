// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LugarDireccionDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.LugarDireccion;
import pe.gob.pj.rnc.model.LugarDireccionExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            LugarDireccionDAO

public class LugarDireccionDAOImpl extends SqlMapDaoTemplate
    implements LugarDireccionDAO
{

    public LugarDireccionDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(LugarDireccion record)
    {
        insert("LUGAR_DIRECCION.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(LugarDireccion record)
    {
        int rows = update("LUGAR_DIRECCION.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(LugarDireccion record)
    {
        int rows = update("LUGAR_DIRECCION.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(LugarDireccionExample example)
    {
        List list = queryForList("LUGAR_DIRECCION.abatorgenerated_selectByExample", example);
        return list;
    }

    public LugarDireccion selectByPrimaryKey(String CODG_LUGAR_DIRECCION)
    {
        LugarDireccion key = new LugarDireccion();
        key.setCODG_LUGAR_DIRECCION(CODG_LUGAR_DIRECCION);
        LugarDireccion record = (LugarDireccion)queryForObject("LUGAR_DIRECCION.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(LugarDireccionExample example)
    {
        int rows = delete("LUGAR_DIRECCION.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String CODG_LUGAR_DIRECCION)
    {
        LugarDireccion key = new LugarDireccion();
        key.setCODG_LUGAR_DIRECCION(CODG_LUGAR_DIRECCION);
        int rows = delete("LUGAR_DIRECCION.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
}
