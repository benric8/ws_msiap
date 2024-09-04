// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LugarDireccionDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.LugarDireccion;
import pe.gob.pj.rnc.model.LugarDireccionExample;

public interface LugarDireccionDAO
{

    public abstract void insert(LugarDireccion lugardireccion);

    public abstract int updateByPrimaryKey(LugarDireccion lugardireccion);

    public abstract int updateByPrimaryKeySelective(LugarDireccion lugardireccion);

    public abstract List selectByExample(LugarDireccionExample lugardireccionexample);

    public abstract LugarDireccion selectByPrimaryKey(String s);

    public abstract int deleteByExample(LugarDireccionExample lugardireccionexample);

    public abstract int deleteByPrimaryKey(String s);
}
