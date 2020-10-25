ALTER SESSION SET nls_date_format='YYYY-MM-DD';
-- ####################################################################################
-- 시나리오

DROP TABLE t_emp PURGE ;
CREATE TABLE t_emp ( 
  empno     NUMBER(4, 0), 
  ename     VARCHAR2(10), 
  job       VARCHAR2(9), 
  mgr       NUMBER(4, 0), 
  hiredate  DATE, 
  sal       NUMBER(7, 2),
  comm      NUMBER(7, 2), 
  deptno    NUMBER(2, 0)
);

CREATE UNIQUE INDEX pk_emp ON t_emp (empno) ;
ALTER TABLE t_emp ADD  CONSTRAINT pk_emp PRIMARY KEY (empno);

INSERT INTO t_emp VALUES (7369,'SMITH','CLERK',7902,'1990-12-17',800,NULL,20);
INSERT INTO t_emp VALUES (7499,'ALLEN','SALESMAN',7698,'1991-02-20',1600,300,30);
INSERT INTO t_emp VALUES (7521,'WARD','SALESMAN',7698,'1992-02-22',1250,500,30);
INSERT INTO t_emp VALUES (7566,'JONES','MANAGER',7839,'1991-04-02',2975,NULL,20);
INSERT INTO t_emp VALUES (7654,'MARTIN','SALESMAN',7698,'1991-09-28',1250,1400,30);
INSERT INTO t_emp VALUES (7698,'BLAKE','MANAGER',7839,'1991-05-01',2850,NULL,30);
INSERT INTO t_emp VALUES (7782,'CLARK','MANAGER',7839,'1991-06-09',2450,NULL,10);
INSERT INTO t_emp VALUES (7788,'SCOTT','ANALYST',7566,'1997-04-17',3000,NULL,20);
INSERT INTO t_emp VALUES (7839,'KING','PRESIDENT',NULL,'1991-11-17',5000,NULL,10);
INSERT INTO t_emp VALUES (7844,'TURNER','SALESMAN',7698,'1991-09-08',1500,0,30);
INSERT INTO t_emp VALUES (7876,'ADAMS','CLERK',7788,'1997-05-23',1100,NULL,20);
INSERT INTO t_emp VALUES (7900,'JAMES','CLERK',7698,'1991-12-03',950,NULL,30);
INSERT INTO t_emp VALUES (7902,'FORD','ANALYST',7566,'1991-12-03',3000,NULL,20);
INSERT INTO t_emp VALUES (7934,'MILLER','CLERK',7782,'1992-01-23',1300,NULL,10);
COMMIT;

--------------------------------------------------------------------
DROP TABLE t_dept PURGE ;
CREATE TABLE t_dept (
  deptno   NUMBER(2,0), 
  dname    VARCHAR2(14), 
  loc      VARCHAR2(13)
);

INSERT INTO t_dept VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO t_dept VALUES (20,'RESEARCH','DALLAS');
INSERT INTO t_dept VALUES (30,'SALES','CHICAGO');
INSERT INTO t_dept VALUES (40,'OPERATIONS','BOSTON');
COMMIT;

CREATE UNIQUE INDEX pk_dept ON t_dept (deptno);
ALTER TABLE t_dept ADD  CONSTRAINT pk_dept PRIMARY KEY (deptno);

ALTER TABLE t_emp ADD CONSTRAINT fk_deptno FOREIGN KEY (deptno) REFERENCES t_dept (deptno);


-- ####################################################################################
-- 시나리오

DROP TABLE t_professor PURGE;

CREATE TABLE t_professor(
	profno    NUMBER(4) PRIMARY KEY,
	name      VARCHAR2(10) NOT NULL, 
	id        VARCHAR2(15) NOT NULL,
	POSITION  VARCHAR2(20) NOT NULL,
	pay       NUMBER(3) NOT NULL,
	hiredate  DATE NOT NULL,
	bonus     NUMBER(4) ,
	deptno    NUMBER(3),
	email     VARCHAR2(50),
	hpage     VARCHAR2(50)
) TABLESPACE users;

