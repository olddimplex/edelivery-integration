
package org.datacontract.schemas._2004._07.edelivery_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.edelivery_common_datacontracts.DcSubjectPublicInfo;


/**
 * <p>Java class for DcRegisteredSubjectInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcRegisteredSubjectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject}DcSubjectPublicInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstitutionType" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums}eInstitutionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcRegisteredSubjectInfo", propOrder = {
    "institutionType"
})
public class DcRegisteredSubjectInfo
    extends DcSubjectPublicInfo
{

    @XmlElementRef(name = "InstitutionType", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EInstitutionType> institutionType;

    /**
     * Gets the value of the institutionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EInstitutionType }{@code >}
     *     
     */
    public JAXBElement<EInstitutionType> getInstitutionType() {
        return institutionType;
    }

    /**
     * Sets the value of the institutionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EInstitutionType }{@code >}
     *     
     */
    public void setInstitutionType(JAXBElement<EInstitutionType> value) {
        this.institutionType = value;
    }

}
