-- 메뉴테이블 생성
create table menu(
id varchar2(20),
name varchar2(1000),
price number(8)
);

-- 주문테이블 생성
create table order_mm(
id number(4),
mid varchar2(20),
regdate date,
cnt number(4)
);

-- 테이블 조회 항목 : table_name, tablespace_name, ini_trans
SELECT table_name, tablespace_name, ini_trans FROM all_all_tables where owner = 'TEST_1';

-- 주문 테이블 컬럼 조회 항목 : column_name, data_type, data_length, nullable, data_default
select column_name, data_type, data_length, nullable, data_default from user_tab_columns where table_name = 'ORDER_MM';
