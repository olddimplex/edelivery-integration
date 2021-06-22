
package https.edelivery_egov_bg.services.integration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.edelivery_common.ArrayOfDcDocument;
import org.datacontract.schemas._2004._07.edelivery_common.ArrayOfDcMessage;
import org.datacontract.schemas._2004._07.edelivery_common.DcDocument;
import org.datacontract.schemas._2004._07.edelivery_common.DcLegalPersonRegistrationInfo;
import org.datacontract.schemas._2004._07.edelivery_common.DcMessageDetails;
import org.datacontract.schemas._2004._07.edelivery_common.DcPartialListOfDcMessageHR29GRRX;
import org.datacontract.schemas._2004._07.edelivery_common.DcPersonRegistrationInfo;
import org.datacontract.schemas._2004._07.edelivery_common.DcStatisticsGeneral;
import org.datacontract.schemas._2004._07.edelivery_common.DcSubjectRegistrationInfo;
import org.datacontract.schemas._2004._07.edelivery_common_datacontracts.ArrayOfDcInstitutionInfo;
import org.datacontract.schemas._2004._07.edelivery_common_datacontracts.DcMessageWithCodeReceiver;
import org.datacontract.schemas._2004._07.edelivery_common_datacontracts.DcSubjectInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.edelivery_egov_bg.services.integration package. 
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

    private final static QName _GetRegisteredInstitutionsResponseGetRegisteredInstitutionsResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetRegisteredInstitutionsResult");
    private final static QName _SendElectronicDocumentSubject_QNAME = new QName("https://edelivery.egov.bg/services/integration", "subject");
    private final static QName _SendElectronicDocumentDocBytes_QNAME = new QName("https://edelivery.egov.bg/services/integration", "docBytes");
    private final static QName _SendElectronicDocumentDocNameWithExtension_QNAME = new QName("https://edelivery.egov.bg/services/integration", "docNameWithExtension");
    private final static QName _SendElectronicDocumentDocRegNumber_QNAME = new QName("https://edelivery.egov.bg/services/integration", "docRegNumber");
    private final static QName _SendElectronicDocumentReceiverUniqueIdentifier_QNAME = new QName("https://edelivery.egov.bg/services/integration", "receiverUniqueIdentifier");
    private final static QName _SendElectronicDocumentReceiverPhone_QNAME = new QName("https://edelivery.egov.bg/services/integration", "receiverPhone");
    private final static QName _SendElectronicDocumentReceiverEmail_QNAME = new QName("https://edelivery.egov.bg/services/integration", "receiverEmail");
    private final static QName _SendElectronicDocumentServiceOID_QNAME = new QName("https://edelivery.egov.bg/services/integration", "serviceOID");
    private final static QName _SendElectronicDocumentOperatorEGN_QNAME = new QName("https://edelivery.egov.bg/services/integration", "operatorEGN");
    private final static QName _SendElectronicDocumentWithAccessCodeReceiver_QNAME = new QName("https://edelivery.egov.bg/services/integration", "receiver");
    private final static QName _SendElectronicDocumentOnBehalfOfSenderUniqueIdentifier_QNAME = new QName("https://edelivery.egov.bg/services/integration", "senderUniqueIdentifier");
    private final static QName _SendElectronicDocumentOnBehalfOfSenderPhone_QNAME = new QName("https://edelivery.egov.bg/services/integration", "senderPhone");
    private final static QName _SendElectronicDocumentOnBehalfOfSenderEmail_QNAME = new QName("https://edelivery.egov.bg/services/integration", "senderEmail");
    private final static QName _SendElectronicDocumentOnBehalfOfSenderFirstName_QNAME = new QName("https://edelivery.egov.bg/services/integration", "senderFirstName");
    private final static QName _SendElectronicDocumentOnBehalfOfSenderLastName_QNAME = new QName("https://edelivery.egov.bg/services/integration", "senderLastName");
    private final static QName _SendMessageMessage_QNAME = new QName("https://edelivery.egov.bg/services/integration", "message");
    private final static QName _GetSentDocumentStatusByRegNumDocumentRegistrationNumber_QNAME = new QName("https://edelivery.egov.bg/services/integration", "documentRegistrationNumber");
    private final static QName _GetSentDocumentStatusByRegNumResponseGetSentDocumentStatusByRegNumResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSentDocumentStatusByRegNumResult");
    private final static QName _GetSentDocumentContentByRegNumResponseGetSentDocumentContentByRegNumResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSentDocumentContentByRegNumResult");
    private final static QName _GetSentDocumentsContentResponseGetSentDocumentsContentResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSentDocumentsContentResult");
    private final static QName _GetSentDocumentContentResponseGetSentDocumentContentResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSentDocumentContentResult");
    private final static QName _GetSentMessageStatusResponseGetSentMessageStatusResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSentMessageStatusResult");
    private final static QName _GetSentMessagesListResponseGetSentMessagesListResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSentMessagesListResult");
    private final static QName _GetSentMessagesListPagedResponseGetSentMessagesListPagedResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSentMessagesListPagedResult");
    private final static QName _GetReceivedMessagesListResponseGetReceivedMessagesListResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetReceivedMessagesListResult");
    private final static QName _GetReceivedMessagesListPagedResponseGetReceivedMessagesListPagedResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetReceivedMessagesListPagedResult");
    private final static QName _GetSentMessageContentResponseGetSentMessageContentResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSentMessageContentResult");
    private final static QName _GetReceivedMessageContentResponseGetReceivedMessageContentResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetReceivedMessageContentResult");
    private final static QName _CheckPersonHasRegistrationPersonId_QNAME = new QName("https://edelivery.egov.bg/services/integration", "personId");
    private final static QName _CheckPersonHasRegistrationResponseCheckPersonHasRegistrationResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "CheckPersonHasRegistrationResult");
    private final static QName _CheckLegalPersonHasRegistrationEik_QNAME = new QName("https://edelivery.egov.bg/services/integration", "eik");
    private final static QName _CheckLegalPersonHasRegistrationResponseCheckLegalPersonHasRegistrationResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "CheckLegalPersonHasRegistrationResult");
    private final static QName _CheckSubjectHasRegistrationIdentificator_QNAME = new QName("https://edelivery.egov.bg/services/integration", "identificator");
    private final static QName _CheckSubjectHasRegistrationResponseCheckSubjectHasRegistrationResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "CheckSubjectHasRegistrationResult");
    private final static QName _GetSubjectInfoResponseGetSubjectInfoResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetSubjectInfoResult");
    private final static QName _GetEDeliveryGeneralStatisticsResponseGetEDeliveryGeneralStatisticsResult_QNAME = new QName("https://edelivery.egov.bg/services/integration", "GetEDeliveryGeneralStatisticsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.edelivery_egov_bg.services.integration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRegisteredInstitutions }
     * 
     */
    public GetRegisteredInstitutions createGetRegisteredInstitutions() {
        return new GetRegisteredInstitutions();
    }

    /**
     * Create an instance of {@link GetRegisteredInstitutionsResponse }
     * 
     */
    public GetRegisteredInstitutionsResponse createGetRegisteredInstitutionsResponse() {
        return new GetRegisteredInstitutionsResponse();
    }

    /**
     * Create an instance of {@link SendElectronicDocument }
     * 
     */
    public SendElectronicDocument createSendElectronicDocument() {
        return new SendElectronicDocument();
    }

    /**
     * Create an instance of {@link SendElectronicDocumentResponse }
     * 
     */
    public SendElectronicDocumentResponse createSendElectronicDocumentResponse() {
        return new SendElectronicDocumentResponse();
    }

    /**
     * Create an instance of {@link SendElectronicDocumentWithAccessCode }
     * 
     */
    public SendElectronicDocumentWithAccessCode createSendElectronicDocumentWithAccessCode() {
        return new SendElectronicDocumentWithAccessCode();
    }

    /**
     * Create an instance of {@link SendElectronicDocumentWithAccessCodeResponse }
     * 
     */
    public SendElectronicDocumentWithAccessCodeResponse createSendElectronicDocumentWithAccessCodeResponse() {
        return new SendElectronicDocumentWithAccessCodeResponse();
    }

    /**
     * Create an instance of {@link SendElectronicDocumentOnBehalfOf }
     * 
     */
    public SendElectronicDocumentOnBehalfOf createSendElectronicDocumentOnBehalfOf() {
        return new SendElectronicDocumentOnBehalfOf();
    }

    /**
     * Create an instance of {@link SendElectronicDocumentOnBehalfOfResponse }
     * 
     */
    public SendElectronicDocumentOnBehalfOfResponse createSendElectronicDocumentOnBehalfOfResponse() {
        return new SendElectronicDocumentOnBehalfOfResponse();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link SendMessageWithAccessCode }
     * 
     */
    public SendMessageWithAccessCode createSendMessageWithAccessCode() {
        return new SendMessageWithAccessCode();
    }

    /**
     * Create an instance of {@link SendMessageWithAccessCodeResponse }
     * 
     */
    public SendMessageWithAccessCodeResponse createSendMessageWithAccessCodeResponse() {
        return new SendMessageWithAccessCodeResponse();
    }

    /**
     * Create an instance of {@link SendMessageInReplyTo }
     * 
     */
    public SendMessageInReplyTo createSendMessageInReplyTo() {
        return new SendMessageInReplyTo();
    }

    /**
     * Create an instance of {@link SendMessageInReplyToResponse }
     * 
     */
    public SendMessageInReplyToResponse createSendMessageInReplyToResponse() {
        return new SendMessageInReplyToResponse();
    }

    /**
     * Create an instance of {@link SendMessageOnBehalfOf }
     * 
     */
    public SendMessageOnBehalfOf createSendMessageOnBehalfOf() {
        return new SendMessageOnBehalfOf();
    }

    /**
     * Create an instance of {@link SendMessageOnBehalfOfResponse }
     * 
     */
    public SendMessageOnBehalfOfResponse createSendMessageOnBehalfOfResponse() {
        return new SendMessageOnBehalfOfResponse();
    }

    /**
     * Create an instance of {@link GetSentDocumentStatusByRegNum }
     * 
     */
    public GetSentDocumentStatusByRegNum createGetSentDocumentStatusByRegNum() {
        return new GetSentDocumentStatusByRegNum();
    }

    /**
     * Create an instance of {@link GetSentDocumentStatusByRegNumResponse }
     * 
     */
    public GetSentDocumentStatusByRegNumResponse createGetSentDocumentStatusByRegNumResponse() {
        return new GetSentDocumentStatusByRegNumResponse();
    }

    /**
     * Create an instance of {@link GetSentDocumentContentByRegNum }
     * 
     */
    public GetSentDocumentContentByRegNum createGetSentDocumentContentByRegNum() {
        return new GetSentDocumentContentByRegNum();
    }

    /**
     * Create an instance of {@link GetSentDocumentContentByRegNumResponse }
     * 
     */
    public GetSentDocumentContentByRegNumResponse createGetSentDocumentContentByRegNumResponse() {
        return new GetSentDocumentContentByRegNumResponse();
    }

    /**
     * Create an instance of {@link GetSentDocumentsContent }
     * 
     */
    public GetSentDocumentsContent createGetSentDocumentsContent() {
        return new GetSentDocumentsContent();
    }

    /**
     * Create an instance of {@link GetSentDocumentsContentResponse }
     * 
     */
    public GetSentDocumentsContentResponse createGetSentDocumentsContentResponse() {
        return new GetSentDocumentsContentResponse();
    }

    /**
     * Create an instance of {@link GetSentDocumentContent }
     * 
     */
    public GetSentDocumentContent createGetSentDocumentContent() {
        return new GetSentDocumentContent();
    }

    /**
     * Create an instance of {@link GetSentDocumentContentResponse }
     * 
     */
    public GetSentDocumentContentResponse createGetSentDocumentContentResponse() {
        return new GetSentDocumentContentResponse();
    }

    /**
     * Create an instance of {@link GetSentMessageStatus }
     * 
     */
    public GetSentMessageStatus createGetSentMessageStatus() {
        return new GetSentMessageStatus();
    }

    /**
     * Create an instance of {@link GetSentMessageStatusResponse }
     * 
     */
    public GetSentMessageStatusResponse createGetSentMessageStatusResponse() {
        return new GetSentMessageStatusResponse();
    }

    /**
     * Create an instance of {@link GetSentMessagesList }
     * 
     */
    public GetSentMessagesList createGetSentMessagesList() {
        return new GetSentMessagesList();
    }

    /**
     * Create an instance of {@link GetSentMessagesListResponse }
     * 
     */
    public GetSentMessagesListResponse createGetSentMessagesListResponse() {
        return new GetSentMessagesListResponse();
    }

    /**
     * Create an instance of {@link GetSentMessagesListPaged }
     * 
     */
    public GetSentMessagesListPaged createGetSentMessagesListPaged() {
        return new GetSentMessagesListPaged();
    }

    /**
     * Create an instance of {@link GetSentMessagesListPagedResponse }
     * 
     */
    public GetSentMessagesListPagedResponse createGetSentMessagesListPagedResponse() {
        return new GetSentMessagesListPagedResponse();
    }

    /**
     * Create an instance of {@link GetReceivedMessagesList }
     * 
     */
    public GetReceivedMessagesList createGetReceivedMessagesList() {
        return new GetReceivedMessagesList();
    }

    /**
     * Create an instance of {@link GetReceivedMessagesListResponse }
     * 
     */
    public GetReceivedMessagesListResponse createGetReceivedMessagesListResponse() {
        return new GetReceivedMessagesListResponse();
    }

    /**
     * Create an instance of {@link GetReceivedMessagesListPaged }
     * 
     */
    public GetReceivedMessagesListPaged createGetReceivedMessagesListPaged() {
        return new GetReceivedMessagesListPaged();
    }

    /**
     * Create an instance of {@link GetReceivedMessagesListPagedResponse }
     * 
     */
    public GetReceivedMessagesListPagedResponse createGetReceivedMessagesListPagedResponse() {
        return new GetReceivedMessagesListPagedResponse();
    }

    /**
     * Create an instance of {@link GetSentMessageContent }
     * 
     */
    public GetSentMessageContent createGetSentMessageContent() {
        return new GetSentMessageContent();
    }

    /**
     * Create an instance of {@link GetSentMessageContentResponse }
     * 
     */
    public GetSentMessageContentResponse createGetSentMessageContentResponse() {
        return new GetSentMessageContentResponse();
    }

    /**
     * Create an instance of {@link GetReceivedMessageContent }
     * 
     */
    public GetReceivedMessageContent createGetReceivedMessageContent() {
        return new GetReceivedMessageContent();
    }

    /**
     * Create an instance of {@link GetReceivedMessageContentResponse }
     * 
     */
    public GetReceivedMessageContentResponse createGetReceivedMessageContentResponse() {
        return new GetReceivedMessageContentResponse();
    }

    /**
     * Create an instance of {@link CheckPersonHasRegistration }
     * 
     */
    public CheckPersonHasRegistration createCheckPersonHasRegistration() {
        return new CheckPersonHasRegistration();
    }

    /**
     * Create an instance of {@link CheckPersonHasRegistrationResponse }
     * 
     */
    public CheckPersonHasRegistrationResponse createCheckPersonHasRegistrationResponse() {
        return new CheckPersonHasRegistrationResponse();
    }

    /**
     * Create an instance of {@link CheckLegalPersonHasRegistration }
     * 
     */
    public CheckLegalPersonHasRegistration createCheckLegalPersonHasRegistration() {
        return new CheckLegalPersonHasRegistration();
    }

    /**
     * Create an instance of {@link CheckLegalPersonHasRegistrationResponse }
     * 
     */
    public CheckLegalPersonHasRegistrationResponse createCheckLegalPersonHasRegistrationResponse() {
        return new CheckLegalPersonHasRegistrationResponse();
    }

    /**
     * Create an instance of {@link CheckSubjectHasRegistration }
     * 
     */
    public CheckSubjectHasRegistration createCheckSubjectHasRegistration() {
        return new CheckSubjectHasRegistration();
    }

    /**
     * Create an instance of {@link CheckSubjectHasRegistrationResponse }
     * 
     */
    public CheckSubjectHasRegistrationResponse createCheckSubjectHasRegistrationResponse() {
        return new CheckSubjectHasRegistrationResponse();
    }

    /**
     * Create an instance of {@link GetSubjectInfo }
     * 
     */
    public GetSubjectInfo createGetSubjectInfo() {
        return new GetSubjectInfo();
    }

    /**
     * Create an instance of {@link GetSubjectInfoResponse }
     * 
     */
    public GetSubjectInfoResponse createGetSubjectInfoResponse() {
        return new GetSubjectInfoResponse();
    }

    /**
     * Create an instance of {@link GetEDeliveryGeneralStatistics }
     * 
     */
    public GetEDeliveryGeneralStatistics createGetEDeliveryGeneralStatistics() {
        return new GetEDeliveryGeneralStatistics();
    }

    /**
     * Create an instance of {@link GetEDeliveryGeneralStatisticsResponse }
     * 
     */
    public GetEDeliveryGeneralStatisticsResponse createGetEDeliveryGeneralStatisticsResponse() {
        return new GetEDeliveryGeneralStatisticsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcInstitutionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcInstitutionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetRegisteredInstitutionsResult", scope = GetRegisteredInstitutionsResponse.class)
    public JAXBElement<ArrayOfDcInstitutionInfo> createGetRegisteredInstitutionsResponseGetRegisteredInstitutionsResult(ArrayOfDcInstitutionInfo value) {
        return new JAXBElement<ArrayOfDcInstitutionInfo>(_GetRegisteredInstitutionsResponseGetRegisteredInstitutionsResult_QNAME, ArrayOfDcInstitutionInfo.class, GetRegisteredInstitutionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "subject", scope = SendElectronicDocument.class)
    public JAXBElement<String> createSendElectronicDocumentSubject(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentSubject_QNAME, String.class, SendElectronicDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docBytes", scope = SendElectronicDocument.class)
    public JAXBElement<byte[]> createSendElectronicDocumentDocBytes(byte[] value) {
        return new JAXBElement<byte[]>(_SendElectronicDocumentDocBytes_QNAME, byte[].class, SendElectronicDocument.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docNameWithExtension", scope = SendElectronicDocument.class)
    public JAXBElement<String> createSendElectronicDocumentDocNameWithExtension(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentDocNameWithExtension_QNAME, String.class, SendElectronicDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docRegNumber", scope = SendElectronicDocument.class)
    public JAXBElement<String> createSendElectronicDocumentDocRegNumber(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentDocRegNumber_QNAME, String.class, SendElectronicDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiverUniqueIdentifier", scope = SendElectronicDocument.class)
    public JAXBElement<String> createSendElectronicDocumentReceiverUniqueIdentifier(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentReceiverUniqueIdentifier_QNAME, String.class, SendElectronicDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiverPhone", scope = SendElectronicDocument.class)
    public JAXBElement<String> createSendElectronicDocumentReceiverPhone(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentReceiverPhone_QNAME, String.class, SendElectronicDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiverEmail", scope = SendElectronicDocument.class)
    public JAXBElement<String> createSendElectronicDocumentReceiverEmail(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentReceiverEmail_QNAME, String.class, SendElectronicDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "serviceOID", scope = SendElectronicDocument.class)
    public JAXBElement<String> createSendElectronicDocumentServiceOID(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentServiceOID_QNAME, String.class, SendElectronicDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = SendElectronicDocument.class)
    public JAXBElement<String> createSendElectronicDocumentOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, SendElectronicDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "subject", scope = SendElectronicDocumentWithAccessCode.class)
    public JAXBElement<String> createSendElectronicDocumentWithAccessCodeSubject(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentSubject_QNAME, String.class, SendElectronicDocumentWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docBytes", scope = SendElectronicDocumentWithAccessCode.class)
    public JAXBElement<byte[]> createSendElectronicDocumentWithAccessCodeDocBytes(byte[] value) {
        return new JAXBElement<byte[]>(_SendElectronicDocumentDocBytes_QNAME, byte[].class, SendElectronicDocumentWithAccessCode.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docNameWithExtension", scope = SendElectronicDocumentWithAccessCode.class)
    public JAXBElement<String> createSendElectronicDocumentWithAccessCodeDocNameWithExtension(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentDocNameWithExtension_QNAME, String.class, SendElectronicDocumentWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docRegNumber", scope = SendElectronicDocumentWithAccessCode.class)
    public JAXBElement<String> createSendElectronicDocumentWithAccessCodeDocRegNumber(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentDocRegNumber_QNAME, String.class, SendElectronicDocumentWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageWithCodeReceiver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageWithCodeReceiver }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiver", scope = SendElectronicDocumentWithAccessCode.class)
    public JAXBElement<DcMessageWithCodeReceiver> createSendElectronicDocumentWithAccessCodeReceiver(DcMessageWithCodeReceiver value) {
        return new JAXBElement<DcMessageWithCodeReceiver>(_SendElectronicDocumentWithAccessCodeReceiver_QNAME, DcMessageWithCodeReceiver.class, SendElectronicDocumentWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "serviceOID", scope = SendElectronicDocumentWithAccessCode.class)
    public JAXBElement<String> createSendElectronicDocumentWithAccessCodeServiceOID(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentServiceOID_QNAME, String.class, SendElectronicDocumentWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = SendElectronicDocumentWithAccessCode.class)
    public JAXBElement<String> createSendElectronicDocumentWithAccessCodeOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, SendElectronicDocumentWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "subject", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfSubject(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentSubject_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docBytes", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<byte[]> createSendElectronicDocumentOnBehalfOfDocBytes(byte[] value) {
        return new JAXBElement<byte[]>(_SendElectronicDocumentDocBytes_QNAME, byte[].class, SendElectronicDocumentOnBehalfOf.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docNameWithExtension", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfDocNameWithExtension(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentDocNameWithExtension_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "docRegNumber", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfDocRegNumber(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentDocRegNumber_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderUniqueIdentifier", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfSenderUniqueIdentifier(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderUniqueIdentifier_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderPhone", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfSenderPhone(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderPhone_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderEmail", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfSenderEmail(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderEmail_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderFirstName", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfSenderFirstName(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderFirstName_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderLastName", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfSenderLastName(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderLastName_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiverUniqueIdentifier", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfReceiverUniqueIdentifier(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentReceiverUniqueIdentifier_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "serviceOID", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfServiceOID(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentServiceOID_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = SendElectronicDocumentOnBehalfOf.class)
    public JAXBElement<String> createSendElectronicDocumentOnBehalfOfOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, SendElectronicDocumentOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "message", scope = SendMessage.class)
    public JAXBElement<DcMessageDetails> createSendMessageMessage(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_SendMessageMessage_QNAME, DcMessageDetails.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiverUniqueIdentifier", scope = SendMessage.class)
    public JAXBElement<String> createSendMessageReceiverUniqueIdentifier(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentReceiverUniqueIdentifier_QNAME, String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiverPhone", scope = SendMessage.class)
    public JAXBElement<String> createSendMessageReceiverPhone(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentReceiverPhone_QNAME, String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiverEmail", scope = SendMessage.class)
    public JAXBElement<String> createSendMessageReceiverEmail(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentReceiverEmail_QNAME, String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "serviceOID", scope = SendMessage.class)
    public JAXBElement<String> createSendMessageServiceOID(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentServiceOID_QNAME, String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = SendMessage.class)
    public JAXBElement<String> createSendMessageOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "message", scope = SendMessageWithAccessCode.class)
    public JAXBElement<DcMessageDetails> createSendMessageWithAccessCodeMessage(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_SendMessageMessage_QNAME, DcMessageDetails.class, SendMessageWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageWithCodeReceiver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageWithCodeReceiver }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiver", scope = SendMessageWithAccessCode.class)
    public JAXBElement<DcMessageWithCodeReceiver> createSendMessageWithAccessCodeReceiver(DcMessageWithCodeReceiver value) {
        return new JAXBElement<DcMessageWithCodeReceiver>(_SendElectronicDocumentWithAccessCodeReceiver_QNAME, DcMessageWithCodeReceiver.class, SendMessageWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "serviceOID", scope = SendMessageWithAccessCode.class)
    public JAXBElement<String> createSendMessageWithAccessCodeServiceOID(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentServiceOID_QNAME, String.class, SendMessageWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = SendMessageWithAccessCode.class)
    public JAXBElement<String> createSendMessageWithAccessCodeOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, SendMessageWithAccessCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "message", scope = SendMessageInReplyTo.class)
    public JAXBElement<DcMessageDetails> createSendMessageInReplyToMessage(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_SendMessageMessage_QNAME, DcMessageDetails.class, SendMessageInReplyTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "serviceOID", scope = SendMessageInReplyTo.class)
    public JAXBElement<String> createSendMessageInReplyToServiceOID(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentServiceOID_QNAME, String.class, SendMessageInReplyTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = SendMessageInReplyTo.class)
    public JAXBElement<String> createSendMessageInReplyToOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, SendMessageInReplyTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "message", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<DcMessageDetails> createSendMessageOnBehalfOfMessage(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_SendMessageMessage_QNAME, DcMessageDetails.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderUniqueIdentifier", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<String> createSendMessageOnBehalfOfSenderUniqueIdentifier(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderUniqueIdentifier_QNAME, String.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderPhone", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<String> createSendMessageOnBehalfOfSenderPhone(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderPhone_QNAME, String.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderEmail", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<String> createSendMessageOnBehalfOfSenderEmail(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderEmail_QNAME, String.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderFirstName", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<String> createSendMessageOnBehalfOfSenderFirstName(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderFirstName_QNAME, String.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "senderLastName", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<String> createSendMessageOnBehalfOfSenderLastName(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOnBehalfOfSenderLastName_QNAME, String.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "receiverUniqueIdentifier", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<String> createSendMessageOnBehalfOfReceiverUniqueIdentifier(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentReceiverUniqueIdentifier_QNAME, String.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "serviceOID", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<String> createSendMessageOnBehalfOfServiceOID(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentServiceOID_QNAME, String.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = SendMessageOnBehalfOf.class)
    public JAXBElement<String> createSendMessageOnBehalfOfOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, SendMessageOnBehalfOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "documentRegistrationNumber", scope = GetSentDocumentStatusByRegNum.class)
    public JAXBElement<String> createGetSentDocumentStatusByRegNumDocumentRegistrationNumber(String value) {
        return new JAXBElement<String>(_GetSentDocumentStatusByRegNumDocumentRegistrationNumber_QNAME, String.class, GetSentDocumentStatusByRegNum.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSentDocumentStatusByRegNum.class)
    public JAXBElement<String> createGetSentDocumentStatusByRegNumOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSentDocumentStatusByRegNum.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSentDocumentStatusByRegNumResult", scope = GetSentDocumentStatusByRegNumResponse.class)
    public JAXBElement<DcMessageDetails> createGetSentDocumentStatusByRegNumResponseGetSentDocumentStatusByRegNumResult(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_GetSentDocumentStatusByRegNumResponseGetSentDocumentStatusByRegNumResult_QNAME, DcMessageDetails.class, GetSentDocumentStatusByRegNumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "documentRegistrationNumber", scope = GetSentDocumentContentByRegNum.class)
    public JAXBElement<String> createGetSentDocumentContentByRegNumDocumentRegistrationNumber(String value) {
        return new JAXBElement<String>(_GetSentDocumentStatusByRegNumDocumentRegistrationNumber_QNAME, String.class, GetSentDocumentContentByRegNum.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSentDocumentContentByRegNum.class)
    public JAXBElement<String> createGetSentDocumentContentByRegNumOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSentDocumentContentByRegNum.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcDocument }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSentDocumentContentByRegNumResult", scope = GetSentDocumentContentByRegNumResponse.class)
    public JAXBElement<DcDocument> createGetSentDocumentContentByRegNumResponseGetSentDocumentContentByRegNumResult(DcDocument value) {
        return new JAXBElement<DcDocument>(_GetSentDocumentContentByRegNumResponseGetSentDocumentContentByRegNumResult_QNAME, DcDocument.class, GetSentDocumentContentByRegNumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSentDocumentsContent.class)
    public JAXBElement<String> createGetSentDocumentsContentOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSentDocumentsContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcDocument }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSentDocumentsContentResult", scope = GetSentDocumentsContentResponse.class)
    public JAXBElement<ArrayOfDcDocument> createGetSentDocumentsContentResponseGetSentDocumentsContentResult(ArrayOfDcDocument value) {
        return new JAXBElement<ArrayOfDcDocument>(_GetSentDocumentsContentResponseGetSentDocumentsContentResult_QNAME, ArrayOfDcDocument.class, GetSentDocumentsContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSentDocumentContent.class)
    public JAXBElement<String> createGetSentDocumentContentOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSentDocumentContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcDocument }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSentDocumentContentResult", scope = GetSentDocumentContentResponse.class)
    public JAXBElement<DcDocument> createGetSentDocumentContentResponseGetSentDocumentContentResult(DcDocument value) {
        return new JAXBElement<DcDocument>(_GetSentDocumentContentResponseGetSentDocumentContentResult_QNAME, DcDocument.class, GetSentDocumentContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSentMessageStatus.class)
    public JAXBElement<String> createGetSentMessageStatusOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSentMessageStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSentMessageStatusResult", scope = GetSentMessageStatusResponse.class)
    public JAXBElement<DcMessageDetails> createGetSentMessageStatusResponseGetSentMessageStatusResult(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_GetSentMessageStatusResponseGetSentMessageStatusResult_QNAME, DcMessageDetails.class, GetSentMessageStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSentMessagesList.class)
    public JAXBElement<String> createGetSentMessagesListOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSentMessagesList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcMessage }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSentMessagesListResult", scope = GetSentMessagesListResponse.class)
    public JAXBElement<ArrayOfDcMessage> createGetSentMessagesListResponseGetSentMessagesListResult(ArrayOfDcMessage value) {
        return new JAXBElement<ArrayOfDcMessage>(_GetSentMessagesListResponseGetSentMessagesListResult_QNAME, ArrayOfDcMessage.class, GetSentMessagesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSentMessagesListPaged.class)
    public JAXBElement<String> createGetSentMessagesListPagedOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSentMessagesListPaged.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcPartialListOfDcMessageHR29GRRX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcPartialListOfDcMessageHR29GRRX }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSentMessagesListPagedResult", scope = GetSentMessagesListPagedResponse.class)
    public JAXBElement<DcPartialListOfDcMessageHR29GRRX> createGetSentMessagesListPagedResponseGetSentMessagesListPagedResult(DcPartialListOfDcMessageHR29GRRX value) {
        return new JAXBElement<DcPartialListOfDcMessageHR29GRRX>(_GetSentMessagesListPagedResponseGetSentMessagesListPagedResult_QNAME, DcPartialListOfDcMessageHR29GRRX.class, GetSentMessagesListPagedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetReceivedMessagesList.class)
    public JAXBElement<String> createGetReceivedMessagesListOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetReceivedMessagesList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDcMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDcMessage }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetReceivedMessagesListResult", scope = GetReceivedMessagesListResponse.class)
    public JAXBElement<ArrayOfDcMessage> createGetReceivedMessagesListResponseGetReceivedMessagesListResult(ArrayOfDcMessage value) {
        return new JAXBElement<ArrayOfDcMessage>(_GetReceivedMessagesListResponseGetReceivedMessagesListResult_QNAME, ArrayOfDcMessage.class, GetReceivedMessagesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetReceivedMessagesListPaged.class)
    public JAXBElement<String> createGetReceivedMessagesListPagedOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetReceivedMessagesListPaged.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcPartialListOfDcMessageHR29GRRX }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcPartialListOfDcMessageHR29GRRX }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetReceivedMessagesListPagedResult", scope = GetReceivedMessagesListPagedResponse.class)
    public JAXBElement<DcPartialListOfDcMessageHR29GRRX> createGetReceivedMessagesListPagedResponseGetReceivedMessagesListPagedResult(DcPartialListOfDcMessageHR29GRRX value) {
        return new JAXBElement<DcPartialListOfDcMessageHR29GRRX>(_GetReceivedMessagesListPagedResponseGetReceivedMessagesListPagedResult_QNAME, DcPartialListOfDcMessageHR29GRRX.class, GetReceivedMessagesListPagedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSentMessageContent.class)
    public JAXBElement<String> createGetSentMessageContentOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSentMessageContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSentMessageContentResult", scope = GetSentMessageContentResponse.class)
    public JAXBElement<DcMessageDetails> createGetSentMessageContentResponseGetSentMessageContentResult(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_GetSentMessageContentResponseGetSentMessageContentResult_QNAME, DcMessageDetails.class, GetSentMessageContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetReceivedMessageContent.class)
    public JAXBElement<String> createGetReceivedMessageContentOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetReceivedMessageContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcMessageDetails }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetReceivedMessageContentResult", scope = GetReceivedMessageContentResponse.class)
    public JAXBElement<DcMessageDetails> createGetReceivedMessageContentResponseGetReceivedMessageContentResult(DcMessageDetails value) {
        return new JAXBElement<DcMessageDetails>(_GetReceivedMessageContentResponseGetReceivedMessageContentResult_QNAME, DcMessageDetails.class, GetReceivedMessageContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "personId", scope = CheckPersonHasRegistration.class)
    public JAXBElement<String> createCheckPersonHasRegistrationPersonId(String value) {
        return new JAXBElement<String>(_CheckPersonHasRegistrationPersonId_QNAME, String.class, CheckPersonHasRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcPersonRegistrationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcPersonRegistrationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "CheckPersonHasRegistrationResult", scope = CheckPersonHasRegistrationResponse.class)
    public JAXBElement<DcPersonRegistrationInfo> createCheckPersonHasRegistrationResponseCheckPersonHasRegistrationResult(DcPersonRegistrationInfo value) {
        return new JAXBElement<DcPersonRegistrationInfo>(_CheckPersonHasRegistrationResponseCheckPersonHasRegistrationResult_QNAME, DcPersonRegistrationInfo.class, CheckPersonHasRegistrationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "eik", scope = CheckLegalPersonHasRegistration.class)
    public JAXBElement<String> createCheckLegalPersonHasRegistrationEik(String value) {
        return new JAXBElement<String>(_CheckLegalPersonHasRegistrationEik_QNAME, String.class, CheckLegalPersonHasRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcLegalPersonRegistrationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcLegalPersonRegistrationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "CheckLegalPersonHasRegistrationResult", scope = CheckLegalPersonHasRegistrationResponse.class)
    public JAXBElement<DcLegalPersonRegistrationInfo> createCheckLegalPersonHasRegistrationResponseCheckLegalPersonHasRegistrationResult(DcLegalPersonRegistrationInfo value) {
        return new JAXBElement<DcLegalPersonRegistrationInfo>(_CheckLegalPersonHasRegistrationResponseCheckLegalPersonHasRegistrationResult_QNAME, DcLegalPersonRegistrationInfo.class, CheckLegalPersonHasRegistrationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "identificator", scope = CheckSubjectHasRegistration.class)
    public JAXBElement<String> createCheckSubjectHasRegistrationIdentificator(String value) {
        return new JAXBElement<String>(_CheckSubjectHasRegistrationIdentificator_QNAME, String.class, CheckSubjectHasRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcSubjectRegistrationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcSubjectRegistrationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "CheckSubjectHasRegistrationResult", scope = CheckSubjectHasRegistrationResponse.class)
    public JAXBElement<DcSubjectRegistrationInfo> createCheckSubjectHasRegistrationResponseCheckSubjectHasRegistrationResult(DcSubjectRegistrationInfo value) {
        return new JAXBElement<DcSubjectRegistrationInfo>(_CheckSubjectHasRegistrationResponseCheckSubjectHasRegistrationResult_QNAME, DcSubjectRegistrationInfo.class, CheckSubjectHasRegistrationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "operatorEGN", scope = GetSubjectInfo.class)
    public JAXBElement<String> createGetSubjectInfoOperatorEGN(String value) {
        return new JAXBElement<String>(_SendElectronicDocumentOperatorEGN_QNAME, String.class, GetSubjectInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcSubjectInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcSubjectInfo }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetSubjectInfoResult", scope = GetSubjectInfoResponse.class)
    public JAXBElement<DcSubjectInfo> createGetSubjectInfoResponseGetSubjectInfoResult(DcSubjectInfo value) {
        return new JAXBElement<DcSubjectInfo>(_GetSubjectInfoResponseGetSubjectInfoResult_QNAME, DcSubjectInfo.class, GetSubjectInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DcStatisticsGeneral }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DcStatisticsGeneral }{@code >}
     */
    @XmlElementDecl(namespace = "https://edelivery.egov.bg/services/integration", name = "GetEDeliveryGeneralStatisticsResult", scope = GetEDeliveryGeneralStatisticsResponse.class)
    public JAXBElement<DcStatisticsGeneral> createGetEDeliveryGeneralStatisticsResponseGetEDeliveryGeneralStatisticsResult(DcStatisticsGeneral value) {
        return new JAXBElement<DcStatisticsGeneral>(_GetEDeliveryGeneralStatisticsResponseGetEDeliveryGeneralStatisticsResult_QNAME, DcStatisticsGeneral.class, GetEDeliveryGeneralStatisticsResponse.class, value);
    }

}
