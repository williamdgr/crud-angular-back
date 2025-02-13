create table clientes(
    codigo bigint not null auto_increment,
    nome varchar(50) not null,
    idade bigint not null,
    cidade varchar(50) not null,
    primary key(codigo)
);

insert into clientes(codigo, nome, idade, cidade) values(1, 'João', 25, 'Ibiporã');
insert into clientes(codigo, nome, idade, cidade) values(2, 'José', 30, 'Londrina');
insert into clientes(codigo, nome, idade, cidade) values(3, 'Pedro', 36, 'Ibiporã');