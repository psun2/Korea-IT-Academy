--▶ 조인
-- 사원번호가 110인 사원의 부서명을 알고 싶다면
-- select * from employees where employee_id=110;
-- 먼저 사원 테이블에서 사원 번호를 검색한 후
-- select * from departments where department_id=100;
-- 부서 테이블에서 부서번호를 검색해야 한다.

--▷ equi join
-- 두 테이블에서 공통적으로 존재하는 컬럼의 값이 일치되는 행을 연결해서 결과를 생성
-- select * from employees, departments where employees.department_id = departments.department_id;
-- 조건을 주지 않을 경우 두 테이블의 모든 레코드가 결합한 곱집합이 발생한다.
-- 조건은 조인한 테이블 개수에서 ?1 한 만큼 주어야 한다.
-- 
-- 동일한 컬럼명 앞에는 테이블명으로 소속을 밝혀야 한다. 
-- 테이블 명이 길 경우 별칭을 부여한다.
-- select * from employees e, departments d where e.department_id = d.department_id;
-- 
-- select * from employees e, departments d 
-- where e.department_id = d.department_id and last_name='King';

--▷ non-equi join
-- where 절의 조인 조건을 = 연산자 이외의 비교 연산자를 사용한다.
--
--시험의 종류가 같고 국어 점수가 cutline 테이블의 jumsu 보다 높은 사람

select exam.* from exam, cutline
where kor >= jum;

-- 시험일정이 cuteline day 이후 인 시험 정보와 학생이름, 취미를 출력하세요.

select exam.*, name, hobby
from exam, member, cutline
where regdate >= day and id = exam.pid;

select * from member
where friend = id; -- 내가 나를 좋아 하는 사람만 나옴

-- 한테이블이지만 둘로 나눠서 생각하겠다 self join
select me.*, you.name from member me, member you
where me.friend = you.id(+);
-- null 안나옴 outer join (+) 사용 = > 앞의 조건에 해당안되는 부분은 outer join을 사용 하여 출력


select avg(e1.kor) from exam e1, exam e2;
select e2.* from exam e1, exam e2;

-- Error -- mysql 에서는 가능
select e2.* from exam e1, exam e2
where e2.kor >= avg(e1.kor);

/* querry */
select rownum 로우넘, member.* from member
order by name; -- desc

/* 서브 쿼리 */
/* 정렬 되어 있는 테이블로 보겟다 */
 select rownum 로우넘, t1.* from
 (select * from member order by name) t1;
 
 
 /* 서브쿼리 - 테이블로도 사용하고, 한 가지의 컬럼으로도 사용 가능 */
 /* join 과 유사하나 join 보다 더 많은 일을 할 수 있다 */
 select avg(kor) from exam;
 
 select * from exam
where kor >= (select avg(kor) from exam); 

select max(no) + 1 from exam;

insert into exam (no, pid, hakgi, title, kor, eng, math)
values
(14, 'aaa', 2, '중간', 56, 63, 51);

insert into exam 
(no, pid, hakgi, title, kor, eng, math)
values
((select max(no) +1 from exam), 'bbb', 2, '중간', 76, 73, 71);

select pid from exam
where math >= 80;

select * from member where id in('bbb', 'ddd', 'eee');

select * from member where id in(select pid from exam
where math >= 80);

select kor from exam
where pid = 'bbb';

select * from exam
where
kor >= any (32, 72, 78);

select * from exam
where
kor >= any (select kor from exam where pid = 'bbb');

select * from exam
where
kor >= all (32, 72, 78);

select * from exam
where
kor >= all (select kor from exam where pid = 'bbb');

select * from exam
where
kor >= (select kor from exam where pid = 'bbb' and kor is not null);

-- 생일파티 날짜를 구하고 생일파티가 가까운 3인을 출력하세요
-- 생일파티는 토, 일요일은 배재 한다.

select member.*, 
to_char(birth, 'MM-DD')
from member;

-----------------------------------------------------------------------


select * from (
select rownum rnum, t3.* from (
select t2.*, 
case
when to_char(nb,'dy') = '토' then nb - 1
when to_char(nb,'dy') = '일' then nb - 2
else nb
end
as pd
from
(select t1.*,
case
when sysdate > nowBirth then add_months(nowBirth,12)
else nowBirth
end 
as nb
from (select member.*, to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')) 
as nowBirth from member) t1) t2 
order by pd) t3) t4
where rnum <=3;

select member.*, to_date(to_char(sysdate,'yyyy')||to_char(birth,'/mm/dd')) as nowBirth from member;

















