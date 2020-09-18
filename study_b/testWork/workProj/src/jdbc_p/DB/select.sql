/*
�� SELECT  (�ڷḦ �����ִ� ����)

�� �⺻��
 SELECT [DISTINCT] {*, column[Alias], ...} FROM ���̺��;
�� select * from employees;    -> �����Ͷ�  ��θ�   employees�� ���̺���
 select employee_id, last_name from employees;  -> �����Ͷ� id�� �̸��� 
 
�� ��� ������
 select first_name, salary + 100 from employees;
 select first_name, salary - 100 from employees;
 select first_name, salary * 100 from employees;
 select first_name, salary / 100 from employees;
 
�� null
 zero, �� ������ �ƴϴ�. 
 ��Ȯ�� �� �� �� ���� ���� �ǹ��Ѵ�.
 � ������ �� �� ������ ���� �����Ѵ�.
 ? Ȥ�� ���Ѵ��� �ǹ��̹Ƿ� ����, �Ҵ�, �񱳰� �Ұ����ϴ�.
 
 select last_name, salary*commission_pct from employees;
 null �� ��찡 �ֱ� ������ ����� null�� ���´�.
 
�� Alias
 select last_name, salary*12 as ���� from employees;
 as ���� ����
 select last_name, salary*12 as ���� ���� from employees;
 �����̳� $ _ # �� Ư�����ڸ� ���� ��� �� ����ǥ�� ����Ѵ�.
 
�� Concatenation
 select last_name, ' is a ', job_id from employees;
 select last_name || ' is a ' || job_id from employees;
 �޸� ��ſ� ����ϸ� ���ڿ��� ����Ǿ� ��µȴ�.
�� DISTINCT
 select job_id from employees;
 select distinct job_id from employees;
 �ߺ��Ǵ� �÷��� �� ������ �����ش�.
 */

/* ��Ģ���� */
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
    bus; -- ��Ģ���� ����

-- ���� ctrl + F7

SELECT
    height + 100,
    no + 5
FROM
    member; -- no �� String type ������ ��Ģ������ �˴ϴ�(??)
 
/* ���ο� �̸� �ο� */ 
    
SELECT
    member.*,
    height + 100  AS zz, -- ���ο� �̸� �ο�
    no + 5        AS kk -- ���ο� �̸� �ο�
FROM
    member; -- no �� String type ������ ��Ģ������ �˴ϴ�(??)
    
 /* Concatenation */   
    
select member.*, name + ' �˾Ҿ��' from member; -- error

select member.*,
name || ' �˾Ҿ��' AS na ok FROM
member; -- error

SELECT
    member.*,
    name || ' �˾Ҿ��' AS "na ok"
FROM
    member;

/* distinct */ => �ߺ� ����
SELECT DISTINCT
    hobby
FROM
    member;

/* �ߺ����� X => �̸��� �ߺ����� �ʱ⶧���� ���� �ٳ��� */
SELECT DISTINCT hobby, name FROM
member;


/*
    exam ���̺��� �����ϼ���
    �̸�, ����, ����, ����
    
    ������ ���̺��� �̿��Ͽ� ����, ����� ����ϼ���
*/

