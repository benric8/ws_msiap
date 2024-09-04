// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DocumentoIdentidadDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.DocumentoIdentidad;
import pe.gob.pj.rnc.model.DocumentoIdentidadExample;

public interface DocumentoIdentidadDAO
{

    public abstract void insert(DocumentoIdentidad documentoidentidad);

    public abstract int updateByPrimaryKey(DocumentoIdentidad documentoidentidad);

    public abstract int updateByPrimaryKeySelective(DocumentoIdentidad documentoidentidad);

    public abstract List selectByExample(DocumentoIdentidadExample documentoidentidadexample);

    public abstract DocumentoIdentidad selectByPrimaryKey(String s);

    public abstract int deleteByExample(DocumentoIdentidadExample documentoidentidadexample);

    public abstract int deleteByPrimaryKey(String s);
}