INSERT INTO t_professor VALUES (1001,'조인형','captain','정교수',550,to_date('1990-06-23','YYYY-MM-DD'),100,101,'captain@abc.net','http://www.abc.net');
INSERT INTO t_professor VALUES (1002,'박승곤','sweety','조교수',380,to_date('1997-01-30','YYYY-MM-DD'),60,101,'sweety@abc.net','http://www.abc.net');
INSERT INTO t_professor VALUES (1003,'송도권','powerman','전임강사',270,to_date('2008-03-22','YYYY-MM-DD'),NULL,101,'pman@power.com','http://www.power.com');
INSERT INTO t_professor VALUES (2001,'양선희','lamb1','전임강사',250,to_date('2011-09-01','YYYY-MM-DD'),NULL,102,'lamb1@hamail.net',NULL);
INSERT INTO t_professor VALUES (2002,'김영조','number1','조교수',350,to_date('1995-11-30','YYYY-MM-DD'),80,102,'number1@naver.com','http://num1.naver.com');
INSERT INTO t_professor VALUES (2003,'주승재','bluedragon','정교수',490,to_date('1992-04-29','YYYY-MM-DD'),90,102,'bdragon@naver.com',NULL);
INSERT INTO t_professor VALUES (3001,'김도형','angel1004','정교수',530,to_date('1991-10-23','YYYY-MM-DD'),110,103,'angel1004@hanmir.com',NULL);
INSERT INTO t_professor VALUES (3002,'나한열','naone10','조교수',330,to_date('2007-07-01','YYYY-MM-DD'),50,103,'naone10@empal.com',NULL);
INSERT INTO t_professor VALUES (3003,'김현정','only-u','전임강사',290,to_date('2012-02-24','YYYY-MM-DD'),NULL,103,'only_u@abc.com',NULL);
INSERT INTO t_professor VALUES (4001,'심슨','simson','정교수',570,to_date('1991-10-23','YYYY-MM-DD'),130,201,'chebin@daum.net',NULL);
INSERT INTO t_professor VALUES (4002,'최슬기','gogogo','조교수',330,to_date('2019-08-30','YYYY-MM-DD'),NULL,201,'gogogo@def.com',NULL);
INSERT INTO t_professor VALUES (4003,'박원범','mypride','조교수',310,to_date('2009-12-01','YYYY-MM-DD'),50,202,'mypride@hanmail.net',NULL);
INSERT INTO t_professor VALUES (4004,'차범철','ironman','전임강사',260,to_date('2019-01-28','YYYY-MM-DD'),NULL,202,'ironman@naver.com',NULL);
INSERT INTO t_professor VALUES (4005,'바비','standkang','정교수',500,to_date('1995-09-18','YYYY-MM-DD'),80,203,'standkang@naver.com',NULL);
INSERT INTO t_professor VALUES (4006,'전민','napeople','전임강사',220,to_date('2020-06-28','YYYY-MM-DD'),NULL,301,'napeople@jass.com',NULL);
INSERT INTO t_professor VALUES (4007,'허은','silver-her','조교수',290,to_date('2011-05-23','YYYY-MM-DD'),30,301,'silver-her@daum.net',NULL);
COMMIT;
--------------------------------------------------------------------
DROP TABLE t_department PURGE;
CREATE TABLE t_department ( 
	deptno  NUMBER(3) PRIMARY KEY ,
	dname   VARCHAR2(30) NOT NULL,
	part    NUMBER(3),
	build   VARCHAR2(20)
)TABLESPACE users;

INSERT INTO t_department VALUES (101,'컴퓨터공학과',100,'정보관');
INSERT INTO t_department VALUES (102,'멀티미디어공학과',100,'멀티미디어관');
INSERT INTO t_department VALUES (103,'소프트웨어공학과',100,'소프트웨어관');
INSERT INTO t_department VALUES (201,'전자공학과',200,'전자제어관');
INSERT INTO t_department VALUES (202,'기계공학과',200,'기계실험관');
INSERT INTO t_department VALUES (203,'화학공학과',200,'화학실습관');
INSERT INTO t_department VALUES (301,'문헌정보학과',300,'인문관');
INSERT INTO t_department VALUES (100,'컴퓨터정보학부',10,NULL);
INSERT INTO t_department VALUES (200,'메카트로닉스학부',10,NULL);
INSERT INTO t_department VALUES (300,'인문사회학부',20,NULL);
INSERT INTO t_department VALUES (10,'공과대학',NULL,NULL);
INSERT INTO t_department VALUES (20,'인문대학',NULL,NULL);
COMMIT;
--------------------------------------------------------------------
 
DROP TABLE t_student PURGE;

CREATE TABLE t_student( 
	studno    NUMBER(4) PRIMARY KEY,
	name      VARCHAR2(10) NOT NULL,
	id        VARCHAR2(20) NOT NULL UNIQUE,
	grade     NUMBER CHECK(grade BETWEEN 1 AND 6),
	jumin     CHAR(13) NOT NULL,
	birthday  DATE,
	tel       VARCHAR2(15),
	height    NUMBER(4),
	weight    NUMBER(3),
	deptno1   NUMBER(3),
	deptno2   NUMBER(3),
	profno    NUMBER(4)
) TABLESPACE users;

