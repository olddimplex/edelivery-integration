
package org.datacontract.schemas._2004._07.edelivery_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcPersonRegistrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcPersonRegistrationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessibleProfiles" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}ArrayOfDcSubjectShortInfo" minOccurs="0"/&gt;
 *         &lt;element name="HasRegistration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonIdentificator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcPersonRegistrationInfo", propOrder = {
    "accessibleProfiles",
    "hasRegistration",
    "name",
    "personIdentificator"
})
public class DcPersonRegistrationInfo {

    @XmlElementRef(name = "AccessibleProfiles", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDcSubjectShortInfo> accessibleProfiles;
    @XmlElement(name = "HasRegistration")
    protected Boolean hasRegistration;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "PersonIdentificator", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personIdentificator;

    /**
     * Gets the value of the accessibleProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDcSubjectShortInfo> getAccessibleProfiles() {
        return accessibleProfiles;
    }

    /**
     * Sets the value of the accessibleProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     *     
     */
    public void setAccessibleProfiles(JAXBElement<ArrayOfDcSubjectShortInfo> value) {
        this.accessibleProfiles = value;
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
     * Gets the value of the personIdentificator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonIdentificator() {
        return personIdentificator;
    }

    /**
     * Sets the value of the personIdentificator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonIdentificator(JAXBElement<String> value) {
        this.personIdentificator = value;
    }

}
