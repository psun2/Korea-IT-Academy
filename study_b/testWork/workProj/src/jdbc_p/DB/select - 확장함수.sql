--�� �� ��ȯ �Լ�
-- 
--            <- TO_NUMBER   
--                 TO_CHAR ->
-- Number                         character 
-- 
--  date                            character 
--timestamp    
--            <- TO_DATE 
--            <- TO_timestamp
--                 TO_CHAR ->
-- 
--
--�� TO_DATE
-- ���ڿ��� ��¥��
-- to_date( ����¥��, �����ġ� )   
-- select sysdate, sysdate - to_date( '10/1/1', 'yy/mm/dd' ) from dual;
-- ����
-- YYYY    �� �ڸ� ����
-- YY   �� �ڸ� ����
-- MM   ���� ���ڷ�
-- MON   ���� ���ĺ�����
-- DAY   ���� ǥ��
-- DY   ���� ��� ǥ��
-- AM �Ǵ� PM  ���� ����
-- HH �Ǵ� HH12  12�ð�
-- HH24   24�ð�
-- MI   ��
-- SS   ��
--
--
--�� TO_CHAR
--         to_char(������, '��������')   ===> ���������� ������ ���� ���̰� ���� �Ѵ�. ª�� ��� ##���� ǥ����
-- ��¥�� ���ڸ� ���ڷ� ��ȯ
-- select to_char( sysdate, 'yy/mm/dd hh24:mi:ss' ) from dual;
-- select to_char( sysdate, 'yy"Ҵ" mm"��" dd"��" (dy) hh:mi') from dual;
----���ڿ��� ������ ���"" �� ��� ǥ��
-- 
-- 9   �� �ڸ��� ���� ǥ��   ( 1111, ��99999�� ) 1111 
-- 0   �� �κ��� 0���� ǥ��  ( 1111, ��099999�� ) 001111
-- $   �޷� ��ȣ�� �տ� ǥ��  ( 1111, ��$99999�� ) $1111
-- .   �Ҽ����� ǥ��   ( 1111, ��99999.99�� ) 1111.00
-- ,   Ư�� ��ġ�� , ǥ��   ( 1111, ��99,999�� ) 1,111
-- MI   �����ʿ� ? ��ȣ ǥ��  ( 1111, ��99999MI�� ) 1111-
-- PR   �������� <>�� ǥ��   ( -1111, ��99999PR�� ) <1111>
-- EEEE   ������ ǥ��   ( 1111, ��9.999EEEE�� ) 1.11E+03
-- V   10�� n�� ���Ѱ����� ǥ��  ( 1111, ��999V99�� ) 111100
-- B   ������ 0���� ǥ��   ( 1111, ��B9999.99�� ) 1111.00
-- L   ������ȭ    ( 1111, ��L9999�� )
-- select to_char( salary, '0999999' ) from employees;
-- select to_char( -salary, '999999PR' ) from employees;
-- select to_char( 1111, '99.99EEEE' ) from dual;   1.11E+03
-- select to_char( 1111, 'B9999.99' ) from dual;   ǥ������ ������ #���� ǥ��
-- select to_char( 1111, 'L99999' ) from dual;   \1111

--�� TO_NUMBER
-- ���ڸ� ���ڷ� ��ȯ
-- select to_number('123,456.78','99999,999.999999')+100 from dual;
--         select sysdate, to_number(to_char(sysdate,'yyyy'),'9999')-1988 from dual
--
--�� nvl()
-- null�� 0 �Ǵ� �ٸ� ������ ��ȯ�ϴ� �Լ�--�÷��� �ڷ����� ��ġ�ؾ߸� ��� ����
-- select salary, salary*12*nvl(commission_pct, 0 ) from employees;
-- select last_name, manager_id, nvl( to_char( manager_id, 9999 ), 'CEO' ) from employees;
--
--
--�� decode() 
-- switch~ case���� ���� ���� ��츦 ������ �� �ֵ��� �ϴ� �Լ�
-- select last_name, department_id, decode( department_id, 90, '�濵������', 60, '���α׷���', 100, '�λ��' )  
--from employees;
--
--
--�� case()
--          if��ó��
-- decode() �Լ��� �����ϳ� decode() �Լ��� ������ ������ ��츸 ����������
-- case() �Լ��� �پ��� �񱳿����ڷ� ������ ������ �� �ִ�.
--
--select last_name, department_id, 
--case 
--  when department_id=90 then '�濵������' 
--  when department_id=60 then '���α׷���' 
--  when department_id=100 then '�λ��' 
--  else '�����'
--end 
--as �Ҽ�
-- from employees;

