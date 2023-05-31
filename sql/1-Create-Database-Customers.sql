create table customers (id integer not null, name varchar(255), personNr
                       varchar(255), primary key (id)) engine=InnoDB;
create table customers_seq (next_val bigint) engine=InnoDB;
insert into customers_seq  values ( 1 );