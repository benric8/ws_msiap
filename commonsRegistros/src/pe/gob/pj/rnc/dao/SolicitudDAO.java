// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   SolicitudDAO.java

package pe.gob.pj.rnc.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.model.DelitoReporte;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExample;
import pe.gob.pj.rnc.model.SolicitudReporte;

public interface SolicitudDAO
{

    public abstract void insert(Solicitud solicitud);

    public abstract int updateByPrimaryKey(Solicitud solicitud);

    public abstract int updateByPrimaryKeySelective(Solicitud solicitud);

    public abstract List selectByExample(SolicitudExample solicitudexample);

    public abstract Solicitud selectByPrimaryKey(String s);

    public abstract int deleteByExample(SolicitudExample solicitudexample);

    public abstract int deleteByPrimaryKey(String s);

    public abstract int updateByPrimaryCertificadoExterno(Map map);

    public abstract int updateByPrimarySolicitud(Map map);

//    public abstract String getPkAlternativo(String codg_certi) throws SQLException;

    public int updateByPrimaryKeySolicitudSelective(Map map) throws SQLException;

    public List<Solicitud> getSolicitudesPorCertifExt(Integer codCertificado);

    public List<SolicitudReporte> reporteSolicitudMagistrado(String codCertificado);

    public List<DelitoReporte> delitosPorBoletin(Integer boletin);

	public abstract List<SolicitudReporte> reporteSolicitudMagistrado(Map<String, Object> params);

	public abstract List<SolicitudReporte> reporteSolicitudesRangoFechas(Map<String, Object> params);
	
    public abstract List<Solicitud>  getSolicitudByNombreUsuarioFecha(Solicitud solicitud);

    public List<Solicitud> consultarSolicitudesInternas(CriterioListarSolicitud criterio);
}
