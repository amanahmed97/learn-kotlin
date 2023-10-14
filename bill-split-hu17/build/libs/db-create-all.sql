create table bill_model (
  bill_id                       serial not null,
  bill_paid_by                  integer not null,
  bill_amount                   float not null,
  group_id                      integer not null,
  bill_status                   boolean default false not null,
  constraint pk_bill_model primary key (bill_id)
);

create table bill_model_user_model (
  bill_model_bill_id            integer not null,
  user_model_user_id            integer not null,
  constraint pk_bill_model_user_model primary key (bill_model_bill_id,user_model_user_id)
);

create table customer (
  id                            bigserial not null,
  name                          varchar(255),
  constraint pk_customer primary key (id)
);

create table group_model (
  group_id                      serial not null,
  constraint pk_group_model primary key (group_id)
);

create table test (
  id                            bigserial not null,
  name                          varchar(255) not null,
  constraint pk_test primary key (id)
);

create table transaction_model (
  t_id                          serial not null,
  bill_bill_id                  integer not null,
  t_bill_id                     integer not null,
  t_user1                       integer not null,
  t_user2                       integer not null,
  t_amount                      float not null,
  constraint pk_transaction_model primary key (t_id)
);

create table user_model (
  user_id                       serial not null,
  user_name                     varchar(255) not null,
  user_email                    varchar(255) not null,
  user_phone                    varchar(255) not null,
  user_total_balance            float not null,
  constraint pk_user_model primary key (user_id)
);

create table user_model_bill_model (
  user_model_user_id            integer not null,
  bill_model_bill_id            integer not null,
  constraint pk_user_model_bill_model primary key (user_model_user_id,bill_model_bill_id)
);

create index ix_bill_model_user_model_bill_model on bill_model_user_model (bill_model_bill_id);
alter table bill_model_user_model add constraint fk_bill_model_user_model_bill_model foreign key (bill_model_bill_id) references bill_model (bill_id) on delete restrict on update restrict;

create index ix_bill_model_user_model_user_model on bill_model_user_model (user_model_user_id);
alter table bill_model_user_model add constraint fk_bill_model_user_model_user_model foreign key (user_model_user_id) references user_model (user_id) on delete restrict on update restrict;

create index ix_transaction_model_bill_bill_id on transaction_model (bill_bill_id);
alter table transaction_model add constraint fk_transaction_model_bill_bill_id foreign key (bill_bill_id) references bill_model (bill_id) on delete restrict on update restrict;

create index ix_user_model_bill_model_user_model on user_model_bill_model (user_model_user_id);
alter table user_model_bill_model add constraint fk_user_model_bill_model_user_model foreign key (user_model_user_id) references user_model (user_id) on delete restrict on update restrict;

create index ix_user_model_bill_model_bill_model on user_model_bill_model (bill_model_bill_id);
alter table user_model_bill_model add constraint fk_user_model_bill_model_bill_model foreign key (bill_model_bill_id) references bill_model (bill_id) on delete restrict on update restrict;

