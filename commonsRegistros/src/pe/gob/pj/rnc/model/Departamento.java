// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   Departamento.java

package pe.gob.pj.rnc.model;


public class Departamento
{

    private String CODG_LUGAR;
    private String DESC_LUGAR;
    private String INDC_VISUA;
    private String INDC_LOCAL;
    private String CODG_DISTRITO_JUDICIAL;
    private String c_ubigeo;
    private String INDC_ALL;
    private String eq_cod_pais;
    private Integer cod_entidad_externa;
    private String C_CONVENIOS;

    public Departamento()
    {
    }

    public String getCODG_LUGAR()
    {
        return CODG_LUGAR;
    }

    public void setCODG_LUGAR(String CODG_LUGAR)
    {
        this.CODG_LUGAR = CODG_LUGAR;
    }

    public String getDESC_LUGAR()
    {
        return DESC_LUGAR;
    }

    public void setDESC_LUGAR(String DESC_LUGAR)
    {
        this.DESC_LUGAR = DESC_LUGAR;
    }

    public String getINDC_VISUA()
    {
        return INDC_VISUA;
    }

    public void setINDC_VISUA(String INDC_VISUA)
    {
        this.INDC_VISUA = INDC_VISUA;
    }

    public String getINDC_LOCAL()
    {
        return INDC_LOCAL;
    }

    public void setINDC_LOCAL(String INDC_LOCAL)
    {
        this.INDC_LOCAL = INDC_LOCAL;
    }

    public String getCODG_DISTRITO_JUDICIAL()
    {
        return CODG_DISTRITO_JUDICIAL;
    }

    public void setCODG_DISTRITO_JUDICIAL(String CODG_DISTRITO_JUDICIAL)
    {
        this.CODG_DISTRITO_JUDICIAL = CODG_DISTRITO_JUDICIAL;
    }

    public String getC_ubigeo()
    {
        return c_ubigeo;
    }

    public void setC_ubigeo(String c_ubigeo)
    {
        this.c_ubigeo = c_ubigeo;
    }

    public String getINDC_ALL()
    {
        return INDC_ALL;
    }

    public void setINDC_ALL(String INDC_ALL)
    {
        this.INDC_ALL = INDC_ALL;
    }

	public Integer getCod_entidad_externa() {
		return cod_entidad_externa;
	}

	public void setCod_entidad_externa(Integer cod_entidad_externa) {
		this.cod_entidad_externa = cod_entidad_externa;
	}

	public String getEq_cod_pais() {
		return eq_cod_pais;
	}

	public void setEq_cod_pais(String eq_cod_pais) {
		this.eq_cod_pais = eq_cod_pais;
	}

	public String getC_CONVENIOS() {
		return C_CONVENIOS;
	}

	public void setC_CONVENIOS(String c_CONVENIOS) {
		C_CONVENIOS = c_CONVENIOS;
	}
}
