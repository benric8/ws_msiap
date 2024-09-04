// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SolicitudExternaItem.java

package pe.gob.pj.rnc.model;


// Referenced classes of package pe.gob.pj.rnc.model:
//            SolicitudExternaItemKey

public class SolicitudExternaItem extends SolicitudExternaItemKey
{

    public SolicitudExternaItem()
    {
    }

    public String getINDC_REGISTRA()
    {
        return INDC_REGISTRA;
    }

    public void setINDC_REGISTRA(String INDC_REGISTRA)
    {
        this.INDC_REGISTRA = INDC_REGISTRA;
    }

    public String getINDC_DESCARTE()
    {
        return INDC_DESCARTE;
    }

    public void setINDC_DESCARTE(String INDC_DESCARTE)
    {
        this.INDC_DESCARTE = INDC_DESCARTE;
    }

    private String INDC_REGISTRA;
    private String INDC_DESCARTE;
}