INSERT INTO t_student VALUES (9411,'서진수','75true',4,'9510231901813',to_date('1995-10-23','YYYY-MM-DD'),'055)381-2158',180,72,101,201,1001);
INSERT INTO t_student VALUES (9412,'서재수','pooh94',4,'9502241128467',to_date('1995-02-24','YYYY-MM-DD'),'051)426-1700',172,64,102,NULL,2001);
INSERT INTO t_student VALUES (9413,'이미경','angel000',4,'9506152123648',to_date('1995-06-15','YYYY-MM-DD'),'053)266-8947',168,52,103,203,3002);
INSERT INTO t_student VALUES (9414,'김재수','gunmandu',4,'9512251063421',to_date('1995-12-25','YYYY-MM-DD'),'02)6255-9875',177,83,201,NULL,4001);
INSERT INTO t_student VALUES (9415,'박동호','pincle1',4,'9503031639826',to_date('1995-03-03','YYYY-MM-DD'),'031)740-6388',182,70,202,NULL,4003);
INSERT INTO t_student VALUES (9511,'김신영','bingo',3,'9601232186327',to_date('1996-01-23','YYYY-MM-DD'),'055)333-6328',164,48,101,NULL,1002);
INSERT INTO t_student VALUES (9512,'신은경','jjang1',3,'9604122298371',to_date('1996-04-12','YYYY-MM-DD'),'051)418-9627',161,42,102,201,2002);
INSERT INTO t_student VALUES (9513,'오나라','nara5',3,'9609112118379',to_date('1996-09-11','YYYY-MM-DD'),'051)724-9618',177,55,202,NULL,4003);
INSERT INTO t_student VALUES (9514,'구유미','guyume',3,'9601202378641',to_date('1996-01-20','YYYY-MM-DD'),'055)296-3784',160,58,301,101,4007);
INSERT INTO t_student VALUES (9515,'임세현','shyun1',3,'9610122196482',to_date('1996-10-12','YYYY-MM-DD'),'02)312-9838',171,54,201,NULL,4001);
INSERT INTO t_student VALUES (9611,'일지매','onejimae',2,'9711291186223',to_date('1997-11-29','YYYY-MM-DD'),'02)6788-4861',182,72,101,NULL,1002);
INSERT INTO t_student VALUES (9612,'김진욱','samjang7',2,'9704021358674',to_date('1997-04-02','YYYY-MM-DD'),'055)488-2998',171,70,102,NULL,2001);
INSERT INTO t_student VALUES (9613,'안광훈','nonnon1',2,'9709131276431',to_date('1997-09-13','YYYY-MM-DD'),'053)736-4981',175,82,201,NULL,4002);
INSERT INTO t_student VALUES (9614,'김문호','munho',2,'9702261196365',to_date('1997-02-26','YYYY-MM-DD'),'02)6175-3945',166,51,201,NULL,4003);
INSERT INTO t_student VALUES (9615,'노정호','star123',2,'9712141254963',to_date('1997-12-14','YYYY-MM-DD'),'051)785-6984',184,62,301,NULL,4007);
INSERT INTO t_student VALUES (9711,'이윤나','prettygirl',1,'9808192157498',to_date('1998-08-19','YYYY-MM-DD'),'055)278-3649',162,48,101,NULL,NULL);
INSERT INTO t_student VALUES (9712,'안은수','silverwt',1,'9801051776346',to_date('1998-01-05','YYYY-MM-DD'),'02)381-5440',175,63,201,NULL,NULL);
INSERT INTO t_student VALUES (9713,'인영민','youngmin',1,'9808091786954',to_date('1998-08-09','YYYY-MM-DD'),'031)345-5677',173,69,201,NULL,NULL);
INSERT INTO t_student VALUES (9714,'김주현','kimjh',1,'9803241981987',to_date('1998-03-24','YYYY-MM-DD'),'055)423-9870',179,81,102,NULL,NULL);
INSERT INTO t_student VALUES (9715,'허우','wooya2702',1,'9802232116784',to_date('1998-02-23','YYYY-MM-DD'),'02)6122-2345',163,51,103,NULL,NULL);
COMMIT;

--------------------------------------------------------------------

DROP TABLE t_credit PURGE;

create table t_credit(
	grade      CHAR(9),
	min_point  NUMBER,
	max_point  NUMBER 
);

INSERT INTO t_credit VALUES ('A+',96,100);
INSERT INTO t_credit VALUES ('A0',90,95);
INSERT INTO t_credit VALUES ('B+',86,89);
INSERT INTO t_credit VALUES ('B0',80,85);
INSERT INTO t_credit VALUES ('C+',76,79);
INSERT INTO t_credit VALUES ('C0',70,75);
INSERT INTO t_credit VALUES ('D',0,69);
COMMIT;

