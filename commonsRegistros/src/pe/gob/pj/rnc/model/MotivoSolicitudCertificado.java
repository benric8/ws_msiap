// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   MotivoSolicitudCertificado.java

package pe.gob.pj.rnc.model;


public class MotivoSolicitudCertificado
{

	private String codigo_del_motivo;
    private String codigo_tipo_de_solicitud;
    private String descripcion;
    private String situacion;
    private String abreviatura;
    private String CODG_ENTIDADES_EXTERNAS;
    private String l_activo;

    public MotivoSolicitudCertificado()
    {
    }

    public String getCodigo_del_motivo()
    {
        return codigo_del_motivo;
    }

    public void setCodigo_del_motivo(String codigo_del_motivo)
    {
        this.codigo_del_motivo = codigo_del_motivo;
    }

    public String getCodigo_tipo_de_solicitud()
    {
        return codigo_tipo_de_solicitud==null?"":codigo_tipo_de_solicitud;
    }

    public void setCodigo_tipo_de_solicitud(String codigo_tipo_de_solicitud)
    {
        this.codigo_tipo_de_solicitud = codigo_tipo_de_solicitud;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getSituacion()
    {
        return situacion;
    }

    public void setSituacion(String situacion)
    {
        this.situacion = situacion;
    }

    public String getAbreviatura()
    {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura)
    {
        this.abreviatura = abreviatura;
    }

    public String getCODG_ENTIDADES_EXTERNAS()
    {
        return CODG_ENTIDADES_EXTERNAS;
    }

    public void setCODG_ENTIDADES_EXTERNAS(String CODG_ENTIDADES_EXTERNAS)
    {
        this.CODG_ENTIDADES_EXTERNAS = CODG_ENTIDADES_EXTERNAS;
    }

	public String getL_activo() {
		return l_activo;
	}

	public void setL_activo(String l_activo) {
		this.l_activo = l_activo;
	}
}
