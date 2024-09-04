// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FirmaAutorizada.java

package pe.gob.pj.rnc.model;

import java.util.Date;

public class FirmaAutorizada
{

    public FirmaAutorizada()
    {
    }

    public String getCODG_USU_FIRMA()
    {
        return CODG_USU_FIRMA;
    }

    public void setCODG_USU_FIRMA(String CODG_USU_FIRMA)
    {
        this.CODG_USU_FIRMA = CODG_USU_FIRMA;
    }

    public String getDESC_NOMBRE()
    {
        return DESC_NOMBRE;
    }

    public void setDESC_NOMBRE(String DESC_NOMBRE)
    {
        this.DESC_NOMBRE = DESC_NOMBRE;
    }

    public String getDESC_SUMILLA()
    {
        return DESC_SUMILLA;
    }

    public void setDESC_SUMILLA(String DESC_SUMILLA)
    {
        this.DESC_SUMILLA = DESC_SUMILLA;
    }

    public String getINDC_ACTIVO()
    {
        return INDC_ACTIVO;
    }

    public void setINDC_ACTIVO(String INDC_ACTIVO)
    {
        this.INDC_ACTIVO = INDC_ACTIVO;
    }

    public Short getNUMR_ORDEN()
    {
        return NUMR_ORDEN;
    }

    public void setNUMR_ORDEN(Short NUMR_ORDEN)
    {
        this.NUMR_ORDEN = NUMR_ORDEN;
    }

    public String getDESC_OBSERVACIONES()
    {
        return DESC_OBSERVACIONES;
    }

    public void setDESC_OBSERVACIONES(String DESC_OBSERVACIONES)
    {
        this.DESC_OBSERVACIONES = DESC_OBSERVACIONES;
    }

    public String getINDC_JEFE_RNC()
    {
        return INDC_JEFE_RNC;
    }

    public void setINDC_JEFE_RNC(String INDC_JEFE_RNC)
    {
        this.INDC_JEFE_RNC = INDC_JEFE_RNC;
    }

    public String getTIPO_FIRMA()
    {
        return TIPO_FIRMA;
    }

    public void setTIPO_FIRMA(String TIPO_FIRMA)
    {
        this.TIPO_FIRMA = TIPO_FIRMA;
    }

    public String getCODG_USU_REGISTRO()
    {
        return CODG_USU_REGISTRO;
    }

    public void setCODG_USU_REGISTRO(String CODG_USU_REGISTRO)
    {
        this.CODG_USU_REGISTRO = CODG_USU_REGISTRO;
    }

    public Date getFECH_REGISTRO()
    {
        return FECH_REGISTRO;
    }

    public void setFECH_REGISTRO(Date FECH_REGISTRO)
    {
        this.FECH_REGISTRO = FECH_REGISTRO;
    }

    public String getCODG_USU_ULT_MODI()
    {
        return CODG_USU_ULT_MODI;
    }

    public void setCODG_USU_ULT_MODI(String CODG_USU_ULT_MODI)
    {
        this.CODG_USU_ULT_MODI = CODG_USU_ULT_MODI;
    }

    public Date getFECH_ULT_MODI()
    {
        return FECH_ULT_MODI;
    }

    public void setFECH_ULT_MODI(Date FECH_ULT_MODI)
    {
        this.FECH_ULT_MODI = FECH_ULT_MODI;
    }

    public String getDESC_FEC_USU_MODI()
    {
        return DESC_FEC_USU_MODI;
    }

    public void setDESC_FEC_USU_MODI(String DESC_FEC_USU_MODI)
    {
        this.DESC_FEC_USU_MODI = DESC_FEC_USU_MODI;
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

    private String CODG_USU_FIRMA;
    private String DESC_NOMBRE;
    private String DESC_SUMILLA;
    private String INDC_ACTIVO;
    private Short NUMR_ORDEN;
    private String DESC_OBSERVACIONES;
    private String INDC_JEFE_RNC;
    private String TIPO_FIRMA;
    private String CODG_USU_REGISTRO;
    private Date FECH_REGISTRO;
    private String CODG_USU_ULT_MODI;
    private Date FECH_ULT_MODI;
    private String DESC_FEC_USU_MODI;
    private Date f_aud;
    private String c_aud_uid;
    private String c_aud_pc;
    private String n_aud_ip;
    private String c_aud_mcaddr;
    private String c_aud_lgnred;
}
