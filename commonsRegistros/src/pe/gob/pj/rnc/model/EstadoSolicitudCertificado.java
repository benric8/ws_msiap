// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EstadoSolicitudCertificado.java

package pe.gob.pj.rnc.model;


public class EstadoSolicitudCertificado
{

    public EstadoSolicitudCertificado()
    {
    }

    public String getCODG_ESTADO()
    {
        return CODG_ESTADO;
    }

    public void setCODG_ESTADO(String CODG_ESTADO)
    {
        this.CODG_ESTADO = CODG_ESTADO;
    }

    public String getDESC_ESTADO()
    {
        return DESC_ESTADO;
    }

    public void setDESC_ESTADO(String DESC_ESTADO)
    {
        this.DESC_ESTADO = DESC_ESTADO;
    }

    public String getCODG_ESTADO_ANTERIOR()
    {
        return CODG_ESTADO_ANTERIOR;
    }

    public void setCODG_ESTADO_ANTERIOR(String CODG_ESTADO_ANTERIOR)
    {
        this.CODG_ESTADO_ANTERIOR = CODG_ESTADO_ANTERIOR;
    }

    public String getCODG_ESTADO_SIGUIENTE()
    {
        return CODG_ESTADO_SIGUIENTE;
    }

    public void setCODG_ESTADO_SIGUIENTE(String CODG_ESTADO_SIGUIENTE)
    {
        this.CODG_ESTADO_SIGUIENTE = CODG_ESTADO_SIGUIENTE;
    }

    public Short getNUMR_SECUENCIA()
    {
        return NUMR_SECUENCIA;
    }

    public void setNUMR_SECUENCIA(Short NUMR_SECUENCIA)
    {
        this.NUMR_SECUENCIA = NUMR_SECUENCIA;
    }

    public String getDESC_VENTANAS_ASOCIADAS()
    {
        return DESC_VENTANAS_ASOCIADAS;
    }

    public void setDESC_VENTANAS_ASOCIADAS(String DESC_VENTANAS_ASOCIADAS)
    {
        this.DESC_VENTANAS_ASOCIADAS = DESC_VENTANAS_ASOCIADAS;
    }

    private String CODG_ESTADO;
    private String DESC_ESTADO;
    private String CODG_ESTADO_ANTERIOR;
    private String CODG_ESTADO_SIGUIENTE;
    private Short NUMR_SECUENCIA;
    private String DESC_VENTANAS_ASOCIADAS;
}
