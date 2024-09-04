// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FirmaAutorizadaDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.FirmaAutorizada;
import pe.gob.pj.rnc.model.FirmaAutorizadaExample;

public interface FirmaAutorizadaDAO
{

    public abstract void insert(FirmaAutorizada firmaautorizada);

    public abstract int updateByPrimaryKey(FirmaAutorizada firmaautorizada);

    public abstract int updateByPrimaryKeySelective(FirmaAutorizada firmaautorizada);

    public abstract List selectByExample(FirmaAutorizadaExample firmaautorizadaexample);

    public abstract FirmaAutorizada selectByPrimaryKey(String s);

    public abstract int deleteByExample(FirmaAutorizadaExample firmaautorizadaexample);

    public abstract int deleteByPrimaryKey(String s);
}
