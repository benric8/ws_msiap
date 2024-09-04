// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaItemDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;

import pe.gob.pj.rnc.model.SolicitudExternaItem;
import pe.gob.pj.rnc.model.SolicitudExternaItemExample;
import pe.gob.pj.rnc.model.SolicitudExternaItemKey;


public interface SolicitudExternaItemDAO
{

    public abstract void insert(SolicitudExternaItem solicitudexternaitem);

    public abstract int updateByPrimaryKey(SolicitudExternaItem solicitudexternaitem);

    public abstract int updateByPrimaryKeySelective(SolicitudExternaItem solicitudexternaitem);

    public abstract List selectByExample(SolicitudExternaItemExample solicitudexternaitemexample);

    public abstract SolicitudExternaItem selectByPrimaryKey(SolicitudExternaItemKey solicitudexternaitemkey);

    public abstract int deleteByExample(SolicitudExternaItemExample solicitudexternaitemexample);

    public abstract int deleteByPrimaryKey(SolicitudExternaItemKey solicitudexternaitemkey);
}
