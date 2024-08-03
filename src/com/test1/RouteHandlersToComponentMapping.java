package com.test1;

public class RouteHandlersToComponentMapping {
	private Integer routerComponentDefinition;
	private Integer routeHandlersId;
	private Integer objectInspector;
	private String department;
	private Integer baseReportingIndicator;
	private boolean routeHandlersMappedToReport;
	private boolean isActive;
	private String componentName;
	private String componentType;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RouteHandlersToComponentMapping() {

	}

	public RouteHandlersToComponentMapping(Integer routerComponentDefinition, Integer routeHandlersId,
			Integer objectInspector, String department, Integer baseReportingIndicator,
			boolean routeHandlersMappedToReport, boolean isActive, String componentName, String componentType,
			String creationCr, String modifiedCr, String creationDate, String modifiedDate, String entityState) {
		super();
		this.routerComponentDefinition = routerComponentDefinition;
		this.routeHandlersId = routeHandlersId;
		this.objectInspector = objectInspector;
		this.department = department;
		this.baseReportingIndicator = baseReportingIndicator;
		this.routeHandlersMappedToReport = routeHandlersMappedToReport;
		this.isActive = isActive;
		this.componentName = componentName;
		this.componentType = componentType;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRouterComponentDefinition() {
		return routerComponentDefinition;
	}

	public void setRouterComponentDefinition(Integer routerComponentDefinition) {
		this.routerComponentDefinition = routerComponentDefinition;
	}

	public Integer getRouteHandlersId() {
		return routeHandlersId;
	}

	public void setRouteHandlersId(Integer routeHandlersId) {
		this.routeHandlersId = routeHandlersId;
	}

	public Integer getObjectInspector() {
		return objectInspector;
	}

	public void setObjectInspector(Integer objectInspector) {
		this.objectInspector = objectInspector;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getBaseReportingIndicator() {
		return baseReportingIndicator;
	}

	public void setBaseReportingIndicator(Integer baseReportingIndicator) {
		this.baseReportingIndicator = baseReportingIndicator;
	}

	public boolean isRouteHandlersMappedToReport() {
		return routeHandlersMappedToReport;
	}

	public void setRouteHandlersMappedToReport(boolean routeHandlersMappedToReport) {
		this.routeHandlersMappedToReport = routeHandlersMappedToReport;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