select 
to_char(123.456, '999999999999'), --           123
to_char(123456.456, '999999999999'), --        123456
to_char(123456.456, '000'), -- ���ڸ��� ####
to_char(123.456, '00000000000'), --  00000000123
to_char(123456.78912, '99999999.9999999999'), --    123456.7891200000
to_char(123456.78912, '99999999.99') --    123456.79
from dual;

select
to_number('123.456', '999999999.99999999') + 100, -- 223.456
'123.456' + 100 -- 223.456 ?????? => ���ڿ��� ���ؼ��� Ư�� �����ϴ�....
from dual;

select
sysdate, to_char(sysdate, 'yyyy'), -- 2020
to_char(sysdate, 'yy'), -- 20
to_char(sysdate, 'MM'), -- 07
to_char(sysdate, 'MON'), -- 7�� 
to_char(sysdate, 'DAY'), -- ������
to_char(sysdate, 'DY'), -- ��
to_char(sysdate, 'AM'), -- ����
to_char(sysdate, 'HH'), -- 04
to_char(sysdate, 'HH12'), -- 04
to_char(sysdate, 'HH24'), -- 16
to_char(sysdate, 'MI'), -- 17
to_char(sysdate, 'SS') -- 23
from dual;

---2003Ҵ 10�� 23�� (��) 14:23:15
-- ������ 10�� ������ ��� ���� ������� ����ϼ���.

select sysdate, 
to_char(sysdate, 'yyyy') || 'Ҵ' ||
to_char(sysdate, 'MM') || '��' ||
to_char(sysdate, 'DD') || '��' ||
to_char(sysdate, 'DD') || '��' ||
to_char(sysdate, '(DY) HH24:MI:SS') as "���� �� ��"
from dual;
-- 2020Ҵ07��15��15��(��) 16:56:09

select 
--'2020-07-15'+100, --�̰� �ȵ� 
to_date('2020-07-15', 'yyyy-mm-dd')+100, --100�� ��
to_date('2020-07-15 13:34:21', 'yyyy-mm-dd hh24:mi:ss')+100  
from dual;

/* nvl - null ���� ��ü */
select name, nvl (kor, 0), nvl (eng, 0), nvl (math, 0), 
nvl (kor + eng + math, 0) as "����", 
nvl (trunc((kor + eng + math) / 3), 0) as "��� ������",
nvl (trunc(kor + eng + math), 0) as tot,
nvl (trunc((kor + eng + math) / 3), 0) as avg
from exam;


/* decode */
select bus.*,
decode(type, '����', '����', '�Ķ�', '�ó�', '���', '����') as kind
from bus;

-- birth�� �̿��Ͽ� ����ϼ���
-- 2010��� : 0��, 2000���: 10��, 1990 : 20��, 1980 : 30��, 1970 : 40��, 1960 : 50��
select name, birth,
decode(trunc(to_char(birth, 'yyyy'),-1),2010, 0, 2000, 10, 1990, 20, 1980, 30, 1970, 40, 1960, 50) as age
from member;
-- trunc �ɼǿ� -1 �� �ϸ� �ڿ��� ���ڸ����� ��������, �ڸ����� �ٲ��� �ʽ��ϴ�.

-- ����
select 
trunc(123.456789, 2),
trunc(-123.456789, 3),
trunc(987.456789, 4),
trunc(-987.456789, 5),
trunc(-987.456789, -1)
from dual;

/* case */

select kor,
case
when kor >= 90 then 'A'
when kor >= 80 then 'B'
when kor >= 70 then 'C'
when kor >= 60 then 'D'
when kor >= 50 then 'E'
else 'F'
end
as kor_gread
from exam;

-- ��� ����̾簡

select exam.*, 
nvl (kor, 0), nvl (eng, 0), nvl (math, 0),
trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3) as avg,
case
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 10 then '��'
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 9 then '��'
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 8 then '��'
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 7 then '��'
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 6 then '��'
else '��'
end
as grade
from exam;

-------------------------------------------------------------------------------
select name,sysdate,
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')) as ���ػ���,
case
when
sysdate>to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
then 
add_months(to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')), 12)
else
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
end as �ٰ��û���,
 
case
when
to_char(
case
when
sysdate>to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
then 
add_months(to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')), 12)
else
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
end
,'dy') = '��'
then
 
 
case
when
sysdate>to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
then 
add_months(to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')), 12)
else
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
end-1
 
 
else
case
when
sysdate>to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
then 
add_months(to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')), 12)
else
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
end
end as ������Ƽ��,
 
 
trunc
(case
when
to_char(
case
when
sysdate>to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
then 
add_months(to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')), 12)
else
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
end
,'dy') = '��'
then
 
 
case
when
sysdate>to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
then 
add_months(to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')), 12)
else
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
end-1
 
 
else
case
when
sysdate>to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
then 
add_months(to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')), 12)
else
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
end
end-sysdate) as DDay
 
 
from member;
