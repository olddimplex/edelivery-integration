
package org.datacontract.schemas._2004._07.edelivery_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eInstitutionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="eInstitutionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StateAdministraation"/&gt;
 *     &lt;enumeration value="SocialOrganisations"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "eInstitutionType", namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums")
@XmlEnum
public enum EInstitutionType {

    @XmlEnumValue("StateAdministraation")
    STATE_ADMINISTRAATION("StateAdministraation"),
    @XmlEnumValue("SocialOrganisations")
    SOCIAL_ORGANISATIONS("SocialOrganisations");
    private final String value;

    EInstitutionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EInstitutionType fromValue(String v) {
        for (EInstitutionType c: EInstitutionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
