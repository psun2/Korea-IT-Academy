create table test1 (
id number(4),
name char(10),
email varchar2(50),
height number(6,2), -- �ڸ��� �Ҽ��� ���ڸ� ��� �Ҹ�
birth date,
regdate timestamp,
hobby nvarchar2(10)
);

-- ���� ��� ���̺� ����
select * from tab;

-- ��밡�� ���� ���� ��� �÷��� �� �� ����
select * from user_tab_columns;

select * from user_tab_columns where table_name = 'TEST1';

select * from test1;