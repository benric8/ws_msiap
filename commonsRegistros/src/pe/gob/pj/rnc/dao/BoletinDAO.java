// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   BoletinDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.Boletin;
import pe.gob.pj.rnc.model.BoletinExample;
import pe.gob.pj.rnc.model.BoletinReporte;
import pe.gob.pj.rnc.model.Delito;

public interface BoletinDAO
{

    public abstract void insert(Boletin boletin);

    public abstract int updateByPrimaryKey(Boletin boletin);

    public abstract int updateByPrimaryKeySelective(Boletin boletin);

    public abstract List selectByExample(BoletinExample boletinexample);

    public abstract Boletin selectByPrimaryKey(Long long1);

    public abstract int deleteByExample(BoletinExample boletinexample);

    public abstract int deleteByPrimaryKey(Long long1);

    public List<BoletinReporte> getBoletin(String codgCerti);
    
    public String consultarDelitoPorBoletinE(Integer nBoletin);
}
