
package https.edelivery_egov_bg.services.integration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.edelivery_common_datacontracts.DcSubjectInfo;


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
 *         &lt;element name="GetSubjectInfoResult" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject}DcSubjectInfo" minOccurs="0"/&gt;
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
    "getSubjectInfoResult"
})
@XmlRootElement(name = "GetSubjectInfoResponse")
public class GetSubjectInfoResponse {

    @XmlElementRef(name = "GetSubjectInfoResult", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<DcSubjectInfo> getSubjectInfoResult;

    /**
     * Gets the value of the getSubjectInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DcSubjectInfo }{@code >}
     *     
     */
    public JAXBElement<DcSubjectInfo> getGetSubjectInfoResult() {
        return getSubjectInfoResult;
    }

    /**
     * Sets the value of the getSubjectInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DcSubjectInfo }{@code >}
     *     
     */
    public void setGetSubjectInfoResult(JAXBElement<DcSubjectInfo> value) {
        this.getSubjectInfoResult = value;
    }

}