INSERT ALL INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '�Ѱ���',
    78,
    56,
    35
) INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '�ΰ���',
    98,
    86,
    85
) INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '�ﰡ��',
    78,
    76,
    75
) INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '�簡��',
    18,
    36,
    85
) INTO exam (
    name,
    kor,
    eng,
    math
) VALUES (
    '������',
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
where name like '%ȣ%';

select * from member
where name like '%��%';

-- �达�� ������� ����ϼ���
select * from member
where name like '��%';

select * from member
where id = 'ddd' or id = 'bbb';

select * from member
where id in ('ddd','bbb');

select * from member
where birth >= '1990-01-01' and birth <='1999-12-31';

select * from member
where birth between '1990-01-01' and '1999-12-31';

-- between �� ������ �߿� �մϴ�.!
select * from member
where birth between '1999-12-31' and '1990-01-01'; -- �̰� �ȳ���

select * from member
where height = null; -- �ȳ��ɴϴ�.

-- null�� ���� ���� �ݴϴ�.
select * from member
where height is null; 

-- null�� �ƴ� ���� �����ݴϴ�.
select * from member
where height is not null; 

/* ���� */
select * from bus
order by type;

/* ���� - �������� */
select * from bus
order by type desc;

/* ���� �պ��� ������� ���ǿ� ���� ��� ���� �մϴ�. */
select * from bus
order by type desc, district;

select * from bus
order by type desc, district desc;

select * from bus
where price >= 2000
order by type desc, district desc;

-- ����� 60�� �̻��� �л����� �б� ����, Ÿ��Ʋ �ø� ��� ���� ������ �����Ͽ� ����ϼ���
update exam set hakgi = 1, title = '�߰�';

INSERT ALL 
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('�Ѱ���',78,56, 35, 1,'�⸻')
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('�ΰ���',98,86,85, 1,'�⸻')
INTO exam (name,kor,eng,math,hakgi,title)  VALUES ('�ﰡ��',78,76,75,1,'�⸻')  
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('�簡��',18,36,85,2,'�⸻') 
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('������',48,76,37,2,'�⸻') 
INTO exam (name,kor,eng,math,hakgi,title)  VALUES ('������',58,96,95,2,'�߰�')  
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('ĥ����',68,66,65,2,'�߰�') 
INTO exam (name,kor,eng,math,hakgi,title) VALUES ('�Ȱ���',100,97,13,2,'�߰�') 
SELECT
      *
  FROM
      dual;
      

select * from exam;

select exam.*, (kor+eng+math)/3 as avg from exam 
where (kor+eng+math)/3 >= 60
order by hakgi desc, title, (kor+eng+math)/3 desc;

-- �ݿø�
select 
round(123.456789, 2),
round(-123.456789, 3),
round(987.456789, 4),
round(-987.456789, 5)
from dual;

-- ����
select 
trunc(123.456789, 2),
trunc(-123.456789, 3),
trunc(987.456789, 4),
trunc(-987.456789, 5)
trunc(-987.456789, -1)
from dual;

-- ������
select 
mod(15,7),
mod(4,2)
from dual;

-- ���� ��
select
ABS(-15),
ABS(15),
ABS(-10010),
ABS(10010)
from dual;

-- ���ڿ�
select 
upper('aBcd Efg'), -- �빮��
lower('aBcd Efg'), -- �ҹ���
initcap('aBcd Efg'), -- ����
length('aBcd Efg') -- ����
from dual;

-- ������ �ڿ��� ���� ã���ϴ�. �ڿ� ������ ���ڴ� 2��° ���� �ϴ� �������� ã���ϴ�.
select 
instr('korea koo asdko qwekrk fewf kk', 'k') as in1, -- 1
instr('korea koo asdko qwekrk fewf kk', 'k', 4) as in2, -- 7
instr('korea koo asdko qwekrk fewf kk', 'k', 4,2) as in3, -- 14
instr('korea koo asdko qwekrk fewf kk', 'k', -1) as in4, -- 30
instr('korea koo asdko qwekrk fewf kk', 'k', -4) as in5, -- 22
instr('korea koo asdko qwekrk fewf kk', 'k', -4, 2) as in6 -- 20
from dual;

-- subString �� ���� ���ڿ��� �ڸ��ϴ�.
select
substr('korea koo asdko qwekrk fewf kk', 3) as in1, -- rea koo asdko qwekrk fewf kk
substr('korea koo asdko qwekrk fewf kk', 3,5) as in2, -- rea k
substr('korea koo asdko qwekrk fewf kk', -9) as in3, -- k fewf kk
substr('korea koo asdko qwekrk fewf kk', -9, 5) as in4 -- k few
from dual;

-- Ȯ���ڸ��� ����ϼ��� : aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt
select
substr('aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt', INSTR('aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt', '.', -1)) as "Ȯ �� ��"
from dual;

-- Ȯ���ڸ��� ����ϼ��� : aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt - teacher
select
substr('aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt', INSTR('aaaa.bbbb.ccc.dddddd.ee.ddddd.xx.a.txt', '.', -1) +1) as "Ȯ �� ��"
from dual;


select
substr('��������������̿��',5,1) as test
from dual;

-- exam ���̺��� ����� ����Ͽ� ����̾簡�� ����ϼ���
select exam.*, trunc((kor + eng + math) / 3) as avg,
substr('������������̿����', trunc(((kor + eng + math) / 3))/10, 1) as grade
from exam;

-- exam ���̺��� ����� ����Ͽ� ����̾簡�� ����ϼ��� - teacher
select exam.*, trunc((kor + eng + math) / 3) as avg,
substr('��������������̿����', trunc((kor + eng + math) / 3 /10)+1, 1) as grade
from exam;