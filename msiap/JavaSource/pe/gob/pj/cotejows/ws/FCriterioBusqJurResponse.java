
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
 *         &lt;element name="f_criterio_busq_jurResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fCriterioBusqJurResult"
})
@XmlRootElement(name = "f_criterio_busq_jurResponse")
public class FCriterioBusqJurResponse {

    @XmlElement(name = "f_criterio_busq_jurResult")
    protected String fCriterioBusqJurResult;

    /**
     * Gets the value of the fCriterioBusqJurResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCriterioBusqJurResult() {
        return fCriterioBusqJurResult;
    }

    /**
     * Sets the value of the fCriterioBusqJurResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCriterioBusqJurResult(String value) {
        this.fCriterioBusqJurResult = value;
    }

}
