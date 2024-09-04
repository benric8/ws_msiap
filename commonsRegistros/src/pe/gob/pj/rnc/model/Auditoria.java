/* *
* Copyright 2023 Poder Judicial del Perú 
*/
package pe.gob.pj.rnc.model;

import java.io.Serializable;

 

public class Auditoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    protected String ipPc;
    protected String macAddressPc;
    protected String pcName;
    protected String usuarioSis;
    protected String usuarioRed;
    protected String nombreSo;
    protected String cuo;
    
    
	public Auditoria() {
		super();
	}
	public String getIpPc() {
		return ipPc;
	}
	public void setIpPc(String ipPc) {
		this.ipPc = ipPc;
	}
	public String getMacAddressPc() {
		return macAddressPc;
	}
	public void setMacAddressPc(String macAddressPc) {
		this.macAddressPc = macAddressPc;
	}
	public String getPcName() {
		return pcName;
	}
	public void setPcName(String pcName) {
		this.pcName = pcName;
	}
	public String getUsuarioSis() {
		return usuarioSis;
	}
	public void setUsuarioSis(String usuarioSis) {
		this.usuarioSis = usuarioSis;
	}
	public String getUsuarioRed() {
		return usuarioRed;
	}
	public void setUsuarioRed(String usuarioRed) {
		this.usuarioRed = usuarioRed;
	}
	public String getNombreSo() {
		return nombreSo;
	}
	public void setNombreSo(String nombreSo) {
		this.nombreSo = nombreSo;
	}
	public String getCuo() {
		return cuo;
	}
	public void setCuo(String cuo) {
		this.cuo = cuo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
