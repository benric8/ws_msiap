// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   TipoDocumentoIdentidad.java

package pe.gob.pj.rnc.model;


public class TipoDocumentoIdentidad
{

	public static final String COD_TIPO_DOCUMENTO_DNI = "0010";
	public static final String COD_TIPO_DOCUMENTO_CE = "0005";
	public static final String COD_TIPO_DOCUMENTO_PASAPORTE = "0006";
	
    private String codigo_tipo_documento;
    private String descripcion;
    private String situacion;
    private String abreviatura;
    private String INDC_CONVENIO;

    public TipoDocumentoIdentidad()
    {
    }

    public String getCodigo_tipo_documento()
    {
        return codigo_tipo_documento;
    }

    public void setCodigo_tipo_documento(String codigo_tipo_documento)
    {
        this.codigo_tipo_documento = codigo_tipo_documento;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getSituacion()
    {
        return situacion;
    }

    public void setSituacion(String situacion)
    {
        this.situacion = situacion;
    }

    public String getAbreviatura()
    {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura)
    {
        this.abreviatura = abreviatura;
    }

	public String getINDC_CONVENIO() {
		return INDC_CONVENIO;
	}

	public void setINDC_CONVENIO(String iNDC_CONVENIO) {
		INDC_CONVENIO = iNDC_CONVENIO;
	}
}
