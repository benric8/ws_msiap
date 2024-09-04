// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaAuditoriaKey.java

package pe.gob.pj.rnc.model;


public class SolicitudExternaAuditoriaKey
{

    public SolicitudExternaAuditoriaKey()
    {
    }

    public Integer getCODG_CERTI_EXTERNO()
    {
        return CODG_CERTI_EXTERNO;
    }

    public void setCODG_CERTI_EXTERNO(Integer CODG_CERTI_EXTERNO)
    {
        this.CODG_CERTI_EXTERNO = CODG_CERTI_EXTERNO;
    }

    public Integer getCODG_CORRELATIVO()
    {
        return CODG_CORRELATIVO;
    }

    public void setCODG_CORRELATIVO(Integer CODG_CORRELATIVO)
    {
        this.CODG_CORRELATIVO = CODG_CORRELATIVO;
    }

    private Integer CODG_CERTI_EXTERNO;
    private Integer CODG_CORRELATIVO;
}