--------------------------------------------------------------------

DROP TABLE t_exam01 PURGE;
CREATE TABLE t_exam01(
	studno  NUMBER,
	total NUMBER
);

INSERT INTO t_exam01 VALUES (9411,97);
INSERT INTO t_exam01 VALUES (9412,78);
INSERT INTO t_exam01 VALUES (9413,83);
INSERT INTO t_exam01 VALUES (9414,62);
INSERT INTO t_exam01 VALUES (9415,88);
INSERT INTO t_exam01 VALUES (9511,92);
INSERT INTO t_exam01 VALUES (9512,87);
INSERT INTO t_exam01 VALUES (9513,81);
INSERT INTO t_exam01 VALUES (9514,79);
INSERT INTO t_exam01 VALUES (9515,95);
INSERT INTO t_exam01 VALUES (9611,89);
INSERT INTO t_exam01 VALUES (9612,77);
INSERT INTO t_exam01 VALUES (9613,86);
INSERT INTO t_exam01 VALUES (9614,82);
INSERT INTO t_exam01 VALUES (9615,87);
INSERT INTO t_exam01 VALUES (9711,91);
INSERT INTO t_exam01 VALUES (9712,88);
INSERT INTO t_exam01 VALUES (9713,82);
INSERT INTO t_exam01 VALUES (9714,83);
INSERT INTO t_exam01 VALUES (9715,84);
COMMIT ;

-- ####################################################################################
-- 시나리오
DROP TABLE t_emp2 CASCADE CONSTRAINT;
CREATE TABLE t_emp2 (
	empno       NUMBER  PRIMARY KEY,
	name        VARCHAR2(20) NOT NULL,
	birthday    DATE,
	deptno      VARCHAR2(06) NOT NULL,
	emp_type    VARCHAR2(20),
	tel         VARCHAR2(15),
	hobby       VARCHAR2(30),
	pay         NUMBER,  
	post        VARCHAR2(20), -- 직위
	pempno      NUMBER
);

INSERT INTO t_emp2 VALUES (20000101,'나사장',TO_DATE('19740125','YYYYMMDD'),'0001','정규직','054)223-0001','음악감상',100000000,'대표이사',NULL);
INSERT INTO t_emp2 VALUES (20060101,'전부장',TO_DATE('19830322','YYYYMMDD'),'1000','정규직','02)6255-8000','독서',72000000,'부장',20000101);
INSERT INTO t_emp2 VALUES (20070201,'최일도',TO_DATE('19850415','YYYYMMDD'),'1000','정규직','02)6255-8005','운동',50000000,'과장',20060101);
INSERT INTO t_emp2 VALUES (20030331,'백원만',TO_DATE('19860525','YYYYMMDD'),'1001','정규직','02)6255-8010','자전거타기',60000000,'차장',20060101);
INSERT INTO t_emp2 VALUES (20050303,'천만득',TO_DATE('19830615','YYYYMMDD'),'1002','정규직','02)6255-8020','마라톤',56000000,'과장',20060101);
INSERT INTO t_emp2 VALUES (20066102,'일지매',TO_DATE('19820705','YYYYMMDD'),'1003','정규직','052)223-4000','음악감상',75000000,'부장',20000101);
INSERT INTO t_emp2 VALUES (20030402,'유관순',TO_DATE('19820815','YYYYMMDD'),'1004','정규직','042)998-7005','등산',51000000,'과장',20066102);
INSERT INTO t_emp2 VALUES (20060303,'김문호',TO_DATE('19810925','YYYYMMDD'),'1005','정규직','031)564-3340','등산',35000000,'대리',20066102);
INSERT INTO t_emp2 VALUES (20070112,'노정호',TO_DATE('19861105','YYYYMMDD'),'1006','정규직','054)223-4500','수영',68000000,'부장',20000101);
INSERT INTO t_emp2 VALUES (20060212,'이윤나',TO_DATE('19821215','YYYYMMDD'),'1007','정규직','054)223-4600',NULL,49000000,'과장',20070112);
INSERT INTO t_emp2 VALUES (20100101,'이태백',TO_DATE('19950125','YYYYMMDD'),'1008','계약직','051)123-4567','등산', 30000000,'',20060212);
INSERT INTO t_emp2 VALUES (20100102,'김설악',TO_DATE('19930322','YYYYMMDD'),'1009','계약직','031)234-5678','낚시', 30000000,'',20060212);
INSERT INTO t_emp2 VALUES (20100203,'최오대',TO_DATE('19920415','YYYYMMDD'),'1010','계약직','02)2345-6789','바둑', 30000000,'',20060212);
INSERT INTO t_emp2 VALUES (20100334,'박지리',TO_DATE('19910525','YYYYMMDD'),'1011','계약직','053)456-7890','노래', 30000000,'',20060212);
INSERT INTO t_emp2 VALUES (20100305,'정북악',TO_DATE('19900615','YYYYMMDD'),'1008','수습직','051)567-8901','독서', 22000000,'',20060212);
INSERT INTO t_emp2 VALUES (20106106,'유도봉',TO_DATE('19900705','YYYYMMDD'),'1009','수습직','031)678-9012','술',   22000000,'',20060212);
INSERT INTO t_emp2 VALUES (20100407,'윤주왕',TO_DATE('19900815','YYYYMMDD'),'1010','수습직','02)2789-0123','오락', 22000000,'',20060212);
INSERT INTO t_emp2 VALUES (20100308,'강월악',TO_DATE('19900925','YYYYMMDD'),'1011','인턴직','053)890-1234','골프', 20000000,'',20060212);
INSERT INTO t_emp2 VALUES (20100119,'장금강',TO_DATE('19901105','YYYYMMDD'),'1004','인턴직','042)901-2345','술',   20000000,'',20030402);
INSERT INTO t_emp2 VALUES (20100210,'나한라',TO_DATE('19901215','YYYYMMDD'),'1005','인턴직','031)345-3456','독서', 20000000,'',20060303);
COMMIT;

