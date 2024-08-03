create table if not exists route_handlers_to_component_mapping(
router_component_definition Integer not null,
route_handlers_id Integer null,
object_inspector Integer null,
department varchar(255) null,
base_reporting_indicator Integer null,
route_handlers_mapped_to_report char null,
is_active char null,
component_name varchar(255) null,
component_type varchar(255) null,
creation_cr varchar(255) null,
modified_cr varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint route_handlers_to_component_mapping_pk primary key(router_component_definition));