// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MotivoSolicitudCertificadoDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificado;
import pe.gob.pj.rnc.model.MotivoSolicitudCertificadoExample;

public interface MotivoSolicitudCertificadoDAO
{

    public abstract void insert(MotivoSolicitudCertificado motivosolicitudcertificado);

    public abstract int updateByPrimaryKey(MotivoSolicitudCertificado motivosolicitudcertificado);

    public abstract int updateByPrimaryKeySelective(MotivoSolicitudCertificado motivosolicitudcertificado);

    public abstract List selectByExample(MotivoSolicitudCertificadoExample motivosolicitudcertificadoexample);

    public abstract MotivoSolicitudCertificado selectByPrimaryKey(String s);

    public abstract int deleteByExample(MotivoSolicitudCertificadoExample motivosolicitudcertificadoexample);

    public abstract int deleteByPrimaryKey(String s);
}
