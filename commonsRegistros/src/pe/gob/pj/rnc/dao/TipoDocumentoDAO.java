// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoDocumentoDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.TipoDocumento;
import pe.gob.pj.rnc.model.TipoDocumentoExample;

public interface TipoDocumentoDAO
{

    public abstract void insert(TipoDocumento tipodocumento);

    public abstract int updateByPrimaryKey(TipoDocumento tipodocumento);

    public abstract int updateByPrimaryKeySelective(TipoDocumento tipodocumento);

    public abstract List selectByExample(TipoDocumentoExample tipodocumentoexample);

    public abstract TipoDocumento selectByPrimaryKey(String s);

    public abstract int deleteByExample(TipoDocumentoExample tipodocumentoexample);

    public abstract int deleteByPrimaryKey(String s);
}
