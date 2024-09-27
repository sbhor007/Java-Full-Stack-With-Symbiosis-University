-- create table employee empNo, empName, dept, salary and few records to display .name of employee starts with B
-- in ascending order based on their salary.
-- 2. display details whose salary is more than 20000 and dept is same
-- 3.change the salary of those employees who is having 20000 to 25000 increment of 5000
-- 3. display average of salary from a table
-- 4. display all employee detail who works in HR or account dept.

create table employee1(
empNo int not null primary key,
empName varchar(15),
dept varchar(15),
salary double
);

select * from employee1;

insert into employee1 values(1002,'Santosh','sales',22000);

insert into employee1 values(1001,'Harshal','marketing',20000);

insert into employee1 values(1006,'Tejas','HR',27000);

insert into employee1 values(1005,'Durgesh','account',25000);

insert into employee1 values(1003,'Garry','sales',19000);

insert into employee1 values(1004,'Vijay','HR',26000);

select empName,salary
from employee1
where empName like 'S%'
order by salary;

select *
from employee1
where dept = 'sales' AND salary > 20000;

update employee1 set salary = (salary + 5000) where salary between 20000 AND 25000;
#update employee1 set salary = (salary+5000) where salary >= 20000 AND salary <= 25000;

#Display average salary
select  avg(salary)
from employee1;

select * 
from employee1
where dept = 'HR' OR dept = 'account';

# IN - 
select *
from employee1
where dept IN ('HR','sales');

# sorting data ASSENDING - ORDER BY <>
select * 
from employee1
order by empName;

# sorting data Decending - ORDER BY <   > desc
select * 
from employee1
order by empName desc;

