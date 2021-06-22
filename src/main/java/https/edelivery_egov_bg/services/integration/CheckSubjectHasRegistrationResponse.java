
package https.edelivery_egov_bg.services.integration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.edelivery_common.DcSubjectRegistrationInfo;


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
 *         &lt;element name="CheckSubjectHasRegistrationResult" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}DcSubjectRegistrationInfo" minOccurs="0"/&gt;
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
    "checkSubjectHasRegistrationResult"
})
@XmlRootElement(name = "CheckSubjectHasRegistrationResponse")
public class CheckSubjectHasRegistrationResponse {

    @XmlElementRef(name = "CheckSubjectHasRegistrationResult", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<DcSubjectRegistrationInfo> checkSubjectHasRegistrationResult;

    /**
     * Gets the value of the checkSubjectHasRegistrationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DcSubjectRegistrationInfo }{@code >}
     *     
     */
    public JAXBElement<DcSubjectRegistrationInfo> getCheckSubjectHasRegistrationResult() {
        return checkSubjectHasRegistrationResult;
    }

    /**
     * Sets the value of the checkSubjectHasRegistrationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DcSubjectRegistrationInfo }{@code >}
     *     
     */
    public void setCheckSubjectHasRegistrationResult(JAXBElement<DcSubjectRegistrationInfo> value) {
        this.checkSubjectHasRegistrationResult = value;
    }

}
