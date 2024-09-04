// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EstadoSolicitudCertificadoDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.EstadoSolicitudCertificado;
import pe.gob.pj.rnc.model.EstadoSolicitudCertificadoExample;

public interface EstadoSolicitudCertificadoDAO
{

    public abstract void insert(EstadoSolicitudCertificado estadosolicitudcertificado);

    public abstract int updateByPrimaryKey(EstadoSolicitudCertificado estadosolicitudcertificado);

    public abstract int updateByPrimaryKeySelective(EstadoSolicitudCertificado estadosolicitudcertificado);

    public abstract List selectByExample(EstadoSolicitudCertificadoExample estadosolicitudcertificadoexample);

    public abstract EstadoSolicitudCertificado selectByPrimaryKey(String s);

    public abstract int deleteByExample(EstadoSolicitudCertificadoExample estadosolicitudcertificadoexample);

    public abstract int deleteByPrimaryKey(String s);
}
