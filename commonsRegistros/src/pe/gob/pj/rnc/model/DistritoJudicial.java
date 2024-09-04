// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   DistritoJudicial.java

package pe.gob.pj.rnc.model;

import java.util.Date;

public class DistritoJudicial
{
	public static final String RELACIONES_EXTERIORES_ID = "32";
	public static final String CORTE_SUPREMA_ID = "33";
    private String CODG_DISTRITO_JUDICIAL;
    private String DESC_DISTRITO_JUDICIAL;
    private String INDC_LOCAL;
    private Short NUMR_ORDEN;
    private String INDC_ACTIVO;
    private String CODG_LUGAR_DJ;
    private String INDC_SISTEMA_RDC;
    private String RUTA_PRODUCCION;
    private String RUTA_APLICACION;
    private String RUTA_AYUDA;
    private String RUTA_CAMARA;
    private String RUTA_ESCANER;
    private String RUTA_BMPS;
    private Date f_aud;
    private String c_aud_uid;
    private String c_aud_pc;
    private String n_aud_ip;
    private String c_aud_mcaddr;
    private String c_aud_lgnred;
    private String ALERTA_PAPEL;
    private String C_CONVENIOS;

    public DistritoJudicial()
    {
    }

    public String getCODG_DISTRITO_JUDICIAL()
    {
        return CODG_DISTRITO_JUDICIAL;
    }

    public void setCODG_DISTRITO_JUDICIAL(String CODG_DISTRITO_JUDICIAL)
    {
        this.CODG_DISTRITO_JUDICIAL = CODG_DISTRITO_JUDICIAL;
    }

    public String getDESC_DISTRITO_JUDICIAL()
    {
        return DESC_DISTRITO_JUDICIAL;
    }

    public void setDESC_DISTRITO_JUDICIAL(String DESC_DISTRITO_JUDICIAL)
    {
        this.DESC_DISTRITO_JUDICIAL = DESC_DISTRITO_JUDICIAL;
    }

    public String getINDC_LOCAL()
    {
        return INDC_LOCAL;
    }

    public void setINDC_LOCAL(String INDC_LOCAL)
    {
        this.INDC_LOCAL = INDC_LOCAL;
    }

    public Short getNUMR_ORDEN()
    {
        return NUMR_ORDEN;
    }

    public void setNUMR_ORDEN(Short NUMR_ORDEN)
    {
        this.NUMR_ORDEN = NUMR_ORDEN;
    }

    public String getINDC_ACTIVO()
    {
        return INDC_ACTIVO;
    }

    public void setINDC_ACTIVO(String INDC_ACTIVO)
    {
        this.INDC_ACTIVO = INDC_ACTIVO;
    }

    public String getCODG_LUGAR_DJ()
    {
        return CODG_LUGAR_DJ;
    }

    public void setCODG_LUGAR_DJ(String CODG_LUGAR_DJ)
    {
        this.CODG_LUGAR_DJ = CODG_LUGAR_DJ;
    }

    public String getINDC_SISTEMA_RDC()
    {
        return INDC_SISTEMA_RDC;
    }

    public void setINDC_SISTEMA_RDC(String INDC_SISTEMA_RDC)
    {
        this.INDC_SISTEMA_RDC = INDC_SISTEMA_RDC;
    }

    public String getRUTA_PRODUCCION()
    {
        return RUTA_PRODUCCION;
    }

    public void setRUTA_PRODUCCION(String RUTA_PRODUCCION)
    {
        this.RUTA_PRODUCCION = RUTA_PRODUCCION;
    }

    public String getRUTA_APLICACION()
    {
        return RUTA_APLICACION;
    }

    public void setRUTA_APLICACION(String RUTA_APLICACION)
    {
        this.RUTA_APLICACION = RUTA_APLICACION;
    }

    public String getRUTA_AYUDA()
    {
        return RUTA_AYUDA;
    }

    public void setRUTA_AYUDA(String RUTA_AYUDA)
    {
        this.RUTA_AYUDA = RUTA_AYUDA;
    }

    public String getRUTA_CAMARA()
    {
        return RUTA_CAMARA;
    }

    public void setRUTA_CAMARA(String RUTA_CAMARA)
    {
        this.RUTA_CAMARA = RUTA_CAMARA;
    }

    public String getRUTA_ESCANER()
    {
        return RUTA_ESCANER;
    }

    public void setRUTA_ESCANER(String RUTA_ESCANER)
    {
        this.RUTA_ESCANER = RUTA_ESCANER;
    }

    public String getRUTA_BMPS()
    {
        return RUTA_BMPS;
    }

    public void setRUTA_BMPS(String RUTA_BMPS)
    {
        this.RUTA_BMPS = RUTA_BMPS;
    }

    public Date getF_aud()
    {
        return f_aud;
    }

    public void setF_aud(Date f_aud)
    {
        this.f_aud = f_aud;
    }

    public String getC_aud_uid()
    {
        return c_aud_uid;
    }

    public void setC_aud_uid(String c_aud_uid)
    {
        this.c_aud_uid = c_aud_uid;
    }

    public String getC_aud_pc()
    {
        return c_aud_pc;
    }

    public void setC_aud_pc(String c_aud_pc)
    {
        this.c_aud_pc = c_aud_pc;
    }

    public String getN_aud_ip()
    {
        return n_aud_ip;
    }

    public void setN_aud_ip(String n_aud_ip)
    {
        this.n_aud_ip = n_aud_ip;
    }

    public String getC_aud_mcaddr()
    {
        return c_aud_mcaddr;
    }

    public void setC_aud_mcaddr(String c_aud_mcaddr)
    {
        this.c_aud_mcaddr = c_aud_mcaddr;
    }

    public String getC_aud_lgnred()
    {
        return c_aud_lgnred;
    }

    public void setC_aud_lgnred(String c_aud_lgnred)
    {
        this.c_aud_lgnred = c_aud_lgnred;
    }

    public String getALERTA_PAPEL()
    {
        return ALERTA_PAPEL;
    }

    public void setALERTA_PAPEL(String ALERTA_PAPEL)
    {
        this.ALERTA_PAPEL = ALERTA_PAPEL;
    }

	public static String getCorteSupremaId() {
		return CORTE_SUPREMA_ID;
	}

	public String getC_CONVENIOS() {
		return C_CONVENIOS;
	}

	public void setC_CONVENIOS(String c_CONVENIOS) {
		C_CONVENIOS = c_CONVENIOS;
	}
}
