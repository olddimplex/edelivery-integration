
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
 *         &lt;element name="SendMessageInReplyToResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "sendMessageInReplyToResult"
})
@XmlRootElement(name = "SendMessageInReplyToResponse")
public class SendMessageInReplyToResponse {

    @XmlElement(name = "SendMessageInReplyToResult")
    protected Integer sendMessageInReplyToResult;

    /**
     * Gets the value of the sendMessageInReplyToResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendMessageInReplyToResult() {
        return sendMessageInReplyToResult;
    }

    /**
     * Sets the value of the sendMessageInReplyToResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendMessageInReplyToResult(Integer value) {
        this.sendMessageInReplyToResult = value;
    }

}
