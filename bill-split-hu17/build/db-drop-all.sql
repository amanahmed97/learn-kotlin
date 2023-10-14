alter table if exists bill_model_user_model drop constraint if exists fk_bill_model_user_model_bill_model;
drop index if exists ix_bill_model_user_model_bill_model;

alter table if exists bill_model_user_model drop constraint if exists fk_bill_model_user_model_user_model;
drop index if exists ix_bill_model_user_model_user_model;

alter table if exists transaction_model drop constraint if exists fk_transaction_model_bill_bill_id;
drop index if exists ix_transaction_model_bill_bill_id;

alter table if exists user_model_bill_model drop constraint if exists fk_user_model_bill_model_user_model;
drop index if exists ix_user_model_bill_model_user_model;

alter table if exists user_model_bill_model drop constraint if exists fk_user_model_bill_model_bill_model;
drop index if exists ix_user_model_bill_model_bill_model;

drop table if exists bill_model cascade;

drop table if exists bill_model_user_model cascade;

drop table if exists customer cascade;

drop table if exists group_model cascade;

drop table if exists test cascade;

drop table if exists transaction_model cascade;

drop table if exists user_model cascade;

drop table if exists user_model_bill_model cascade;

