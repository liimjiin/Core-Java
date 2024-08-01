-- user 생성
CREATE USER 'lim'@'%' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON database_name.emp TO 'lim'@'%';
FLUSH PRIVILEGES;

-- emp TABLE 생성
create TABLE emp (
    empno VARCHAR(10) PRIMARY KEY,  -- 사원번호, 중복 불가
    ename VARCHAR(50),              -- 사원 이름
    dname VARCHAR(10),              -- 부서명
    sal INT,                        -- 기본급
    n_time INT,                     -- 야간 시간
    fam INT,                        -- 가족 수
    ho_sal INT,                     -- 호급수당
    fam_sal INT,                    -- 가족수당
    n_sal INT,                      -- 야간수당
    total INT,                      -- 총금액
    netAmount INT                   -- 실수령액
);

DELIMITER //
create procedure InsertEmployee
(
    IN p_empno VARCHAR(10),
    IN p_ename VARCHAR(50),
    IN p_dname VARCHAR(10),
    IN p_sal INT,
    IN p_n_time INT,
    IN p_fam INT,
    IN p_ho_sal INT,
    IN p_fam_sal INT,
    IN p_n_sal INT,
    IN p_total INT,
    IN p_netAmount INT
)
BEGIN
    INSERT INTO emp (empno, ename, dname, sal, n_time, fam, ho_sal, fam_sal, n_sal, total, netAmount)
    VALUES (p_empno, p_ename, p_dname, p_sal, p_n_time, p_fam, p_ho_sal, p_fam_sal, p_n_sal, p_total, p_netAmount);
END //
DELIMITER ;


DELIMITER $$
create procedure select_all_emp()
BEGIN
	SELECT empno, ename, dname, sal, ho_sal, fam_sal, n_sal, total, netAmount
    FROm emp
    ORDER BY empno;
END $$
DELIMITER ;