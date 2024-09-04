// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DepartamentoDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.Departamento;
import pe.gob.pj.rnc.model.DepartamentoExample;

public interface DepartamentoDAO
{

    public abstract void insert(Departamento departamento);

    public abstract int updateByPrimaryKey(Departamento departamento);

    public abstract int updateByPrimaryKeySelective(Departamento departamento);

    public abstract List selectByExample(DepartamentoExample departamentoexample);

    public abstract Departamento selectByPrimaryKey(String s);

    public abstract int deleteByExample(DepartamentoExample departamentoexample);

    public abstract int deleteByPrimaryKey(String s);
    
    public abstract Departamento obtenerPorCodEntidadExterna(Integer codigoEntidadExterna);
}
