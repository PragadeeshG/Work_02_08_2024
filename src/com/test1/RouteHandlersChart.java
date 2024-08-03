package com.test1;

public class RouteHandlersChart {
	private Integer routerComponentDefinition;
	private Integer routeHandlersId;
	private String routeHandlersBudgetIndicator;
	private String routeHandlersSheet;
	private String routeHandlersControlFlag;
	private String routeHandlersDesc;
	private String routeHandlersShortDesc;
	private String routeHandlersType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RouteHandlersChart() {

	}

	public RouteHandlersChart(Integer routerComponentDefinition, Integer routeHandlersId,
			String routeHandlersBudgetIndicator, String routeHandlersSheet, String routeHandlersControlFlag,
			String routeHandlersDesc, String routeHandlersShortDesc, String routeHandlersType, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.routerComponentDefinition = routerComponentDefinition;
		this.routeHandlersId = routeHandlersId;
		this.routeHandlersBudgetIndicator = routeHandlersBudgetIndicator;
		this.routeHandlersSheet = routeHandlersSheet;
		this.routeHandlersControlFlag = routeHandlersControlFlag;
		this.routeHandlersDesc = routeHandlersDesc;
		this.routeHandlersShortDesc = routeHandlersShortDesc;
		this.routeHandlersType = routeHandlersType;
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

	public String getRouteHandlersBudgetIndicator() {
		return routeHandlersBudgetIndicator;
	}

	public void setRouteHandlersBudgetIndicator(String routeHandlersBudgetIndicator) {
		this.routeHandlersBudgetIndicator = routeHandlersBudgetIndicator;
	}

	public String getRouteHandlersSheet() {
		return routeHandlersSheet;
	}

	public void setRouteHandlersSheet(String routeHandlersSheet) {
		this.routeHandlersSheet = routeHandlersSheet;
	}

	public String getRouteHandlersControlFlag() {
		return routeHandlersControlFlag;
	}

	public void setRouteHandlersControlFlag(String routeHandlersControlFlag) {
		this.routeHandlersControlFlag = routeHandlersControlFlag;
	}

	public String getRouteHandlersDesc() {
		return routeHandlersDesc;
	}

	public void setRouteHandlersDesc(String routeHandlersDesc) {
		this.routeHandlersDesc = routeHandlersDesc;
	}

	public String getRouteHandlersShortDesc() {
		return routeHandlersShortDesc;
	}

	public void setRouteHandlersShortDesc(String routeHandlersShortDesc) {
		this.routeHandlersShortDesc = routeHandlersShortDesc;
	}

	public String getRouteHandlersType() {
		return routeHandlersType;
	}

	public void setRouteHandlersType(String routeHandlersType) {
		this.routeHandlersType = routeHandlersType;
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
