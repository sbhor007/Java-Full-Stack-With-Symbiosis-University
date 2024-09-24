create database santoshDB;

use santoshDB;

create table employee(
ecode int not null primary key,
ename varchar(30),
gender varchar(5),
grade varchar(3),
gross int not null
);

insert into employee values(1001,'Ravi','M','E4',50000);
insert into employee values(1002,'Akash','M','A1',35000);
insert into employee values(1003,'Neela','F','B2',38965);
insert into employee values(1004,'Sunny','M','A2',30000);
insert into employee values(1005,'Haeshal','M','E4',60000);

select * from employee;