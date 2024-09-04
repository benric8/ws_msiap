// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   SolicitudExternaDAO.java

package pe.gob.pj.rnc.dao;

import java.util.List;
import java.util.Map;

import pe.gob.pj.rnc.criterio.CriterioListarSolicitud;
import pe.gob.pj.rnc.criterio.CriterioListarSolicitudExterna;
import pe.gob.pj.rnc.model.Solicitud;
import pe.gob.pj.rnc.model.SolicitudExterna;
import pe.gob.pj.rnc.model.SolicitudExternaExample;
import pe.gob.pj.rnc.model.SolicitudExternaReporte;

public interface SolicitudExternaDAO
{

    public abstract Integer insert(SolicitudExterna solicitudexterna);

    public abstract int updateByPrimaryKey(SolicitudExterna solicitudexterna);

    public abstract int updateByPrimaryKeySelective(SolicitudExterna solicitudexterna);

    public abstract List selectByExample(SolicitudExternaExample solicitudexternaexample);

    public abstract SolicitudExterna selectByPrimaryKey(Integer integer);

    public abstract int deleteByExample(SolicitudExternaExample solicitudexternaexample);

    public abstract int deleteByPrimaryKey(Integer integer);

	public abstract List<SolicitudExterna> seleccionarSolicitudes(
			CriterioListarSolicitudExterna criterio);

	public List<SolicitudExternaReporte> reporteSolicitudExterna(Map<String, Object> params);

	public abstract List<SolicitudExterna>  getSolicitudByNombreUsuarioFecha(Solicitud solicitud);

    public List<SolicitudExterna> consultarSolicitudesExternas(CriterioListarSolicitud criterio);
}
