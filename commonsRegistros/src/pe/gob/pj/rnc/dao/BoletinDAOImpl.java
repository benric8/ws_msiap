// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   BoletinDAOImpl.java

package pe.gob.pj.rnc.dao;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;
import java.util.List;

import pe.gob.pj.rnc.model.Boletin;
import pe.gob.pj.rnc.model.BoletinExample;
import pe.gob.pj.rnc.model.BoletinReporte;
import pe.gob.pj.rnc.model.Delito;


public class BoletinDAOImpl extends SqlMapDaoTemplate
    implements BoletinDAO
{

    public BoletinDAOImpl(DaoManager daoManager)
    {
        super(daoManager);
    }

    public void insert(Boletin record)
    {
        insert("BOLETIN.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(Boletin record)
    {
        int rows = update("BOLETIN.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(Boletin record)
    {
        int rows = update("BOLETIN.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(BoletinExample example)
    {
        List list = queryForList("BOLETIN.abatorgenerated_selectByExample", example);
        return list;
    }

    public Boletin selectByPrimaryKey(Long NUMR_BOLETN)
    {
        Boletin key = new Boletin();
        key.setNUMR_BOLETN(NUMR_BOLETN);
        Boletin record = (Boletin)queryForObject("BOLETIN.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    public int deleteByExample(BoletinExample example)
    {
        int rows = delete("BOLETIN.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Long NUMR_BOLETN)
    {
        Boletin key = new Boletin();
        key.setNUMR_BOLETN(NUMR_BOLETN);
        int rows = delete("BOLETIN.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    public List<BoletinReporte> getBoletin(String codgCerti) {
		return queryForList("BOLETIN.getBoletin", codgCerti);
	}
    
    public String consultarDelitoPorBoletinE(Integer nBoletin) {
    	StringBuffer delito=new StringBuffer();
    	List<Delito> lista = queryForList("BOLETIN.consultarDelitoPorBoletinE", nBoletin);
    	for(Delito del:lista) {
    		delito.append(del.getDESC_DELIT()).append(" ");
    	}
		return delito.toString();
	}
    
}
