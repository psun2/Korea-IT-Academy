--▶ 형 변환 함수
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
--▷ TO_DATE
-- 문자열을 날짜로
-- to_date( ‘날짜’, ‘형식’ )   
-- select sysdate, sysdate - to_date( '10/1/1', 'yy/mm/dd' ) from dual;
-- 형식
-- YYYY    네 자리 연도
-- YY   두 자리 연도
-- MM   월을 숫자로
-- MON   월을 알파벳으로
-- DAY   요일 표현
-- DY   요일 약어 표현
-- AM 또는 PM  오전 오후
-- HH 또는 HH12  12시간
-- HH24   24시간
-- MI   분
-- SS   초
--
--
--▷ TO_CHAR
--         to_char(데이터, '포맷형식')   ===> 포맷형식이 데이터 보다 길이가 길어야 한다. 짧을 경우 ##으로 표현됨
-- 날짜나 숫자를 문자로 변환
-- select to_char( sysdate, 'yy/mm/dd hh24:mi:ss' ) from dual;
-- select to_char( sysdate, 'yy"年" mm"月" dd"日" (dy) hh:mi') from dual;
----문자열을 결합할 경우"" 로 묶어서 표현
-- 
-- 9   한 자리의 숫자 표현   ( 1111, ‘99999’ ) 1111 
-- 0   앞 부분을 0으로 표현  ( 1111, ‘099999’ ) 001111
-- $   달러 기호를 앞에 표현  ( 1111, ‘$99999’ ) $1111
-- .   소수점을 표시   ( 1111, ‘99999.99’ ) 1111.00
-- ,   특정 위치에 , 표시   ( 1111, ‘99,999’ ) 1,111
-- MI   오른쪽에 ? 기호 표시  ( 1111, ‘99999MI’ ) 1111-
-- PR   음수값을 <>로 표현   ( -1111, ‘99999PR’ ) <1111>
-- EEEE   과학적 표현   ( 1111, ‘9.999EEEE’ ) 1.11E+03
-- V   10을 n승 곱한값으로 표현  ( 1111, ‘999V99’ ) 111100
-- B   공백을 0으로 표현   ( 1111, ‘B9999.99’ ) 1111.00
-- L   지역통화    ( 1111, ‘L9999’ )
-- select to_char( salary, '0999999' ) from employees;
-- select to_char( -salary, '999999PR' ) from employees;
-- select to_char( 1111, '99.99EEEE' ) from dual;   1.11E+03
-- select to_char( 1111, 'B9999.99' ) from dual;   표현식이 작으면 #으로 표현
-- select to_char( 1111, 'L99999' ) from dual;   \1111

--▷ TO_NUMBER
-- 문자를 숫자로 변환
-- select to_number('123,456.78','99999,999.999999')+100 from dual;
--         select sysdate, to_number(to_char(sysdate,'yyyy'),'9999')-1988 from dual
--
--▷ nvl()
-- null을 0 또는 다른 값으로 변환하는 함수--컬럼의 자료형이 일치해야만 사용 가능
-- select salary, salary*12*nvl(commission_pct, 0 ) from employees;
-- select last_name, manager_id, nvl( to_char( manager_id, 9999 ), 'CEO' ) from employees;
--
--
--▷ decode() 
-- switch~ case문과 같이 여러 경우를 선택할 수 있도록 하는 함수
-- select last_name, department_id, decode( department_id, 90, '경영지원실', 60, '프로그래머', 100, '인사부' )  
--from employees;
--
--
--▷ case()
--          if문처럼
-- decode() 함수와 동일하나 decode() 함수는 조건이 동일한 경우만 가능하지만
-- case() 함수는 다양한 비교연산자로 조건을 제시할 수 있다.
--
--select last_name, department_id, 
--case 
--  when department_id=90 then '경영지원실' 
--  when department_id=60 then '프로그래머' 
--  when department_id=100 then '인사부' 
--  else '생산부'
--end 
--as 소속
-- from employees;

