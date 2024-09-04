// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SecuenciaSolicitudDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.SecuenciaSolicitud;
import pe.gob.pj.rnc.model.SecuenciaSolicitudExample;

public interface SecuenciaSolicitudDAO
{

    public abstract void insert(SecuenciaSolicitud secuenciasolicitud);

    public abstract int updateByPrimaryKey(SecuenciaSolicitud secuenciasolicitud);

    public abstract int updateByPrimaryKeySelective(SecuenciaSolicitud secuenciasolicitud);

    public abstract List selectByExample(SecuenciaSolicitudExample secuenciasolicitudexample);

    public abstract SecuenciaSolicitud selectByPrimaryKey(String s);

    public abstract int deleteByExample(SecuenciaSolicitudExample secuenciasolicitudexample);

    public abstract int deleteByPrimaryKey(String s);
}
