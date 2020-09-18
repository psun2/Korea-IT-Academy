-- ���̺��� ���鶧 primary Ű�� �Ŵ� ���

create table stud(
id varchar2(20) primary key, -- ���� ������ ���
name varchar2(50) CONSTRAINT stud_name_nn not null,
addr varchar2(300),
tel varchar2(50) CONSTRAINT stud_tel_uni unique
);

-- primary key Ȯ��
select * from user_constraints;
--USER_B	STUD_NAME_NN	C	STUD	"NAME" IS NOT NULL				ENABLED	NOT DEFERRABLE	IMMEDIATE	VALIDATED	USER NAME
--USER_B	STUD_TEL_UNI	U	STUD					ENABLED	NOT DEFERRABLE	IMMEDIATE	VALIDATED	USER NAME
--USER_B	SYS_C007007	P	STUD					ENABLED	NOT DEFERRABLE	IMMEDIATE	VALIDATED	GENERATED NAME

alter table exam add constraint exam_pk primary key(no);

select * from user_constraints;
--USER_B	STUD_NAME_NN	C	STUD	"NAME" IS NOT NULL				ENABLED	NOT DEFERRABLE	IMMEDIATE	VALIDATED	USER NAME			20/08/04				
--USER_B	EXAM_PK	P	EXAM					ENABLED	NOT DEFERRABLE	IMMEDIATE	VALIDATED	USER NAME			20/08/04	USER_B	EXAM_PK		
--USER_B	STUD_TEL_UNI	U	STUD					ENABLED	NOT DEFERRABLE	IMMEDIATE	VALIDATED	USER NAME			20/08/04	USER_B	STUD_TEL_UNI		
--USER_B	SYS_C007007	P	STUD					ENABLED	NOT DEFERRABLE	IMMEDIATE	VALIDATED	GENERATED NAME			20/08/04	USER_B	SYS_C007007		

-- primary key ����
alter table stud drop constraint stud_tel_uni;
alter table stud drop constraint stud_name_nn;
alter table stud drop constraint sys_c007007;

select * from user_constraints;

-- primary key �߰� 
alter table stud add constraint stud_pk primary key(id);
alter table stud add constraint stud_tel_uni unique(tel);

select * from user_constraints;

-- not null �� ���尡 �ƴմϴ�.
-- alter table stud add constraint stud_name_nn not null(name);
-- ���� �����̹Ƿ� modify ��� (�߰��� �ƴ� ���� ��ȭ)
alter table stud modify name constraint stud_name_nn not null;

insert into stud (id, name, addr, tel) values('aaa', '���켺', '�츮��', '1111');

select * from stud;

-- primary key�� ���� ���̵� �ߺ� Error
insert into stud (id, name, addr, tel) values('aaa', '������', '�ϳ���', '2222');

-- ���̵� ��� ����
insert into stud (name, addr, tel) values('������', '�ϳ���', '2222');

-- �̸��� null �ϰ�� ����
insert into stud (id, name, addr, tel) values('aaa',  '�ϳ���', '2222');

select * from stud;

insert into stud (id, name, addr) values('bbb',  '���켺', '�ϳ���');
insert into stud (id, name) values('ccc',  '���켺');
insert into stud (id, name, addr) values('ddd',  '������', '�ϳ���');

select * from stud;

-----------------------------------------------------------------------------------------------------------------------------------------

-- �ܷ�Ű
alter table exam add constraint exam_fk foreign key(sid) references stud(id);

select * from user_constraints;

insert into exam (no, title, sid, kor, eng, mat, regdate) values (1, '�߰�', 'aaa', 77, 87, 84, '2018-05-04');

select * from exam;

-- Error primary key�� ���� ���� ������
insert into exam (no, title, sid, kor, eng, mat, regdate) values (1, '�߰�', 'kkk', 77, 87, 84, '2018-05-04');

-- �ܷ�Ű�� null �̿����������
insert into exam (no, title, kor, eng, mat, regdate) values (2, '�߰�', 77, 87, 84, '2018-05-04');
select * from exam;


-------------------------------------------------------------------------------------------------------------------------------------------------

-- �� check ���� ����
-- age number constraint test2_age_ck check( age between 0 and 150 )
--alter table test3 add constraint t3_ch_kor check (kor between 0 and 150)
--alter table test3 add constraint t3_ch_kor check (kor >= 0 and  kor <= 100)
--alter table test3 add constraint t3_ch_kor check ( ban in(1,3))    -------���� 1 �̳� 3 ���� �ްڴ�
alter table exam add constraint title_chk check (title in ('�߰�', '�⸻'));

select * from user_constraints;

insert into exam (no, title, sid, kor, eng, mat, regdate) values (3, '�߰�', 'bbb', 55, 57, 54, '2018-05-04');

-- chk Error
insert into exam (no, title, sid, kor, eng, mat, regdate) values (4, '����', 'bbb', 55, 57, 54, '2018-05-04');

----------------------------------------------------------------------------------------------------------------------------------------------------------
exam
�а� : id(pk), �а���

���� ���̺� : id(pk), ������(not null), �а�(fk), ��ȭ��ȣ(unique)

stud : ���� �÷��߰� (fk)

-- �а� ���̺�
create table department(
name varchar2(20) constraint department_name_nn primary key
);

select * from user_constraints where table_name = 'DEPARTMENT';

alter table department drop constraint department_name_nn;

alter table department add(id varchar2(20) constraint department_id_id primary key);

select * from user_constraints where table_name = 'DEPARTMENT';

-- ���� ���̺�
create table professor(
id varchar2(20) constraint professor_id_pk primary key,
name varchar2(20) constraint professor_name_nn not null,
department varchar2(20),
tel varchar2(50) constraint professor_tel_uni unique
);

-- �ַ�Ű fk �� ������ �ȵ�� ���� ���� ���ݴϴ�.
alter table professor add constraint professor_department_fk foreign key(department) references department(id);

alter table stud add(professor varchar2(20));

alter table stud add constraint stud_professor_fk foreign key (professor) references  professor(id);

select * from user_constraints where table_name = 'DEPARTMENT';
select * from user_constraints where table_name = 'PROFESSOR';
select * from user_constraints where table_name = 'STUD';

-- ���
select * from stud;
select * from department;
select * from professor;

select * from stud, (select * from professor) t1 where professor = t1.id;

-- �� -------------------------------------------------------------------------------------------------------------------------------------------------------
create table major(
    id varchar2(20) constraint major_id_pk primary key,
    name varchar2(50)
);

create table professor2(
     id varchar2(20) constraint pro_id_pk primary key,
     name varchar2(50) constraint pro_name_nn not null,
     major varchar2(20) constraint pro_major_fk references major(id),
     tel varchar2(30) constraint pro_tel_uni unique
);

-- 1
alter table stud add (pid varchar2(20) constraint stud_pro_fk references professor2(id));

-- 2
alter table stud (pid varchar2(20));
alter table stud add constraint stud_pro_fk (pid) references professor2(id);

select * from user_constraints;