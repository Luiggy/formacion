create table alineaciones_Jugador (
	uuid_ VARCHAR(75) null,
	jugadorId LONG not null primary key,
	partidoId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(75) null,
	dni VARCHAR(75) null,
	titular BOOLEAN
);

create table alineaciones_Partido (
	uuid_ VARCHAR(75) null,
	partidoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(75) null,
	fecha DATE null
);