insert into major (id, name) values ('com', '��ǻ�Ͱ���');
commit;
insert into major (id, name) values ('eye_design', '�ð�������');
savepoint a;
insert into major (id, name) values ('phillos', 'ö��');
insert into major (id, name) values ('chemisrty', 'ȭ��');
savepoint b;
update major set id = 'tb' where name = 'ȭ��';

rollback to a; -- a�������� �ѹ�
rollback to a; -- b�������� �ѹ�
rollback; -- Ŀ�������� �ѹ�

select * from major;


select * from user_constraints;

create table car(
name varchar2(30),
price number(8),
type varchar2(20)
);

insert all
into car (name, price, type) values ('���������', 1000, 'Ʈ��')
into car (name, price, type) values ('���', 4000, '�����')
into car (name, price, type) values ('�ڶ�', 1400, '�¿���')
into car (name, price, type) values ('����', 1500, '����')
into car (name, price, type) values ('�������ȴ�', 2000, '����')
into car (name, price, type) values ('�������Ѵ�', 2300, '�¿���')
into car (name, price, type) values ('����������', 3000, '�����')
into car (name, price, type) values ('����', 1600, 'Ʈ��')
into car (name, price, type) values ('�ȶ�', 2000, '����')
into car (name, price, type) values ('�ն�', 5000, '�¿���')
select * from dual;

select * from car;

select * from user_constraints where table_name = 'CAR';

select * from car where name like '%����%';

-- �ε��� ����
create index inx_car on car(name);

-- index ���� Ȯ��
select * from user_indexes;

-- index �̸� ����
alter index inx_car rename to inx_cc;

select * from user_indexes;

-- index ����
drop index inx_cc;

drop index exam_pk;

select * from user_indexes;

select * from user_constraints where table_name = 'EXAM';

alter table exam drop constraint EXAM_PK;

select * from user_indexes where table_name = 'EXAM';

-- index ����
alter index inx_car on car(price);

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
stud�� name, tel �� idx_stud �ε����� �����ϼ���

select * from user_constraints where table_name = 'STUD';

create index stud_idx_name on stud(name);

alter index stud_idx_name rename to stud_name_idx;

create index stud_tel_idx on stud(tel);

alter table stud drop constraint STUD_TEL_UNI;

create index stud_tel_idx on stud(tel);

pk �ε��� ����-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

select * from user_constraints where table_name = 'STUD';

alter table stud drop constraint STUD_PK;

select * from user_constraints where r_constraint_name = 'STUD_PK';

alter table exam drop constraint exam_fk;

alter table stud drop constraint stud_pk;

select * from user_constraints;
select * from user_constraints where table_name = 'STUD';
select * from user_constraints where r_constraint_name = 'STUD_PK';

drop constraint STUD_NAME_NN; -- �ȵ�
alter table stud drop constraint STUD_NAME_NN;

alter table stud modify name constraint STUD_NAME_NN not null;

select * from user_constraints where table_name = 'STUD';