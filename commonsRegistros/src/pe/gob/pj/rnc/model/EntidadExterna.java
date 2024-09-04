// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EntidadExterna.java

package pe.gob.pj.rnc.model;

import java.util.Date;

public class EntidadExterna
{
	public static final Integer MINISTERIO_RELACIONES_EXTERIORES_ID = 2;
	public static final Integer CORTE_SUPREMA_ID = 998;
	public static final Integer REGISTRO_NACIONAL_CONDENAS_ID = 999;
	public static final Integer JURADO_NACIONAL_DE_ELECCIONES = 296;
	
	private Integer CODG_ENTIDAD_EXTERNA;
    private String DESC_ENTIDAD_EXTERNA;
    private String DESC_SIGLAS;
    private String INDC_ACTIVO;
    private Date FEC_REGISTRO;
    private Date FEC_MODIFICACION;
    private String DESC_CONVENIO;
    private String INDC_REFERENCIA;
    private String CODG_MOTIVO_DEFECTO;
    private Integer CODG_ENTIDAD_EXTERNA_SUP;
    private String CODG_DISTRITO_JUDICIAL;
    
	public boolean isConsulado() {
		return MINISTERIO_RELACIONES_EXTERIORES_ID.equals(getCODG_ENTIDAD_EXTERNA_SUP());
	}
	
    public EntidadExterna()
    {
    }

    public Integer getCODG_ENTIDAD_EXTERNA()
    {
        return CODG_ENTIDAD_EXTERNA;
    }

    public void setCODG_ENTIDAD_EXTERNA(Integer CODG_ENTIDAD_EXTERNA)
    {
        this.CODG_ENTIDAD_EXTERNA = CODG_ENTIDAD_EXTERNA;
    }

    public String getDESC_ENTIDAD_EXTERNA()
    {
        return DESC_ENTIDAD_EXTERNA;
    }

    public void setDESC_ENTIDAD_EXTERNA(String DESC_ENTIDAD_EXTERNA)
    {
        this.DESC_ENTIDAD_EXTERNA = DESC_ENTIDAD_EXTERNA;
    }

    public String getDESC_SIGLAS()
    {
        return DESC_SIGLAS;
    }

    public void setDESC_SIGLAS(String DESC_SIGLAS)
    {
        this.DESC_SIGLAS = DESC_SIGLAS;
    }

    public String getINDC_ACTIVO()
    {
        return INDC_ACTIVO;
    }

    public void setINDC_ACTIVO(String INDC_ACTIVO)
    {
        this.INDC_ACTIVO = INDC_ACTIVO;
    }

    public Date getFEC_REGISTRO()
    {
        return FEC_REGISTRO;
    }

    public void setFEC_REGISTRO(Date FEC_REGISTRO)
    {
        this.FEC_REGISTRO = FEC_REGISTRO;
    }

    public Date getFEC_MODIFICACION()
    {
        return FEC_MODIFICACION;
    }

    public void setFEC_MODIFICACION(Date FEC_MODIFICACION)
    {
        this.FEC_MODIFICACION = FEC_MODIFICACION;
    }

    public String getDESC_CONVENIO()
    {
        return DESC_CONVENIO;
    }

    public void setDESC_CONVENIO(String DESC_CONVENIO)
    {
        this.DESC_CONVENIO = DESC_CONVENIO;
    }

    public String getINDC_REFERENCIA()
    {
        return INDC_REFERENCIA;
    }

    public void setINDC_REFERENCIA(String INDC_REFERENCIA)
    {
        this.INDC_REFERENCIA = INDC_REFERENCIA;
    }

    public String getCODG_MOTIVO_DEFECTO()
    {
        return CODG_MOTIVO_DEFECTO;
    }

    public void setCODG_MOTIVO_DEFECTO(String CODG_MOTIVO_DEFECTO)
    {
        this.CODG_MOTIVO_DEFECTO = CODG_MOTIVO_DEFECTO;
    }

    public Integer getCODG_ENTIDAD_EXTERNA_SUP()
    {
        return CODG_ENTIDAD_EXTERNA_SUP;
    }

    public void setCODG_ENTIDAD_EXTERNA_SUP(Integer CODG_ENTIDAD_EXTERNA_SUP)
    {
        this.CODG_ENTIDAD_EXTERNA_SUP = CODG_ENTIDAD_EXTERNA_SUP;
    }

	public String getCODG_DISTRITO_JUDICIAL() {
		return CODG_DISTRITO_JUDICIAL;
	}

	public void setCODG_DISTRITO_JUDICIAL(String cODG_DISTRITO_JUDICIAL) {
		CODG_DISTRITO_JUDICIAL = cODG_DISTRITO_JUDICIAL;
	}
}
