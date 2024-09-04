// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CertificadoBoletin.java

package pe.gob.pj.rnc.model;

import java.util.Date;

// Referenced classes of package pe.gob.pj.rnc.model:
//            CertificadoBoletinKey

public class CertificadoBoletin extends CertificadoBoletinKey
{

    public CertificadoBoletin()
    {
    }

    public Date getFECH_BOLETIN()
    {
        return FECH_BOLETIN;
    }

    public void setFECH_BOLETIN(Date FECH_BOLETIN)
    {
        this.FECH_BOLETIN = FECH_BOLETIN;
    }

    public String getCODG_DELIT()
    {
        return CODG_DELIT;
    }

    public void setCODG_DELIT(String CODG_DELIT)
    {
        this.CODG_DELIT = CODG_DELIT;
    }

    public String getCODG_CORRESP_BOLETIN()
    {
        return CODG_CORRESP_BOLETIN;
    }

    public void setCODG_CORRESP_BOLETIN(String CODG_CORRESP_BOLETIN)
    {
        this.CODG_CORRESP_BOLETIN = CODG_CORRESP_BOLETIN;
    }

    public String getCODG_MOTIVO_NO_BOLETIN()
    {
        return CODG_MOTIVO_NO_BOLETIN;
    }

    public void setCODG_MOTIVO_NO_BOLETIN(String CODG_MOTIVO_NO_BOLETIN)
    {
        this.CODG_MOTIVO_NO_BOLETIN = CODG_MOTIVO_NO_BOLETIN;
    }

    public String getDESC_MOTIVO_NO_BOLETIN()
    {
        return DESC_MOTIVO_NO_BOLETIN;
    }

    public void setDESC_MOTIVO_NO_BOLETIN(String DESC_MOTIVO_NO_BOLETIN)
    {
        this.DESC_MOTIVO_NO_BOLETIN = DESC_MOTIVO_NO_BOLETIN;
    }

    public String getCODG_ESTADO_CERT_BOL()
    {
        return CODG_ESTADO_CERT_BOL;
    }

    public void setCODG_ESTADO_CERT_BOL(String CODG_ESTADO_CERT_BOL)
    {
        this.CODG_ESTADO_CERT_BOL = CODG_ESTADO_CERT_BOL;
    }

    public String getCODG_USU_CREACION()
    {
        return CODG_USU_CREACION;
    }

    public void setCODG_USU_CREACION(String CODG_USU_CREACION)
    {
        this.CODG_USU_CREACION = CODG_USU_CREACION;
    }

    public Date getFECH_CREACION()
    {
        return FECH_CREACION;
    }

    public void setFECH_CREACION(Date FECH_CREACION)
    {
        this.FECH_CREACION = FECH_CREACION;
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

    private Date FECH_BOLETIN;
    private String CODG_DELIT;
    private String CODG_CORRESP_BOLETIN;
    private String CODG_MOTIVO_NO_BOLETIN;
    private String DESC_MOTIVO_NO_BOLETIN;
    private String CODG_ESTADO_CERT_BOL;
    private String CODG_USU_CREACION;
    private Date FECH_CREACION;
    private String CODG_USU_ULT_MODI;
    private Date FECH_ULT_MODI;
    private String DESC_FEC_USU_MODI;
}
