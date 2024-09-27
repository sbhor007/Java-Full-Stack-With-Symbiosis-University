-- create a student table id, name, subject, avgrage mark, division
-- where institute occur only three subject as physics chemistry biology insert 10 records accordingly
-- 1.display all the details from student table 
-- 2.display more than 70
-- 3.display whose starts with A and ends with N

use santoshDb;

create table student(
studID int not null primary key,
studName varchar(15),
subject varchar(15),
averageMarks double,
division varchar(2)
);
use santoshDb;

insert into student values(13,'santosh','physics',87.33,'A');
insert into student values(14,'Harshal','chemistry',74,'A');
insert into student values(16,'Tejas','biology',75.66,'A');
insert into student values(17,'Grarry','chemistry',67.33,'A');
insert into student values(122,'Vijay','physics',78.33,'A');
insert into student values(120,'Durgesh','biology',85.33,'A');
insert into student values(130,'Rohit','physics',87.33,'A');
insert into student values(123,'Bhirav','chemistry',74,'A');
insert into student values(1,'dipak','biology',75.66,'A');
insert into student values(10,'Bhairav','chemistry',82.33,'A');
insert into student values(12,'Anuradha','physics',89.33,'A');

select * from student;

select averageMarks 
from student 
where averageMarks > 70;

select * 
from student
where studName like 'd%k';

select * 
from student
where subject in ('biology','chemistry');