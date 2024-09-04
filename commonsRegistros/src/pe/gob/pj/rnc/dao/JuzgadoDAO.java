// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JuzgadoDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.Juzgado;
import pe.gob.pj.rnc.model.JuzgadoExample;

public interface JuzgadoDAO
{

    public abstract void insert(Juzgado juzgado);

    public abstract int updateByPrimaryKey(Juzgado juzgado);

    public abstract int updateByPrimaryKeySelective(Juzgado juzgado);

    public abstract List selectByExample(JuzgadoExample juzgadoexample);

    public abstract Juzgado selectByPrimaryKey(String s);

    public abstract int deleteByExample(JuzgadoExample juzgadoexample);

    public abstract int deleteByPrimaryKey(String s);
}
