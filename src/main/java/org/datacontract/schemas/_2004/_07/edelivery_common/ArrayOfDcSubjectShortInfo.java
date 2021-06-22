
package org.datacontract.schemas._2004._07.edelivery_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDcSubjectShortInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDcSubjectShortInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DcSubjectShortInfo" type="{http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts}DcSubjectShortInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDcSubjectShortInfo", propOrder = {
    "dcSubjectShortInfo"
})
public class ArrayOfDcSubjectShortInfo {

    @XmlElement(name = "DcSubjectShortInfo", nillable = true)
    protected List<DcSubjectShortInfo> dcSubjectShortInfo;

    /**
     * Gets the value of the dcSubjectShortInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcSubjectShortInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDcSubjectShortInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DcSubjectShortInfo }
     * 
     * 
     */
    public List<DcSubjectShortInfo> getDcSubjectShortInfo() {
        if (dcSubjectShortInfo == null) {
            dcSubjectShortInfo = new ArrayList<DcSubjectShortInfo>();
        }
        return this.dcSubjectShortInfo;
    }

}
