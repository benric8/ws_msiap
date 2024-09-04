// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   Solicitud.java

package pe.gob.pj.rnc.model;

import java.util.Date;

public class Solicitud
{
	private String motivo;
	private String CODG_CERTI;
    private String NUME_CERTI;
    private String APLL_PATER_SOLIC;
    private String APLL_MATER_SOLIC;
    private String NOM1_SOLIC;
    private String NOM2_SOLIC;
    private String NOM3_SOLIC;
    private String NOM4_SOLIC;
    private String NOM5_SOLIC;
    private String TIPO_SOLIC;
    private String MOTI_SOLIC;
    private String DOCU_IDENT_SOLIC;
    private String NUME_IDENT_SOLIC;
    private String NUME_JUZGA;
    private String CODG_JUZGAD;
    private String CODG_LUGAR;
    private String NOMB_JUZGA_SOLIC;
    private String NUME_EXPED_SOLIC;
    private Date FECH_NACIM_SOLIC;
    private String CODG_USUAR;
    private Integer N_VECES;
    private String MARCA;
    private String DESC_JUZGA_SOLIC;
    private Date FECH_DIGIT_SOLIC;
    private String INDC_PROCE_SOLIC;
    private String V_DES_OFICIOx;
    private String V_DES_DISTRITOx;
    private String DESC_TASA;
    private String CODG_USU_FOTO;
    private Date FECH_FOTO;
    private String RUTA_FOTO;
    private String CODG_ESTADO_FOTO;
    private String CODG_TIPO_ORIGEN;
    private String OBSERVACION;
    private String CODG_ESTADO_SOLICITUD;
    private String CODG_USU_REGISTRO;
    private Date FECH_REGISTRO;
    private String CODG_USU_ULT_MODI;
    private Date FECH_ULT_MODI;
    private String DESC_FEC_USU_MODI;
    private String NOM_PADRE;
    private String NOM_MADRE;
    private String NOM_APODERADO;
    private String INDC_PROVINCIA;
    private String INDC_ANULADO;
    private String CODG_USU_ANULACION;
    private Date FECH_ANULACION;
    private String DESC_ANULACION;
    private String NUMR_HOJA;
    private String V_DES_OFICIO;
    private String V_DES_DISTRITO;
    private String NOMB_JUZGA_SOLIC1;
    private Integer NUMR_IMPRESION;
    private String CODG_USU_IMPRESION;
    private Integer ANIO_HOJA;
    private Date FECH_IMPRESION;
    private String NUMR_FORM_ANTERIOR;
    private Date FECH_ENTREGA;
    private String CODG_DISTRITO_JUDICIAL;
    private String INDC_URGENTE;
    private String CODG_USU_FIRMA;
    private String X_CODG_LUGAR_NAC;
    private String SERIE_HOJA;
    private Date f_aud;
    private String ____b_aud;
    private String c_aud_uid;
    private String c_aud_pc;
    private String n_aud_ip;
    private String c_aud_mcaddr;
    private String c_aud_lgnred;
    private String VENTANILLA;
    private String L_INDC_OFICIO;
    private String L_FEC_NAC;
    private Integer l_nro_modifica;
    private String pk_alternativo;
    private String NUMR_HOJA_FIN;
    private String l_autoriza;
    private String l_usuar_aut;
    private Date fech_aut;
    private String DESC_ESTADO_IMPRESION;
    private String DESC_ESTADO_SOLICITUD;
    private String NOMBRECOMPLETO;

    private String DES_DELITO;
    private boolean flag_naci;

    private String INDC_MAGISTRADO;
    private String FLAG_MANT= "NEW";
    private String rptaValidacion;

    private DistritoJudicial distritoJudicial;
    private Departamento  departamento;
    
    private Integer idTipoDocumentoAutorizacion;
    private String documentoAutorizacionValidado="0";
    
    private Integer anio;
    private Integer mes;
    private Integer dia;
    
    private String flagNacidoExterior;
    private String lugarNacimiento;

    public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Solicitud()
    {
    }

    public String getCODG_CERTI()
    {
        return CODG_CERTI;
    }

