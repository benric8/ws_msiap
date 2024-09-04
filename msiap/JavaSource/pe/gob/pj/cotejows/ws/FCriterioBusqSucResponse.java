
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
 *         &lt;element name="f_criterio_busq_sucResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fCriterioBusqSucResult"
})
@XmlRootElement(name = "f_criterio_busq_sucResponse")
public class FCriterioBusqSucResponse {

    @XmlElement(name = "f_criterio_busq_sucResult")
    protected String fCriterioBusqSucResult;

    /**
     * Gets the value of the fCriterioBusqSucResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCriterioBusqSucResult() {
        return fCriterioBusqSucResult;
    }

    /**
     * Sets the value of the fCriterioBusqSucResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCriterioBusqSucResult(String value) {
        this.fCriterioBusqSucResult = value;
    }

}
