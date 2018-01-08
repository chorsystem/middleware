
package org.apache.ode.pmapi.types._2006._08._02;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.ode.pmapi.types._2006._08._02 package. 
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

    private final static QName _SnapshotVersion_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "snapshot-version");
    private final static QName _VariableRefList_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "variable-ref-list");
    private final static QName _PartnerLinkRefList_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "partnerLink-ref-list");
    private final static QName _ScopeInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "scope-info");
    private final static QName _ActivityExtInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-ext-info");
    private final static QName _InstanceInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "instance-info");
    private final static QName _ActivityInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-info");
    private final static QName _SnapshotInfoList_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "snapshot-info-list");
    private final static QName _VariableInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "variable-info");
    private final static QName _SnapshotInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "snapshot-info");
    private final static QName _MockQueryResponse_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "mockQueryResponse");
    private final static QName _InstanceInfoList_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "instance-info-list");
    private final static QName _ActivityExtInfoList_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-ext-info-list");
    private final static QName _SnapshotPartnerLinks_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "snapshot-partnerLinks");
    private final static QName _EventInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "event-info");
    private final static QName _ProcessInfoList_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "process-info-list");
    private final static QName _PartnerLinkInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "partnerLink-info");
    private final static QName _EventInfoList_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "event-info-list");
    private final static QName _ProcessInfo_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "process-info");
    private final static QName _ReplayResponse_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "replayResponse");
    private final static QName _GetCommunicationResponse_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "getCommunicationResponse");
    private final static QName _SnapshotVariables_QNAME = new QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "snapshot-variables");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.ode.pmapi.types._2006._08._02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TProcessProperties }
     * 
     */
    public TProcessProperties createTProcessProperties() {
        return new TProcessProperties();
    }

    /**
     * Create an instance of {@link TFaultInfo }
     * 
     */
    public TFaultInfo createTFaultInfo() {
        return new TFaultInfo();
    }

    /**
     * Create an instance of {@link TEndpointReferences }
     * 
     */
    public TEndpointReferences createTEndpointReferences() {
        return new TEndpointReferences();
    }

    /**
     * Create an instance of {@link CommunicationType }
     * 
     */
    public CommunicationType createCommunicationType() {
        return new CommunicationType();
    }

    /**
     * Create an instance of {@link TInstanceSummary }
     * 
     */
    public TInstanceSummary createTInstanceSummary() {
        return new TInstanceSummary();
    }

    /**
     * Create an instance of {@link TProcessInfo }
     * 
     */
    public TProcessInfo createTProcessInfo() {
        return new TProcessInfo();
    }

    /**
     * Create an instance of {@link TPartnerLinkInfo }
     * 
     */
    public TPartnerLinkInfo createTPartnerLinkInfo() {
        return new TPartnerLinkInfo();
    }

    /**
     * Create an instance of {@link TVariableInfo }
     * 
     */
    public TVariableInfo createTVariableInfo() {
        return new TVariableInfo();
    }

    /**
     * Create an instance of {@link TScopeInfo }
     * 
     */
    public TScopeInfo createTScopeInfo() {
        return new TScopeInfo();
    }

    /**
     * Create an instance of {@link TScopeInfo.CorrelationSets }
     * 
     */
    public TScopeInfo.CorrelationSets createTScopeInfoCorrelationSets() {
        return new TScopeInfo.CorrelationSets();
    }

    /**
     * Create an instance of {@link TInstanceInfo }
     * 
     */
    public TInstanceInfo createTInstanceInfo() {
        return new TInstanceInfo();
    }

    /**
     * Create an instance of {@link TInstanceInfoList }
     * 
     */
    public TInstanceInfoList createTInstanceInfoList() {
        return new TInstanceInfoList();
    }

    /**
     * Create an instance of {@link GetCommunication }
     * 
     */
    public GetCommunication createGetCommunication() {
        return new GetCommunication();
    }

    /**
     * Create an instance of {@link TVariableRefList }
     * 
     */
    public TVariableRefList createTVariableRefList() {
        return new TVariableRefList();
    }

    /**
     * Create an instance of {@link TPartnerLinkRefList }
     * 
     */
    public TPartnerLinkRefList createTPartnerLinkRefList() {
        return new TPartnerLinkRefList();
    }

    /**
     * Create an instance of {@link TSnapshotPartnerLinks }
     * 
     */
    public TSnapshotPartnerLinks createTSnapshotPartnerLinks() {
        return new TSnapshotPartnerLinks();
    }

    /**
     * Create an instance of {@link TSnapshotInfoList }
     * 
     */
    public TSnapshotInfoList createTSnapshotInfoList() {
        return new TSnapshotInfoList();
    }

    /**
     * Create an instance of {@link TSnapshotInfo }
     * 
     */
    public TSnapshotInfo createTSnapshotInfo() {
        return new TSnapshotInfo();
    }

    /**
     * Create an instance of {@link Replay }
     * 
     */
    public Replay createReplay() {
        return new Replay();
    }

    /**
     * Create an instance of {@link GetCommunicationResponse }
     * 
     */
    public GetCommunicationResponse createGetCommunicationResponse() {
        return new GetCommunicationResponse();
    }

    /**
     * Create an instance of {@link TSnapshotVariables }
     * 
     */
    public TSnapshotVariables createTSnapshotVariables() {
        return new TSnapshotVariables();
    }

    /**
     * Create an instance of {@link ReplayResponse }
     * 
     */
    public ReplayResponse createReplayResponse() {
        return new ReplayResponse();
    }

    /**
     * Create an instance of {@link TEventInfoList }
     * 
     */
    public TEventInfoList createTEventInfoList() {
        return new TEventInfoList();
    }

    /**
     * Create an instance of {@link TActivityInfo }
     * 
     */
    public TActivityInfo createTActivityInfo() {
        return new TActivityInfo();
    }

    /**
     * Create an instance of {@link TActivityExtInfo }
     * 
     */
    public TActivityExtInfo createTActivityExtInfo() {
        return new TActivityExtInfo();
    }

    /**
     * Create an instance of {@link TSnapshotVersion }
     * 
     */
    public TSnapshotVersion createTSnapshotVersion() {
        return new TSnapshotVersion();
    }

    /**
     * Create an instance of {@link TProcessInfoList }
     * 
     */
    public TProcessInfoList createTProcessInfoList() {
        return new TProcessInfoList();
    }

    /**
     * Create an instance of {@link TEventInfo }
     * 
     */
    public TEventInfo createTEventInfo() {
        return new TEventInfo();
    }

    /**
     * Create an instance of {@link TActivitytExtInfoList }
     * 
     */
    public TActivitytExtInfoList createTActivitytExtInfoList() {
        return new TActivitytExtInfoList();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link MockQueryRequest }
     * 
     */
    public MockQueryRequest createMockQueryRequest() {
        return new MockQueryRequest();
    }

    /**
     * Create an instance of {@link FailureType }
     * 
     */
    public FailureType createFailureType() {
        return new FailureType();
    }

    /**
     * Create an instance of {@link TPartnerLinkRef }
     * 
     */
    public TPartnerLinkRef createTPartnerLinkRef() {
        return new TPartnerLinkRef();
    }

    /**
     * Create an instance of {@link TFailuresInfo }
     * 
     */
    public TFailuresInfo createTFailuresInfo() {
        return new TFailuresInfo();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link TDefinitionInfo }
     * 
     */
    public TDefinitionInfo createTDefinitionInfo() {
        return new TDefinitionInfo();
    }

    /**
     * Create an instance of {@link ReplayType }
     * 
     */
    public ReplayType createReplayType() {
        return new ReplayType();
    }

    /**
     * Create an instance of {@link TVariableRef }
     * 
     */
    public TVariableRef createTVariableRef() {
        return new TVariableRef();
    }

    /**
     * Create an instance of {@link TCorrelationProperty }
     * 
     */
    public TCorrelationProperty createTCorrelationProperty() {
        return new TCorrelationProperty();
    }

    /**
     * Create an instance of {@link TDocumentInfo }
     * 
     */
    public TDocumentInfo createTDocumentInfo() {
        return new TDocumentInfo();
    }

    /**
     * Create an instance of {@link TDeploymentInfo }
     * 
     */
    public TDeploymentInfo createTDeploymentInfo() {
        return new TDeploymentInfo();
    }

    /**
     * Create an instance of {@link TFailureInfo }
     * 
     */
    public TFailureInfo createTFailureInfo() {
        return new TFailureInfo();
    }

    /**
     * Create an instance of {@link TScopeRef }
     * 
     */
    public TScopeRef createTScopeRef() {
        return new TScopeRef();
    }

    /**
     * Create an instance of {@link TProcessProperties.Property }
     * 
     */
    public TProcessProperties.Property createTProcessPropertiesProperty() {
        return new TProcessProperties.Property();
    }

    /**
     * Create an instance of {@link TFaultInfo.Data }
     * 
     */
    public TFaultInfo.Data createTFaultInfoData() {
        return new TFaultInfo.Data();
    }

    /**
     * Create an instance of {@link TEndpointReferences.EndpointRef }
     * 
     */
    public TEndpointReferences.EndpointRef createTEndpointReferencesEndpointRef() {
        return new TEndpointReferences.EndpointRef();
    }

    /**
     * Create an instance of {@link CommunicationType.ServiceConfig }
     * 
     */
    public CommunicationType.ServiceConfig createCommunicationTypeServiceConfig() {
        return new CommunicationType.ServiceConfig();
    }

    /**
     * Create an instance of {@link CommunicationType.Exchange }
     * 
     */
    public CommunicationType.Exchange createCommunicationTypeExchange() {
        return new CommunicationType.Exchange();
    }

    /**
     * Create an instance of {@link TInstanceSummary.Instances }
     * 
     */
    public TInstanceSummary.Instances createTInstanceSummaryInstances() {
        return new TInstanceSummary.Instances();
    }

    /**
     * Create an instance of {@link TProcessInfo.Documents }
     * 
     */
    public TProcessInfo.Documents createTProcessInfoDocuments() {
        return new TProcessInfo.Documents();
    }

    /**
     * Create an instance of {@link TPartnerLinkInfo.MyEPR }
     * 
     */
    public TPartnerLinkInfo.MyEPR createTPartnerLinkInfoMyEPR() {
        return new TPartnerLinkInfo.MyEPR();
    }

    /**
     * Create an instance of {@link TPartnerLinkInfo.PartnerEPR }
     * 
     */
    public TPartnerLinkInfo.PartnerEPR createTPartnerLinkInfoPartnerEPR() {
        return new TPartnerLinkInfo.PartnerEPR();
    }

    /**
     * Create an instance of {@link TVariableInfo.Value }
     * 
     */
    public TVariableInfo.Value createTVariableInfoValue() {
        return new TVariableInfo.Value();
    }

    /**
     * Create an instance of {@link TScopeInfo.Children }
     * 
     */
    public TScopeInfo.Children createTScopeInfoChildren() {
        return new TScopeInfo.Children();
    }

    /**
     * Create an instance of {@link TScopeInfo.Activities }
     * 
     */
    public TScopeInfo.Activities createTScopeInfoActivities() {
        return new TScopeInfo.Activities();
    }

    /**
     * Create an instance of {@link TScopeInfo.Variables }
     * 
     */
    public TScopeInfo.Variables createTScopeInfoVariables() {
        return new TScopeInfo.Variables();
    }

    /**
     * Create an instance of {@link TScopeInfo.CorrelationSets.CorrelationSet }
     * 
     */
    public TScopeInfo.CorrelationSets.CorrelationSet createTScopeInfoCorrelationSetsCorrelationSet() {
        return new TScopeInfo.CorrelationSets.CorrelationSet();
    }

    /**
     * Create an instance of {@link TInstanceInfo.CorrelationProperties }
     * 
     */
    public TInstanceInfo.CorrelationProperties createTInstanceInfoCorrelationProperties() {
        return new TInstanceInfo.CorrelationProperties();
    }

    /**
     * Create an instance of {@link TInstanceInfo.EventInfo }
     * 
     */
    public TInstanceInfo.EventInfo createTInstanceInfoEventInfo() {
        return new TInstanceInfo.EventInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSnapshotVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "snapshot-version")
    public JAXBElement<TSnapshotVersion> createSnapshotVersion(TSnapshotVersion value) {
        return new JAXBElement<TSnapshotVersion>(_SnapshotVersion_QNAME, TSnapshotVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TVariableRefList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "variable-ref-list")
    public JAXBElement<TVariableRefList> createVariableRefList(TVariableRefList value) {
        return new JAXBElement<TVariableRefList>(_VariableRefList_QNAME, TVariableRefList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPartnerLinkRefList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "partnerLink-ref-list")
    public JAXBElement<TPartnerLinkRefList> createPartnerLinkRefList(TPartnerLinkRefList value) {
        return new JAXBElement<TPartnerLinkRefList>(_PartnerLinkRefList_QNAME, TPartnerLinkRefList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TScopeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "scope-info")
    public JAXBElement<TScopeInfo> createScopeInfo(TScopeInfo value) {
        return new JAXBElement<TScopeInfo>(_ScopeInfo_QNAME, TScopeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TActivityExtInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "activity-ext-info")
    public JAXBElement<TActivityExtInfo> createActivityExtInfo(TActivityExtInfo value) {
        return new JAXBElement<TActivityExtInfo>(_ActivityExtInfo_QNAME, TActivityExtInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TInstanceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "instance-info")
    public JAXBElement<TInstanceInfo> createInstanceInfo(TInstanceInfo value) {
        return new JAXBElement<TInstanceInfo>(_InstanceInfo_QNAME, TInstanceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TActivityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "activity-info")
    public JAXBElement<TActivityInfo> createActivityInfo(TActivityInfo value) {
        return new JAXBElement<TActivityInfo>(_ActivityInfo_QNAME, TActivityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSnapshotInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "snapshot-info-list")
    public JAXBElement<TSnapshotInfoList> createSnapshotInfoList(TSnapshotInfoList value) {
        return new JAXBElement<TSnapshotInfoList>(_SnapshotInfoList_QNAME, TSnapshotInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TVariableInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "variable-info")
    public JAXBElement<TVariableInfo> createVariableInfo(TVariableInfo value) {
        return new JAXBElement<TVariableInfo>(_VariableInfo_QNAME, TVariableInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSnapshotInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "snapshot-info")
    public JAXBElement<TSnapshotInfo> createSnapshotInfo(TSnapshotInfo value) {
        return new JAXBElement<TSnapshotInfo>(_SnapshotInfo_QNAME, TSnapshotInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "mockQueryResponse")
    public JAXBElement<ResponseType> createMockQueryResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_MockQueryResponse_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TInstanceInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "instance-info-list")
    public JAXBElement<TInstanceInfoList> createInstanceInfoList(TInstanceInfoList value) {
        return new JAXBElement<TInstanceInfoList>(_InstanceInfoList_QNAME, TInstanceInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TActivitytExtInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "activity-ext-info-list")
    public JAXBElement<TActivitytExtInfoList> createActivityExtInfoList(TActivitytExtInfoList value) {
        return new JAXBElement<TActivitytExtInfoList>(_ActivityExtInfoList_QNAME, TActivitytExtInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSnapshotPartnerLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "snapshot-partnerLinks")
    public JAXBElement<TSnapshotPartnerLinks> createSnapshotPartnerLinks(TSnapshotPartnerLinks value) {
        return new JAXBElement<TSnapshotPartnerLinks>(_SnapshotPartnerLinks_QNAME, TSnapshotPartnerLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEventInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "event-info")
    public JAXBElement<TEventInfo> createEventInfo(TEventInfo value) {
        return new JAXBElement<TEventInfo>(_EventInfo_QNAME, TEventInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TProcessInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "process-info-list")
    public JAXBElement<TProcessInfoList> createProcessInfoList(TProcessInfoList value) {
        return new JAXBElement<TProcessInfoList>(_ProcessInfoList_QNAME, TProcessInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPartnerLinkInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "partnerLink-info")
    public JAXBElement<TPartnerLinkInfo> createPartnerLinkInfo(TPartnerLinkInfo value) {
        return new JAXBElement<TPartnerLinkInfo>(_PartnerLinkInfo_QNAME, TPartnerLinkInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEventInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "event-info-list")
    public JAXBElement<TEventInfoList> createEventInfoList(TEventInfoList value) {
        return new JAXBElement<TEventInfoList>(_EventInfoList_QNAME, TEventInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TProcessInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "process-info")
    public JAXBElement<TProcessInfo> createProcessInfo(TProcessInfo value) {
        return new JAXBElement<TProcessInfo>(_ProcessInfo_QNAME, TProcessInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "replayResponse")
    public JAXBElement<ReplayResponse> createReplayResponse(ReplayResponse value) {
        return new JAXBElement<ReplayResponse>(_ReplayResponse_QNAME, ReplayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommunicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "getCommunicationResponse")
    public JAXBElement<GetCommunicationResponse> createGetCommunicationResponse(GetCommunicationResponse value) {
        return new JAXBElement<GetCommunicationResponse>(_GetCommunicationResponse_QNAME, GetCommunicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSnapshotVariables }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.apache.org/ode/pmapi/types/2006/08/02/", name = "snapshot-variables")
    public JAXBElement<TSnapshotVariables> createSnapshotVariables(TSnapshotVariables value) {
        return new JAXBElement<TSnapshotVariables>(_SnapshotVariables_QNAME, TSnapshotVariables.class, null, value);
    }

}