--------------------------------------------------------------------
DROP TABLE t_dept2 CASCADE CONSTRAINT;

CREATE TABLE t_dept2 (
	dcode   VARCHAR2(06) PRIMARY KEY,
	dname   VARCHAR2(20) NOT NULL,
	pdept   VARCHAR2(06),
	area    VARCHAR2(16)
);

INSERT INTO t_dept2 VALUES ('0001','사장실','','포항본사');
INSERT INTO t_dept2 VALUES ('1000','경영지원부','0001','서울지사');
INSERT INTO t_dept2 VALUES ('1001','재무관리팀','1000','서울지사');
INSERT INTO t_dept2 VALUES ('1002','총무팀','1000','서울지사');
INSERT INTO t_dept2 VALUES ('1003','기술부','0001','포항본사');
INSERT INTO t_dept2 VALUES ('1004','H/W지원','1003','대전지사');
INSERT INTO t_dept2 VALUES ('1005','S/W지원','1003','경기지사');
INSERT INTO t_dept2 VALUES ('1006','영업부','0001','포항본사');
INSERT INTO t_dept2 VALUES ('1007','영업기획팀','1006','포항본사');
INSERT INTO t_dept2 VALUES ('1008','영업1팀','1007','부산지사');
INSERT INTO t_dept2 VALUES ('1009','영업2팀','1007','경기지사');
INSERT INTO t_dept2 VALUES ('1010','영업3팀','1007','서울지사');
INSERT INTO t_dept2 VALUES ('1011','영업4팀','1007','울산지사');
COMMIT;

--------------------------------------------------------------------
DROP TABLE t_post PURGE;
CREATE TABLE t_post(
	post   VARCHAR2(10),
	s_age  NUMBER,
	e_age  NUMBER,
	s_year NUMBER,
	e_year NUMBER,
	s_pay  NUMBER,
	e_pay  NUMBER
);

INSERT INTO t_post VALUES ('주임',0,24,1,2,12000000,29990000);
INSERT INTO t_post VALUES ('대리',25,28,3,5,30000000,45000000);
INSERT INTO t_post VALUES ('과장',29,32,6,8,45010000,51000000);
INSERT INTO t_post VALUES ('차장',33,36,9,10,51010000,60000000);
INSERT INTO t_post VALUES ('부장',37,40,11,13,60010000,75000000);
INSERT INTO t_post VALUES ('이사',41,55,14,99,75010000,100000000);
COMMIT;

-- ####################################################################################
-- 시나리오

DROP TABLE t_cal PURGE;

CREATE TABLE t_cal(
	c_week    varchar2(1),
	c_day     varchar2(10),
	c_num_day varchar2(2)
);

