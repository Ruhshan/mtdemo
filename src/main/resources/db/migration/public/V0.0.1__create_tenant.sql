
CREATE TABLE tenant
(
    id    serial primary key,
    name  varchar(64)  not null UNIQUE
);