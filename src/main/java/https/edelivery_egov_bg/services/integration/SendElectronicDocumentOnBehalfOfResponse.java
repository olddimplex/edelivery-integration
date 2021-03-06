
package https.edelivery_egov_bg.services.integration;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SendElectronicDocumentOnBehalfOfResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sendElectronicDocumentOnBehalfOfResult"
})
@XmlRootElement(name = "SendElectronicDocumentOnBehalfOfResponse")
public class SendElectronicDocumentOnBehalfOfResponse {

    @XmlElement(name = "SendElectronicDocumentOnBehalfOfResult")
    protected Integer sendElectronicDocumentOnBehalfOfResult;

    /**
     * Gets the value of the sendElectronicDocumentOnBehalfOfResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendElectronicDocumentOnBehalfOfResult() {
        return sendElectronicDocumentOnBehalfOfResult;
    }

    /**
     * Sets the value of the sendElectronicDocumentOnBehalfOfResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendElectronicDocumentOnBehalfOfResult(Integer value) {
        this.sendElectronicDocumentOnBehalfOfResult = value;
    }

}
