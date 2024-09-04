
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
 *         &lt;element name="f_criterio_busq_jneResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fCriterioBusqJneResult"
})
@XmlRootElement(name = "f_criterio_busq_jneResponse")
public class FCriterioBusqJneResponse {

    @XmlElement(name = "f_criterio_busq_jneResult")
    protected String fCriterioBusqJneResult;

    /**
     * Obtiene el valor de la propiedad fCriterioBusqJneResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCriterioBusqJneResult() {
        return fCriterioBusqJneResult;
    }

    /**
     * Define el valor de la propiedad fCriterioBusqJneResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCriterioBusqJneResult(String value) {
        this.fCriterioBusqJneResult = value;
    }

}
