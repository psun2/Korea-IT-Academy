--8. Ȯ��(��ȯ)�Լ�, �׷��Լ�
--�� �׷��Լ�
--��ü �����͸� �׷캰�� �����Ͽ� ������� ����� ���ϱ� ���ؼ� ����ϴ� �Լ�
--
--�� sum() avg() max() min()
-- �հ� ��� �ִ밪 �ּҰ� ���� ����� ��� null ���� nvl() �Լ��� �����ؾ� �Ѵ�.
-- �׷��Լ��� null���� �����ϰ� ����Ѵ�.
-- select sum( salary ) from employees;
--select sum( salary ) from employees where salary>=15000; ->������ ���� ���� ����
-- select avg( salary ) from employees;
-- select max( salary ) from employees;
-- select min( salary ) from employees;
-- max() min()�� ���� Ÿ��, ��¥ Ÿ�Ե� ���� �����ϴ�.
--�� count()
-- null�� �����ϰ� �ߺ��� ������ ����.
-- select count( commission_pct ) from employees;
-- select count( distinct commission_pct ) from employees;
-- select count( * ) from employees;     ��ü���� ��
--��group by
-- select department_id, avg( salary ) from employees group by department_id;
-- select job_id, avg( salary ) from employees group by job_id;
-- ���� select �ڿ��� �׷����� ���� �� �ִ� �÷��� �� �� �ִ�.
-- 
-- select job_id, avg( salary ), max( salary ), min( salary ) from employees group by job_id;
-- 
--select job_id,count(*),avg(salary),max(first_name) from employees where salary >=10000 group by job_id;
-- 
-- having
-- group by ���� �ڿ� ���� ����� Ư�� ������ �ο��Ѵ�.
-- select job_id, avg( salary ), max( salary ), min( salary ) from employees 
-- group by job_id having avg(salary)>=5000;
-- 
--select p_id,name,kor,class from exam,student where kor=(select max(kor)from exam,student where p_id=id and class =1) and p_id=id and class =1
--//1���� ���������� ������� ����� ���̵�, �̸� , ��������


/* �׷��Լ� */
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
--�׷��Լ��� �����͸� ��� ������ �մϴ�. �� �������� �ʴ��� ���� �Դϴ�.

select title, hakgi, sum(kor)
from exam
group by title, hakgi;
--�߰�	1	242
--�߰�	2	168
--�⸻	1	254
--�⸻	2	66

select title, hakgi, sum(kor) -- 2
from exam 
where kor >= 60 -- ó������ 1
group by title, hakgi;
--�߰�	1	176
--�߰�	2	168
--�⸻	1	254

-- ���� where �� ó�������� �ٸ�.
-- having�� �������� ���� ���� �� ������ ������ �˻�
-- where�� �������� �Ÿ���, ������
select title, hakgi, sum(kor)
from exam 
where kor >= 60 
group by title, hakgi
having sum(kor) >= 200;

--exam 
-- ���� �������� ����, ����, ������ �ִ������� ����ϼ���
-- �� �л� ����� 70�� �̻��� ����鸸 �׷�ȭ �Ұ�
-- ���� ������ ���� ����
select pid, title, kor, eng, math , max(kor), max(eng), max(math)
from exam
where trunc((nvl(kor, 0) + nvl(eng, 0) + nvl(math, 0)) / 3) >= 70
group by pid, title, kor, eng, math
order by title desc;

/* join */
-- ���� ������ ���� ������Ʈ
-- name => pid
-- no �߰�

update exam set pid = 'aaa' where pid = '�Ѱ���';

select * from exam, member; -- ���� ���ϱⰡ �Ǿ� ���� ����

select * from exam, member
where pid = id; -- pid �� id ���� ���� ��ҵ鸸 ���

select exam.*, name, birth from exam, member
where pid = id; 

select exam.*, name, birth, no from exam, member
where pid = id;  -- error - ������ no ���� �ޱ�

select exam.*, name, birth, member.no from exam, member
where pid = id;

/* outter join */
select exam.*, name, birth, member.no from exam, member
where pid = id(+); -- + �� �ǹ� : pid�� �־�� �ϰ� id�� �߰���
