
package https.edelivery_egov_bg.services.integration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.edelivery_common.DcMessageDetails;


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
 *         &lt;element name="message" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}DcMessageDetails" minOccurs="0"/&gt;
 *         &lt;element name="replyToMessageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="serviceOID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorEGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "message",
    "replyToMessageId",
    "serviceOID",
    "operatorEGN"
})
@XmlRootElement(name = "SendMessageInReplyTo")
public class SendMessageInReplyTo {

    @XmlElementRef(name = "message", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<DcMessageDetails> message;
    protected Integer replyToMessageId;
    @XmlElementRef(name = "serviceOID", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceOID;
    @XmlElementRef(name = "operatorEGN", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatorEGN;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     *     
     */
    public JAXBElement<DcMessageDetails> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     *     
     */
    public void setMessage(JAXBElement<DcMessageDetails> value) {
        this.message = value;
    }

    /**
     * Gets the value of the replyToMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    /**
     * Sets the value of the replyToMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReplyToMessageId(Integer value) {
        this.replyToMessageId = value;
    }

    /**
     * Gets the value of the serviceOID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceOID() {
        return serviceOID;
    }

    /**
     * Sets the value of the serviceOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceOID(JAXBElement<String> value) {
        this.serviceOID = value;
    }

    /**
     * Gets the value of the operatorEGN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorEGN() {
        return operatorEGN;
    }

    /**
     * Sets the value of the operatorEGN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorEGN(JAXBElement<String> value) {
        this.operatorEGN = value;
    }

}
