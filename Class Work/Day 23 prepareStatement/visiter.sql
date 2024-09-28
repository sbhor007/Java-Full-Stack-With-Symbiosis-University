# visuters
-- create a visitors table with visitor id,name,gender,amount paid and visitor location.insert five records.

use santoshDb;

# create Visiter table
create table visiter(
visiterId int not null primary key,
visiterName varchar(15),
gender varchar(1),
amountPaid double,
location varchar(15)
);

#Insert records
insert into visiter values(
	1001,
    'santosh',
    'M',
    2000,
    'nashik'
);

insert into visiter values(
	1004,
    'harshal',
    'M',
    3020,
    'jalgav'
);

insert into visiter values(
	1002,
    'Vijay',
    'M',
    2500,
    'mumbai'
);
insert into visiter values(
	1005,
    'tejas',
    'M',
    32000,
    'nashik'
);
insert into visiter values(
	1003,
    'garry',
    'M',
    null,
    'thane'
);
insert into visiter values(
	1007,
    'anuradha',
    'F',
    null,
    'dhule'
);

insert into visiter values(
	1009,
    'vaishnavi',
    'F',
    3200,
    'pune'
);

insert into visiter values(
	1008,
    'durgesh',
    'M',
    null,
    'malegav'
);

# Dispaly visiters details
select * from visiter;

#write a query to display visitor detail who are coming from particular location is female and paid more than 3000.
select * 
from visiter
where location like 'pune' AND gender like 'F' AND amountPaid > 3000;

#write a query to display all location uniquely.
select distinct(location)
from visiter;

#write a query to display visitor from highest to lower based on amount paid.
select * 
from visiter
order by amountPaid desc;

#select the visitor name who are male.
select *
from visiter
where gender like 'M';

#add 10% of amount paid and update the amount
update visiter set amountPaid = (amountPaid + (amountPaid*0.1)) where visiterId = 1001;
select * 
from visiter;

#list the visitor detail where amount paid is null
select * 
from visiter
where amountPaid is null;