INSERT INTO t_cal VALUES ('1','일','1');
INSERT INTO t_cal VALUES ('1','월','2');
INSERT INTO t_cal VALUES ('1','화','3');
INSERT INTO t_cal VALUES ('1','수','4');
INSERT INTO t_cal VALUES ('1','목','5');
INSERT INTO t_cal VALUES ('1','금','6');
INSERT INTO t_cal VALUES ('1','토','7');
INSERT INTO t_cal VALUES ('2','일','8');
INSERT INTO t_cal VALUES ('2','월','9');
INSERT INTO t_cal VALUES ('2','화','10');
INSERT INTO t_cal VALUES ('2','수','11');
INSERT INTO t_cal VALUES ('2','목','12');
INSERT INTO t_cal VALUES ('2','금','13');
INSERT INTO t_cal VALUES ('2','토','14');
INSERT INTO t_cal VALUES ('3','일','15');
INSERT INTO t_cal VALUES ('3','월','16');
INSERT INTO t_cal VALUES ('3','화','17');
INSERT INTO t_cal VALUES ('3','수','18');
INSERT INTO t_cal VALUES ('3','목','19');
INSERT INTO t_cal VALUES ('3','금','20');
INSERT INTO t_cal VALUES ('3','토','21');
INSERT INTO t_cal VALUES ('4','일','22');
INSERT INTO t_cal VALUES ('4','월','23');
INSERT INTO t_cal VALUES ('4','화','24');
INSERT INTO t_cal VALUES ('4','수','25');
INSERT INTO t_cal VALUES ('4','목','26');
INSERT INTO t_cal VALUES ('4','금','27');
INSERT INTO t_cal VALUES ('4','토','28');
INSERT INTO t_cal VALUES ('5','일','29');
INSERT INTO t_cal VALUES ('5','월','30');
INSERT INTO t_cal VALUES ('5','화','31');
COMMIT ;

-- ####################################################################################
-- 시나리오

DROP TABLE t_gift PURGE;
CREATE TABLE t_gift( 
	g_no    NUMBER,
	g_name  VARCHAR2(30),
	g_start NUMBER,
	g_end   NUMBER
);

INSERT INTO t_gift VALUES (1,'참치세트',1,100000);
INSERT INTO t_gift VALUES (2,'샴푸세트',100001,200000);
INSERT INTO t_gift VALUES (3,'세차용품세트',200001,300000);
INSERT INTO t_gift VALUES (4,'주방용품세트',300001,400000);
INSERT INTO t_gift VALUES (5,'산악용자전거',400001,500000);
INSERT INTO t_gift VALUES (6,'LCD모니터',500001,600000);
INSERT INTO t_gift VALUES (7,'노트북',600001,700000);
INSERT INTO t_gift VALUES (8,'벽걸이TV',700001,800000);
INSERT INTO t_gift VALUES (9,'드럼세탁기',800001,900000);
INSERT INTO t_gift VALUES (10,'양쪽문냉장고',900001,1000000);
COMMIT;

--------------------------------------------------------------------

DROP TABLE t_customer PURGE;
CREATE TABLE t_customer(
	c_no    NUMBER(8),
	c_name  VARCHAR2(20),
	c_jumin CHAR(13),
	c_point NUMBER
);

INSERT INTO t_customer VALUES (20110001,'서진수','8510231369824',980000);
INSERT INTO t_customer VALUES (20110002,'서재수','8502241128467',73000);
INSERT INTO t_customer VALUES (20110003,'이미경','8506152123648',320000);
INSERT INTO t_customer VALUES (20110004,'김재수','8512251063421',65000);
INSERT INTO t_customer VALUES (20110005,'박동호','8503031639826',180000);
INSERT INTO t_customer VALUES (20110006,'김신영','8601232186327',153000);
INSERT INTO t_customer VALUES (20110007,'신은경','8604212298371',273000);
INSERT INTO t_customer VALUES (20110008,'오나라','8609112118379',315000);
INSERT INTO t_customer VALUES (20110009,'김설희','8601202378641',542000);
INSERT INTO t_customer VALUES (20110010,'임세현','8610122196482',265000);
INSERT INTO t_customer VALUES (20110011,'최순규','8711291186223',110000);
INSERT INTO t_customer VALUES (20110012,'정현영','8704021358674',99000);
INSERT INTO t_customer VALUES (20110013,'안광훈','8709131276431',470000);
INSERT INTO t_customer VALUES (20110014,'모병환','8702261196365',298000);
INSERT INTO t_customer VALUES (20110015,'노정호','8712141254963',420000);
INSERT INTO t_customer VALUES (20110016,'이윤나','8808192157498',598000);
INSERT INTO t_customer VALUES (20110017,'안은수','8801051776346',625000);
INSERT INTO t_customer VALUES (20110018,'인영민','8808091786954',670000);
INSERT INTO t_customer VALUES (20110019,'김지영','8803242114563',770000);
INSERT INTO t_customer VALUES (20110020,'허우','8802232116784',730000);
COMMIT ;


-- ####################################################################################
-- 시나리오

