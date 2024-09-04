// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ContadorWeb.java

package pe.gob.pj.rnc.model;


public class ContadorWeb
{

    public ContadorWeb()
    {
    }

    public Integer getCOD_TABLA()
    {
        return COD_TABLA;
    }

    public void setCOD_TABLA(Integer COD_TABLA)
    {
        this.COD_TABLA = COD_TABLA;
    }

    public String getNUM_ANHO()
    {
        return NUM_ANHO;
    }

    public void setNUM_ANHO(String NUM_ANHO)
    {
        this.NUM_ANHO = NUM_ANHO;
    }

    public Integer getNUM_CORRELATIVO()
    {
        return NUM_CORRELATIVO;
    }

    public void setNUM_CORRELATIVO(Integer NUM_CORRELATIVO)
    {
        this.NUM_CORRELATIVO = NUM_CORRELATIVO;
    }

    public String getDES_TABLA()
    {
        return DES_TABLA;
    }

    public void setDES_TABLA(String DES_TABLA)
    {
        this.DES_TABLA = DES_TABLA;
    }

    private Integer COD_TABLA;
    private String NUM_ANHO;
    private Integer NUM_CORRELATIVO;
    private String DES_TABLA;
}
