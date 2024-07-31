CREATE TABLE patient(
	number 		TINYINT 	NOT NULL,
	code		CHAR(2)		NOT NULL,
	days		SMALLINT	NOT NULL,
	age			TINYINT		NOT NULL,
	dept		VARCHAR(20),
	operfee		INT,
	hospitalfee INT,
	money		INT,
	CONSTRAINT patient_pk PRIMARY KEY(number)
	);
-----------------------------------------

DELIMITER $$
CREATE PROCEDURE sp_select_all_patient()
BEGIN
	 SELECT number, dept, operfee, hospitalfee, money
     FROM patient
     ORDER BY number DESC;
END $$
DELIMITER ;

--------------------------------------------
DELIMITER //
CREATE PROCEDURE cp_select_one_patient
(
	IN v_number TINYINT
)
BEGIN
	SELECT *
    FROM patient
    WHERE number = v_number;
END //
DELIMITER ;
