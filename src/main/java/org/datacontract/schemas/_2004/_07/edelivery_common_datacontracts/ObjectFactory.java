
package org.datacontract.schemas._2004._07.edelivery_common_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import org.datacontract.schemas._2004._07.edelivery_common.ArrayOfDcDocument;
import org.datacontract.schemas._2004._07.edelivery_common.ArrayOfDcDocumentAdditional;
import org.datacontract.schemas._2004._07.edelivery_common.DcDocument;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.edelivery_common_datacontracts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfDcInstitutionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "ArrayOfDcInstitutionInfo");
    private final static QName _DcInstitutionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcInstitutionInfo");
    private final static QName _DcSubjectInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcSubjectInfo");
    private final static QName _DcSubjectPublicInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcSubjectPublicInfo");
    private final static QName _DcAdministrativeActInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcAdministrativeActInfo");
    private final static QName _DcCertificateInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcCertificateInfo");
    private final static QName _WebInstitutionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "WebInstitutionInfo");
    private final static QName _DcLegalPersonInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcLegalPersonInfo");
    private final static QName _DcPersonInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcPersonInfo");
    private final static QName _WebLegalPersonInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "WebLegalPersonInfo");
    private final static QName _DcTokenVerificationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcTokenVerificationInfo");
    private final static QName _DcElectronicIdentityInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcElectronicIdentityInfo");
    private final static QName _DcAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcAddress");
    private final static QName _ArrayOfDcSubjectPublicInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "ArrayOfDcSubjectPublicInfo");
    private final static QName _DcMessageWithCodeReceiver_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DcMessageWithCodeReceiver");
    private final static QName _DcSubjectPublicInfoElectronicSubjectName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "ElectronicSubjectName");
    private final static QName _DcSubjectPublicInfoEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "Email");
    private final static QName _DcSubjectPublicInfoPhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "PhoneNumber");
    private final static QName _DcAddressAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "Address");
    private final static QName _DcAddressCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "City");
    private final static QName _DcAddressCountryIso2_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "CountryIso2");
    private final static QName _DcAddressState_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "State");
    private final static QName _DcAddressZipCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "ZipCode");
    private final static QName _DcElectronicIdentityInfoDateOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DateOfBirth");
    private final static QName _DcElectronicIdentityInfoEGN_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "EGN");
    private final static QName _DcElectronicIdentityInfoFamilyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "FamilyName");
    private final static QName _DcElectronicIdentityInfoFamilyNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "FamilyNameLat");
    private final static QName _DcElectronicIdentityInfoGivenName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "GivenName");
    private final static QName _DcElectronicIdentityInfoGivenNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "GivenNameLat");
    private final static QName _DcElectronicIdentityInfoMiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "MiddleName");
    private final static QName _DcElectronicIdentityInfoMiddleNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "MiddleNameLat");
    private final static QName _DcElectronicIdentityInfoPID_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "PID");
    private final static QName _DcElectronicIdentityInfoSpin_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "Spin");
    private final static QName _DcTokenVerificationInfoToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "Token");
    private final static QName _DcSubjectInfoDateCreated_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DateCreated");
    private final static QName _DcSubjectInfoUniqueSubjectIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "UniqueSubjectIdentifier");
    private final static QName _DcSubjectInfoVerificationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "VerificationInfo");
    private final static QName _DcLegalPersonInfoCompanyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "CompanyName");
    private final static QName _DcLegalPersonInfoDateOutOfForce_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DateOutOfForce");
    private final static QName _DcLegalPersonInfoRegisteredBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "RegisteredBy");
    private final static QName _WebLegalPersonInfoDateDeleted_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DateDeleted");
    private final static QName _WebLegalPersonInfoRegistrationDcouments_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "RegistrationDcouments");
    private final static QName _DcPersonInfoDateOfDeath_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "DateOfDeath");
    private final static QName _DcPersonInfoFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "FirstName");
    private final static QName _DcPersonInfoLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "LastName");
    private final static QName _DcInstitutionInfoHeadInstitution_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "HeadInstitution");
    private final static QName _DcInstitutionInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "Name");
    private final static QName _DcInstitutionInfoSubInstitutions_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "SubInstitutions");
    private final static QName _WebInstitutionInfoAdditionalDcouments_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "AdditionalDcouments");
    private final static QName _WebInstitutionInfoRegistrationDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "RegistrationDocument");
    private final static QName _DcCertificateInfoIssuer_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "Issuer");
    private final static QName _DcCertificateInfoSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "Subject");
    private final static QName _DcAdministrativeActInfoActNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "ActNumber");
    private final static QName _DcAdministrativeActInfoCreatedByInstitution_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "CreatedByInstitution");
    private final static QName _DcMessageWithCodeReceiverEGNorLNCH_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "EGNorLNCH");
    private final static QName _DcMessageWithCodeReceiverPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", "Phone");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.edelivery_common_datacontracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDcInstitutionInfo }
     * 
     */
    public ArrayOfDcInstitutionInfo createArrayOfDcInstitutionInfo() {
        return new ArrayOfDcInstitutionInfo();
    }

    /**
     * Create an instance of {@link DcMessageWithCodeReceiver }
     * 
     */
    public DcMessageWithCodeReceiver createDcMessageWithCodeReceiver() {
        return new DcMessageWithCodeReceiver();
    }

    /**
     * Create an instance of {@link DcSubjectInfo }
     * 
     */
    public DcSubjectInfo createDcSubjectInfo() {
        return new DcSubjectInfo();
    }

    /**
     * Create an instance of {@link DcInstitutionInfo }
     * 
     */
    public DcInstitutionInfo createDcInstitutionInfo() {
        return new DcInstitutionInfo();
    }

    /**
     * Create an instance of {@link DcSubjectPublicInfo }
     * 
     */
    public DcSubjectPublicInfo createDcSubjectPublicInfo() {
        return new DcSubjectPublicInfo();
    }

    /**
     * Create an instance of {@link DcAdministrativeActInfo }
     * 
     */
    public DcAdministrativeActInfo createDcAdministrativeActInfo() {
        return new DcAdministrativeActInfo();
    }

    /**
     * Create an instance of {@link DcCertificateInfo }
     * 
     */
    public DcCertificateInfo createDcCertificateInfo() {
        return new DcCertificateInfo();
    }

    /**
     * Create an instance of {@link WebInstitutionInfo }
     * 
     */
    public WebInstitutionInfo createWebInstitutionInfo() {
        return new WebInstitutionInfo();
    }

    /**
     * Create an instance of {@link DcLegalPersonInfo }
     * 
     */
    public DcLegalPersonInfo createDcLegalPersonInfo() {
        return new DcLegalPersonInfo();
    }

    /**
     * Create an instance of {@link DcPersonInfo }
     * 
     */
    public DcPersonInfo createDcPersonInfo() {
        return new DcPersonInfo();
    }

    /**
     * Create an instance of {@link WebLegalPersonInfo }
     * 
     */
    public WebLegalPersonInfo createWebLegalPersonInfo() {
        return new WebLegalPersonInfo();
    }

    /**
     * Create an instance of {@link DcTokenVerificationInfo }
     * 
     */
    public DcTokenVerificationInfo createDcTokenVerificationInfo() {
        return new DcTokenVerificationInfo();
    }

    /**
     * Create an instance of {@link DcElectronicIdentityInfo }
     * 
     */
    public DcElectronicIdentityInfo createDcElectronicIdentityInfo() {
        return new DcElectronicIdentityInfo();
    }

    /**
     * Create an instance of {@link DcAddress }
     * 
     */
    public DcAddress createDcAddress() {
        return new DcAddress();
    }

    /**
     * Create an instance of {@link ArrayOfDcSubjectPublicInfo }
     * 
     */
    public ArrayOfDcSubjectPublicInfo createArrayOfDcSubjectPublicInfo() {
        return new ArrayOfDcSubjectPublicInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcInstitutionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcInstitutionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "ArrayOfDcInstitutionInfo")
    public JAXBElement<ArrayOfDcInstitutionInfo> createArrayOfDcInstitutionInfo(ArrayOfDcInstitutionInfo value) {
        return new JAXBElement<ArrayOfDcInstitutionInfo>(_ArrayOfDcInstitutionInfo_QNAME, ArrayOfDcInstitutionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcInstitutionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcInstitutionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcInstitutionInfo")
    public JAXBElement<DcInstitutionInfo> createDcInstitutionInfo(DcInstitutionInfo value) {
        return new JAXBElement<DcInstitutionInfo>(_DcInstitutionInfo_QNAME, DcInstitutionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcSubjectInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcSubjectInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcSubjectInfo")
    public JAXBElement<DcSubjectInfo> createDcSubjectInfo(DcSubjectInfo value) {
        return new JAXBElement<DcSubjectInfo>(_DcSubjectInfo_QNAME, DcSubjectInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcSubjectPublicInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcSubjectPublicInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcSubjectPublicInfo")
    public JAXBElement<DcSubjectPublicInfo> createDcSubjectPublicInfo(DcSubjectPublicInfo value) {
        return new JAXBElement<DcSubjectPublicInfo>(_DcSubjectPublicInfo_QNAME, DcSubjectPublicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcAdministrativeActInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcAdministrativeActInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcAdministrativeActInfo")
    public JAXBElement<DcAdministrativeActInfo> createDcAdministrativeActInfo(DcAdministrativeActInfo value) {
        return new JAXBElement<DcAdministrativeActInfo>(_DcAdministrativeActInfo_QNAME, DcAdministrativeActInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcCertificateInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcCertificateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcCertificateInfo")
    public JAXBElement<DcCertificateInfo> createDcCertificateInfo(DcCertificateInfo value) {
        return new JAXBElement<DcCertificateInfo>(_DcCertificateInfo_QNAME, DcCertificateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebInstitutionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebInstitutionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "WebInstitutionInfo")
    public JAXBElement<WebInstitutionInfo> createWebInstitutionInfo(WebInstitutionInfo value) {
        return new JAXBElement<WebInstitutionInfo>(_WebInstitutionInfo_QNAME, WebInstitutionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcLegalPersonInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcLegalPersonInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcLegalPersonInfo")
    public JAXBElement<DcLegalPersonInfo> createDcLegalPersonInfo(DcLegalPersonInfo value) {
        return new JAXBElement<DcLegalPersonInfo>(_DcLegalPersonInfo_QNAME, DcLegalPersonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcPersonInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcPersonInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcPersonInfo")
    public JAXBElement<DcPersonInfo> createDcPersonInfo(DcPersonInfo value) {
        return new JAXBElement<DcPersonInfo>(_DcPersonInfo_QNAME, DcPersonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebLegalPersonInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebLegalPersonInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "WebLegalPersonInfo")
    public JAXBElement<WebLegalPersonInfo> createWebLegalPersonInfo(WebLegalPersonInfo value) {
        return new JAXBElement<WebLegalPersonInfo>(_WebLegalPersonInfo_QNAME, WebLegalPersonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcTokenVerificationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcTokenVerificationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcTokenVerificationInfo")
    public JAXBElement<DcTokenVerificationInfo> createDcTokenVerificationInfo(DcTokenVerificationInfo value) {
        return new JAXBElement<DcTokenVerificationInfo>(_DcTokenVerificationInfo_QNAME, DcTokenVerificationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcElectronicIdentityInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcElectronicIdentityInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcElectronicIdentityInfo")
    public JAXBElement<DcElectronicIdentityInfo> createDcElectronicIdentityInfo(DcElectronicIdentityInfo value) {
        return new JAXBElement<DcElectronicIdentityInfo>(_DcElectronicIdentityInfo_QNAME, DcElectronicIdentityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcAddress")
    public JAXBElement<DcAddress> createDcAddress(DcAddress value) {
        return new JAXBElement<DcAddress>(_DcAddress_QNAME, DcAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectPublicInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectPublicInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "ArrayOfDcSubjectPublicInfo")
    public JAXBElement<ArrayOfDcSubjectPublicInfo> createArrayOfDcSubjectPublicInfo(ArrayOfDcSubjectPublicInfo value) {
        return new JAXBElement<ArrayOfDcSubjectPublicInfo>(_ArrayOfDcSubjectPublicInfo_QNAME, ArrayOfDcSubjectPublicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageWithCodeReceiver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageWithCodeReceiver }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DcMessageWithCodeReceiver")
    public JAXBElement<DcMessageWithCodeReceiver> createDcMessageWithCodeReceiver(DcMessageWithCodeReceiver value) {
        return new JAXBElement<DcMessageWithCodeReceiver>(_DcMessageWithCodeReceiver_QNAME, DcMessageWithCodeReceiver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "ElectronicSubjectName", scope = DcSubjectPublicInfo.class)
    public JAXBElement<String> createDcSubjectPublicInfoElectronicSubjectName(String value) {
        return new JAXBElement<String>(_DcSubjectPublicInfoElectronicSubjectName_QNAME, String.class, DcSubjectPublicInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Email", scope = DcSubjectPublicInfo.class)
    public JAXBElement<String> createDcSubjectPublicInfoEmail(String value) {
        return new JAXBElement<String>(_DcSubjectPublicInfoEmail_QNAME, String.class, DcSubjectPublicInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "PhoneNumber", scope = DcSubjectPublicInfo.class)
    public JAXBElement<String> createDcSubjectPublicInfoPhoneNumber(String value) {
        return new JAXBElement<String>(_DcSubjectPublicInfoPhoneNumber_QNAME, String.class, DcSubjectPublicInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Address", scope = DcAddress.class)
    public JAXBElement<String> createDcAddressAddress(String value) {
        return new JAXBElement<String>(_DcAddressAddress_QNAME, String.class, DcAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "City", scope = DcAddress.class)
    public JAXBElement<String> createDcAddressCity(String value) {
        return new JAXBElement<String>(_DcAddressCity_QNAME, String.class, DcAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "CountryIso2", scope = DcAddress.class)
    public JAXBElement<String> createDcAddressCountryIso2(String value) {
        return new JAXBElement<String>(_DcAddressCountryIso2_QNAME, String.class, DcAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "State", scope = DcAddress.class)
    public JAXBElement<String> createDcAddressState(String value) {
        return new JAXBElement<String>(_DcAddressState_QNAME, String.class, DcAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "ZipCode", scope = DcAddress.class)
    public JAXBElement<String> createDcAddressZipCode(String value) {
        return new JAXBElement<String>(_DcAddressZipCode_QNAME, String.class, DcAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Address", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoAddress(String value) {
        return new JAXBElement<String>(_DcAddressAddress_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DateOfBirth", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<XMLGregorianCalendar> createDcElectronicIdentityInfoDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DcElectronicIdentityInfoDateOfBirth_QNAME, XMLGregorianCalendar.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "EGN", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoEGN(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoEGN_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "FamilyName", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoFamilyName(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoFamilyName_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "FamilyNameLat", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoFamilyNameLat(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoFamilyNameLat_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "GivenName", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoGivenName(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoGivenName_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "GivenNameLat", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoGivenNameLat(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoGivenNameLat_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "MiddleName", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoMiddleName(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoMiddleName_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "MiddleNameLat", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoMiddleNameLat(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoMiddleNameLat_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "PID", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoPID(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoPID_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "PhoneNumber", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoPhoneNumber(String value) {
        return new JAXBElement<String>(_DcSubjectPublicInfoPhoneNumber_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Spin", scope = DcElectronicIdentityInfo.class)
    public JAXBElement<String> createDcElectronicIdentityInfoSpin(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoSpin_QNAME, String.class, DcElectronicIdentityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Token", scope = DcTokenVerificationInfo.class)
    public JAXBElement<String> createDcTokenVerificationInfoToken(String value) {
        return new JAXBElement<String>(_DcTokenVerificationInfoToken_QNAME, String.class, DcTokenVerificationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Address", scope = DcSubjectInfo.class)
    public JAXBElement<DcAddress> createDcSubjectInfoAddress(DcAddress value) {
        return new JAXBElement<DcAddress>(_DcAddressAddress_QNAME, DcAddress.class, DcSubjectInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DateCreated", scope = DcSubjectInfo.class)
    public JAXBElement<XMLGregorianCalendar> createDcSubjectInfoDateCreated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DcSubjectInfoDateCreated_QNAME, XMLGregorianCalendar.class, DcSubjectInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "UniqueSubjectIdentifier", scope = DcSubjectInfo.class)
    public JAXBElement<String> createDcSubjectInfoUniqueSubjectIdentifier(String value) {
        return new JAXBElement<String>(_DcSubjectInfoUniqueSubjectIdentifier_QNAME, String.class, DcSubjectInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "VerificationInfo", scope = DcSubjectInfo.class)
    public JAXBElement<ArrayOfanyType> createDcSubjectInfoVerificationInfo(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_DcSubjectInfoVerificationInfo_QNAME, ArrayOfanyType.class, DcSubjectInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "CompanyName", scope = DcLegalPersonInfo.class)
    public JAXBElement<String> createDcLegalPersonInfoCompanyName(String value) {
        return new JAXBElement<String>(_DcLegalPersonInfoCompanyName_QNAME, String.class, DcLegalPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DateOutOfForce", scope = DcLegalPersonInfo.class)
    public JAXBElement<XMLGregorianCalendar> createDcLegalPersonInfoDateOutOfForce(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DcLegalPersonInfoDateOutOfForce_QNAME, XMLGregorianCalendar.class, DcLegalPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcPersonInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcPersonInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "RegisteredBy", scope = DcLegalPersonInfo.class)
    public JAXBElement<DcPersonInfo> createDcLegalPersonInfoRegisteredBy(DcPersonInfo value) {
        return new JAXBElement<DcPersonInfo>(_DcLegalPersonInfoRegisteredBy_QNAME, DcPersonInfo.class, DcLegalPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DateDeleted", scope = WebLegalPersonInfo.class)
    public JAXBElement<XMLGregorianCalendar> createWebLegalPersonInfoDateDeleted(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WebLegalPersonInfoDateDeleted_QNAME, XMLGregorianCalendar.class, WebLegalPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "RegistrationDcouments", scope = WebLegalPersonInfo.class)
    public JAXBElement<ArrayOfDcDocument> createWebLegalPersonInfoRegistrationDcouments(ArrayOfDcDocument value) {
        return new JAXBElement<ArrayOfDcDocument>(_WebLegalPersonInfoRegistrationDcouments_QNAME, ArrayOfDcDocument.class, WebLegalPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DateOfDeath", scope = DcPersonInfo.class)
    public JAXBElement<XMLGregorianCalendar> createDcPersonInfoDateOfDeath(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DcPersonInfoDateOfDeath_QNAME, XMLGregorianCalendar.class, DcPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "FirstName", scope = DcPersonInfo.class)
    public JAXBElement<String> createDcPersonInfoFirstName(String value) {
        return new JAXBElement<String>(_DcPersonInfoFirstName_QNAME, String.class, DcPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "LastName", scope = DcPersonInfo.class)
    public JAXBElement<String> createDcPersonInfoLastName(String value) {
        return new JAXBElement<String>(_DcPersonInfoLastName_QNAME, String.class, DcPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "MiddleName", scope = DcPersonInfo.class)
    public JAXBElement<String> createDcPersonInfoMiddleName(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoMiddleName_QNAME, String.class, DcPersonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcSubjectPublicInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcSubjectPublicInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "HeadInstitution", scope = DcInstitutionInfo.class)
    public JAXBElement<DcSubjectPublicInfo> createDcInstitutionInfoHeadInstitution(DcSubjectPublicInfo value) {
        return new JAXBElement<DcSubjectPublicInfo>(_DcInstitutionInfoHeadInstitution_QNAME, DcSubjectPublicInfo.class, DcInstitutionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Name", scope = DcInstitutionInfo.class)
    public JAXBElement<String> createDcInstitutionInfoName(String value) {
        return new JAXBElement<String>(_DcInstitutionInfoName_QNAME, String.class, DcInstitutionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectPublicInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectPublicInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "SubInstitutions", scope = DcInstitutionInfo.class)
    public JAXBElement<ArrayOfDcSubjectPublicInfo> createDcInstitutionInfoSubInstitutions(ArrayOfDcSubjectPublicInfo value) {
        return new JAXBElement<ArrayOfDcSubjectPublicInfo>(_DcInstitutionInfoSubInstitutions_QNAME, ArrayOfDcSubjectPublicInfo.class, DcInstitutionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocumentAdditional }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocumentAdditional }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "AdditionalDcouments", scope = WebInstitutionInfo.class)
    public JAXBElement<ArrayOfDcDocumentAdditional> createWebInstitutionInfoAdditionalDcouments(ArrayOfDcDocumentAdditional value) {
        return new JAXBElement<ArrayOfDcDocumentAdditional>(_WebInstitutionInfoAdditionalDcouments_QNAME, ArrayOfDcDocumentAdditional.class, WebInstitutionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "DateDeleted", scope = WebInstitutionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createWebInstitutionInfoDateDeleted(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WebLegalPersonInfoDateDeleted_QNAME, XMLGregorianCalendar.class, WebInstitutionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "RegistrationDocument", scope = WebInstitutionInfo.class)
    public JAXBElement<DcDocument> createWebInstitutionInfoRegistrationDocument(DcDocument value) {
        return new JAXBElement<DcDocument>(_WebInstitutionInfoRegistrationDocument_QNAME, DcDocument.class, WebInstitutionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Issuer", scope = DcCertificateInfo.class)
    public JAXBElement<String> createDcCertificateInfoIssuer(String value) {
        return new JAXBElement<String>(_DcCertificateInfoIssuer_QNAME, String.class, DcCertificateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Subject", scope = DcCertificateInfo.class)
    public JAXBElement<String> createDcCertificateInfoSubject(String value) {
        return new JAXBElement<String>(_DcCertificateInfoSubject_QNAME, String.class, DcCertificateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "ActNumber", scope = DcAdministrativeActInfo.class)
    public JAXBElement<String> createDcAdministrativeActInfoActNumber(String value) {
        return new JAXBElement<String>(_DcAdministrativeActInfoActNumber_QNAME, String.class, DcAdministrativeActInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "CreatedByInstitution", scope = DcAdministrativeActInfo.class)
    public JAXBElement<String> createDcAdministrativeActInfoCreatedByInstitution(String value) {
        return new JAXBElement<String>(_DcAdministrativeActInfoCreatedByInstitution_QNAME, String.class, DcAdministrativeActInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "EGNorLNCH", scope = DcMessageWithCodeReceiver.class)
    public JAXBElement<String> createDcMessageWithCodeReceiverEGNorLNCH(String value) {
        return new JAXBElement<String>(_DcMessageWithCodeReceiverEGNorLNCH_QNAME, String.class, DcMessageWithCodeReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Email", scope = DcMessageWithCodeReceiver.class)
    public JAXBElement<String> createDcMessageWithCodeReceiverEmail(String value) {
        return new JAXBElement<String>(_DcSubjectPublicInfoEmail_QNAME, String.class, DcMessageWithCodeReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "FirstName", scope = DcMessageWithCodeReceiver.class)
    public JAXBElement<String> createDcMessageWithCodeReceiverFirstName(String value) {
        return new JAXBElement<String>(_DcPersonInfoFirstName_QNAME, String.class, DcMessageWithCodeReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "LastName", scope = DcMessageWithCodeReceiver.class)
    public JAXBElement<String> createDcMessageWithCodeReceiverLastName(String value) {
        return new JAXBElement<String>(_DcPersonInfoLastName_QNAME, String.class, DcMessageWithCodeReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "MiddleName", scope = DcMessageWithCodeReceiver.class)
    public JAXBElement<String> createDcMessageWithCodeReceiverMiddleName(String value) {
        return new JAXBElement<String>(_DcElectronicIdentityInfoMiddleName_QNAME, String.class, DcMessageWithCodeReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts.ESubject", name = "Phone", scope = DcMessageWithCodeReceiver.class)
    public JAXBElement<String> createDcMessageWithCodeReceiverPhone(String value) {
        return new JAXBElement<String>(_DcMessageWithCodeReceiverPhone_QNAME, String.class, DcMessageWithCodeReceiver.class, value);
    }

}
