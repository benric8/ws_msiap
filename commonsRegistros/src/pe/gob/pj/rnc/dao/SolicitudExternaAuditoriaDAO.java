// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaAuditoriaDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;

import pe.gob.pj.rnc.model.SolicitudExternaAuditoria;
import pe.gob.pj.rnc.model.SolicitudExternaAuditoriaExample;
import pe.gob.pj.rnc.model.SolicitudExternaAuditoriaKey;


public interface SolicitudExternaAuditoriaDAO
{

    public abstract void insert(SolicitudExternaAuditoria solicitudexternaauditoria);

    public abstract int updateByPrimaryKey(SolicitudExternaAuditoria solicitudexternaauditoria);

    public abstract int updateByPrimaryKeySelective(SolicitudExternaAuditoria solicitudexternaauditoria);

    public abstract List selectByExample(SolicitudExternaAuditoriaExample solicitudexternaauditoriaexample);

    public abstract SolicitudExternaAuditoria selectByPrimaryKey(SolicitudExternaAuditoriaKey solicitudexternaauditoriakey);

    public abstract int deleteByExample(SolicitudExternaAuditoriaExample solicitudexternaauditoriaexample);

    public abstract int deleteByPrimaryKey(SolicitudExternaAuditoriaKey solicitudexternaauditoriakey);
}