select 
to_char(123.456, '999999999999'), --           123
to_char(123456.456, '999999999999'), --        123456
to_char(123456.456, '000'), -- 모자를시 ####
to_char(123.456, '00000000000'), --  00000000123
to_char(123456.78912, '99999999.9999999999'), --    123456.7891200000
to_char(123456.78912, '99999999.99') --    123456.79
from dual;

select
to_number('123.456', '999999999.99999999') + 100, -- 223.456
'123.456' + 100 -- 223.456 ?????? => 문자열에 대해서만 특히 관대하다....
from dual;

select
sysdate, to_char(sysdate, 'yyyy'), -- 2020
to_char(sysdate, 'yy'), -- 20
to_char(sysdate, 'MM'), -- 07
to_char(sysdate, 'MON'), -- 7월 
to_char(sysdate, 'DAY'), -- 수요일
to_char(sysdate, 'DY'), -- 수
to_char(sysdate, 'AM'), -- 오후
to_char(sysdate, 'HH'), -- 04
to_char(sysdate, 'HH12'), -- 04
to_char(sysdate, 'HH24'), -- 16
to_char(sysdate, 'MI'), -- 17
to_char(sysdate, 'SS') -- 23
from dual;

---2003年 10月 23日 (월) 14:23:15
-- 생일을 10년 단위로 묶어서 각각 몇명인지 출력하세요.

select sysdate, 
to_char(sysdate, 'yyyy') || '年' ||
to_char(sysdate, 'MM') || '月' ||
to_char(sysdate, 'DD') || '日' ||
to_char(sysdate, 'DD') || '日' ||
to_char(sysdate, '(DY) HH24:MI:SS') as "생년 월 일"
from dual;
-- 2020年07月15日15日(수) 16:56:09

select 
--'2020-07-15'+100, --이건 안됨 
to_date('2020-07-15', 'yyyy-mm-dd')+100, --100일 뒤
to_date('2020-07-15 13:34:21', 'yyyy-mm-dd hh24:mi:ss')+100  
from dual;

/* nvl - null 값을 대체 */
select name, nvl (kor, 0), nvl (eng, 0), nvl (math, 0), 
nvl (kor + eng + math, 0) as "총점", 
nvl (trunc((kor + eng + math) / 3), 0) as "평균 ㅅㄱㅂ",
nvl (trunc(kor + eng + math), 0) as tot,
nvl (trunc((kor + eng + math) / 3), 0) as avg
from exam;


/* decode */
select bus.*,
decode(type, '빨강', '광역', '파랑', '시내', '녹색', '마을') as kind
from bus;

-- birth를 이용하여 출력하세요
-- 2010년대 : 0대, 2000년대: 10대, 1990 : 20대, 1980 : 30대, 1970 : 40대, 1960 : 50대
select name, birth,
decode(trunc(to_char(birth, 'yyyy'),-1),2010, 0, 2000, 10, 1990, 20, 1980, 30, 1970, 40, 1960, 50) as age
from member;
-- trunc 옵션에 -1 을 하면 뒤에서 한자리수를 버리지만, 자리수는 바뀌지 않습니다.

-- 버림
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

-- 평균 수우미양가

select exam.*, 
nvl (kor, 0), nvl (eng, 0), nvl (math, 0),
trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3) as avg,
case
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 10 then '수'
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 9 then '수'
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 8 then '우'
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 7 then '미'
when trunc((nvl (kor, 0) + nvl (eng, 0) + nvl (math, 0)) / 3 / 10) = 6 then '양'
else '가'
end
as grade
from exam;

-------------------------------------------------------------------------------
select name,sysdate,
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')) as 올해생일,
case
when
sysdate>to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
then 
add_months(to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')), 12)
else
to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd'))
end as 다가올생일,
 
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
,'dy') = '토'
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
end as 생일파티날,
 
 
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
,'dy') = '토'
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
