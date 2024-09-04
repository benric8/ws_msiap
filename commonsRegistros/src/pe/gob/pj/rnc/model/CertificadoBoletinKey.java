// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CertificadoBoletinKey.java

package pe.gob.pj.rnc.model;


public class CertificadoBoletinKey
{

    public CertificadoBoletinKey()
    {
    }

    public String getCODG_CERTI()
    {
        return CODG_CERTI;
    }

    public void setCODG_CERTI(String CODG_CERTI)
    {
        this.CODG_CERTI = CODG_CERTI;
    }

    public Long getNUMR_BOLETN()
    {
        return NUMR_BOLETN;
    }

    public void setNUMR_BOLETN(Long NUMR_BOLETN)
    {
        this.NUMR_BOLETN = NUMR_BOLETN;
    }

    private String CODG_CERTI;
    private Long NUMR_BOLETN;
}
