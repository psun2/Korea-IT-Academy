select * from
(select rownum rnum, t1.* from 
(select exam.*, kor + eng as tot, (kor + eng) / 2 as avg from exam
order by regdate  desc) t1)
where rnum >= 5 and rnum <= 7;

create view res_exam as 
select rownum rnum, t1.*
from (select exam.*, kor + eng as tot, (kor + eng) / 2 as avg from exam
order by regdate  desc) t1;

select * from user_views;

select * from res_exam
where rnum >= 5 and rnum <= 7;

select * from res_exam;

select * from user_constraints where table_name = 'EXAM';

insert into exam (id, title, pid, regdate, kor, eng) values (9, '중간', 'aaa', '2020-05-08', 67, 68);

select max(id) + 1 as "다 음 값" from exam;
select max(rnum) from res_exam;

insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '중간', 'bbb', '2020-05-08', 57, 88);

