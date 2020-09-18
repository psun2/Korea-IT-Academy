-- 7. select 일반 함수

--▷ lpad()
-- 오른쪽 정렬 후 왼쪽에 문자를 채운다.
-- select lpad( 'Hello World', 20, '#' ) from dual;
---- 20: byte 수 , 한글은 2byte
--
--▷ rpad()
-- 왼쪽 정렬 후 오른쪽에 문자를 채운다.
-- select rpad( 'Hello World', 20, '#' ) from dual;
--▷ ltrim()
-- select ltrim( 'aaaHello Worldaaa', 'a' ) from dual;  Hello Worldaaa 앞의 특정 문자 제거
-- select ltrim( '   Hello World   ' ) from dual;   Hello World 문자열 앞뒤 공백 제거
--▷ rtrim()
-- select rtrim( 'aaaHello Worldaaa', 'a' ) from dual;  aaaHello World 뒤의 특정 문자 제거
-- select rtrim( '   Hello World   ' ) from dual;   Hello World 문자열 뒤 공백 제거
--▷ trim()
-- select last_name, trim( 'A' from last_name) from employees;   앞뒤의 특정 문자 제거

/* pad */
select lpad('선생님은 귀여워요', 30 ,'?') as lpad from dual; -- ?????????????선생님은 귀여워요
-- ?????????????선생님은 귀여워요 13 + 1 + (8 * 2) = 30byte
-- ? => 1byte, 한글 => 1byte, 공백 => 1byte
--  문자열, byte수,  빈칸글자  : 한글은 2btye  : ?????????????선생님은 귀여워요

select lpad('선생님은 귀여워요',10,'?') as lpad짤림 from dual;
--  문자열, byte수,  빈칸글자  : 문자열길이 > byte 크기 : 문자열이 짤려서 리턴 -  '선생님은 '

select rpad('선생님은 귀여워요', 30 ,'?') as rpad from dual; -- 선생님은 귀여워요?????????????
select rpad('선생님은 귀여워요', 10 ,'?') as rpad짤림 from dual; -- '선생님은  '

/* trim */
select ltrim('????왜? 나만? 뭐라고? 해??????', '?') as ltrim from dual; -- 왜? 나만? 뭐라고? 해??????
select rtrim('????왜? 나만? 뭐라고? 해??????', '?') as rtrim from dual; -- ????왜? 나만? 뭐라고? 해
select trim('????왜? 나만? 뭐라고? 해??????', '?') as trim from dual; -- Error (공백이 없음)

select ltrim('????왜? 나만? 뭐라고? 해??????', '?') as ltrim from dual; -- 왜? 나만? 뭐라고? 해??????
select rtrim('????왜? 나만? 뭐라고? 해??????', '?') as rtrim from dual; -- ????왜? 나만? 뭐라고? 해
select trim('????왜? 나만? 뭐라고? 해??????', '?') as trim from dual; -- Error

select ltrim('     왜? 나만? 뭐라고? 해     ') as ltrim from dual; --      왜? 나만? 뭐라고? 해     
select rtrim('     왜? 나만? 뭐라고? 해     ') as rtrim from dual; --           왜? 나만? 뭐라고? 해
select trim('     왜? 나만? 뭐라고? 해     ') as trim from dual; -- 왜? 나만? 뭐라고? 해

/* sysdate */ -- today
select sysdate from dual;
select member.*, sysdate as today, trunc((sysdate - birth) / 365) as age from member;

select regdate, sysdate from member;

select regdate, months_between (sysdate, regdate) from member; -- 몇개월 지났다...
select regdate, trunc(months_between (sysdate, regdate)) from member; -- 몇개월 지났다...
select regdate, trunc(add_months (regdate, 6)) as "6개월 뒤" from member; -- 6개월 뒤
select regdate, last_day(regdate) as "각 달의 마지막 날" from member; -- 각 달의 마지막 날
select regdate, next_day(sysdate, '수') as "다음에 나타날 요일" from member; -- 현재로 부터 다음 수요일을 찾습니다.

-- 성년인 사람의 정보를 출력하세요 성년 : 만 19세
select member.*, trunc((sysdate - birth) / 365) as age from member
where trunc((sysdate - birth) / 365) >= 19;

select member.*, trunc((sysdate - birth) / 365) as age from member
where add_months(birth, 19*12) < sysdate; -- 19 * 12 개월 뒤................

