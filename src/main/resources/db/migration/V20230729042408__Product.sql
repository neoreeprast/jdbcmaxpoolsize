create table products
(
    id bigint auto_increment,
    name varchar(255) not null,
    constraint products_pk
        primary key (id)
);

