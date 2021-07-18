CREATE DATABASE chat;

CREATE TABLE public.users (
    id       uuid        NOT NULL,
    name     varchar(40) NULL,
    login    varchar(40) NOT NULL,
    password varchar(40) NOT NULL
);

