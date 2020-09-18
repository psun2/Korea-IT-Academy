create table test1 (
id number(4),
name char(10),
email varchar2(50),
height number(6,2), -- 자리에 소수점 두자리 라는 소리
birth date,
regdate timestamp,
hobby nvarchar2(10)
);

-- 현재 모든 테이블 보기
select * from tab;

-- 사용가가 만든 탭의 모든 컬럼을 볼 수 있음
select * from user_tab_columns;

select * from user_tab_columns where table_name = 'TEST1';

select * from test1;