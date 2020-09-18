insert into major (id, name) values ('com', '컴퓨터공학');
commit;
insert into major (id, name) values ('eye_design', '시각디자인');
savepoint a;
insert into major (id, name) values ('phillos', '철학');
insert into major (id, name) values ('chemisrty', '화공');
savepoint b;
update major set id = 'tb' where name = '화공';

rollback to a; -- a지점까지 롤백
rollback to a; -- b지점까지 롤백
rollback; -- 커밋전까지 롤백

select * from major;


select * from user_constraints;

create table car(
name varchar2(30),
price number(8),
type varchar2(20)
);

insert all
into car (name, price, type) values ('람보르기니', 1000, '트럭')
into car (name, price, type) values ('페라리', 4000, '비행기')
into car (name, price, type) values ('코라리', 1400, '승용차')
into car (name, price, type) values ('워라리', 1500, '버스')
into car (name, price, type) values ('람보르걷니', 2000, '버스')
into car (name, price, type) values ('람보르뚜니', 2300, '승용차')
into car (name, price, type) values ('람보르나니', 3000, '비행기')
into car (name, price, type) values ('간라리', 1600, '트럭')
into car (name, price, type) values ('팔라리', 2000, '버스')
into car (name, price, type) values ('손라리', 5000, '승용차')
select * from dual;

select * from car;

select * from user_constraints where table_name = 'CAR';

select * from car where name like '%보르%';

-- 인덱스 생성
create index inx_car on car(name);

-- index 생성 확인
select * from user_indexes;

-- index 이름 변경
alter index inx_car rename to inx_cc;

select * from user_indexes;

-- index 삭제
drop index inx_cc;

drop index exam_pk;

select * from user_indexes;

select * from user_constraints where table_name = 'EXAM';

alter table exam drop constraint EXAM_PK;

select * from user_indexes where table_name = 'EXAM';

-- index 수정
alter index inx_car on car(price);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
stud의 name, tel 로 idx_stud 인덱스를 생성하세요

select * from user_constraints where table_name = 'STUD';

create index stud_idx_name on stud(name);

alter index stud_idx_name rename to stud_name_idx;

create index stud_tel_idx on stud(tel);

alter table stud drop constraint STUD_TEL_UNI;

create index stud_tel_idx on stud(tel);

pk 인덱스 제거-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

select * from user_constraints where table_name = 'STUD';

alter table stud drop constraint STUD_PK;

select * from user_constraints where r_constraint_name = 'STUD_PK';

alter table exam drop constraint exam_fk;

alter table stud drop constraint stud_pk;

select * from user_constraints;
select * from user_constraints where table_name = 'STUD';
select * from user_constraints where r_constraint_name = 'STUD_PK';

drop constraint STUD_NAME_NN; -- 안됨
alter table stud drop constraint STUD_NAME_NN;

alter table stud modify name constraint STUD_NAME_NN not null;

select * from user_constraints where table_name = 'STUD';