DROP TABLE t_reg_test PURGE;
CREATE TABLE t_reg_test(
	text VARCHAR2(10)
);
INSERT ALL
	INTO t_reg_test VALUES ('ABC123')
	INTO t_reg_test VALUES ('ABC 123')
	INTO t_reg_test VALUES ('abc 123')
	INTO t_reg_test VALUES ('a1b2c3')
	INTO t_reg_test VALUES ('aabbcc123')
	INTO t_reg_test VALUES ('?/!@#$*&')
	INTO t_reg_test VALUES ('\~*().,')
	INTO t_reg_test VALUES (123123)
	INTO t_reg_test VALUES ('123abc')
SELECT * FROM dual;
COMMIT;

-- ####################################################################################
-- 시나리오
--------------------------------------------------------------------
-- INSERT ALL 실습용 테이블

DROP TABLE t_p01 PURGE;
DROP TABLE t_p02 PURGE;

CREATE TABLE t_p01(
	no   NUMBER,
	name VARCHAR2(10) 
);

CREATE TABLE t_p02(
	no NUMBER,
	name VARCHAR2(10) 
);

--------------------------------------------------------------------
-- merge 실습용 테이블

DROP TABLE t_m01 PURGE;
DROP TABLE t_m02 PURGE;
DROP TABLE t_mtotal PURGE;

CREATE TABLE t_m01(
	판매번호  VARCHAR2(8), 
	제품번호  CHAR(4), 
	수량     NUMBER, 
	금액     NUMBER
);

CREATE TABLE t_m02(
	판매번호  VARCHAR2(8), 
	제품번호  CHAR(4), 
	수량     NUMBER, 
	금액     NUMBER
);

CREATE TABLE t_mtotal(
	판매번호  VARCHAR2(8), 
	제품번호  CHAR(4), 
	수량     NUMBER, 
	금액     NUMBER
);

INSERT ALL
 INTO t_m01 VALUES ('12010101','1000',1,500)
 INTO t_m01 VALUES ('12010102','1001',1,400)
 INTO t_m01 VALUES ('12010103','1003',1,300)
 INTO t_m02 VALUES ('12010201','1004',1,600)
 INTO t_m02 VALUES ('12010202','1000',1,500)
 INTO t_m02 VALUES ('12010203','1005',1,700)
 SELECT * FROM dual ;
COMMIT;


--------------------------------------------------------------------
-- DML 에러 로깅 기능 실습용 테이블
DROP Table t_dml_err PURGE;

CREATE TABLE t_dml_err(
	NO   NUMBER PRIMARY KEY,
	name VARCHAR2(10)
);

INSERT ALL
	INTO t_dml_err VALUES (1,'AAA')
	INTO t_dml_err VALUES (2,'BBB')
SELECT  * FROM dual ;
COMMIT;

CREATE OR REPLACE PROCEDURE print_table( p_query IN VARCHAR2 )
AUTHID CURRENT_USER
IS
    l_theCursor     INTEGER default dbms_sql.open_cursor;
    l_columnValue   VARCHAR2(4000);
    l_status        INTEGER;
    l_descTbl       dbms_sql.desc_tab;
    l_colCnt        NUMBER;
BEGIN
    EXECUTE IMMEDIATE
    'alter session set
        nls_date_format=''yyyy-mm-dd:hh24:mi:ss'' ';
    dbms_sql.parse(  l_theCursor,  p_query, dbms_sql.native );
    dbms_sql.describe_columns
    ( l_theCursor, l_colCnt, l_descTbl );
    FOR i IN 1 .. l_colCnt LOOP
        dbms_sql.define_column
        (l_theCursor, i, l_columnValue, 4000);
    END LOOP;
    l_status := dbms_sql.EXECUTE(l_theCursor);
    WHILE ( dbms_sql.fetch_rows(l_theCursor) > 0 ) LOOP
        FOR i IN 1 .. l_colCnt LOOP
            dbms_sql.column_value
            ( l_theCursor, i, l_columnValue );
            dbms_output.put_line
            ( rpad( l_descTbl(i).col_name, 30 )
              || ': ' ||
              l_columnValue );
        END LOOP;
        dbms_output.put_line( '-----------------' );
    END LOOP;
    EXECUTE IMMEDIATE
        'alter session set nls_date_format=''yyyy-mm-dd'' ';
EXCEPTION
    WHEN OTHERS THEN
      EXECUTE IMMEDIATE
          'alter session set nls_date_format=''yyyy-mm-dd'' ';
      raise;
END;
 /


--------------------------------------------------------------------
-- 제약조건 테스트용 테이블

DROP TABLE t_novalidate PURGE;

CREATE TABLE t_novalidate(
	no NUMBER PRIMARY KEY,
	name VARCHAR2(10) NOT NULL
);

