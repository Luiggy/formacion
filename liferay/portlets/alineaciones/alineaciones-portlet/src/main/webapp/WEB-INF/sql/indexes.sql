create index IX_419C1D6C on alineaciones_Jugador (companyId, partidoId);
create index IX_A93EFAC on alineaciones_Jugador (uuid_);
create index IX_8DC5D0FC on alineaciones_Jugador (uuid_, companyId);
create unique index IX_7F46667E on alineaciones_Jugador (uuid_, groupId);

create index IX_4C940A61 on alineaciones_Partido (companyId);
create index IX_9AE4346D on alineaciones_Partido (uuid_);
create index IX_A850B99B on alineaciones_Partido (uuid_, companyId);
create unique index IX_F660EADD on alineaciones_Partido (uuid_, groupId);