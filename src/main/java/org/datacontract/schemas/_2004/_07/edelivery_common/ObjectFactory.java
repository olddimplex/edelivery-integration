
package org.datacontract.schemas._2004._07.edelivery_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.edelivery_common package. 
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

    private final static QName _EProfileType_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", "eProfileType");
    private final static QName _EVerificationInfoType_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", "eVerificationInfoType");
    private final static QName _ERevokationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", "eRevokationResult");
    private final static QName _EVerificationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", "eVerificationResult");
    private final static QName _ESortColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", "eSortColumn");
    private final static QName _ESortOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", "eSortOrder");
    private final static QName _EInstitutionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", "eInstitutionType");
    private final static QName _ArrayOfDcDocumentAdditional_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ArrayOfDcDocumentAdditional");
    private final static QName _DcDocumentAdditional_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcDocumentAdditional");
    private final static QName _DcDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcDocument");
    private final static QName _ArrayOfDcSignatureValidationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ArrayOfDcSignatureValidationResult");
    private final static QName _DcSignatureValidationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcSignatureValidationResult");
    private final static QName _ArrayOfDcChainCertificate_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ArrayOfDcChainCertificate");
    private final static QName _DcChainCertificate_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcChainCertificate");
    private final static QName _DcTimeStamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcTimeStamp");
    private final static QName _ArrayOfDcDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ArrayOfDcDocument");
    private final static QName _DcMessageDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcMessageDetails");
    private final static QName _DcMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcMessage");
    private final static QName _DcLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcLogin");
    private final static QName _ArrayOfDcProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ArrayOfDcProfile");
    private final static QName _DcProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcProfile");
    private final static QName _DcTimeStampMessageContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcTimeStampMessageContent");
    private final static QName _ArrayOfDcMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ArrayOfDcMessage");
    private final static QName _DcPartialListOfDcMessageHR29GRRX_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcPartialListOfDcMessageHR29gRRX");
    private final static QName _DcPersonRegistrationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcPersonRegistrationInfo");
    private final static QName _ArrayOfDcSubjectShortInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ArrayOfDcSubjectShortInfo");
    private final static QName _DcSubjectShortInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcSubjectShortInfo");
    private final static QName _DcLegalPersonRegistrationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcLegalPersonRegistrationInfo");
    private final static QName _DcSubjectRegistrationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcSubjectRegistrationInfo");
    private final static QName _DcRegisteredSubjectInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcRegisteredSubjectInfo");
    private final static QName _DcStatisticsGeneral_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DcStatisticsGeneral");
    private final static QName _DcRegisteredSubjectInfoInstitutionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "InstitutionType");
    private final static QName _DcSubjectShortInfoEGN_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "EGN");
    private final static QName _DcSubjectShortInfoEIK_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "EIK");
    private final static QName _DcSubjectShortInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Name");
    private final static QName _DcTimeStampMessageContentContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Content");
    private final static QName _DcTimeStampMessageContentContentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ContentType");
    private final static QName _DcTimeStampMessageContentFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "FileName");
    private final static QName _DcProfileElectronicSubjectName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ElectronicSubjectName");
    private final static QName _DcProfileEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Email");
    private final static QName _DcProfilePhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Phone");
    private final static QName _DcLoginCertificateThumbprint_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "CertificateThumbprint");
    private final static QName _DcLoginPhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "PhoneNumber");
    private final static QName _DcLoginProfiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Profiles");
    private final static QName _DcLoginPushNotificationsUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "PushNotificationsUrl");
    private final static QName _DcMessageDateReceived_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DateReceived");
    private final static QName _DcMessageDateSent_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DateSent");
    private final static QName _DcMessageReceiverLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ReceiverLogin");
    private final static QName _DcMessageReceiverProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ReceiverProfile");
    private final static QName _DcMessageSenderLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "SenderLogin");
    private final static QName _DcMessageSenderProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "SenderProfile");
    private final static QName _DcMessageTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Title");
    private final static QName _DcTimeStampTimeStampData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "TimeStampData");
    private final static QName _DcChainCertificateSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Subject");
    private final static QName _DcDocumentAdditionalContentEncodingCodePage_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ContentEncodingCodePage");
    private final static QName _DcDocumentAdditionalCreatedBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "CreatedBy");
    private final static QName _DcDocumentAdditionalDocumentDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DocumentDescription");
    private final static QName _DcDocumentAdditionalDocumentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DocumentName");
    private final static QName _DcSubjectRegistrationInfoIdentificator_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Identificator");
    private final static QName _DcSubjectRegistrationInfoSubjectInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "SubjectInfo");
    private final static QName _DcLegalPersonRegistrationInfoProfilesWithAccess_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "ProfilesWithAccess");
    private final static QName _DcPersonRegistrationInfoAccessibleProfiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "AccessibleProfiles");
    private final static QName _DcPersonRegistrationInfoPersonIdentificator_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "PersonIdentificator");
    private final static QName _DcPartialListOfDcMessageHR29GRRXItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "Items");
    private final static QName _DcDocumentDocumentRegistrationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "DocumentRegistrationNumber");
    private final static QName _DcDocumentSignaturesInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "SignaturesInfo");
    private final static QName _DcDocumentTimeStamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "TimeStamp");
    private final static QName _DcMessageDetailsAttachedDocuments_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "AttachedDocuments");
    private final static QName _DcMessageDetailsMessageText_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "MessageText");
    private final static QName _DcMessageDetailsTimeStampContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "TimeStampContent");
    private final static QName _DcMessageDetailsTimeStampNRD_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "TimeStampNRD");
    private final static QName _DcMessageDetailsTimeStampNRO_QNAME = new QName("http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", "TimeStampNRO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.edelivery_common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DcMessageDetails }
     * 
     */
    public DcMessageDetails createDcMessageDetails() {
        return new DcMessageDetails();
    }

    /**
     * Create an instance of {@link DcDocument }
     * 
     */
    public DcDocument createDcDocument() {
        return new DcDocument();
    }

    /**
     * Create an instance of {@link ArrayOfDcDocument }
     * 
     */
    public ArrayOfDcDocument createArrayOfDcDocument() {
        return new ArrayOfDcDocument();
    }

    /**
     * Create an instance of {@link ArrayOfDcMessage }
     * 
     */
    public ArrayOfDcMessage createArrayOfDcMessage() {
        return new ArrayOfDcMessage();
    }

    /**
     * Create an instance of {@link DcPartialListOfDcMessageHR29GRRX }
     * 
     */
    public DcPartialListOfDcMessageHR29GRRX createDcPartialListOfDcMessageHR29GRRX() {
        return new DcPartialListOfDcMessageHR29GRRX();
    }

    /**
     * Create an instance of {@link DcPersonRegistrationInfo }
     * 
     */
    public DcPersonRegistrationInfo createDcPersonRegistrationInfo() {
        return new DcPersonRegistrationInfo();
    }

    /**
     * Create an instance of {@link DcLegalPersonRegistrationInfo }
     * 
     */
    public DcLegalPersonRegistrationInfo createDcLegalPersonRegistrationInfo() {
        return new DcLegalPersonRegistrationInfo();
    }

    /**
     * Create an instance of {@link DcSubjectRegistrationInfo }
     * 
     */
    public DcSubjectRegistrationInfo createDcSubjectRegistrationInfo() {
        return new DcSubjectRegistrationInfo();
    }

    /**
     * Create an instance of {@link DcStatisticsGeneral }
     * 
     */
    public DcStatisticsGeneral createDcStatisticsGeneral() {
        return new DcStatisticsGeneral();
    }

    /**
     * Create an instance of {@link ArrayOfDcDocumentAdditional }
     * 
     */
    public ArrayOfDcDocumentAdditional createArrayOfDcDocumentAdditional() {
        return new ArrayOfDcDocumentAdditional();
    }

    /**
     * Create an instance of {@link DcDocumentAdditional }
     * 
     */
    public DcDocumentAdditional createDcDocumentAdditional() {
        return new DcDocumentAdditional();
    }

    /**
     * Create an instance of {@link ArrayOfDcSignatureValidationResult }
     * 
     */
    public ArrayOfDcSignatureValidationResult createArrayOfDcSignatureValidationResult() {
        return new ArrayOfDcSignatureValidationResult();
    }

    /**
     * Create an instance of {@link DcSignatureValidationResult }
     * 
     */
    public DcSignatureValidationResult createDcSignatureValidationResult() {
        return new DcSignatureValidationResult();
    }

    /**
     * Create an instance of {@link ArrayOfDcChainCertificate }
     * 
     */
    public ArrayOfDcChainCertificate createArrayOfDcChainCertificate() {
        return new ArrayOfDcChainCertificate();
    }

    /**
     * Create an instance of {@link DcChainCertificate }
     * 
     */
    public DcChainCertificate createDcChainCertificate() {
        return new DcChainCertificate();
    }

    /**
     * Create an instance of {@link DcTimeStamp }
     * 
     */
    public DcTimeStamp createDcTimeStamp() {
        return new DcTimeStamp();
    }

    /**
     * Create an instance of {@link DcMessage }
     * 
     */
    public DcMessage createDcMessage() {
        return new DcMessage();
    }

    /**
     * Create an instance of {@link DcLogin }
     * 
     */
    public DcLogin createDcLogin() {
        return new DcLogin();
    }

    /**
     * Create an instance of {@link ArrayOfDcProfile }
     * 
     */
    public ArrayOfDcProfile createArrayOfDcProfile() {
        return new ArrayOfDcProfile();
    }

    /**
     * Create an instance of {@link DcProfile }
     * 
     */
    public DcProfile createDcProfile() {
        return new DcProfile();
    }

    /**
     * Create an instance of {@link DcTimeStampMessageContent }
     * 
     */
    public DcTimeStampMessageContent createDcTimeStampMessageContent() {
        return new DcTimeStampMessageContent();
    }

    /**
     * Create an instance of {@link ArrayOfDcSubjectShortInfo }
     * 
     */
    public ArrayOfDcSubjectShortInfo createArrayOfDcSubjectShortInfo() {
        return new ArrayOfDcSubjectShortInfo();
    }

    /**
     * Create an instance of {@link DcSubjectShortInfo }
     * 
     */
    public DcSubjectShortInfo createDcSubjectShortInfo() {
        return new DcSubjectShortInfo();
    }

    /**
     * Create an instance of {@link DcRegisteredSubjectInfo }
     * 
     */
    public DcRegisteredSubjectInfo createDcRegisteredSubjectInfo() {
        return new DcRegisteredSubjectInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EProfileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EProfileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", name = "eProfileType")
    public JAXBElement<EProfileType> createEProfileType(EProfileType value) {
        return new JAXBElement<EProfileType>(_EProfileType_QNAME, EProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EVerificationInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EVerificationInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", name = "eVerificationInfoType")
    public JAXBElement<EVerificationInfoType> createEVerificationInfoType(EVerificationInfoType value) {
        return new JAXBElement<EVerificationInfoType>(_EVerificationInfoType_QNAME, EVerificationInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ERevokationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ERevokationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", name = "eRevokationResult")
    public JAXBElement<ERevokationResult> createERevokationResult(ERevokationResult value) {
        return new JAXBElement<ERevokationResult>(_ERevokationResult_QNAME, ERevokationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EVerificationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EVerificationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", name = "eVerificationResult")
    public JAXBElement<EVerificationResult> createEVerificationResult(EVerificationResult value) {
        return new JAXBElement<EVerificationResult>(_EVerificationResult_QNAME, EVerificationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESortColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ESortColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", name = "eSortColumn")
    public JAXBElement<ESortColumn> createESortColumn(ESortColumn value) {
        return new JAXBElement<ESortColumn>(_ESortColumn_QNAME, ESortColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESortOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ESortOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", name = "eSortOrder")
    public JAXBElement<ESortOrder> createESortOrder(ESortOrder value) {
        return new JAXBElement<ESortOrder>(_ESortOrder_QNAME, ESortOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EInstitutionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EInstitutionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.Enums", name = "eInstitutionType")
    public JAXBElement<EInstitutionType> createEInstitutionType(EInstitutionType value) {
        return new JAXBElement<EInstitutionType>(_EInstitutionType_QNAME, EInstitutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocumentAdditional }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocumentAdditional }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ArrayOfDcDocumentAdditional")
    public JAXBElement<ArrayOfDcDocumentAdditional> createArrayOfDcDocumentAdditional(ArrayOfDcDocumentAdditional value) {
        return new JAXBElement<ArrayOfDcDocumentAdditional>(_ArrayOfDcDocumentAdditional_QNAME, ArrayOfDcDocumentAdditional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcDocumentAdditional }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcDocumentAdditional }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcDocumentAdditional")
    public JAXBElement<DcDocumentAdditional> createDcDocumentAdditional(DcDocumentAdditional value) {
        return new JAXBElement<DcDocumentAdditional>(_DcDocumentAdditional_QNAME, DcDocumentAdditional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcDocument")
    public JAXBElement<DcDocument> createDcDocument(DcDocument value) {
        return new JAXBElement<DcDocument>(_DcDocument_QNAME, DcDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSignatureValidationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSignatureValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ArrayOfDcSignatureValidationResult")
    public JAXBElement<ArrayOfDcSignatureValidationResult> createArrayOfDcSignatureValidationResult(ArrayOfDcSignatureValidationResult value) {
        return new JAXBElement<ArrayOfDcSignatureValidationResult>(_ArrayOfDcSignatureValidationResult_QNAME, ArrayOfDcSignatureValidationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcSignatureValidationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcSignatureValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcSignatureValidationResult")
    public JAXBElement<DcSignatureValidationResult> createDcSignatureValidationResult(DcSignatureValidationResult value) {
        return new JAXBElement<DcSignatureValidationResult>(_DcSignatureValidationResult_QNAME, DcSignatureValidationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcChainCertificate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcChainCertificate }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ArrayOfDcChainCertificate")
    public JAXBElement<ArrayOfDcChainCertificate> createArrayOfDcChainCertificate(ArrayOfDcChainCertificate value) {
        return new JAXBElement<ArrayOfDcChainCertificate>(_ArrayOfDcChainCertificate_QNAME, ArrayOfDcChainCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcChainCertificate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcChainCertificate }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcChainCertificate")
    public JAXBElement<DcChainCertificate> createDcChainCertificate(DcChainCertificate value) {
        return new JAXBElement<DcChainCertificate>(_DcChainCertificate_QNAME, DcChainCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcTimeStamp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcTimeStamp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcTimeStamp")
    public JAXBElement<DcTimeStamp> createDcTimeStamp(DcTimeStamp value) {
        return new JAXBElement<DcTimeStamp>(_DcTimeStamp_QNAME, DcTimeStamp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ArrayOfDcDocument")
    public JAXBElement<ArrayOfDcDocument> createArrayOfDcDocument(ArrayOfDcDocument value) {
        return new JAXBElement<ArrayOfDcDocument>(_ArrayOfDcDocument_QNAME, ArrayOfDcDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcMessageDetails")
    public JAXBElement<DcMessageDetails> createDcMessageDetails(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_DcMessageDetails_QNAME, DcMessageDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcMessage")
    public JAXBElement<DcMessage> createDcMessage(DcMessage value) {
        return new JAXBElement<DcMessage>(_DcMessage_QNAME, DcMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcLogin")
    public JAXBElement<DcLogin> createDcLogin(DcLogin value) {
        return new JAXBElement<DcLogin>(_DcLogin_QNAME, DcLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ArrayOfDcProfile")
    public JAXBElement<ArrayOfDcProfile> createArrayOfDcProfile(ArrayOfDcProfile value) {
        return new JAXBElement<ArrayOfDcProfile>(_ArrayOfDcProfile_QNAME, ArrayOfDcProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcProfile")
    public JAXBElement<DcProfile> createDcProfile(DcProfile value) {
        return new JAXBElement<DcProfile>(_DcProfile_QNAME, DcProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcTimeStampMessageContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcTimeStampMessageContent }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcTimeStampMessageContent")
    public JAXBElement<DcTimeStampMessageContent> createDcTimeStampMessageContent(DcTimeStampMessageContent value) {
        return new JAXBElement<DcTimeStampMessageContent>(_DcTimeStampMessageContent_QNAME, DcTimeStampMessageContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ArrayOfDcMessage")
    public JAXBElement<ArrayOfDcMessage> createArrayOfDcMessage(ArrayOfDcMessage value) {
        return new JAXBElement<ArrayOfDcMessage>(_ArrayOfDcMessage_QNAME, ArrayOfDcMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcPartialListOfDcMessageHR29GRRX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcPartialListOfDcMessageHR29GRRX }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcPartialListOfDcMessageHR29gRRX")
    public JAXBElement<DcPartialListOfDcMessageHR29GRRX> createDcPartialListOfDcMessageHR29GRRX(DcPartialListOfDcMessageHR29GRRX value) {
        return new JAXBElement<DcPartialListOfDcMessageHR29GRRX>(_DcPartialListOfDcMessageHR29GRRX_QNAME, DcPartialListOfDcMessageHR29GRRX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcPersonRegistrationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcPersonRegistrationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcPersonRegistrationInfo")
    public JAXBElement<DcPersonRegistrationInfo> createDcPersonRegistrationInfo(DcPersonRegistrationInfo value) {
        return new JAXBElement<DcPersonRegistrationInfo>(_DcPersonRegistrationInfo_QNAME, DcPersonRegistrationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ArrayOfDcSubjectShortInfo")
    public JAXBElement<ArrayOfDcSubjectShortInfo> createArrayOfDcSubjectShortInfo(ArrayOfDcSubjectShortInfo value) {
        return new JAXBElement<ArrayOfDcSubjectShortInfo>(_ArrayOfDcSubjectShortInfo_QNAME, ArrayOfDcSubjectShortInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcSubjectShortInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcSubjectShortInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcSubjectShortInfo")
    public JAXBElement<DcSubjectShortInfo> createDcSubjectShortInfo(DcSubjectShortInfo value) {
        return new JAXBElement<DcSubjectShortInfo>(_DcSubjectShortInfo_QNAME, DcSubjectShortInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcLegalPersonRegistrationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcLegalPersonRegistrationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcLegalPersonRegistrationInfo")
    public JAXBElement<DcLegalPersonRegistrationInfo> createDcLegalPersonRegistrationInfo(DcLegalPersonRegistrationInfo value) {
        return new JAXBElement<DcLegalPersonRegistrationInfo>(_DcLegalPersonRegistrationInfo_QNAME, DcLegalPersonRegistrationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcSubjectRegistrationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcSubjectRegistrationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcSubjectRegistrationInfo")
    public JAXBElement<DcSubjectRegistrationInfo> createDcSubjectRegistrationInfo(DcSubjectRegistrationInfo value) {
        return new JAXBElement<DcSubjectRegistrationInfo>(_DcSubjectRegistrationInfo_QNAME, DcSubjectRegistrationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcRegisteredSubjectInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcRegisteredSubjectInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcRegisteredSubjectInfo")
    public JAXBElement<DcRegisteredSubjectInfo> createDcRegisteredSubjectInfo(DcRegisteredSubjectInfo value) {
        return new JAXBElement<DcRegisteredSubjectInfo>(_DcRegisteredSubjectInfo_QNAME, DcRegisteredSubjectInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcStatisticsGeneral }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcStatisticsGeneral }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DcStatisticsGeneral")
    public JAXBElement<DcStatisticsGeneral> createDcStatisticsGeneral(DcStatisticsGeneral value) {
        return new JAXBElement<DcStatisticsGeneral>(_DcStatisticsGeneral_QNAME, DcStatisticsGeneral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EInstitutionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EInstitutionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "InstitutionType", scope = DcRegisteredSubjectInfo.class)
    public JAXBElement<EInstitutionType> createDcRegisteredSubjectInfoInstitutionType(EInstitutionType value) {
        return new JAXBElement<EInstitutionType>(_DcRegisteredSubjectInfoInstitutionType_QNAME, EInstitutionType.class, DcRegisteredSubjectInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "EGN", scope = DcSubjectShortInfo.class)
    public JAXBElement<String> createDcSubjectShortInfoEGN(String value) {
        return new JAXBElement<String>(_DcSubjectShortInfoEGN_QNAME, String.class, DcSubjectShortInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "EIK", scope = DcSubjectShortInfo.class)
    public JAXBElement<String> createDcSubjectShortInfoEIK(String value) {
        return new JAXBElement<String>(_DcSubjectShortInfoEIK_QNAME, String.class, DcSubjectShortInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Name", scope = DcSubjectShortInfo.class)
    public JAXBElement<String> createDcSubjectShortInfoName(String value) {
        return new JAXBElement<String>(_DcSubjectShortInfoName_QNAME, String.class, DcSubjectShortInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Content", scope = DcTimeStampMessageContent.class)
    public JAXBElement<byte[]> createDcTimeStampMessageContentContent(byte[] value) {
        return new JAXBElement<byte[]>(_DcTimeStampMessageContentContent_QNAME, byte[].class, DcTimeStampMessageContent.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ContentType", scope = DcTimeStampMessageContent.class)
    public JAXBElement<String> createDcTimeStampMessageContentContentType(String value) {
        return new JAXBElement<String>(_DcTimeStampMessageContentContentType_QNAME, String.class, DcTimeStampMessageContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "FileName", scope = DcTimeStampMessageContent.class)
    public JAXBElement<String> createDcTimeStampMessageContentFileName(String value) {
        return new JAXBElement<String>(_DcTimeStampMessageContentFileName_QNAME, String.class, DcTimeStampMessageContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ElectronicSubjectName", scope = DcProfile.class)
    public JAXBElement<String> createDcProfileElectronicSubjectName(String value) {
        return new JAXBElement<String>(_DcProfileElectronicSubjectName_QNAME, String.class, DcProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Email", scope = DcProfile.class)
    public JAXBElement<String> createDcProfileEmail(String value) {
        return new JAXBElement<String>(_DcProfileEmail_QNAME, String.class, DcProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Phone", scope = DcProfile.class)
    public JAXBElement<String> createDcProfilePhone(String value) {
        return new JAXBElement<String>(_DcProfilePhone_QNAME, String.class, DcProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "CertificateThumbprint", scope = DcLogin.class)
    public JAXBElement<String> createDcLoginCertificateThumbprint(String value) {
        return new JAXBElement<String>(_DcLoginCertificateThumbprint_QNAME, String.class, DcLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ElectronicSubjectName", scope = DcLogin.class)
    public JAXBElement<String> createDcLoginElectronicSubjectName(String value) {
        return new JAXBElement<String>(_DcProfileElectronicSubjectName_QNAME, String.class, DcLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Email", scope = DcLogin.class)
    public JAXBElement<String> createDcLoginEmail(String value) {
        return new JAXBElement<String>(_DcProfileEmail_QNAME, String.class, DcLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "PhoneNumber", scope = DcLogin.class)
    public JAXBElement<String> createDcLoginPhoneNumber(String value) {
        return new JAXBElement<String>(_DcLoginPhoneNumber_QNAME, String.class, DcLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Profiles", scope = DcLogin.class)
    public JAXBElement<ArrayOfDcProfile> createDcLoginProfiles(ArrayOfDcProfile value) {
        return new JAXBElement<ArrayOfDcProfile>(_DcLoginProfiles_QNAME, ArrayOfDcProfile.class, DcLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "PushNotificationsUrl", scope = DcLogin.class)
    public JAXBElement<String> createDcLoginPushNotificationsUrl(String value) {
        return new JAXBElement<String>(_DcLoginPushNotificationsUrl_QNAME, String.class, DcLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DateReceived", scope = DcMessage.class)
    public JAXBElement<XMLGregorianCalendar> createDcMessageDateReceived(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DcMessageDateReceived_QNAME, XMLGregorianCalendar.class, DcMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DateSent", scope = DcMessage.class)
    public JAXBElement<XMLGregorianCalendar> createDcMessageDateSent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DcMessageDateSent_QNAME, XMLGregorianCalendar.class, DcMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ReceiverLogin", scope = DcMessage.class)
    public JAXBElement<DcLogin> createDcMessageReceiverLogin(DcLogin value) {
        return new JAXBElement<DcLogin>(_DcMessageReceiverLogin_QNAME, DcLogin.class, DcMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ReceiverProfile", scope = DcMessage.class)
    public JAXBElement<DcProfile> createDcMessageReceiverProfile(DcProfile value) {
        return new JAXBElement<DcProfile>(_DcMessageReceiverProfile_QNAME, DcProfile.class, DcMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "SenderLogin", scope = DcMessage.class)
    public JAXBElement<DcLogin> createDcMessageSenderLogin(DcLogin value) {
        return new JAXBElement<DcLogin>(_DcMessageSenderLogin_QNAME, DcLogin.class, DcMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "SenderProfile", scope = DcMessage.class)
    public JAXBElement<DcProfile> createDcMessageSenderProfile(DcProfile value) {
        return new JAXBElement<DcProfile>(_DcMessageSenderProfile_QNAME, DcProfile.class, DcMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Title", scope = DcMessage.class)
    public JAXBElement<String> createDcMessageTitle(String value) {
        return new JAXBElement<String>(_DcMessageTitle_QNAME, String.class, DcMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "FileName", scope = DcTimeStamp.class)
    public JAXBElement<String> createDcTimeStampFileName(String value) {
        return new JAXBElement<String>(_DcTimeStampMessageContentFileName_QNAME, String.class, DcTimeStamp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "TimeStampData", scope = DcTimeStamp.class)
    public JAXBElement<byte[]> createDcTimeStampTimeStampData(byte[] value) {
        return new JAXBElement<byte[]>(_DcTimeStampTimeStampData_QNAME, byte[].class, DcTimeStamp.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Subject", scope = DcChainCertificate.class)
    public JAXBElement<String> createDcChainCertificateSubject(String value) {
        return new JAXBElement<String>(_DcChainCertificateSubject_QNAME, String.class, DcChainCertificate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Content", scope = DcDocumentAdditional.class)
    public JAXBElement<byte[]> createDcDocumentAdditionalContent(byte[] value) {
        return new JAXBElement<byte[]>(_DcTimeStampMessageContentContent_QNAME, byte[].class, DcDocumentAdditional.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ContentEncodingCodePage", scope = DcDocumentAdditional.class)
    public JAXBElement<Integer> createDcDocumentAdditionalContentEncodingCodePage(Integer value) {
        return new JAXBElement<Integer>(_DcDocumentAdditionalContentEncodingCodePage_QNAME, Integer.class, DcDocumentAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ContentType", scope = DcDocumentAdditional.class)
    public JAXBElement<String> createDcDocumentAdditionalContentType(String value) {
        return new JAXBElement<String>(_DcTimeStampMessageContentContentType_QNAME, String.class, DcDocumentAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "CreatedBy", scope = DcDocumentAdditional.class)
    public JAXBElement<String> createDcDocumentAdditionalCreatedBy(String value) {
        return new JAXBElement<String>(_DcDocumentAdditionalCreatedBy_QNAME, String.class, DcDocumentAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DocumentDescription", scope = DcDocumentAdditional.class)
    public JAXBElement<String> createDcDocumentAdditionalDocumentDescription(String value) {
        return new JAXBElement<String>(_DcDocumentAdditionalDocumentDescription_QNAME, String.class, DcDocumentAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DocumentName", scope = DcDocumentAdditional.class)
    public JAXBElement<String> createDcDocumentAdditionalDocumentName(String value) {
        return new JAXBElement<String>(_DcDocumentAdditionalDocumentName_QNAME, String.class, DcDocumentAdditional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Identificator", scope = DcSubjectRegistrationInfo.class)
    public JAXBElement<String> createDcSubjectRegistrationInfoIdentificator(String value) {
        return new JAXBElement<String>(_DcSubjectRegistrationInfoIdentificator_QNAME, String.class, DcSubjectRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcRegisteredSubjectInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcRegisteredSubjectInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "SubjectInfo", scope = DcSubjectRegistrationInfo.class)
    public JAXBElement<DcRegisteredSubjectInfo> createDcSubjectRegistrationInfoSubjectInfo(DcRegisteredSubjectInfo value) {
        return new JAXBElement<DcRegisteredSubjectInfo>(_DcSubjectRegistrationInfoSubjectInfo_QNAME, DcRegisteredSubjectInfo.class, DcSubjectRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "EIK", scope = DcLegalPersonRegistrationInfo.class)
    public JAXBElement<String> createDcLegalPersonRegistrationInfoEIK(String value) {
        return new JAXBElement<String>(_DcSubjectShortInfoEIK_QNAME, String.class, DcLegalPersonRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Email", scope = DcLegalPersonRegistrationInfo.class)
    public JAXBElement<String> createDcLegalPersonRegistrationInfoEmail(String value) {
        return new JAXBElement<String>(_DcProfileEmail_QNAME, String.class, DcLegalPersonRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Name", scope = DcLegalPersonRegistrationInfo.class)
    public JAXBElement<String> createDcLegalPersonRegistrationInfoName(String value) {
        return new JAXBElement<String>(_DcSubjectShortInfoName_QNAME, String.class, DcLegalPersonRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Phone", scope = DcLegalPersonRegistrationInfo.class)
    public JAXBElement<String> createDcLegalPersonRegistrationInfoPhone(String value) {
        return new JAXBElement<String>(_DcProfilePhone_QNAME, String.class, DcLegalPersonRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ProfilesWithAccess", scope = DcLegalPersonRegistrationInfo.class)
    public JAXBElement<ArrayOfDcSubjectShortInfo> createDcLegalPersonRegistrationInfoProfilesWithAccess(ArrayOfDcSubjectShortInfo value) {
        return new JAXBElement<ArrayOfDcSubjectShortInfo>(_DcLegalPersonRegistrationInfoProfilesWithAccess_QNAME, ArrayOfDcSubjectShortInfo.class, DcLegalPersonRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSubjectShortInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "AccessibleProfiles", scope = DcPersonRegistrationInfo.class)
    public JAXBElement<ArrayOfDcSubjectShortInfo> createDcPersonRegistrationInfoAccessibleProfiles(ArrayOfDcSubjectShortInfo value) {
        return new JAXBElement<ArrayOfDcSubjectShortInfo>(_DcPersonRegistrationInfoAccessibleProfiles_QNAME, ArrayOfDcSubjectShortInfo.class, DcPersonRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Name", scope = DcPersonRegistrationInfo.class)
    public JAXBElement<String> createDcPersonRegistrationInfoName(String value) {
        return new JAXBElement<String>(_DcSubjectShortInfoName_QNAME, String.class, DcPersonRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "PersonIdentificator", scope = DcPersonRegistrationInfo.class)
    public JAXBElement<String> createDcPersonRegistrationInfoPersonIdentificator(String value) {
        return new JAXBElement<String>(_DcPersonRegistrationInfoPersonIdentificator_QNAME, String.class, DcPersonRegistrationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Items", scope = DcPartialListOfDcMessageHR29GRRX.class)
    public JAXBElement<ArrayOfDcMessage> createDcPartialListOfDcMessageHR29GRRXItems(ArrayOfDcMessage value) {
        return new JAXBElement<ArrayOfDcMessage>(_DcPartialListOfDcMessageHR29GRRXItems_QNAME, ArrayOfDcMessage.class, DcPartialListOfDcMessageHR29GRRX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "Content", scope = DcDocument.class)
    public JAXBElement<byte[]> createDcDocumentContent(byte[] value) {
        return new JAXBElement<byte[]>(_DcTimeStampMessageContentContent_QNAME, byte[].class, DcDocument.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ContentEncodingCodePage", scope = DcDocument.class)
    public JAXBElement<Integer> createDcDocumentContentEncodingCodePage(Integer value) {
        return new JAXBElement<Integer>(_DcDocumentAdditionalContentEncodingCodePage_QNAME, Integer.class, DcDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "ContentType", scope = DcDocument.class)
    public JAXBElement<String> createDcDocumentContentType(String value) {
        return new JAXBElement<String>(_DcTimeStampMessageContentContentType_QNAME, String.class, DcDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DocumentName", scope = DcDocument.class)
    public JAXBElement<String> createDcDocumentDocumentName(String value) {
        return new JAXBElement<String>(_DcDocumentAdditionalDocumentName_QNAME, String.class, DcDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "DocumentRegistrationNumber", scope = DcDocument.class)
    public JAXBElement<String> createDcDocumentDocumentRegistrationNumber(String value) {
        return new JAXBElement<String>(_DcDocumentDocumentRegistrationNumber_QNAME, String.class, DcDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSignatureValidationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcSignatureValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "SignaturesInfo", scope = DcDocument.class)
    public JAXBElement<ArrayOfDcSignatureValidationResult> createDcDocumentSignaturesInfo(ArrayOfDcSignatureValidationResult value) {
        return new JAXBElement<ArrayOfDcSignatureValidationResult>(_DcDocumentSignaturesInfo_QNAME, ArrayOfDcSignatureValidationResult.class, DcDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcTimeStamp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcTimeStamp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "TimeStamp", scope = DcDocument.class)
    public JAXBElement<DcTimeStamp> createDcDocumentTimeStamp(DcTimeStamp value) {
        return new JAXBElement<DcTimeStamp>(_DcDocumentTimeStamp_QNAME, DcTimeStamp.class, DcDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "AttachedDocuments", scope = DcMessageDetails.class)
    public JAXBElement<ArrayOfDcDocument> createDcMessageDetailsAttachedDocuments(ArrayOfDcDocument value) {
        return new JAXBElement<ArrayOfDcDocument>(_DcMessageDetailsAttachedDocuments_QNAME, ArrayOfDcDocument.class, DcMessageDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "MessageText", scope = DcMessageDetails.class)
    public JAXBElement<String> createDcMessageDetailsMessageText(String value) {
        return new JAXBElement<String>(_DcMessageDetailsMessageText_QNAME, String.class, DcMessageDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcTimeStampMessageContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcTimeStampMessageContent }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "TimeStampContent", scope = DcMessageDetails.class)
    public JAXBElement<DcTimeStampMessageContent> createDcMessageDetailsTimeStampContent(DcTimeStampMessageContent value) {
        return new JAXBElement<DcTimeStampMessageContent>(_DcMessageDetailsTimeStampContent_QNAME, DcTimeStampMessageContent.class, DcMessageDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcTimeStamp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcTimeStamp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "TimeStampNRD", scope = DcMessageDetails.class)
    public JAXBElement<DcTimeStamp> createDcMessageDetailsTimeStampNRD(DcTimeStamp value) {
        return new JAXBElement<DcTimeStamp>(_DcMessageDetailsTimeStampNRD_QNAME, DcTimeStamp.class, DcMessageDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcTimeStamp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcTimeStamp }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EDelivery.Common.DataContracts", name = "TimeStampNRO", scope = DcMessageDetails.class)
    public JAXBElement<DcTimeStamp> createDcMessageDetailsTimeStampNRO(DcTimeStamp value) {
        return new JAXBElement<DcTimeStamp>(_DcMessageDetailsTimeStampNRO_QNAME, DcTimeStamp.class, DcMessageDetails.class, value);
    }

}
