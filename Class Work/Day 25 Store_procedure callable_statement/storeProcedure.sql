use santoshDb;

-- DELIMITER //
-- CREATE PROCEDURE getAllEmployee()
-- BEGIN
-- 	SELECT * FROM employee1;
-- END //
-- DELIMITER ;

-- call getAllEmployee()

select * from employee1;
# insert proceger
DELIMITER //
CREATE PROCEDURE insertEmployeeRecord(in _empNo int, in _empName varchar(15), in _dept varchar(15), in _salary double)
BEGIN
	insert into employee1(empNo,empName,dept,salary) value(_empNo,_empName,_dept,_salary);
END //
DELIMITER ;


call insertEmployeeRecord(1110, "Yash", "IT", 258200);


# DROP PROCEDURE  getEmployee;



