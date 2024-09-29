-- create a table AccountNo transaction no, amount,  type, date of transaction , name, address
use santoshDb;

create table account(
accountNo int not null primary key,
accountHolderName varchar(15),
transactionNo int,
amount double,
transactionType varchar(15),
transactionDate date,
address varchar(15)
);

insert into account values(1001,'Santosh',106,5000,'deposit','2024-07-15','nashik');

insert into account values(1010,'Harshal',101,15000,'withdraw','2024-05-05','pune');

insert into account values(1008,'Tejas',110,10000,'withdraw','2024-05-15','mumbai');

insert into account values(1002,'Durgesh',116,155000,'deposit','2024-05-15','pune');

insert into account values(1001,'Santosh',106,5000,'deposit','2024-07-15','nashik');

insert into account values(1011,'Garry',107,152000,'withdraw','2024-05-15','pune');

insert into account values(1001,'Santosh',115,12000,'withdraw','2024-05-15','pune');

insert into account values(1001,'Santosh',115,12000,'withdraw','2024-12-15','pune');

select * from account;
-- 1) Display all details where the type = withdraw
select * 
from account
where transactionType like 'withdraw';

-- display a/c no, name and amount, for all deposit and withdrawal done in the month of may
select accountNo, accountHolderName, transactionType
from account
where transactionType in ('withdraw','deposit')AND month(transactionDate) = 5;# AND dayofmonth(transactionDate) = 'may' ;

-- display all the transaction done by accNo 1001
select *
from account
where accountNo = 1001;

-- display all the details who has done the transaction less than 50000
select * 
from account 
where amount < 50000;

-- select all the a/c holders whose address and who are not from pune and Mumbai
select * 
from account
where address not in ('pune','mumbai');

-- select unique locations and how many of them
select count(distinct(address))
from account;

-- select min and max transaction amount in a month of may
select max(amount) ,max(amount)
from account
where transactionDate like '%-05-%';

-- display total transaction till know
select count(transactionNo)
from account
where transactionDate like '2024-05-15'; 
