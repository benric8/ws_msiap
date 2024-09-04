// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TipoUsuario.java

package pe.gob.pj.rnc.model;


public class TipoUsuario
{

    public TipoUsuario()
    {
    }

    public String getCODG_TIPO()
    {
        return CODG_TIPO;
    }

    public void setCODG_TIPO(String CODG_TIPO)
    {
        this.CODG_TIPO = CODG_TIPO;
    }

    public String getDESC_TIPO()
    {
        return DESC_TIPO;
    }

    public void setDESC_TIPO(String DESC_TIPO)
    {
        this.DESC_TIPO = DESC_TIPO;
    }

    private String CODG_TIPO;
    private String DESC_TIPO;
}
