// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaItemKey.java

package pe.gob.pj.rnc.model;


public class SolicitudExternaItemKey
{

    public SolicitudExternaItemKey()
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

    public Integer getCODG_CERTI_EXTERNO()
    {
        return CODG_CERTI_EXTERNO;
    }

    public void setCODG_CERTI_EXTERNO(Integer CODG_CERTI_EXTERNO)
    {
        this.CODG_CERTI_EXTERNO = CODG_CERTI_EXTERNO;
    }

    private String CODG_CERTI;
    private Integer CODG_CERTI_EXTERNO;
}
