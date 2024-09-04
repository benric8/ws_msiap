// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoDocumentoIdentidadDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;

import pe.gob.pj.rnc.model.TipoDocumentoAutorizacion;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidad;
import pe.gob.pj.rnc.model.TipoDocumentoIdentidadExample;

public interface TipoDocumentoIdentidadDAO
{

    public abstract void insert(TipoDocumentoIdentidad tipodocumentoidentidad);

    public abstract int updateByPrimaryKey(TipoDocumentoIdentidad tipodocumentoidentidad);

    public abstract int updateByPrimaryKeySelective(TipoDocumentoIdentidad tipodocumentoidentidad);

    public abstract List selectByExample(TipoDocumentoIdentidadExample tipodocumentoidentidadexample);

    public abstract TipoDocumentoIdentidad selectByPrimaryKey(String s);

    public abstract int deleteByExample(TipoDocumentoIdentidadExample tipodocumentoidentidadexample);

    public abstract int deleteByPrimaryKey(String s);
    
    public abstract List<TipoDocumentoAutorizacion> getTiposDocumentoAutorizacion();
}
