// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoUsuarioDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.TipoUsuario;
import pe.gob.pj.rnc.model.TipoUsuarioExample;

public interface TipoUsuarioDAO
{

    public abstract void insert(TipoUsuario tipousuario);

    public abstract int updateByPrimaryKey(TipoUsuario tipousuario);

    public abstract int updateByPrimaryKeySelective(TipoUsuario tipousuario);

    public abstract List selectByExample(TipoUsuarioExample tipousuarioexample);

    public abstract TipoUsuario selectByPrimaryKey(String s);

    public abstract int deleteByExample(TipoUsuarioExample tipousuarioexample);

    public abstract int deleteByPrimaryKey(String s);
}
