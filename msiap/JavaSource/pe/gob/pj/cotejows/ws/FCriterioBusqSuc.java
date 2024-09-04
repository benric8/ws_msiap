
package pe.gob.pj.cotejows.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlRootElement(name = "f_criterio_busq_suc")
public class FCriterioBusqSuc {

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
     * Gets the value of the psPaterno property.
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
     * Sets the value of the psPaterno property.
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
     * Gets the value of the psMaterno property.
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
     * Sets the value of the psMaterno property.
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
     * Gets the value of the psNom1 property.
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
     * Sets the value of the psNom1 property.
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
     * Gets the value of the psNom2 property.
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
     * Sets the value of the psNom2 property.
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
     * Gets the value of the psNom3 property.
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
     * Sets the value of the psNom3 property.
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
     * Gets the value of the trama property.
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
     * Sets the value of the trama property.
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
