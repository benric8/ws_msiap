// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaAuditoria.java

package pe.gob.pj.rnc.model;

import java.util.Date;

// Referenced classes of package pe.gob.pj.rnc.model:
//            SolicitudExternaAuditoriaKey

public class SolicitudExternaAuditoria extends SolicitudExternaAuditoriaKey
{

    public SolicitudExternaAuditoria()
    {
    }

    public String getCODG_USUAR()
    {
        return CODG_USUAR;
    }

    public void setCODG_USUAR(String CODG_USUAR)
    {
        this.CODG_USUAR = CODG_USUAR;
    }

    public String getDESC_ACCION()
    {
        return DESC_ACCION;
    }

    public void setDESC_ACCION(String DESC_ACCION)
    {
        this.DESC_ACCION = DESC_ACCION;
    }

    public Date getFECH_ACCION()
    {
        return FECH_ACCION;
    }

    public void setFECH_ACCION(Date FECH_ACCION)
    {
        this.FECH_ACCION = FECH_ACCION;
    }

    private String CODG_USUAR;
    private String DESC_ACCION;
    private Date FECH_ACCION;
}
