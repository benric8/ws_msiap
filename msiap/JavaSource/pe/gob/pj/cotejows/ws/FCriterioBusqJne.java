
package pe.gob.pj.cotejows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ps_paterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_materno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_nom1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_nom2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_nom3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_aud_dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_aud_pc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_aud_ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_aud_cod_usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ps_aud_mcaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pi_aud_cod_entidad" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "psPaterno",
    "psMaterno",
    "psNom1",
    "psNom2",
    "psNom3",
    "psAudDni",
    "psAudPc",
    "psAudIp",
    "psAudCodUsuario",
    "psAudMcaddr",
    "piAudCodEntidad"
})
@XmlRootElement(name = "f_criterio_busq_jne")
public class FCriterioBusqJne {

    @XmlElement(name = "ps_paterno")
    protected String psPaterno;
    @XmlElement(name = "ps_materno")
    protected String psMaterno;
    @XmlElement(name = "ps_nom1")
    protected String psNom1;
    @XmlElement(name = "ps_nom2")
    protected String psNom2;
    @XmlElement(name = "ps_nom3")
    protected String psNom3;
    @XmlElement(name = "ps_aud_dni")
    protected String psAudDni;
    @XmlElement(name = "ps_aud_pc")
    protected String psAudPc;
    @XmlElement(name = "ps_aud_ip")
    protected String psAudIp;
    @XmlElement(name = "ps_aud_cod_usuario")
    protected String psAudCodUsuario;
    @XmlElement(name = "ps_aud_mcaddr")
    protected String psAudMcaddr;
    @XmlElement(name = "pi_aud_cod_entidad")
    protected short piAudCodEntidad;

    /**
     * Obtiene el valor de la propiedad psPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsPaterno() {
        return psPaterno;
    }

    /**
     * Define el valor de la propiedad psPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsPaterno(String value) {
        this.psPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad psMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsMaterno() {
        return psMaterno;
    }

    /**
     * Define el valor de la propiedad psMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsMaterno(String value) {
        this.psMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad psNom1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsNom1() {
        return psNom1;
    }

    /**
     * Define el valor de la propiedad psNom1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsNom1(String value) {
        this.psNom1 = value;
    }

    /**
     * Obtiene el valor de la propiedad psNom2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsNom2() {
        return psNom2;
    }

    /**
     * Define el valor de la propiedad psNom2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsNom2(String value) {
        this.psNom2 = value;
    }

    /**
     * Obtiene el valor de la propiedad psNom3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsNom3() {
        return psNom3;
    }

    /**
     * Define el valor de la propiedad psNom3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsNom3(String value) {
        this.psNom3 = value;
    }

    /**
     * Obtiene el valor de la propiedad psAudDni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsAudDni() {
        return psAudDni;
    }

    /**
     * Define el valor de la propiedad psAudDni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsAudDni(String value) {
        this.psAudDni = value;
    }

    /**
     * Obtiene el valor de la propiedad psAudPc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsAudPc() {
        return psAudPc;
    }

    /**
     * Define el valor de la propiedad psAudPc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsAudPc(String value) {
        this.psAudPc = value;
    }

    /**
     * Obtiene el valor de la propiedad psAudIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsAudIp() {
        return psAudIp;
    }

    /**
     * Define el valor de la propiedad psAudIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsAudIp(String value) {
        this.psAudIp = value;
    }

    /**
     * Obtiene el valor de la propiedad psAudCodUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsAudCodUsuario() {
        return psAudCodUsuario;
    }

    /**
     * Define el valor de la propiedad psAudCodUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsAudCodUsuario(String value) {
        this.psAudCodUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad psAudMcaddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsAudMcaddr() {
        return psAudMcaddr;
    }

    /**
     * Define el valor de la propiedad psAudMcaddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsAudMcaddr(String value) {
        this.psAudMcaddr = value;
    }

    /**
     * Obtiene el valor de la propiedad piAudCodEntidad.
     * 
     */
    public short getPiAudCodEntidad() {
        return piAudCodEntidad;
    }

    /**
     * Define el valor de la propiedad piAudCodEntidad.
     * 
     */
    public void setPiAudCodEntidad(short value) {
        this.piAudCodEntidad = value;
    }

}
