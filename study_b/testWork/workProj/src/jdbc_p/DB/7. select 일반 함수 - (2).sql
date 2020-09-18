-- 7. select �Ϲ� �Լ�

--�� lpad()
-- ������ ���� �� ���ʿ� ���ڸ� ä���.
-- select lpad( 'Hello World', 20, '#' ) from dual;
---- 20: byte �� , �ѱ��� 2byte
--
--�� rpad()
-- ���� ���� �� �����ʿ� ���ڸ� ä���.
-- select rpad( 'Hello World', 20, '#' ) from dual;
--�� ltrim()
-- select ltrim( 'aaaHello Worldaaa', 'a' ) from dual;  Hello Worldaaa ���� Ư�� ���� ����
-- select ltrim( '   Hello World   ' ) from dual;   Hello World ���ڿ� �յ� ���� ����
--�� rtrim()
-- select rtrim( 'aaaHello Worldaaa', 'a' ) from dual;  aaaHello World ���� Ư�� ���� ����
-- select rtrim( '   Hello World   ' ) from dual;   Hello World ���ڿ� �� ���� ����
--�� trim()
-- select last_name, trim( 'A' from last_name) from employees;   �յ��� Ư�� ���� ����

/* pad */
select lpad('�������� �Ϳ�����', 30 ,'?') as lpad from dual; -- ?????????????�������� �Ϳ�����
-- ?????????????�������� �Ϳ����� 13 + 1 + (8 * 2) = 30byte
-- ? => 1byte, �ѱ� => 1byte, ���� => 1byte
--  ���ڿ�, byte��,  ��ĭ����  : �ѱ��� 2btye  : ?????????????�������� �Ϳ�����

select lpad('�������� �Ϳ�����',10,'?') as lpad©�� from dual;
--  ���ڿ�, byte��,  ��ĭ����  : ���ڿ����� > byte ũ�� : ���ڿ��� ©���� ���� -  '�������� '

select rpad('�������� �Ϳ�����', 30 ,'?') as rpad from dual; -- �������� �Ϳ�����?????????????
select rpad('�������� �Ϳ�����', 10 ,'?') as rpad©�� from dual; -- '��������  '

/* trim */
select ltrim('????��? ����? �����? ��??????', '?') as ltrim from dual; -- ��? ����? �����? ��??????
select rtrim('????��? ����? �����? ��??????', '?') as rtrim from dual; -- ????��? ����? �����? ��
select trim('????��? ����? �����? ��??????', '?') as trim from dual; -- Error (������ ����)

select ltrim('????��? ����? �����? ��??????', '?') as ltrim from dual; -- ��? ����? �����? ��??????
select rtrim('????��? ����? �����? ��??????', '?') as rtrim from dual; -- ????��? ����? �����? ��
select trim('????��? ����? �����? ��??????', '?') as trim from dual; -- Error

select ltrim('     ��? ����? �����? ��     ') as ltrim from dual; --      ��? ����? �����? ��     
select rtrim('     ��? ����? �����? ��     ') as rtrim from dual; --           ��? ����? �����? ��
select trim('     ��? ����? �����? ��     ') as trim from dual; -- ��? ����? �����? ��

/* sysdate */ -- today
select sysdate from dual;
select member.*, sysdate as today, trunc((sysdate - birth) / 365) as age from member;

select regdate, sysdate from member;

select regdate, months_between (sysdate, regdate) from member; -- ��� ������...
select regdate, trunc(months_between (sysdate, regdate)) from member; -- ��� ������...
select regdate, trunc(add_months (regdate, 6)) as "6���� ��" from member; -- 6���� ��
select regdate, last_day(regdate) as "�� ���� ������ ��" from member; -- �� ���� ������ ��
select regdate, next_day(sysdate, '��') as "������ ��Ÿ�� ����" from member; -- ����� ���� ���� �������� ã���ϴ�.

-- ������ ����� ������ ����ϼ��� ���� : �� 19��
select member.*, trunc((sysdate - birth) / 365) as age from member
where trunc((sysdate - birth) / 365) >= 19;

select member.*, trunc((sysdate - birth) / 365) as age from member
where add_months(birth, 19*12) < sysdate; -- 19 * 12 ���� ��................

