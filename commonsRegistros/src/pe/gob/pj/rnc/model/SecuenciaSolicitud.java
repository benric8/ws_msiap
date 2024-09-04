// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SecuenciaSolicitud.java

package pe.gob.pj.rnc.model;


public class SecuenciaSolicitud
{

    public SecuenciaSolicitud()
    {
    }

    public String getCODG_PREFI()
    {
        return CODG_PREFI;
    }

    public void setCODG_PREFI(String CODG_PREFI)
    {
        this.CODG_PREFI = CODG_PREFI;
    }

    public String getCODG_CORRE()
    {
        return CODG_CORRE;
    }

    public void setCODG_CORRE(String CODG_CORRE)
    {
        this.CODG_CORRE = CODG_CORRE;
    }

    public String getTIPO_PREFI()
    {
        return TIPO_PREFI;
    }

    public void setTIPO_PREFI(String TIPO_PREFI)
    {
        this.TIPO_PREFI = TIPO_PREFI;
    }

    public String getDESC_PREFI()
    {
        return DESC_PREFI;
    }

    public void setDESC_PREFI(String DESC_PREFI)
    {
        this.DESC_PREFI = DESC_PREFI;
    }

    private String CODG_PREFI;
    private String CODG_CORRE;
    private String TIPO_PREFI;
    private String DESC_PREFI;
}
