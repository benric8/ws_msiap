// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EntidadExternaDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;
import pe.gob.pj.rnc.model.EntidadExterna;
import pe.gob.pj.rnc.model.EntidadExternaExample;

// Referenced classes of package pe.gob.pj.rnc.dao:
//            EntidadExternaDAO

public class EntidadExternaDAOImpl extends SqlMapDaoTemplate
    implements EntidadExternaDAO
{

    public EntidadExternaDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(EntidadExterna record)
    {
        insert("ENTIDAD_EXTERNA.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(EntidadExterna record)
    {
        int rows = update("ENTIDAD_EXTERNA.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(EntidadExterna record)
    {
        int rows = update("ENTIDAD_EXTERNA.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(EntidadExternaExample example)
    {
        List list = queryForList("ENTIDAD_EXTERNA.abatorgenerated_selectByExample", example);
        return list;
    }

    public EntidadExterna selectByPrimaryKey(Integer CODG_ENTIDAD_EXTERNA)
    {
        EntidadExterna key = new EntidadExterna();
        key.setCODG_ENTIDAD_EXTERNA(CODG_ENTIDAD_EXTERNA);
        EntidadExterna record = (EntidadExterna)queryForObject("ENTIDAD_EXTERNA.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(EntidadExternaExample example)
    {
        int rows = delete("ENTIDAD_EXTERNA.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer CODG_ENTIDAD_EXTERNA)
    {
        EntidadExterna key = new EntidadExterna();
        key.setCODG_ENTIDAD_EXTERNA(CODG_ENTIDAD_EXTERNA);
        int rows = delete("ENTIDAD_EXTERNA.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }
    
    public List<EntidadExterna> consultarEntidades(EntidadExterna key){
    	List<EntidadExterna> list = queryForList("ENTIDAD_EXTERNA.consultarEntidades", key);
        return list;
    }
}
