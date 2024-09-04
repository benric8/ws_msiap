// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   SolicitudExterna.java

package pe.gob.pj.rnc.model;

import java.util.Date;

public class SolicitudExterna
{

	private Integer CODG_CERTI_EXTERNO;
    private String CODG_ESTADO;
    private String CODG_USUAR;
    private Integer CODG_ENTIDAD_EXTERNA;
    private String codigo_del_motivo;
    private String V_OFI_RESPUESTA_A;
    private String V_OFI_RESPUESTA_B;
    private Date FECH_REGISTRO;
    private Date FECH_ENVIO;
    private Date FECH_ATENCION;
    private Integer NUM_VISTAS_OFI_RESPUESTA_A;
    private Integer NUM_VISTAS_OFI_RESPUESTA_B;
    private String DESC_REFERENCIA;
    private Integer NUM_REGISTROS_ATENDIDOS;
    private Integer NUM_REGISTROS_POR_ATENDER;
    private String NUM_ANHO;
    private Integer NUM_CORRELATIVO_OFI;
    private String codgSupervisor;
    private String codgFirmaRnc;
    private String DESC_ESTADO;


    public SolicitudExterna()
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

    public String getCODG_ESTADO()
    {
        return CODG_ESTADO;
    }

    public void setCODG_ESTADO(String CODG_ESTADO)
    {
        this.CODG_ESTADO = CODG_ESTADO;
    }

    public String getCODG_USUAR()
    {
        return CODG_USUAR;
    }

    public void setCODG_USUAR(String CODG_USUAR)
    {
        this.CODG_USUAR = CODG_USUAR;
    }

    public Integer getCODG_ENTIDAD_EXTERNA()
    {
        return CODG_ENTIDAD_EXTERNA;
    }

    public void setCODG_ENTIDAD_EXTERNA(Integer CODG_ENTIDAD_EXTERNA)
    {
        this.CODG_ENTIDAD_EXTERNA = CODG_ENTIDAD_EXTERNA;
    }

    public String getCodigo_del_motivo()
    {
        return codigo_del_motivo;
    }

    public void setCodigo_del_motivo(String codigo_del_motivo)
    {
        this.codigo_del_motivo = codigo_del_motivo;
    }

    public String getV_OFI_RESPUESTA_A()
    {
        return V_OFI_RESPUESTA_A;
    }

    public void setV_OFI_RESPUESTA_A(String V_OFI_RESPUESTA_A)
    {
        this.V_OFI_RESPUESTA_A = V_OFI_RESPUESTA_A;
    }

    public String getV_OFI_RESPUESTA_B()
    {
        return V_OFI_RESPUESTA_B;
    }

    public void setV_OFI_RESPUESTA_B(String V_OFI_RESPUESTA_B)
    {
        this.V_OFI_RESPUESTA_B = V_OFI_RESPUESTA_B;
    }

    public Date getFECH_REGISTRO()
    {
        return FECH_REGISTRO;
    }

    public void setFECH_REGISTRO(Date FECH_REGISTRO)
    {
        this.FECH_REGISTRO = FECH_REGISTRO;
    }

    public Date getFECH_ENVIO()
    {
        return FECH_ENVIO;
    }

    public void setFECH_ENVIO(Date FECH_ENVIO)
    {
        this.FECH_ENVIO = FECH_ENVIO;
    }

    public Date getFECH_ATENCION()
    {
        return FECH_ATENCION;
    }

    public void setFECH_ATENCION(Date FECH_ATENCION)
    {
        this.FECH_ATENCION = FECH_ATENCION;
    }

    public Integer getNUM_VISTAS_OFI_RESPUESTA_A()
    {
        return NUM_VISTAS_OFI_RESPUESTA_A;
    }

    public void setNUM_VISTAS_OFI_RESPUESTA_A(Integer NUM_VISTAS_OFI_RESPUESTA_A)
    {
        this.NUM_VISTAS_OFI_RESPUESTA_A = NUM_VISTAS_OFI_RESPUESTA_A;
    }

    public Integer getNUM_VISTAS_OFI_RESPUESTA_B()
    {
        return NUM_VISTAS_OFI_RESPUESTA_B;
    }

    public void setNUM_VISTAS_OFI_RESPUESTA_B(Integer NUM_VISTAS_OFI_RESPUESTA_B)
    {
        this.NUM_VISTAS_OFI_RESPUESTA_B = NUM_VISTAS_OFI_RESPUESTA_B;
    }

    public String getDESC_REFERENCIA()
    {
        return DESC_REFERENCIA;
    }

    public void setDESC_REFERENCIA(String DESC_REFERENCIA)
    {
        this.DESC_REFERENCIA = DESC_REFERENCIA;
    }

    public Integer getNUM_REGISTROS_ATENDIDOS()
    {
        return NUM_REGISTROS_ATENDIDOS;
    }

    public void setNUM_REGISTROS_ATENDIDOS(Integer NUM_REGISTROS_ATENDIDOS)
    {
        this.NUM_REGISTROS_ATENDIDOS = NUM_REGISTROS_ATENDIDOS;
    }

    public Integer getNUM_REGISTROS_POR_ATENDER()
    {
        return NUM_REGISTROS_POR_ATENDER;
    }

    public void setNUM_REGISTROS_POR_ATENDER(Integer NUM_REGISTROS_POR_ATENDER)
    {
        this.NUM_REGISTROS_POR_ATENDER = NUM_REGISTROS_POR_ATENDER;
    }

    public String getNUM_ANHO()
    {
        return NUM_ANHO;
    }

    public void setNUM_ANHO(String NUM_ANHO)
    {
        this.NUM_ANHO = NUM_ANHO;
    }

    public Integer getNUM_CORRELATIVO_OFI()
    {
        return NUM_CORRELATIVO_OFI;
    }

    public void setNUM_CORRELATIVO_OFI(Integer NUM_CORRELATIVO_OFI)
    {
        this.NUM_CORRELATIVO_OFI = NUM_CORRELATIVO_OFI;
    }

    public String getCodgSupervisor() {
		return codgSupervisor;
	}

	public void setCodgSupervisor(String codgSupervisor) {
		this.codgSupervisor = codgSupervisor;
	}

	public String getCodgFirmaRnc() {
		return codgFirmaRnc;
	}

	public void setCodgFirmaRnc(String codgFirmaRnc) {
		this.codgFirmaRnc = codgFirmaRnc;
	}

	public String getDESC_ESTADO() {
		return DESC_ESTADO;
	}

	public void setDESC_ESTADO(String dESC_ESTADO) {
		DESC_ESTADO = dESC_ESTADO;
	}



}
