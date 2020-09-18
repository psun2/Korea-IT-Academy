-- ���̺� �����̽� ����
create tablespace ts1
datafile 'C:\oraclexe\app\oracle\oradata\db_test\s1.dbf'
size 100000000;

-- ����Ȯ��
select * from dba_tablespaces where tablespace_name = 'TS1';

-- ��������
create user test_1 identified by 123456
default tablespace ts1
temporary tablespace temp;

-- ����Ȯ��
select * from all_users where username = 'TEST_1';

-- ���Ѻο�
grant connect, resource to test_1;

-- ��� ���
select TABLESPACE_NAME, block_size, SEGMENT_SPACE_MANAGEMENT, STATUS from dba_tablespaces;

-- ��� ���
select * from all_users;