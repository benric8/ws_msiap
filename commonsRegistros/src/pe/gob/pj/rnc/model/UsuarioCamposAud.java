package pe.gob.pj.rnc.model;

public class UsuarioCamposAud {
	private String	CODG_USUAR;
	private String	C_CLAVE;
	private String	NOMB_USUAR;
	private String	APLL_USUAR;
	private String	DESC_TITULO;
	private String	DESC_COREEO;
	private String	CODG_TIPO;
	private String	C_PERFIL;
	private String	CODG_DISTRITO_JUDICIAL;
	private int			CODG_ENTIDAD_EXTERNA;
	private String	CODG_LUGAR;
	private String	NUME_JUZGA;
	private String	CODG_JUZGAD;
	private String	ESTD_USUAR;
	private String	COD_APLICACION;
	private String	DESC_OBSERVACIONES;
	private String	DESC_MOTIVO;
	
	public UsuarioCamposAud() {
		CODG_USUAR = "";
		C_CLAVE = "";
		NOMB_USUAR = "";
		APLL_USUAR = "";
		DESC_TITULO = "";
		DESC_COREEO = "";
		CODG_TIPO = "";
		C_PERFIL = "";
		CODG_DISTRITO_JUDICIAL = "";
		CODG_ENTIDAD_EXTERNA = 0;
		CODG_LUGAR = "";
		NUME_JUZGA = "";
		CODG_JUZGAD = "";
		ESTD_USUAR = "";
		COD_APLICACION = "";
		DESC_OBSERVACIONES = "";
		DESC_MOTIVO="";
	}
	
	@Override
	public String toString() {
		String r = "CODG_USUAR = " + CODG_USUAR + " C_CLAVE = " + C_CLAVE + " NOMB_USUAR = " + NOMB_USUAR
				+ " APLL_USUAR = " + APLL_USUAR + " DESC_TITULO = " + DESC_TITULO + " DESC_COREEO = " + DESC_COREEO
				+ " CODG_TIPO = " + CODG_TIPO + " C_PERFIL = " + C_PERFIL + " CODG_DISTRITO_JUDICIAL = "
				+ CODG_DISTRITO_JUDICIAL + " CODG_ENTIDAD_EXTERNA = " + CODG_ENTIDAD_EXTERNA + " CODG_LUGAR = " + CODG_LUGAR
				+ " NUME_JUZGA = " + NUME_JUZGA + " CODG_JUZGAD = " + CODG_JUZGAD + " ESTD_USUAR = " + ESTD_USUAR
				+ " COD_APLICACION = " + COD_APLICACION + " DESC_OBSERVACIONES = " + DESC_OBSERVACIONES + 
				" DESC_MOTIVO = " + DESC_MOTIVO;
		return r;
	}
	
	public String toString2() {
		String r = "\nCODG_USUAR = " + CODG_USUAR + "\nC_CLAVE = " + C_CLAVE + "\nNOMB_USUAR = " + NOMB_USUAR
				+ "\nAPLL_USUAR = " + APLL_USUAR + "\nDESC_TITULO = " + DESC_TITULO + "\nDESC_COREEO = " + DESC_COREEO
				+ "\nCODG_TIPO = " + CODG_TIPO + "\nC_PERFIL = " + C_PERFIL + "\nCODG_DISTRITO_JUDICIAL = "
				+ CODG_DISTRITO_JUDICIAL + "\nCODG_ENTIDAD_EXTERNA = " + CODG_ENTIDAD_EXTERNA + "\nCODG_LUGAR = " + CODG_LUGAR
				+ "\nNUME_JUZGA = " + NUME_JUZGA + "\nCODG_JUZGAD = " + CODG_JUZGAD + "\nESTD_USUAR = " + ESTD_USUAR
				+ "\nCOD_APLICACION = " + COD_APLICACION + "\nDESC_OBSERVACIONES = " + DESC_OBSERVACIONES + 
				"\nDESC_MOTIVO = " + DESC_MOTIVO;
		return r;
	}
	
