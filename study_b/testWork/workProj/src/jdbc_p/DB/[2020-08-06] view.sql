drop table ttt;

-- ▶ VIEW
두개의 테이블 계속하여 같이 사용 해야 할때
서브쿼리 join을 하지 않고 <가상> 의 테이블을 만든다
내용이 update 될 수 도 있지만, 안될수도 있다.
insert도 마찬가지............................

insert into stud (id, name) values ('aa','정우성');
insert into stud (id, name) values ('bb','정남성');
insert into stud (id, name) values ('cc','정중성');
insert into stud (id, name) values ('dd','정장성');
insert into stud (id, name) values ('ee','장북건');
insert into stud (id, name) values ('ff','장서건');
insert into stud (id, name) values ('gg','장남건');
insert into stud (id, name) values ('hh','장동건');
insert into stud (id, name) values ('ii','장정건');

insert into exam(title, sid, kor, eng, mat) values ('중간','aa',77,78,71);
insert into exam(title, sid, kor, eng, mat) values ('중간','bb',67,68,61);
insert into exam(title, sid, kor, eng, mat) values ('중간','cc',87,88,81);
insert into exam(title, sid, kor, eng, mat) values ('중간','dd',97,98,91);
insert into exam(title, sid, kor, eng, mat) values ('중간','ee',57,58,51);
insert into exam(title, sid, kor, eng, mat) values ('중간','ff',74,48,41);
insert into exam(title, sid, kor, eng, mat) values ('중간','gg',73,83,13);
insert into exam(title, sid, kor, eng, mat) values ('중간','hh',75,58,51);
insert into exam(title, sid, kor, eng, mat) values ('기말','ii',17,18,11);
insert into exam(title, sid, kor, eng, mat) values ('기말','aa',71,81,11);
insert into exam(title, sid, kor, eng, mat) values ('기말','bb',57,58,51);
insert into exam(title, sid, kor, eng, mat) values ('기말','cc',27,28,12);
insert into exam(title, sid, kor, eng, mat) values ('기말','dd',73,83,13);
insert into exam(title, sid, kor, eng, mat) values ('기말','ee',37,38,31);
insert into exam(title, sid, kor, eng, mat) values ('기말','ff',87,88,81);
insert into exam(title, sid, kor, eng, mat) values ('기말','gg',47,84,41);
insert into exam(title, sid, kor, eng, mat) values ('기말','hh',17,81,11);
insert into exam(title, sid, kor, eng, mat) values ('기말','ii',57,85,51);

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

insert into stud_exam (name, title, sid, kor, eng, mat) values ('아기상어', '중간', 'jj', 67,78,89); -- ERROR


----------------------------------------------------------------------------------------------------------------------------------
중간 고사와 'aa, cc, ee, ff' 학생 시험 정보를 가지고 있는 "view mid_acef"를 생성하세요.

drop view mid_acef;

-- 서브쿼리 이용
create view mid_acef as 
select name, t2.* 
from stud, 
(select t1.* from (select exam.*, kor + eng + mat as tot, (kor + eng + mat)/3 as avg from exam where title = '중간') t1
where sid in ('aa', 'cc', 'ee', 'ff')) t2
where id = t2.sid
order by avg desc;

select * from mid_acef;

-- where 절의 and 활용
create view aaa as
select name, exam.*, kor + eng + mat as tot, (kor + eng + mat)/3 as avg from stud, exam
where sid = id and title = '중간' and sid in('aa', 'cc', 'ee', 'ff')
order by title desc, avg desc;

select * from aaa;

-- 생성확인
select * from user_views;

-- 삭제 
drop view aaa;