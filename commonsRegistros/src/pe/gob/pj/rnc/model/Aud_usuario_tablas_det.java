package pe.gob.pj.rnc.model;

public class Aud_usuario_tablas_det {
	Integer cod_registro;// NUMERIC (15, 0)
	Integer correlativo;// NUMERIC (15, 0)
	String campo_modificado;// VARCHAR (30)
	String valor_anterior;// VARCHAR (255)

	public Integer getCod_registro() {
		return cod_registro;
	}

	public void setCod_registro(Integer cod_registro) {
		this.cod_registro = cod_registro;
	}

	public Integer getCorrelativo() {
		return correlativo;
	}

	public void setCorrelativo(Integer correlativo) {
		this.correlativo = correlativo;
	}

	public String getCampo_modificado() {
		return campo_modificado;
	}

	public void setCampo_modificado(String campo_modificado) {
		this.campo_modificado = campo_modificado;
	}

	public String getValor_anterior() {
		return valor_anterior;
	}

	public void setValor_anterior(String valor_anterior) {
		this.valor_anterior = valor_anterior;
	}

}