
package https.edelivery_egov_bg.services.integration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.edelivery_common.DcStatisticsGeneral;


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
 *         &lt;element name="GetEDeliveryGeneralStatisticsResult" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}DcStatisticsGeneral" minOccurs="0"/&gt;
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
    "getEDeliveryGeneralStatisticsResult"
})
@XmlRootElement(name = "GetEDeliveryGeneralStatisticsResponse")
public class GetEDeliveryGeneralStatisticsResponse {

    @XmlElementRef(name = "GetEDeliveryGeneralStatisticsResult", namespace = "https://edelivery.egov.bg/services/integration", type = JAXBElement.class, required = false)
    protected JAXBElement<DcStatisticsGeneral> getEDeliveryGeneralStatisticsResult;

    /**
     * Gets the value of the getEDeliveryGeneralStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DcStatisticsGeneral }{@code >}
     *     
     */
    public JAXBElement<DcStatisticsGeneral> getGetEDeliveryGeneralStatisticsResult() {
        return getEDeliveryGeneralStatisticsResult;
    }

    /**
     * Sets the value of the getEDeliveryGeneralStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DcStatisticsGeneral }{@code >}
     *     
     */
    public void setGetEDeliveryGeneralStatisticsResult(JAXBElement<DcStatisticsGeneral> value) {
        this.getEDeliveryGeneralStatisticsResult = value;
    }

}