	public String getCODG_LUGAR() {
		return CODG_LUGAR;
	}

	public void setCODG_LUGAR(String codg_lugar) {
		CODG_LUGAR = codg_lugar;
	}

	public String getNUME_JUZGA() {
		return NUME_JUZGA;
	}

	public void setNUME_JUZGA(String nume_juzga) {
		NUME_JUZGA = nume_juzga;
	}

	public String getCODG_JUZGAD() {
		return CODG_JUZGAD;
	}

	public void setCODG_JUZGAD(String codg_juzgad) {
		CODG_JUZGAD = codg_juzgad;
	}

	public String getCODG_USUAR() {
		return CODG_USUAR.trim();
	}
	
	public void setCODG_USUAR(String codg_usuar) {
		CODG_USUAR = (codg_usuar.trim() + "").trim();
	}
	
	public String getC_CLAVE() {
		return C_CLAVE.trim();
	}
	
	public void setC_CLAVE(String c_clave) {
		C_CLAVE = (c_clave.trim() + "").trim();
	}
	
	public String getNOMB_USUAR() {
		return NOMB_USUAR.trim();
	}
	
	public void setNOMB_USUAR(String nomb_usuar) {
		NOMB_USUAR = (nomb_usuar.trim() + "").trim();
	}
	
	public String getAPLL_USUAR() {
		return APLL_USUAR.trim();
	}
	
	public void setAPLL_USUAR(String apll_usuar) {
		APLL_USUAR = (apll_usuar.trim() + "").trim();
	}
	
	public String getDESC_TITULO() {
		return DESC_TITULO.trim();
	}
	
	public void setDESC_TITULO(String desc_titulo) {
		DESC_TITULO = (desc_titulo.trim() + "").trim();
	}
	
	public String getDESC_COREEO() {
		return DESC_COREEO.trim();
	}
	
	public void setDESC_COREEO(String desc_coreeo) {
		DESC_COREEO = (desc_coreeo.trim() + "").trim();
	}
	
	public String getCODG_TIPO() {
		return CODG_TIPO.trim();
	}
	
	public void setCODG_TIPO(String codg_tipo) {
		CODG_TIPO = (codg_tipo.trim() + "").trim();
	}
	
	public String getC_PERFIL() {
		return C_PERFIL.trim();
	}
	
	public void setC_PERFIL(String c_perfil) {
		C_PERFIL = (c_perfil.trim() + "").trim();
	}
	
	public String getCODG_DISTRITO_JUDICIAL() {
		return CODG_DISTRITO_JUDICIAL.trim();
	}
	
	public void setCODG_DISTRITO_JUDICIAL(String codg_distrito_judicial) {
		CODG_DISTRITO_JUDICIAL = (codg_distrito_judicial + "").trim();
	}
	
	public int getCODG_ENTIDAD_EXTERNA() {
		return CODG_ENTIDAD_EXTERNA;
	}
	
	public void setCODG_ENTIDAD_EXTERNA(int codg_entidad_externa) {
		CODG_ENTIDAD_EXTERNA = codg_entidad_externa;
	}
	
	public String getESTD_USUAR() {
		return ESTD_USUAR.trim();
	}
	
	public void setESTD_USUAR(String estd_usuar) {
		ESTD_USUAR = (estd_usuar.trim() + "").trim();
	}
	
	public String getCOD_APLICACION() {
		return COD_APLICACION.trim();
	}
	
	public void setCOD_APLICACION(String cod_aplicacion) {
		COD_APLICACION = (cod_aplicacion.trim() + "").trim();
	}
	
	public String getDESC_OBSERVACIONES() {
		return DESC_OBSERVACIONES.trim();
	}
	
	public void setDESC_OBSERVACIONES(String desc_observaciones) {
		DESC_OBSERVACIONES = (desc_observaciones.trim() + "").trim();
	}

	public String getDESC_MOTIVO() {
		return DESC_MOTIVO;
	}

	public void setDESC_MOTIVO(String desc_motivo) {
		DESC_MOTIVO = desc_motivo;
	}
	
}