    public void setCODG_CERTI(String CODG_CERTI)
    {
        this.CODG_CERTI = CODG_CERTI;
    }

    public String getNUME_CERTI()
    {
        return NUME_CERTI;
    }

    public void setNUME_CERTI(String NUME_CERTI)
    {
        this.NUME_CERTI = NUME_CERTI;
    }

    public String getAPLL_PATER_SOLIC()
    {
        return APLL_PATER_SOLIC;
    }

    public void setAPLL_PATER_SOLIC(String APLL_PATER_SOLIC)
    {
     	if(APLL_PATER_SOLIC!=null)
    		if(APLL_PATER_SOLIC.trim().equals(""))
    			APLL_PATER_SOLIC=null;

        this.APLL_PATER_SOLIC = APLL_PATER_SOLIC;
    }

    public String getAPLL_MATER_SOLIC()
    {
        return APLL_MATER_SOLIC;
    }

    public void setAPLL_MATER_SOLIC(String APLL_MATER_SOLIC)
    {
    	if(APLL_MATER_SOLIC!=null)
    		if(APLL_MATER_SOLIC.trim().equals(""))
    			APLL_MATER_SOLIC=null;

        this.APLL_MATER_SOLIC = APLL_MATER_SOLIC;
    }

    public String getNOM1_SOLIC()
    {
        return NOM1_SOLIC;
    }

    public void setNOM1_SOLIC(String NOM1_SOLIC)
    {
        this.NOM1_SOLIC = NOM1_SOLIC;
    }

    public String getNOM2_SOLIC()
    {
        return NOM2_SOLIC;
    }

    public void setNOM2_SOLIC(String NOM2_SOLIC)
    {
    	if(NOM2_SOLIC!=null)
    		if(NOM2_SOLIC.trim().equals(""))
    			NOM2_SOLIC=null;

        this.NOM2_SOLIC = NOM2_SOLIC;
    }

    public String getNOM3_SOLIC()
    {
    	if(NOM3_SOLIC!=null)
    		if(NOM3_SOLIC.trim().equals(""))
    			NOM3_SOLIC=null;

        return NOM3_SOLIC;
    }

    public void setNOM3_SOLIC(String NOM3_SOLIC)
    {
        this.NOM3_SOLIC = NOM3_SOLIC;
    }

    public String getNOM4_SOLIC()
    {
        return NOM4_SOLIC;
    }

    public void setNOM4_SOLIC(String NOM4_SOLIC)
    {
        this.NOM4_SOLIC = NOM4_SOLIC;
    }

    public String getNOM5_SOLIC()
    {
        return NOM5_SOLIC;
    }

    public void setNOM5_SOLIC(String NOM5_SOLIC)
    {
        this.NOM5_SOLIC = NOM5_SOLIC;
    }

    public String getTIPO_SOLIC()
    {
        return TIPO_SOLIC;
    }

    public void setTIPO_SOLIC(String TIPO_SOLIC)
    {
        this.TIPO_SOLIC = TIPO_SOLIC;
    }

    public String getMOTI_SOLIC()
    {
        return MOTI_SOLIC;
    }

    public void setMOTI_SOLIC(String MOTI_SOLIC)
    {
        this.MOTI_SOLIC = MOTI_SOLIC;
    }

    public String getDOCU_IDENT_SOLIC()
    {
        return DOCU_IDENT_SOLIC;
    }

    public void setDOCU_IDENT_SOLIC(String DOCU_IDENT_SOLIC)
    {
        this.DOCU_IDENT_SOLIC = DOCU_IDENT_SOLIC;
    }

    public String getNUME_IDENT_SOLIC()
    {
        if(NUME_IDENT_SOLIC!=null)
        	NUME_IDENT_SOLIC=NUME_IDENT_SOLIC.trim();

    	return NUME_IDENT_SOLIC;
    }

    public void setNUME_IDENT_SOLIC(String NUME_IDENT_SOLIC)
    {
        this.NUME_IDENT_SOLIC = NUME_IDENT_SOLIC;
    }

    public String getNUME_JUZGA()
    {
        return NUME_JUZGA;
    }

