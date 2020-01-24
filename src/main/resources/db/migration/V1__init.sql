drop table if exists PRODUCT;
create table PRODUCT
(
    id      IDENTITY                NOT NULL PRIMARY KEY,
    name    varchar2(255)           not null,
    created timestamp default now() not null
);

insert into products(name)
values ('Nokia 7.2');
insert into products(name)
values ('IPhone 10');
