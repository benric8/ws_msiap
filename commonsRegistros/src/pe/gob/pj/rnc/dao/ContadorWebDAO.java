// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ContadorWebDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.ContadorWeb;
import pe.gob.pj.rnc.model.ContadorWebExample;

public interface ContadorWebDAO
{

    public abstract void insert(ContadorWeb contadorweb);

    public abstract int updateByPrimaryKey(ContadorWeb contadorweb);

    public abstract int updateByPrimaryKeySelective(ContadorWeb contadorweb);

    public abstract List selectByExample(ContadorWebExample contadorwebexample);

    public abstract ContadorWeb selectByPrimaryKey(Integer integer);

    public abstract int deleteByExample(ContadorWebExample contadorwebexample);

    public abstract int deleteByPrimaryKey(Integer integer);
}