    public void setNUME_JUZGA(String NUME_JUZGA)
    {
        this.NUME_JUZGA = NUME_JUZGA;
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

    public String getCODG_LUGAR()
    {
        return CODG_LUGAR;
    }

    public void setCODG_LUGAR(String CODG_LUGAR)
    {
        this.CODG_LUGAR = CODG_LUGAR;
    }

    public String getNOMB_JUZGA_SOLIC()
    {
        return NOMB_JUZGA_SOLIC;
    }

    public void setNOMB_JUZGA_SOLIC(String NOMB_JUZGA_SOLIC)
    {
        this.NOMB_JUZGA_SOLIC = NOMB_JUZGA_SOLIC;
    }

    public String getNUME_EXPED_SOLIC()
    {
        return NUME_EXPED_SOLIC;
    }

    public void setNUME_EXPED_SOLIC(String NUME_EXPED_SOLIC)
    {
        this.NUME_EXPED_SOLIC = NUME_EXPED_SOLIC;
    }

    public Date getFECH_NACIM_SOLIC()
    {
        return FECH_NACIM_SOLIC;
    }

    public void setFECH_NACIM_SOLIC(Date FECH_NACIM_SOLIC)
    {
        this.FECH_NACIM_SOLIC = FECH_NACIM_SOLIC;
    }

    public String getCODG_USUAR()
    {
        return CODG_USUAR;
    }

    public void setCODG_USUAR(String CODG_USUAR)
    {
        this.CODG_USUAR = CODG_USUAR;
    }

    public Integer getN_VECES()
    {
        return N_VECES;
    }

    public void setN_VECES(Integer N_VECES)
    {
        this.N_VECES = N_VECES;
    }

    public String getMARCA()
    {
        return MARCA;
    }

    public void setMARCA(String MARCA)
    {
        this.MARCA = MARCA;
    }

    public String getDESC_JUZGA_SOLIC()
    {
        return DESC_JUZGA_SOLIC;
    }

    public void setDESC_JUZGA_SOLIC(String DESC_JUZGA_SOLIC)
    {
        this.DESC_JUZGA_SOLIC = DESC_JUZGA_SOLIC;
    }

    public Date getFECH_DIGIT_SOLIC()
    {
        return FECH_DIGIT_SOLIC;
    }

    public void setFECH_DIGIT_SOLIC(Date FECH_DIGIT_SOLIC)
    {
        this.FECH_DIGIT_SOLIC = FECH_DIGIT_SOLIC;
    }

    public String getINDC_PROCE_SOLIC()
    {
        return INDC_PROCE_SOLIC;
    }

    public void setINDC_PROCE_SOLIC(String INDC_PROCE_SOLIC)
    {
        this.INDC_PROCE_SOLIC = INDC_PROCE_SOLIC;
    }

    public String getV_DES_OFICIOx()
    {
        return V_DES_OFICIOx;
    }

    public void setV_DES_OFICIOx(String V_DES_OFICIOx)
    {
        this.V_DES_OFICIOx = V_DES_OFICIOx;
    }

    public String getV_DES_DISTRITOx()
    {
        return V_DES_DISTRITOx;
    }

    public void setV_DES_DISTRITOx(String V_DES_DISTRITOx)
    {
        this.V_DES_DISTRITOx = V_DES_DISTRITOx;
    }

    public String getDESC_TASA()
    {
        return DESC_TASA;
    }

    public void setDESC_TASA(String DESC_TASA)
    {
        this.DESC_TASA = DESC_TASA;
    }

    public String getCODG_USU_FOTO()
    {
        return CODG_USU_FOTO;
    }

    public void setCODG_USU_FOTO(String CODG_USU_FOTO)
    {
        this.CODG_USU_FOTO = CODG_USU_FOTO;
    }

    public Date getFECH_FOTO()
    {
        return FECH_FOTO;
    }

    public void setFECH_FOTO(Date FECH_FOTO)
    {
        this.FECH_FOTO = FECH_FOTO;
    }

    public String getRUTA_FOTO()
    {
        return RUTA_FOTO;
    }

    public void setRUTA_FOTO(String RUTA_FOTO)
    {
        this.RUTA_FOTO = RUTA_FOTO;
    }

    public String getCODG_ESTADO_FOTO()
    {
        return CODG_ESTADO_FOTO;
    }

    public void setCODG_ESTADO_FOTO(String CODG_ESTADO_FOTO)
    {
        this.CODG_ESTADO_FOTO = CODG_ESTADO_FOTO;
    }

    public String getCODG_TIPO_ORIGEN()
    {
        return CODG_TIPO_ORIGEN;
    }

    public void setCODG_TIPO_ORIGEN(String CODG_TIPO_ORIGEN)
    {
        this.CODG_TIPO_ORIGEN = CODG_TIPO_ORIGEN;
    }

    public String getOBSERVACION()
    {
        return OBSERVACION;
    }

    public void setOBSERVACION(String OBSERVACION)
    {
        this.OBSERVACION = OBSERVACION;
    }

    public String getCODG_ESTADO_SOLICITUD()
    {
        return CODG_ESTADO_SOLICITUD;
    }

    public void setCODG_ESTADO_SOLICITUD(String CODG_ESTADO_SOLICITUD)
    {
        this.CODG_ESTADO_SOLICITUD = CODG_ESTADO_SOLICITUD;
    }

    public String getCODG_USU_REGISTRO()
    {
        return CODG_USU_REGISTRO;
    }

    public void setCODG_USU_REGISTRO(String CODG_USU_REGISTRO)
    {
        this.CODG_USU_REGISTRO = CODG_USU_REGISTRO;
    }

    public Date getFECH_REGISTRO()
    {
        return FECH_REGISTRO;
    }

    public void setFECH_REGISTRO(Date FECH_REGISTRO)
    {
        this.FECH_REGISTRO = FECH_REGISTRO;
    }

    public String getCODG_USU_ULT_MODI()
    {
        return CODG_USU_ULT_MODI;
    }

    public void setCODG_USU_ULT_MODI(String CODG_USU_ULT_MODI)
    {
        this.CODG_USU_ULT_MODI = CODG_USU_ULT_MODI;
    }

    public Date getFECH_ULT_MODI()
    {
        return FECH_ULT_MODI;
    }

    public void setFECH_ULT_MODI(Date FECH_ULT_MODI)
    {
        this.FECH_ULT_MODI = FECH_ULT_MODI;
    }

    public String getDESC_FEC_USU_MODI()
    {
        return DESC_FEC_USU_MODI;
    }

    public void setDESC_FEC_USU_MODI(String DESC_FEC_USU_MODI)
    {
        this.DESC_FEC_USU_MODI = DESC_FEC_USU_MODI;
    }

    public String getNOM_PADRE()
    {
        return NOM_PADRE;
    }

    public void setNOM_PADRE(String NOM_PADRE)
    {
        this.NOM_PADRE = NOM_PADRE;
    }

    public String getNOM_MADRE()
    {
        return NOM_MADRE;
    }

    public void setNOM_MADRE(String NOM_MADRE)
    {
        this.NOM_MADRE = NOM_MADRE;
    }

    public String getNOM_APODERADO()
    {
        return NOM_APODERADO;
    }

    public void setNOM_APODERADO(String NOM_APODERADO)
    {
        this.NOM_APODERADO = NOM_APODERADO;
    }

    public String getINDC_PROVINCIA()
    {
        return INDC_PROVINCIA;
    }

    public void setINDC_PROVINCIA(String INDC_PROVINCIA)
    {
        this.INDC_PROVINCIA = INDC_PROVINCIA;
    }

    public String getINDC_ANULADO()
    {
        return INDC_ANULADO;
    }

    public void setINDC_ANULADO(String INDC_ANULADO)
    {
        this.INDC_ANULADO = INDC_ANULADO;
    }

    public String getCODG_USU_ANULACION()
    {
        return CODG_USU_ANULACION;
    }

    public void setCODG_USU_ANULACION(String CODG_USU_ANULACION)
    {
        this.CODG_USU_ANULACION = CODG_USU_ANULACION;
    }

    public Date getFECH_ANULACION()
    {
        return FECH_ANULACION;
    }

    public void setFECH_ANULACION(Date FECH_ANULACION)
    {
        this.FECH_ANULACION = FECH_ANULACION;
    }

    public String getDESC_ANULACION()
    {
        return DESC_ANULACION;
    }

    public void setDESC_ANULACION(String DESC_ANULACION)
    {
        this.DESC_ANULACION = DESC_ANULACION;
    }

    public String getNUMR_HOJA()
    {
        return NUMR_HOJA;
    }

    public void setNUMR_HOJA(String NUMR_HOJA)
    {
        this.NUMR_HOJA = NUMR_HOJA;
    }

    public String getV_DES_OFICIO()
    {
        return V_DES_OFICIO;
    }

    public void setV_DES_OFICIO(String V_DES_OFICIO)
    {
        this.V_DES_OFICIO = V_DES_OFICIO;
    }

    public String getV_DES_DISTRITO()
    {
        return V_DES_DISTRITO;
    }

    public void setV_DES_DISTRITO(String V_DES_DISTRITO)
    {
        this.V_DES_DISTRITO = V_DES_DISTRITO;
    }

    public String getNOMB_JUZGA_SOLIC1()
    {
        return NOMB_JUZGA_SOLIC1;
    }

    public void setNOMB_JUZGA_SOLIC1(String NOMB_JUZGA_SOLIC1)
    {
        this.NOMB_JUZGA_SOLIC1 = NOMB_JUZGA_SOLIC1;
    }

    public Integer getNUMR_IMPRESION()
    {
        return NUMR_IMPRESION;
    }

    public void setNUMR_IMPRESION(Integer NUMR_IMPRESION)
    {
        this.NUMR_IMPRESION = NUMR_IMPRESION;
    }

    public String getCODG_USU_IMPRESION()
    {
        return CODG_USU_IMPRESION;
    }

    public void setCODG_USU_IMPRESION(String CODG_USU_IMPRESION)
    {
        this.CODG_USU_IMPRESION = CODG_USU_IMPRESION;
    }

    public Integer getANIO_HOJA()
    {
        return ANIO_HOJA;
    }

    public void setANIO_HOJA(Integer ANIO_HOJA)
    {
        this.ANIO_HOJA = ANIO_HOJA;
    }

    public Date getFECH_IMPRESION()
    {
        return FECH_IMPRESION;
    }

    public void setFECH_IMPRESION(Date FECH_IMPRESION)
    {
        this.FECH_IMPRESION = FECH_IMPRESION;
    }

    public String getNUMR_FORM_ANTERIOR()
    {
        return NUMR_FORM_ANTERIOR;
    }

    public void setNUMR_FORM_ANTERIOR(String NUMR_FORM_ANTERIOR)
    {
        this.NUMR_FORM_ANTERIOR = NUMR_FORM_ANTERIOR;
    }

    public Date getFECH_ENTREGA()
    {
        return FECH_ENTREGA;
    }

    public void setFECH_ENTREGA(Date FECH_ENTREGA)
    {
        this.FECH_ENTREGA = FECH_ENTREGA;
    }

    public String getCODG_DISTRITO_JUDICIAL()
    {
        return CODG_DISTRITO_JUDICIAL;
    }

    public void setCODG_DISTRITO_JUDICIAL(String CODG_DISTRITO_JUDICIAL)
    {
        this.CODG_DISTRITO_JUDICIAL = CODG_DISTRITO_JUDICIAL;
    }

    public String getINDC_URGENTE()
    {
        return INDC_URGENTE;
    }

    public void setINDC_URGENTE(String INDC_URGENTE)
    {
        this.INDC_URGENTE = INDC_URGENTE;
    }

    public String getCODG_USU_FIRMA()
    {
        return CODG_USU_FIRMA;
    }

    public void setCODG_USU_FIRMA(String CODG_USU_FIRMA)
    {
        this.CODG_USU_FIRMA = CODG_USU_FIRMA;
    }

    public String getX_CODG_LUGAR_NAC()
    {
        return X_CODG_LUGAR_NAC;
    }

    public void setX_CODG_LUGAR_NAC(String X_CODG_LUGAR_NAC)
    {
        this.X_CODG_LUGAR_NAC = X_CODG_LUGAR_NAC;
    }

    public String getSERIE_HOJA()
    {
        return SERIE_HOJA;
    }

    public void setSERIE_HOJA(String SERIE_HOJA)
    {
        this.SERIE_HOJA = SERIE_HOJA;
    }

    public Date getF_aud()
    {
        return f_aud;
    }

    public void setF_aud(Date f_aud)
    {
        this.f_aud = f_aud;
    }

    public String get____b_aud()
    {
        return ____b_aud;
    }

    public void set____b_aud(String ____b_aud)
    {
        this.____b_aud = ____b_aud;
    }

    public String getC_aud_uid()
    {
        return c_aud_uid;
    }

    public void setC_aud_uid(String c_aud_uid)
    {
        this.c_aud_uid = c_aud_uid;
    }

    public String getC_aud_pc()
    {
        return c_aud_pc;
    }

    public void setC_aud_pc(String c_aud_pc)
    {
        this.c_aud_pc = c_aud_pc;
    }

    public String getN_aud_ip()
    {
        return n_aud_ip;
    }

    public void setN_aud_ip(String n_aud_ip)
    {
        this.n_aud_ip = n_aud_ip;
    }

    public String getC_aud_mcaddr()
    {
        return c_aud_mcaddr;
    }

    public void setC_aud_mcaddr(String c_aud_mcaddr)
    {
        this.c_aud_mcaddr = c_aud_mcaddr;
    }

    public String getC_aud_lgnred()
    {
        return c_aud_lgnred;
    }

    public void setC_aud_lgnred(String c_aud_lgnred)
    {
        this.c_aud_lgnred = c_aud_lgnred;
    }

    public String getVENTANILLA()
    {
        return VENTANILLA;
    }

    public void setVENTANILLA(String VENTANILLA)
    {
        this.VENTANILLA = VENTANILLA;
    }

    public String getL_INDC_OFICIO()
    {
        return L_INDC_OFICIO;
    }

    public void setL_INDC_OFICIO(String L_INDC_OFICIO)
    {
        this.L_INDC_OFICIO = L_INDC_OFICIO;
    }

    public String getL_FEC_NAC()
    {
        return L_FEC_NAC;
    }

    public void setL_FEC_NAC(String L_FEC_NAC)
    {
        this.L_FEC_NAC = L_FEC_NAC;
    }

    public Integer getL_nro_modifica()
    {
        return l_nro_modifica;
    }

    public void setL_nro_modifica(Integer l_nro_modifica)
    {
        this.l_nro_modifica = l_nro_modifica;
    }

    public String getPk_alternativo()
    {
        return pk_alternativo;
    }

    public void setPk_alternativo(String pk_alternativo)
    {
        this.pk_alternativo = pk_alternativo;
    }

    public String getNUMR_HOJA_FIN()
    {
        return NUMR_HOJA_FIN;
    }

    public void setNUMR_HOJA_FIN(String NUMR_HOJA_FIN)
    {
        this.NUMR_HOJA_FIN = NUMR_HOJA_FIN;
    }

    public String getL_autoriza()
    {
        return l_autoriza;
    }

    public void setL_autoriza(String l_autoriza)
    {
        this.l_autoriza = l_autoriza;
    }

    public String getL_usuar_aut()
    {
        return l_usuar_aut;
    }

    public void setL_usuar_aut(String l_usuar_aut)
    {
        this.l_usuar_aut = l_usuar_aut;
    }

    public Date getFech_aut()
    {
        return fech_aut;
    }

    public void setFech_aut(Date fech_aut)
    {
        this.fech_aut = fech_aut;
    }

    public String getDESC_ESTADO_IMPRESION()
    {
        return DESC_ESTADO_IMPRESION;
    }

    public void setDESC_ESTADO_IMPRESION(String DESC_ESTADO_IMPRESION)
    {
        this.DESC_ESTADO_IMPRESION = DESC_ESTADO_IMPRESION;
    }

	public String getRptaValidacion() {
		return rptaValidacion;
	}

	public void setRptaValidacion(String rptaValidacion) {
		this.rptaValidacion = rptaValidacion;
	}

	public String getFLAG_MANT() {
		return FLAG_MANT;
	}

	public void setFLAG_MANT(String flag_mant) {
		FLAG_MANT = flag_mant;
	}

	public String getNOMBRECOMPLETO() {
		if(NOMBRECOMPLETO==null){
			NOMBRECOMPLETO=(APLL_PATER_SOLIC==null?"":APLL_PATER_SOLIC)+" "+
			(APLL_MATER_SOLIC==null?"":APLL_MATER_SOLIC)+ ", "+
			(NOM1_SOLIC==null?"":NOM1_SOLIC)+" "+
			(NOM2_SOLIC==null?"":NOM2_SOLIC)+" "+(NOM3_SOLIC==null?"":NOM3_SOLIC)+" "+
			(NOM4_SOLIC==null?"":NOM4_SOLIC)+" "+(NOM5_SOLIC==null?"":NOM5_SOLIC);
		}
		return NOMBRECOMPLETO;
	}

	public void setNOMBRECOMPLETO(String nombrecompleto) {
		NOMBRECOMPLETO = nombrecompleto;
	}

	public String getDES_DELITO() {
		return DES_DELITO;
	}

	public void setDES_DELITO(String des_delito) {
		DES_DELITO = des_delito;
	}

	public boolean isFlag_naci() {
		if(L_FEC_NAC==null)
			flag_naci=false;
		else if(L_FEC_NAC.equals("S"))
			flag_naci=true;
		else
			flag_naci=false;
		return flag_naci;
	}

	public void setFlag_naci(boolean flag_naci) {
		if(flag_naci)
			L_FEC_NAC="S";
		this.flag_naci = flag_naci;
	}

	public String getINDC_MAGISTRADO() {
		return INDC_MAGISTRADO;
	}

	public void setINDC_MAGISTRADO(String indc_magistrado) {
		INDC_MAGISTRADO = indc_magistrado;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public DistritoJudicial getDistritoJudicial() {
		return distritoJudicial;
	}

	public void setDistritoJudicial(DistritoJudicial distritoJudicial) {
		this.distritoJudicial = distritoJudicial;
	}

	public String getDESC_ESTADO_SOLICITUD() {
		return DESC_ESTADO_SOLICITUD;
	}

	public String getESTADO_SOLICITUD_SIMPLE(){
		if("Registrado".equalsIgnoreCase(DESC_ESTADO_SOLICITUD)){
			if("N".equals(L_INDC_OFICIO) && "N".equals(MARCA))
				return "Descarte Realizado";
			else
				return "Observado";	 
		}
		else
			return DESC_ESTADO_SOLICITUD;
	}

	public void setDESC_ESTADO_SOLICITUD(String dESC_ESTADO_SOLICITUD) {
		DESC_ESTADO_SOLICITUD = dESC_ESTADO_SOLICITUD;
	}

	public Integer getIdTipoDocumentoAutorizacion() {
		return idTipoDocumentoAutorizacion;
	}

	public void setIdTipoDocumentoAutorizacion(Integer idTipoDocumentoAutorizacion) {
		this.idTipoDocumentoAutorizacion = idTipoDocumentoAutorizacion;
	}

	public String getDocumentoAutorizacionValidado() {
		return documentoAutorizacionValidado;
	}

	public void setDocumentoAutorizacionValidado(String documentoAutorizacionValidado) {
		this.documentoAutorizacionValidado = documentoAutorizacionValidado;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getFlagNacidoExterior() {
		return flagNacidoExterior;
	}

	public void setFlagNacidoExterior(String flagNacidoExterior) {
		this.flagNacidoExterior = flagNacidoExterior;
	}

	public boolean isFlagNacidoExterior() {
		return "1".equals(flagNacidoExterior);
	}
	
	public void setFlagNacidoExterior(boolean flagNacidoExterior) {
		this.flagNacidoExterior = flagNacidoExterior?"1":"0";
	}
}
