create tablespace korea_2
datafile 'C:\oraclexe\app\oracle\oradata\korea\korea_bbb.dbf'
size 100000000;

-- 13. 계정, 권한(grant)
-- 3. 계정생성
-- 계정명 : korea_b
-- pw : 123456
create user korea_b IDENTIFIED by 123456
default tablespace korea_2
temporary tablespace temp;

-- 계정 확인
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

-- 테이블스페이스 목록
select * from dba_tablespaces;
--SYSTEM	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	MANUAL	DISABLED	NOT APPLY	NO	HOST	NO	
--SYSAUX	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	AUTO	DISABLED	NOT APPLY	NO	HOST	NO	
--UNDOTBS1	8192	65536		1	2147483645	2147483645		65536	ONLINE	UNDO	LOGGING	NO	LOCAL	SYSTEM	NO	MANUAL	DISABLED	NOGUARANTEE	NO	HOST	NO	
--TEMP	8192	1048576	1048576	1		2147483645	0	1048576	ONLINE	TEMPORARY	NOLOGGING	NO	LOCAL	UNIFORM	NO	MANUAL	DISABLED	NOT APPLY	NO	HOST	NO	
--USERS	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	AUTO	DISABLED	NOT APPLY	NO	HOST	NO	
--KOREA_2	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	AUTO	DISABLED	NOT APPLY	NO	HOST	NO	

-- 데이터 파일
select * from dba_data_files;
--C:\ORACLEXE\APP\ORACLE\ORADATA\XE\USERS.DBF	4	USERS	104857600	12800	AVAILABLE	4	YES	11811160064	1441792	1280	103809024	12672	ONLINE
--C:\ORACLEXE\APP\ORACLE\ORADATA\XE\SYSAUX.DBF	2	SYSAUX	692060160	84480	AVAILABLE	2	YES	34359721984	4194302	1280	691011584	84352	ONLINE
--C:\ORACLEXE\APP\ORACLE\ORADATA\XE\UNDOTBS1.DBF	3	UNDOTBS1	398458880	48640	AVAILABLE	3	YES	524288000	64000	640	397410304	48512	ONLINE
--C:\ORACLEXE\APP\ORACLE\ORADATA\XE\SYSTEM.DBF	1	SYSTEM	377487360	46080	AVAILABLE	1	YES	629145600	76800	1280	376438784	45952	SYSTEM
--C:\ORACLEXE\APP\ORACLE\ORADATA\KOREA\KOREA_BBB.DBF	5	KOREA_2	100007936	12208	AVAILABLE	5	NO	0	0	0	98959360	12080	ONLINE

-- 컨트롤 파일
select * from v$controlfile;
--	C:\ORACLEXE\APP\ORACLE\ORADATA\XE\CONTROL.DBF	NO	16384	594

-- 로그 파일
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

-- 권한 부여 (grant : 승인하다)
grant connect, resource, create table to korea_b;

-- 권한 삭제 (revoke : 폐지하다)
revoke create table from korea_b;
revoke resource from korea_b; -- 리소스도 같이 빼 주어야 테이블 생성을 막을 수 있습니다.

-- 계정 수정 (암호변경) alter
alter user korea_b identified by 987654;

-- 권한 확인
select * from dba_sys_privs where grantee = 'KOREA_B'; -- 현재 부여된 권한이 없음
select * from role_tab_privs; -- 이게 뭐지 ? 이건 하지 마세요 ~~!

-- 계정 삭제 drop
drop user korea_b cascade; -- 계정 삭제시 접속이 해제 되어 있어야 합니다.

-- 테이블 스페이스 삭제
drop tablespace korea_2;
-- 남은 폴더와 dbf는 껍데기 뿐이니 그냥 delete 시켜도 됩니다.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

테이블스페이스 tp_2 를 생성하세요.
C:\oraclexe\app\oracle\oradata\korea\tp_bbb
용량 : 100mb

계정을 생성하고 권한을 부여하세요
user_b / 123456
create session, create table, create view, create sequence, connect, resource

-- 공간생성
create tablespace tp_2
datafile 'C:\oraclexe\app\oracle\oradata\korea\tp_bbb.dbf'
size 102400;

-- 생성 확인
select * from dba_tablespaces;
--TP_2	8192	65536		1	2147483645	2147483645		65536	ONLINE	PERMANENT	LOGGING	NO	LOCAL	SYSTEM	NO	AUTO	DISABLED	NOT APPLY	NO	HOST	NO	

-- 유저 생성
create user user_b identified by 123456
default tablespace tp_2
temporary tablespace temp;

-- 권한 부여
grant create session, create table, create view, create sequence, connect, resource to user_b;