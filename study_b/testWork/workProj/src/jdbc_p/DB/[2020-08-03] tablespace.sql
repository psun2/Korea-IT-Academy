create tablespace korea_2
datafile 'C:\oraclexe\app\oracle\oradata\korea\korea_bbb.dbf'
size 100000000;

-- 13. ����, ����(grant)
-- 3. ��������
-- ������ : korea_b
-- pw : 123456
create user korea_b IDENTIFIED by 123456
default tablespace korea_2
temporary tablespace temp;

-- ���� Ȯ��
select * from all_users;
--XS$NULL	2147483638	14/05/29
--KOREA_B	48	20/08/03
--APEX_040000	47	14/05/29
--APEX_PUBLIC_USER	45	14/05/29
--FLOWS_FILES	44	14/05/29
--HR	43	14/05/29
--MDSYS	42	14/05/29
--ANONYMOUS	35	14/05/29
--XDB	34	14/05/29
--CTXSYS	32	14/05/29
--APPQOSSYS	30	14/05/29
--DBSNMP	29	14/05/29
--ORACLE_OCM	21	14/05/29
--DIP	14	14/05/29
--OUTLN	9	14/05/29
--SYSTEM	5	14/05/29
--SYS	0	14/05/29

-- ���̺����̽� ���
select * from dba_tablespaces;
--SYSTEM	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	MANUAL	DISABLED	NOT APPLY	NO	HOST	NO	
--SYSAUX	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	AUTO	DISABLED	NOT APPLY	NO	HOST	NO	
--UNDOTBS1	8192	65536		1	2147483645	2147483645		65536	ONLINE	UNDO	LOGGING	NO	LOCAL	SYSTEM	NO	MANUAL	DISABLED	NOGUARANTEE	NO	HOST	NO	
--TEMP	8192	1048576	1048576	1		2147483645	0	1048576	ONLINE	TEMPORARY	NOLOGGING	NO	LOCAL	UNIFORM	NO	MANUAL	DISABLED	NOT APPLY	NO	HOST	NO	
--USERS	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	AUTO	DISABLED	NOT APPLY	NO	HOST	NO	
--KOREA_2	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	AUTO	DISABLED	NOT APPLY	NO	HOST	NO	

-- ������ ����
select * from dba_data_files;
--C:\ORACLEXE\APP\ORACLE\ORADATA\XE\USERS.DBF	4	USERS	104857600	12800	AVAILABLE	4	YES	11811160064	1441792	1280	103809024	12672	ONLINE
--C:\ORACLEXE\APP\ORACLE\ORADATA\XE\SYSAUX.DBF	2	SYSAUX	692060160	84480	AVAILABLE	2	YES	34359721984	4194302	1280	691011584	84352	ONLINE
--C:\ORACLEXE\APP\ORACLE\ORADATA\XE\UNDOTBS1.DBF	3	UNDOTBS1	398458880	48640	AVAILABLE	3	YES	524288000	64000	640	397410304	48512	ONLINE
--C:\ORACLEXE\APP\ORACLE\ORADATA\XE\SYSTEM.DBF	1	SYSTEM	377487360	46080	AVAILABLE	1	YES	629145600	76800	1280	376438784	45952	SYSTEM
--C:\ORACLEXE\APP\ORACLE\ORADATA\KOREA\KOREA_BBB.DBF	5	KOREA_2	100007936	12208	AVAILABLE	5	NO	0	0	0	98959360	12080	ONLINE

-- ��Ʈ�� ����
select * from v$controlfile;
--	C:\ORACLEXE\APP\ORACLE\ORADATA\XE\CONTROL.DBF	NO	16384	594

-- �α� ����
select * from v$log;
--1	1	3	52428800	512	1	NO	INACTIVE	376962	20/07/27	432985	20/07/30
--2	1	4	52428800	512	1	NO	CURRENT	432985	20/07/30	281474976710655	

select * from v$logfile;
--2		ONLINE	C:\ORACLEXE\APP\ORACLE\FAST_RECOVERY_AREA\XE\ONLINELOG\O1_MF_2_HKONNXVX_.LOG	YES
--1		ONLINE	C:\ORACLEXE\APP\ORACLE\FAST_RECOVERY_AREA\XE\ONLINELOG\O1_MF_1_HKONNXMN_.LOG	YES

select * from v$log t1, v$logfile t2
where t1.group# = t2.group#;
--2	1	4	52428800	512	1	NO	CURRENT	432985	20/07/30	281474976710655		2		ONLINE	C:\ORACLEXE\APP\ORACLE\FAST_RECOVERY_AREA\XE\ONLINELOG\O1_MF_2_HKONNXVX_.LOG	YES
--1	1	3	52428800	512	1	NO	INACTIVE	376962	20/07/27	432985	20/07/30	1		ONLINE	C:\ORACLEXE\APP\ORACLE\FAST_RECOVERY_AREA\XE\ONLINELOG\O1_MF_1_HKONNXMN_.LOG	YES

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- ���� �ο� (grant : �����ϴ�)
grant connect, resource, create table to korea_b;

-- ���� ���� (revoke : �����ϴ�)
revoke create table from korea_b;
revoke resource from korea_b; -- ���ҽ��� ���� �� �־�� ���̺� ������ ���� �� �ֽ��ϴ�.

-- ���� ���� (��ȣ����) alter
alter user korea_b identified by 987654;

-- ���� Ȯ��
select * from dba_sys_privs where grantee = 'KOREA_B'; -- ���� �ο��� ������ ����
select * from role_tab_privs; -- �̰� ���� ? �̰� ���� ������ ~~!

-- ���� ���� drop
drop user korea_b cascade; -- ���� ������ ������ ���� �Ǿ� �־�� �մϴ�.

-- ���̺� �����̽� ����
drop tablespace korea_2;
-- ���� ������ dbf�� ������ ���̴� �׳� delete ���ѵ� �˴ϴ�.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

���̺����̽� tp_2 �� �����ϼ���.
C:\oraclexe\app\oracle\oradata\korea\tp_bbb
�뷮 : 100mb

������ �����ϰ� ������ �ο��ϼ���
user_b / 123456
create session, create table, create view, create sequence, connect, resource

-- ��������
create tablespace tp_2
datafile 'C:\oraclexe\app\oracle\oradata\korea\tp_bbb.dbf'
size 102400;

-- ���� Ȯ��
select * from dba_tablespaces;
--TP_2	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	AUTO	DISABLED	NOT APPLY	NO	HOST	NO	

-- ���� ����
create user user_b identified by 123456
default tablespace tp_2
temporary tablespace temp;

-- ���� �ο�
grant create session, create table, create view, create sequence, connect, resource to user_b;