
package org.datacontract.schemas._2004._07.edelivery_common_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcMessageWithCodeReceiver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcMessageWithCodeReceiver"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EGNorLNCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcMessageWithCodeReceiver", propOrder = {
    "egNorLNCH",
    "email",
    "firstName",
    "lastName",
    "middleName",
    "phone"
})
public class DcMessageWithCodeReceiver {

    @XmlElementRef(name = "EGNorLNCH", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", type = JAXBElement.class, required = false)
    protected JAXBElement<String> egNorLNCH;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "LastName", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "MiddleName", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElementRef(name = "Phone", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;

    /**
     * Gets the value of the egNorLNCH property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEGNorLNCH() {
        return egNorLNCH;
    }

    /**
     * Sets the value of the egNorLNCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEGNorLNCH(JAXBElement<String> value) {
        this.egNorLNCH = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

}
