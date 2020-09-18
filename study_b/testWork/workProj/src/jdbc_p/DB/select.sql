/*
▶ SELECT  (자료를 보여주는 구문)

▷ 기본형
 SELECT [DISTINCT] {*, column[Alias], ...} FROM 테이블명;
▷ select * from employees;    -> 가져와라  모두를   employees의 테이블에서
 select employee_id, last_name from employees;  -> 가져와라 id나 이름만 
 
▷ 산술 연산자
 select first_name, salary + 100 from employees;
 select first_name, salary - 100 from employees;
 select first_name, salary * 100 from employees;
 select first_name, salary / 100 from employees;
 
▷ null
 zero, 빈 공간은 아니다. 
 미확정 값 알 수 없는 값을 의미한다.
 어떤 값인지 알 수 없지만 값이 존재한다.
 ? 혹은 무한대의 의미이므로 연산, 할당, 비교가 불가능하다.
 
 select last_name, salary*commission_pct from employees;
 null 인 경우가 있기 때문에 결과는 null이 나온다.
 
▷ Alias
 select last_name, salary*12 as 연봉 from employees;
 as 생략 가능
 select last_name, salary*12 as “연 봉” from employees;
 공백이나 $ _ # 등 특수문자를 넣을 경우 쌍 따옴표를 사용한다.
 
▷ Concatenation
 select last_name, ' is a ', job_id from employees;
 select last_name || ' is a ' || job_id from employees;
 콤마 대신에 사용하면 문자열이 연결되어 출력된다.
▷ DISTINCT
 select job_id from employees;
 select distinct job_id from employees;
 중복되는 컬럼을 한 번씩만 보여준다.
 */

/* 사칙연산 */
SELECT
    50 + 3; -- error

SELECT
    5 + 3
FROM
    dual;

SELECT
    bus.*,
    price + 100,
    price - 100,
    price * 100,
    price / 100
FROM
    bus; -- 사칙연산 가능

-- 정렬 ctrl + F7

SELECT
    height + 100,
    no + 5
FROM
    member; -- no 는 String type 이지만 사칙연산이 됩니다(??)
 
/* 새로운 이름 부여 */ 
    
SELECT
    member.*,
    height + 100  AS zz, -- 새로운 이름 부여
    no + 5        AS kk -- 새로운 이름 부여
FROM
    member; -- no 는 String type 이지만 사칙연산이 됩니다(??)
    
 /* Concatenation */   
    
select member.*, name + ' 알았어요' from member; -- error

select member.*,
name || ' 알았어요' AS na ok FROM
member; -- error

SELECT
    member.*,
    name || ' 알았어요' AS "na ok"
FROM
    member;

/* distinct */ => 중복 제거
SELECT DISTINCT
    hobby
FROM
    member;

/* 중복제거 X => 이름은 중복되지 않기때문에 전부 다나옴 */
SELECT DISTINCT hobby, name FROM
member;


/*
    exam 테이블을 생성하세요
    이름, 국어, 영어, 수학
    
    생성된 테이블을 이용하여 총점, 평균을 출력하세요
*/

INSERT ALL INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '한가인',
    78,
    56,
    35
) INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '두가인',
    98,
    86,
    85
) INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '삼가인',
    78,
    76,
    75
) INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '사가인',
    18,
    36,
    85
) INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '오가인',
    48,
    76,
    37
) SELECT
      *
  FROM
      dual;

SELECT
    exam.*,
    kor + eng + math              AS tot,
    ( kor + eng + math ) / 3          AS avg
FROM
    exam;

select * from member
where birth = '1994-07-13';

select * from member
where birth > '1994-07-13';

/* like */
select * from member
where name like '%호%';

select * from member
where name like '%ㅎ%';

-- 김씨인 사람들을 출력하세요
select * from member
where name like '김%';

select * from member
where id = 'ddd' or id = 'bbb';

select * from member
where id in ('ddd','bbb');

select * from member
where birth >= '1990-01-01' and birth <='1999-12-31';

select * from member
where birth between '1990-01-01' and '1999-12-31';

-- between 은 순서가 중요 합니다.!
select * from member
where birth between '1999-12-31' and '1990-01-01'; -- 이건 안나옴

select * from member
where height = null; -- 안나옵니다.

-- null인 값만 보여 줍니다.
select * from member
where height is null; 