INSERT INTO t_novalidate VALUES (1,'AAA');
INSERT INTO t_novalidate VALUES (2,'BBB');
INSERT INTO t_novalidate VALUES (3,'CCC');
COMMIT;

DROP TABLE t_validate PURGE;
CREATE TABLE t_validate(
	NO    NUMBER
    CONSTRAINT tv_no_pk PRIMARY KEY ,
    name  VARCHAR2(10)
    CONSTRAINT tv_name_nn NOT NULL
);

INSERT INTO t_validate VALUES (1,'AAA');
INSERT INTO t_validate VALUES (2,'BBB');
INSERT INTO t_validate VALUES (3,'CCC');
COMMIT;

DROP TABLE t_enable PURGE;
CREATE TABLE t_enable(
	NO    NUMBER
    CONSTRAINT te_no_pk PRIMARY KEY ,
	name  VARCHAR2(10)
    CONSTRAINT te_name_nn NOT NULL
);



--------------------------------------------------------------------
-- 집계함수 연습을 위한 테이블
DROP TABLE t_product PURGE;
CREATE TABLE t_product(
	p_code  NUMBER(3) PRIMARY KEY,
	p_name  VARCHAR2(20) NOT NULL,
	p_price NUMBER
);

INSERT INTO t_product VALUES (100,'새우짱',800);
INSERT INTO t_product VALUES (101,'감자짱',900);
INSERT INTO t_product VALUES (102,'맛큰산',1000);
INSERT INTO t_product VALUES (103,'에이서',900);
INSERT INTO t_product VALUES (104,'맛짱구',800);
INSERT INTO t_product VALUES (105,'샤보레',1500);
COMMIT;

DROP TABLE t_sales PURGE ;
CREATE TABLE t_sales(
	s_date VARCHAR2(8) NOT NULL,
	s_code NUMBER NOT NULL,
	s_qty  NUMBER,
	s_total NUMBER,
	s_store VARCHAR2(5)
);

INSERT INTO t_sales VALUES ('20180101',100,3,2400,'1000');
INSERT INTO t_sales VALUES ('20180101',101,5,4500,'1001');
INSERT INTO t_sales VALUES ('20180101',102,2,2000,'1003');
INSERT INTO t_sales VALUES ('20180101',103,6,5400,'1004');
INSERT INTO t_sales VALUES ('20180102',102,2,2000,'1000');
INSERT INTO t_sales VALUES ('20180102',103,5,4500,'1002');
INSERT INTO t_sales VALUES ('20180102',104,3,2400,'1002');
INSERT INTO t_sales VALUES ('20180102',105,2,3000,'1000');
INSERT INTO t_sales VALUES ('20180103',100,10,8000,'1004');
INSERT INTO t_sales VALUES ('20180103',100,2,1600,'1000');
INSERT INTO t_sales VALUES ('20180103',100,3,2400,'1001');
INSERT INTO t_sales VALUES ('20180103',101,4,3600,'1003');
INSERT INTO t_sales VALUES ('20180104',100,2,1600,'1002');
INSERT INTO t_sales VALUES ('20180104',100,4,3200,'1003');
INSERT INTO t_sales VALUES ('20180104',100,5,4000,'1004');
INSERT INTO t_sales VALUES ('20180104',101,3,2700,'1001');
INSERT INTO t_sales VALUES ('20180104',101,4,3600,'1002');
INSERT INTO t_sales VALUES ('20180104',101,3,2700,'1003');
INSERT INTO t_sales VALUES ('20180104',102,4,4000,'1001');
INSERT INTO t_sales VALUES ('20180104',102,2,2000,'1002');
INSERT INTO t_sales VALUES ('20180104',103,2,1800,'1003');
COMMIT;

DROP TABLE t_member PURGE;
CREATE TABLE t_member(
	m_no         NUMBER(4) NOT NULL,
	m_name       VARCHAR2(20) NOT NULL,
	m_jumin      CHAR(13) PRIMARY KEY,
	m_passwd     VARCHAR2(20) NOT NULL,
	m_id         VARCHAR2(20) NOT NULL UNIQUE,
	m_question   VARCHAR2(20),
	m_answer     VARCHAR2(20)
);

INSERT INTO t_member VALUES (1001,'서유딩','8510231234567','a1234','simson','아내이름?','김초딩');
INSERT INTO t_member VALUES (1002,'김초딩','8509222345678','b1234','bobby','남편이름?','서유딩');
INSERT INTO t_member VALUES (1003,'서새알','1410234567890','c1234','daddy','아빠이름?','서유딩');
INSERT INTO t_member VALUES (1004,'서공룡알','1609223456789','d1234','mommy','엄마이름?','김초딩');
COMMIT;


