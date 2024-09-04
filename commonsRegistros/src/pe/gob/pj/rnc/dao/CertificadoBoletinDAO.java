// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CertificadoBoletinDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;

import pe.gob.pj.rnc.model.CertificadoBoletin;
import pe.gob.pj.rnc.model.CertificadoBoletinExample;
import pe.gob.pj.rnc.model.CertificadoBoletinKey;


public interface CertificadoBoletinDAO
{

    public abstract void insert(CertificadoBoletin certificadoboletin);

    public abstract int updateByPrimaryKey(CertificadoBoletin certificadoboletin);

    public abstract int updateByPrimaryKeySelective(CertificadoBoletin certificadoboletin);

    public abstract List selectByExample(CertificadoBoletinExample certificadoboletinexample);

    public abstract CertificadoBoletin selectByPrimaryKey(CertificadoBoletinKey certificadoboletinkey);

    public abstract int deleteByExample(CertificadoBoletinExample certificadoboletinexample);

    public abstract int deleteByPrimaryKey(CertificadoBoletinKey certificadoboletinkey);
}
