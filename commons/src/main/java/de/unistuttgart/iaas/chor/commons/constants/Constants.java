package de.unistuttgart.iaas.chor.commons.constants;

public class Constants {

	
	//==================================================================
	//Header name constants
	//==================================================================
	
	public static final String DEPLOYED_HEADER = "deployed";
	public static final String PROCESS_BUNDLE_NO_HEADER = "processBundleNo";
	public static final String PROCESS_BUNDLE_SIZE_HEADER = "processBundleSize";
	public static final String CHOR_MODEL_ID_HEADER = "chorModelId";
	public static final String PROCESS_MODEL_ID_HEADER = "processModelId";
	
	public static final String METHOD_HEADER = "method";
	public static final String ENGINE_ENDPOINTS_HEADER = "engineEndpointsHeader";
	public static final String TRANSLATOR_ENDPOINTS_HEADER = "translatorEndpointsHeader";
	public static final String MANAGEMENT_QUEUE_HEADER = "translatorEndpointsHeader";
	public static final String TARGET_ENGINE = "targetEngine";
	public static final String PROCESS_INSTANCE_ID = "processInstanceID";
	public static final String NUMBER_OF_INVOCATIONS = "numberOfInvocations";
	
	//==================================================================
	//Method name constants
	//==================================================================
	
	public static final String METHOD_REGISTER_DEPLOYED_ARTIFACTS = "registerDeployedArtifacts";
	public static final String METHOD_DEPLOY = "deploy";
	public static final String METHOD_UNDEPLOY = "undeploy";
	public static final String METHOD_START = "start";
	public static final String METHOD_SUSPEND = "suspend";
	public static final String METHOD_RESUME = "resume";
	public static final String METHOD_TERMINATE = "terminate";
	public static final String METHOD_FINISH = "finish";
	public static final String METHOD_GET_CHOR_INSTANCES = "getChorInstances";
	public static final String METHOD_GET_CHOR_INSTANCE_HISTORY = "getChorInstanceHistory";
	public static final String METHOD_GET_CHOR_MODELS = "getChorModels";
	public static final String METHOD_GET_PROCESS_INSTANCES = "getProcessInstances";
	public static final String METHOD_GET_PROCESS_INSTANCE_HISTORY = "getProcessInstanceHistory";
	public static final String METHOD_PREPARE_ITERATE = "prepareIterate";
	public static final String METHOD_PREPARE_ITERATE_EXT = "prepareIterateExt";
	public static final String METHOD_RESUME_ITERATE = "resumeIterate";
	public static final String METHOD_PREPARE_REEXECUTE = "prepareReexecute";
	public static final String METHOD_PREPARE_REEXECUTE_EXT = "prepareReexecuteExt";
	public static final String METHOD_RESUME_REEXECUTE = "resumeReexecute";
	public static final String METHOD_RESET_AND_TERMINATE = "resetAndTerminate";
	

	public static final String METHOD_GET_SNAPSHOTS = "getSnapshots";
	public static final String METHOD_GET_SNAPSHOT_VARIABLES = "getSnapshotVariables";
	public static final String METHOD_REGISTER_BREAKPOINTS = "registerBreakpoints";
	public static final String METHOD_CHANGE_VARIABLE_VALUE = "changeVariableValue";
	public static final String METHOD_SEND_EVENT ="sendEvent";
	
	//==================================================================
	//Service name constants
	//==================================================================
	
	public static final String SERVICE_INSTANCE_MANAGEMENT = "InstanceManagementService";
	public static final String SERVICE_DEPLOYMENT =  "DeploymentService";
	
	
	//===================================================================
	// Destinations
	//===================================================================
	public static final String SERVICE_ROUTE_SYNC_QUEUE = "queue://de.unistuttgart.chor.service.sync";
	public static final String TRANSLATOR_ODE_QUEUE = "activemq:queue:de.unistuttgart.chor.translator.ode?disableReplyTo=true";
	public static final String TRANSLATOR_ODE_UNDEPLOYMENT_QUEUE = "activemq:queue:de.unistuttgart.chor.translator.ode.undeployment?disableReplyTo=true";
	public static final String TRANSLATOR_DEADLETTER_QUEUE = "activemq:queue:de.unistuttgart.chor.translator.deadletter?disableReplyTo=true";
	
	//public static final String DEPLOYMENT_OUTBOUND_QUEUE = "activemq:queue:de.unistuttgart.chor.deployment.outbound?disableReplyTo=true";
	
	
	public static final String EVENT_OBJECT_QUEUE = "activemq:queue:de.unistuttgart.chor.event.object?disableReplyTo=true";
	
	
	//===================================================================
	// Engines
	//===================================================================
	
	public static final String ENGINE_APACHE_ODE = "APACHE_ODE";
	
	//===================================================================
	// Views
	//===================================================================

	public static final String VIEW_LEVEL_CHOR = "choreography";
	public static final String VIEW_LEVEL_PROCESS = "process";

	
}
