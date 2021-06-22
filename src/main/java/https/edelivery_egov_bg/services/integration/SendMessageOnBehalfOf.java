
package https.edelivery_egov_bg.services.integration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.edelivery_common.DcMessageDetails;
import org.datacontract.schemas._2004._07.edelivery_common.EProfileType;


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
 *         &lt;element name="senderType" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums}eProfileType" minOccurs="0"/&gt;
 *         &lt;element name="senderUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiverType" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums}eProfileType" minOccurs="0"/&gt;
 *         &lt;element name="receiverUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "senderType",
    "senderUniqueIdentifier",
    "senderPhone",
    "senderEmail",
    "senderFirstName",
    "senderLastName",
    "receiverType",
    "receiverUniqueIdentifier",
    "serviceOID",
    "operatorEGN"
})
@XmlRootElement(name = "SendMessageOnBehalfOf")
public class SendMessageOnBehalfOf {

    @XmlElementRef(name = "message", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<DcMessageDetails> message;
    @XmlSchemaType(name = "string")
    protected EProfileType senderType;
    @XmlElementRef(name = "senderUniqueIdentifier", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderUniqueIdentifier;
    @XmlElementRef(name = "senderPhone", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderPhone;
    @XmlElementRef(name = "senderEmail", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderEmail;
    @XmlElementRef(name = "senderFirstName", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderFirstName;
    @XmlElementRef(name = "senderLastName", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderLastName;
    @XmlSchemaType(name = "string")
    protected EProfileType receiverType;
    @XmlElementRef(name = "receiverUniqueIdentifier", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverUniqueIdentifier;
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
     * Gets the value of the senderType property.
     * 
     * @return
     *     possible object is
     *     {@link EProfileType }
     *     
     */
    public EProfileType getSenderType() {
        return senderType;
    }

    /**
     * Sets the value of the senderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EProfileType }
     *     
     */
    public void setSenderType(EProfileType value) {
        this.senderType = value;
    }

    /**
     * Gets the value of the senderUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderUniqueIdentifier() {
        return senderUniqueIdentifier;
    }

    /**
     * Sets the value of the senderUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderUniqueIdentifier(JAXBElement<String> value) {
        this.senderUniqueIdentifier = value;
    }

    /**
     * Gets the value of the senderPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderPhone() {
        return senderPhone;
    }

    /**
     * Sets the value of the senderPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderPhone(JAXBElement<String> value) {
        this.senderPhone = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderEmail(JAXBElement<String> value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the senderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderFirstName() {
        return senderFirstName;
    }

    /**
     * Sets the value of the senderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderFirstName(JAXBElement<String> value) {
        this.senderFirstName = value;
    }

    /**
     * Gets the value of the senderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderLastName() {
        return senderLastName;
    }

    /**
     * Sets the value of the senderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderLastName(JAXBElement<String> value) {
        this.senderLastName = value;
    }

    /**
     * Gets the value of the receiverType property.
     * 
     * @return
     *     possible object is
     *     {@link EProfileType }
     *     
     */
    public EProfileType getReceiverType() {
        return receiverType;
    }

    /**
     * Sets the value of the receiverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EProfileType }
     *     
     */
    public void setReceiverType(EProfileType value) {
        this.receiverType = value;
    }

    /**
     * Gets the value of the receiverUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverUniqueIdentifier() {
        return receiverUniqueIdentifier;
    }

    /**
     * Sets the value of the receiverUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverUniqueIdentifier(JAXBElement<String> value) {
        this.receiverUniqueIdentifier = value;
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
