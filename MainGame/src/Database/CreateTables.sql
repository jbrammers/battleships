create table player
(
  username varchar(16) not null
    constraint "Player_pkey"
      primary key,
  password varchar(32) not null,
  salt varchar(32) not null, --not sure what type this is??
  wins integer default 0 not null,
  losses integer default 0 not null,
  winratio decimal default 0 not null,
);