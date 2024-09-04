// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Juzgado.java

package pe.gob.pj.rnc.model;


public class Juzgado
{

    public Juzgado()
    {
    }

    public String getCODG_JUZGAD()
    {
    	if(CODG_JUZGAD!=null)
    		CODG_JUZGAD=CODG_JUZGAD.trim();
    	
        return CODG_JUZGAD;
    }

    public void setCODG_JUZGAD(String CODG_JUZGAD)
    {

    	if(CODG_JUZGAD!=null)
    		CODG_JUZGAD=CODG_JUZGAD.trim();
    	
        this.CODG_JUZGAD = CODG_JUZGAD;
    }

    public String getDESC_JUZGAD()
    {
        return DESC_JUZGAD;
    }

    public void setDESC_JUZGAD(String DESC_JUZGAD)
    {
        this.DESC_JUZGAD = DESC_JUZGAD;
    }

    public String getDESC_LARGA_JUZGAD()
    {
        return DESC_LARGA_JUZGAD;
    }

    public void setDESC_LARGA_JUZGAD(String DESC_LARGA_JUZGAD)
    {
        this.DESC_LARGA_JUZGAD = DESC_LARGA_JUZGAD;
    }

    public String getESTD_JUZGA()
    {
        return ESTD_JUZGA;
    }

    public void setESTD_JUZGA(String ESTD_JUZGA)
    {
        this.ESTD_JUZGA = ESTD_JUZGA;
    }

    private String CODG_JUZGAD;
    private String DESC_JUZGAD;
    private String DESC_LARGA_JUZGAD;
    private String ESTD_JUZGA;
}
