CREATE DATABASE `vetcaredb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */

create table customer
(
    id_customer int auto_increment
        primary key,
    names       varchar(100) not null,
    lastname    varchar(100) not null,
    addres      varchar(150) null,
    phone       varchar(20)  null,
    email       varchar(100) null
);

create table pet
(
    id_pet      int auto_increment
        primary key,
    names       varchar(100) not null,
    species     varchar(50)  null,
    race        varchar(50)  null,
    genders     varchar(10)  null,
    age         int          null,
    id_customer int          null,
    constraint pet_ibfk_1
        foreign key (id_customer) references customer (id_customer)
);

create index id_customer
    on pet (id_customer);

create table veterinarian
(
    id_veterinarian int auto_increment
        primary key,
    names           varchar(100) not null,
    lastname        varchar(100) not null,
    phone           varchar(20)  null,
    email           varchar(100) null
);

create table appointment
(
    id_appointment  int auto_increment
        primary key,
    appointment     timestamp                                                       not null,
    reason          varchar(200)                                                    null,
    status          enum ('Pendiente', 'Atendida', 'Cancelada') default 'Pendiente' null,
    id_pet          int                                                             null,
    id_veterinarian int                                                             null,
    constraint appointment_ibfk_1
        foreign key (id_pet) references pet (id_pet),
    constraint appointment_ibfk_2
        foreign key (id_veterinarian) references veterinarian (id_veterinarian)
);

create index id_pet
    on appointment (id_pet);

create index id_veterinarian
    on appointment (id_veterinarian);


