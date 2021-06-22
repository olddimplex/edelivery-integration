
package org.datacontract.schemas._2004._07.edelivery_common_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.edelivery_common.ArrayOfDcDocument;


/**
 * <p>Java class for WebLegalPersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebLegalPersonInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject}DcLegalPersonInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateDeleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationDcouments" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}ArrayOfDcDocument" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebLegalPersonInfo", propOrder = {
    "dateDeleted",
    "registrationDcouments"
})
public class WebLegalPersonInfo
    extends DcLegalPersonInfo
{

    @XmlElementRef(name = "DateDeleted", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateDeleted;
    @XmlElementRef(name = "RegistrationDcouments", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDcDocument> registrationDcouments;

    /**
     * Gets the value of the dateDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateDeleted() {
        return dateDeleted;
    }

    /**
     * Sets the value of the dateDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateDeleted(JAXBElement<XMLGregorianCalendar> value) {
        this.dateDeleted = value;
    }

    /**
     * Gets the value of the registrationDcouments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDcDocument> getRegistrationDcouments() {
        return registrationDcouments;
    }

    /**
     * Sets the value of the registrationDcouments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     *     
     */
    public void setRegistrationDcouments(JAXBElement<ArrayOfDcDocument> value) {
        this.registrationDcouments = value;
    }

}
