--�� ����
-- �����ȣ�� 110�� ����� �μ����� �˰� �ʹٸ�
-- select * from employees where employee_id=110;
-- ���� ��� ���̺��� ��� ��ȣ�� �˻��� ��
-- select * from departments where department_id=100;
-- �μ� ���̺��� �μ���ȣ�� �˻��ؾ� �Ѵ�.

--�� equi join
-- �� ���̺��� ���������� �����ϴ� �÷��� ���� ��ġ�Ǵ� ���� �����ؼ� ����� ����
-- select * from employees, departments where employees.department_id = departments.department_id;
-- ������ ���� ���� ��� �� ���̺��� ��� ���ڵ尡 ������ �������� �߻��Ѵ�.
-- ������ ������ ���̺� �������� ?1 �� ��ŭ �־�� �Ѵ�.
-- 
-- ������ �÷��� �տ��� ���̺������ �Ҽ��� ������ �Ѵ�. 
-- ���̺� ���� �� ��� ��Ī�� �ο��Ѵ�.
-- select * from employees e, departments d where e.department_id = d.department_id;
-- 
-- select * from employees e, departments d 
-- where e.department_id = d.department_id and last_name='King';

--�� non-equi join
-- where ���� ���� ������ = ������ �̿��� �� �����ڸ� ����Ѵ�.
--
--������ ������ ���� ���� ������ cutline ���̺��� jumsu ���� ���� ���

select exam.* from exam, cutline
where kor >= jum;

-- ���������� cuteline day ���� �� ���� ������ �л��̸�, ��̸� ����ϼ���.

select exam.*, name, hobby
from exam, member, cutline
where regdate >= day and id = exam.pid;

select * from member
where friend = id; -- ���� ���� ���� �ϴ� ����� ����

-- �����̺������� �ѷ� ������ �����ϰڴ� self join
select me.*, you.name from member me, member you
where me.friend = you.id(+);
-- null �ȳ��� outer join (+) ��� = > ���� ���ǿ� �ش�ȵǴ� �κ��� outer join�� ��� �Ͽ� ���


select avg(e1.kor) from exam e1, exam e2;
select e2.* from exam e1, exam e2;

-- Error -- mysql ������ ����
select e2.* from exam e1, exam e2
where e2.kor >= avg(e1.kor);

/* querry */
select rownum �ο��, member.* from member
order by name; -- desc

/* ���� ���� */
/* ���� �Ǿ� �ִ� ���̺�� ���ٴ� */
 select rownum �ο��, t1.* from
 (select * from member order by name) t1;
 
 
 /* �������� - ���̺�ε� ����ϰ�, �� ������ �÷����ε� ��� ���� */
 /* join �� �����ϳ� join ���� �� ���� ���� �� �� �ִ� */
 select avg(kor) from exam;
 
 select * from exam
where kor >= (select avg(kor) from exam); 

select max(no) + 1 from exam;

insert into exam (no, pid, hakgi, title, kor, eng, math)
values
(14, 'aaa', 2, '�߰�', 56, 63, 51);

insert into exam 
(no, pid, hakgi, title, kor, eng, math)
values
((select max(no) +1 from exam), 'bbb', 2, '�߰�', 76, 73, 71);

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

-- ������Ƽ ��¥�� ���ϰ� ������Ƽ�� ����� 3���� ����ϼ���
-- ������Ƽ�� ��, �Ͽ����� ���� �Ѵ�.

select member.*, 
to_char(birth, 'MM-DD')
from member;

-----------------------------------------------------------------------


select * from (
select rownum rnum, t3.* from (
select t2.*, 
case
when to_char(nb,'dy') = '��' then nb - 1
when to_char(nb,'dy') = '��' then nb - 2
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

















