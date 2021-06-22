
package org.datacontract.schemas._2004._07.edelivery_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcLegalPersonRegistrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcLegalPersonRegistrationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HasRegistration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfilesWithAccess" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}ArrayOfDcSubjectShortInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcLegalPersonRegistrationInfo", propOrder = {
    "eik",
    "email",
    "hasRegistration",
    "name",
    "phone",
    "profilesWithAccess"
})
public class DcLegalPersonRegistrationInfo {

    @XmlElementRef(name = "EIK", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eik;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElement(name = "HasRegistration")
    protected Boolean hasRegistration;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Phone", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "ProfilesWithAccess", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDcSubjectShortInfo> profilesWithAccess;

    /**
     * Gets the value of the eik property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEIK() {
        return eik;
    }

    /**
     * Sets the value of the eik property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEIK(JAXBElement<String> value) {
        this.eik = value;
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
     * Gets the value of the hasRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRegistration() {
        return hasRegistration;
    }

    /**
     * Sets the value of the hasRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRegistration(Boolean value) {
        this.hasRegistration = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
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

    /**
     * Gets the value of the profilesWithAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDcSubjectShortInfo> getProfilesWithAccess() {
        return profilesWithAccess;
    }

    /**
     * Sets the value of the profilesWithAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     *     
     */
    public void setProfilesWithAccess(JAXBElement<ArrayOfDcSubjectShortInfo> value) {
        this.profilesWithAccess = value;
    }

}
