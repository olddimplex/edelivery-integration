
package org.datacontract.schemas._2004._07.edelivery_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DcSubjectRegistrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcSubjectRegistrationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HasRegistration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identificator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubjectInfo" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}DcRegisteredSubjectInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcSubjectRegistrationInfo", propOrder = {
    "hasRegistration",
    "identificator",
    "subjectInfo"
})
public class DcSubjectRegistrationInfo {

    @XmlElement(name = "HasRegistration")
    protected Boolean hasRegistration;
    @XmlElementRef(name = "Identificator", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificator;
    @XmlElementRef(name = "SubjectInfo", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<DcRegisteredSubjectInfo> subjectInfo;

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
     * Gets the value of the identificator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificator() {
        return identificator;
    }

    /**
     * Sets the value of the identificator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificator(JAXBElement<String> value) {
        this.identificator = value;
    }

    /**
     * Gets the value of the subjectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DcRegisteredSubjectInfo }{@code >}
     *     
     */
    public JAXBElement<DcRegisteredSubjectInfo> getSubjectInfo() {
        return subjectInfo;
    }

    /**
     * Sets the value of the subjectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DcRegisteredSubjectInfo }{@code >}
     *     
     */
    public void setSubjectInfo(JAXBElement<DcRegisteredSubjectInfo> value) {
        this.subjectInfo = value;
    }

}
