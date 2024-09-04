
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
 *         &lt;element name="trama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "trama"
})
@XmlRootElement(name = "f_criterio_busq_minedu")
public class FCriterioBusqMinedu {

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
    protected String trama;

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
     * Obtiene el valor de la propiedad trama.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrama() {
        return trama;
    }

    /**
     * Define el valor de la propiedad trama.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrama(String value) {
        this.trama = value;
    }

	public String getPsAudDni() {
		return psAudDni;
	}

	public void setPsAudDni(String psAudDni) {
		this.psAudDni = psAudDni;
	}

}
