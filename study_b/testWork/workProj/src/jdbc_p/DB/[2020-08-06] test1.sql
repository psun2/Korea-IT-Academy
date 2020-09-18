-- 테이블 스페이스 생성
create tablespace ts1
datafile 'C:\oraclexe\app\oracle\oradata\db_test\s1.dbf'
size 100000000;

-- 생성확인
select * from dba_tablespaces where tablespace_name = 'TS1';

-- 유저생성
create user test_1 identified by 123456
default tablespace ts1
temporary tablespace temp;

-- 생성확인
select * from all_users where username = 'TEST_1';

-- 권한부여
grant connect, resource to test_1;

-- 결과 출력
select TABLESPACE_NAME, block_size, SEGMENT_SPACE_MANAGEMENT, STATUS from dba_tablespaces;

-- 결과 출력
select * from all_users;