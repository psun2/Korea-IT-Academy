--8. 확장(변환)함수, 그룹함수
--▶ 그룹함수
--전체 데이터를 그룹별로 구분하여 통계적인 결과를 구하기 위해서 사용하는 함수
--
--▷ sum() avg() max() min()
-- 합계 평균 최대값 최소값 등을 계산할 경우 null 값을 nvl() 함수로 제거해야 한다.
-- 그룹함수는 null값을 제외하고 계산한다.
-- select sum( salary ) from employees;
--select sum( salary ) from employees where salary>=15000; ->조건을 넣을 수도 있음
-- select avg( salary ) from employees;
-- select max( salary ) from employees;
-- select min( salary ) from employees;
-- max() min()은 문자 타입, 날짜 타입도 적용 가능하다.
--▷ count()
-- null은 제외하고 중복도 개수로 센다.
-- select count( commission_pct ) from employees;
-- select count( distinct commission_pct ) from employees;
-- select count( * ) from employees;     전체행의 수
--▷group by
-- select department_id, avg( salary ) from employees group by department_id;
-- select job_id, avg( salary ) from employees group by job_id;
-- 주의 select 뒤에는 그룹으로 묶을 수 있는 컬럼만 올 수 있다.
-- 
-- select job_id, avg( salary ), max( salary ), min( salary ) from employees group by job_id;
-- 
--select job_id,count(*),avg(salary),max(first_name) from employees where salary >=10000 group by job_id;
-- 
-- having
-- group by 적용 뒤에 나온 결과에 특정 조건을 부여한다.
-- select job_id, avg( salary ), max( salary ), min( salary ) from employees 
-- group by job_id having avg(salary)>=5000;
-- 
--select p_id,name,kor,class from exam,student where kor=(select max(kor)from exam,student where p_id=id and class =1) and p_id=id and class =1
--//1반의 국어점수가 가장높은 사람의 아이디, 이름 , 국어점수


/* 그룹함수 */
select sum(kor) from exam;

select 
sum(kor), avg(kor), max(kor), min(kor), count(kor),
sum(eng), avg(eng), max(eng), min(eng), count(eng),
sum(math), avg(math), max(math), min(math), count(math)
from exam;


--select title,
--sum(kor), avg(kor), max(kor), min(kor), count(kor),
--sum(eng), avg(eng), max(eng), min(eng), count(eng),
--sum(math), avg(math), max(math), min(math), count(math)
--from exam; -- error 
--그룹함수는 데이터를 묶어서 나오게 합니다. 즉 묶여있지 않는한 에러 입니다.

select title, hakgi, sum(kor)
from exam
group by title, hakgi;
--중간	1	242
--중간	2	168
--기말	1	254
--기말	2	66

select title, hakgi, sum(kor) -- 2
from exam 
where kor >= 60 -- 처리순서 1
group by title, hakgi;
--중간	1	176
--중간	2	168
--기말	1	254

-- 위의 where 와 처리순서가 다름.
-- having은 구룹으로 먼저 묶고 그 다음에 조건을 검색
-- where는 조건으로 거른뒤, 구룹핑
select title, hakgi, sum(kor)
from exam 
where kor >= 60 
group by title, hakgi
having sum(kor) >= 200;

--exam 
-- 시험 종류별로 국어, 영어, 수학의 최대점수를 출력하세요
-- 단 학생 평균이 70점 이상인 사람들만 그룹화 할것
-- 시험 종류는 오름 차순
select pid, title, kor, eng, math , max(kor), max(eng), max(math)
from exam
where trunc((nvl(kor, 0) + nvl(eng, 0) + nvl(math, 0)) / 3) >= 70
group by pid, title, kor, eng, math
order by title desc;

/* join */
-- 조인 예제를 위한 업데이트
-- name => pid
-- no 추가

update exam set pid = 'aaa' where pid = '한가인';

select * from exam, member; -- 전부 곱하기가 되어 들어가고 있음

select * from exam, member
where pid = id; -- pid 와 id 값이 같은 요소들만 출력

select exam.*, name, birth from exam, member
where pid = id; 

select exam.*, name, birth, no from exam, member
where pid = id;  -- error - 누구의 no 인지 햇깔림

select exam.*, name, birth, member.no from exam, member
where pid = id;

/* outter join */
select exam.*, name, birth, member.no from exam, member
where pid = id(+); -- + 의 의미 : pid는 있어야 하고 id는 추가야
