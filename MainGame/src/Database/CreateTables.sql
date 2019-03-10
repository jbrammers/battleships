create table player
(
  username varchar(16) not null
    constraint "Player_pkey"
      primary key,
  password varchar(32) not null,
  wins integer default 0 not null,
  losses integer default 0 not null
);


create table messages
(
  sender varchar(16) not null
    constraint messages_player_username_fk
      references player,
  recipient varchar(16)
    constraint messages_player_username_fk_2
      references player,
  datetime timestamp,
  content varchar(1024)
);