-- null이 아닌 값만 보여줍니다.
select * from member
where height is not null; 

/* 정렬 */
select * from bus
order by type;

/* 정렬 - 내림차순 */
select * from bus
order by type desc;

/* 정렬 앞부터 순차대로 조건에 맞춰 계속 정렬 합니다. */
select * from bus
order by type desc, district;

select * from bus
order by type desc, district desc;

select * from bus
where price >= 2000
order by type desc, district desc;

-- 평균이 60점 이상인 학생들을 학기 내림, 타이틀 올림 평균 내림 순으로 정렬하여 출력하세요
update exam set hakgi = 1, title = '중간';

INSERT ALL 
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('한가인',78,56, 35, 1,'기말')
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('두가인',98,86,85, 1,'기말')
INTO exam (name,kor,eng,math,hakgi,title)  VALUES ('삼가인',78,76,75,1,'기말')  
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('사가인',18,36,85,2,'기말') 
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('오가인',48,76,37,2,'기말') 
INTO exam (name,kor,eng,math,hakgi,title)  VALUES ('육가인',58,96,95,2,'중간')  
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('칠가인',68,66,65,2,'중간') 
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('팔가인',100,97,13,2,'중간') 
SELECT
      *
  FROM
      dual;
      

select * from exam;

select exam.*, (kor+eng+math)/3 as avg from exam 
where (kor+eng+math)/3 >= 60
order by hakgi desc, title, (kor+eng+math)/3 desc;

-- 반올림
select 
round(123.456789, 2),
round(-123.456789, 3),
round(987.456789, 4),
round(-987.456789, 5)
from dual;

-- 버림
select 
trunc(123.456789, 2),
trunc(-123.456789, 3),
trunc(987.456789, 4),
trunc(-987.456789, 5)
trunc(-987.456789, -1)
from dual;

-- 나머지
select 
mod(15,7),
mod(4,2)
from dual;

-- 절대 값
select
ABS(-15),
ABS(15),
ABS(-10010),
ABS(10010)
from dual;

-- 문자열
select 
upper('aBcd Efg'), -- 대문자
lower('aBcd Efg'), -- 소문자
initcap('aBcd Efg'), -- 원본
length('aBcd Efg') -- 길이
from dual;

-- 음수는 뒤에서 부터 찾습니다. 뒤에 나오는 숫자는 2번째 포함 하는 숫자인지 찾습니다.
select 
instr('korea koo asdko qwekrk fewf kk', 'k') as in1, -- 1
instr('korea koo asdko qwekrk fewf kk', 'k', 4) as in2, -- 7
instr('korea koo asdko qwekrk fewf kk', 'k', 4,2) as in3, -- 14
instr('korea koo asdko qwekrk fewf kk', 'k', -1) as in4, -- 30
instr('korea koo asdko qwekrk fewf kk', 'k', -4) as in5, -- 22
instr('korea koo asdko qwekrk fewf kk', 'k', -4, 2) as in6 -- 20
from dual;

-- subString 과 같이 문자열을 자릅니다.
select
substr('korea koo asdko qwekrk fewf kk', 3) as in1, -- rea koo asdko qwekrk fewf kk
substr('korea koo asdko qwekrk fewf kk', 3,5) as in2, -- rea k
substr('korea koo asdko qwekrk fewf kk', -9) as in3, -- k fewf kk
substr('korea koo asdko qwekrk fewf kk', -9, 5) as in4 -- k few
from dual;

-- 확자자명을 출력하세요 : aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt
select
substr('aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt', INSTR('aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt', '.', -1)) as "확 장 자"
from dual;

-- 확자자명을 출력하세요 : aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt - teacher
select
substr('aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt', INSTR('aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt', '.', -1) +1) as "확 장 자"
from dual;


select
substr('가가가가가가양미우수',5,1) as test
from dual;

-- exam 테이블에서 평균을 계산하여 수우미양가를 출력하세요
select exam.*, trunc((kor + eng + math) / 3) as avg,
substr('가가가가가양미우수수', trunc(((kor + eng + math) / 3))/10, 1) as grade
from exam;

-- exam 테이블에서 평균을 계산하여 수우미양가를 출력하세요 - teacher
select exam.*, trunc((kor + eng + math) / 3) as avg,
substr('가가가가가가양미우수수', trunc((kor + eng + math) / 3 /10)+1, 1) as grade
from exam;