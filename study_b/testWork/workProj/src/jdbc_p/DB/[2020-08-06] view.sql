drop table ttt;

-- �� VIEW
�ΰ��� ���̺� ����Ͽ� ���� ��� �ؾ� �Ҷ�
�������� join�� ���� �ʰ� <����> �� ���̺��� �����
������ update �� �� �� ������, �ȵɼ��� �ִ�.
insert�� ��������............................

insert into stud (id, name) values ('aa','���켺');
insert into stud (id, name) values ('bb','������');
insert into stud (id, name) values ('cc','���߼�');
insert into stud (id, name) values ('dd','���强');
insert into stud (id, name) values ('ee','��ϰ�');
insert into stud (id, name) values ('ff','�弭��');
insert into stud (id, name) values ('gg','�峲��');
insert into stud (id, name) values ('hh','�嵿��');
insert into stud (id, name) values ('ii','������');

insert into exam(title, sid, kor, eng, mat) values ('�߰�','aa',77,78,71);
insert into exam(title, sid, kor, eng, mat) values ('�߰�','bb',67,68,61);
insert into exam(title, sid, kor, eng, mat) values ('�߰�','cc',87,88,81);
insert into exam(title, sid, kor, eng, mat) values ('�߰�','dd',97,98,91);
insert into exam(title, sid, kor, eng, mat) values ('�߰�','ee',57,58,51);
insert into exam(title, sid, kor, eng, mat) values ('�߰�','ff',74,48,41);
insert into exam(title, sid, kor, eng, mat) values ('�߰�','gg',73,83,13);
insert into exam(title, sid, kor, eng, mat) values ('�߰�','hh',75,58,51);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','ii',17,18,11);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','aa',71,81,11);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','bb',57,58,51);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','cc',27,28,12);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','dd',73,83,13);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','ee',37,38,31);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','ff',87,88,81);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','gg',47,84,41);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','hh',17,81,11);
insert into exam(title, sid, kor, eng, mat) values ('�⸻','ii',57,85,51);

select * from exam;
create view stud_exam as 
select name, exam.*, kor + eng + mat as tot, (kor + eng + mat)/3 as avg from stud, exam
where sid = id
order by title desc, avg desc;

select * from stud_exam;

select * from stud_exam
where avg >= 70;

update exam set kor = 99 where sid = 'dd';

select * from stud_exam
where avg >= 70;

insert into stud_exam (name, title, sid, kor, eng, mat) values ('�Ʊ���', '�߰�', 'jj', 67,78,89); -- ERROR


----------------------------------------------------------------------------------------------------------------------------------
�߰� ���� 'aa, cc, ee, ff' �л� ���� ������ ������ �ִ� "view mid_acef"�� �����ϼ���.

drop view mid_acef;

-- �������� �̿�
create view mid_acef as 
select name, t2.* 
from stud, 
(select t1.* from (select exam.*, kor + eng + mat as tot, (kor + eng + mat)/3 as avg from exam where title = '�߰�') t1
where sid in ('aa', 'cc', 'ee', 'ff')) t2
where id = t2.sid
order by avg desc;

select * from mid_acef;

-- where ���� and Ȱ��
create view aaa as
select name, exam.*, kor + eng + mat as tot, (kor + eng + mat)/3 as avg from stud, exam
where sid = id and title = '�߰�' and sid in('aa', 'cc', 'ee', 'ff')
order by title desc, avg desc;

select * from aaa;

-- ����Ȯ��
select * from user_views;

-- ���� 
drop view aaa;