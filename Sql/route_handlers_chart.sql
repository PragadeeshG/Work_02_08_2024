create table if not exists route_handlers_chart(
router_component_definition Integer not null,
route_handlers_id Integer null,
route_handlers_budget_indicator varchar(255) null,
route_handlers_sheet varchar(255) null,
route_handlers_control_flag varchar(255) null,
route_handlers_desc varchar(255) null,
route_handlers_short_desc varchar(255) null,
route_handlers_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint route_handlers_chart_pk primary key(router_component_definition));