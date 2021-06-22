
package org.datacontract.schemas._2004._07.edelivery_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="eSortOrder"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Asc"/&gt;
 *     &lt;enumeration value="Desc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "eSortOrder", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums")
@XmlEnum
public enum ESortOrder {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Asc")
    ASC("Asc"),
    @XmlEnumValue("Desc")
    DESC("Desc");
    private final String value;

    ESortOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESortOrder fromValue(String v) {
        for (ESortOrder c: ESortOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
