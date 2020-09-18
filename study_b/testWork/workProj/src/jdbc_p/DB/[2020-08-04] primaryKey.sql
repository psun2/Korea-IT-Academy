-- 테이블을 만들때 primary 키를 거는 방법

create table stud(
id varchar2(20) primary key, -- 제일 안좋은 방법
name varchar2(50) CONSTRAINT stud_name_nn not null,
addr varchar2(300),
tel varchar2(50) CONSTRAINT stud_tel_uni unique
);

-- primary key 확인
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

-- primary key 제거
alter table stud drop constraint stud_tel_uni;
alter table stud drop constraint stud_name_nn;
alter table stud drop constraint sys_c007007;

select * from user_constraints;

-- primary key 추가 
alter table stud add constraint stud_pk primary key(id);
alter table stud add constraint stud_tel_uni unique(tel);

select * from user_constraints;

-- not null 은 에드가 아닙니다.
-- alter table stud add constraint stud_name_nn not null(name);
-- 수정 개념이므로 modify 사용 (추가가 아닌 상태 변화)
alter table stud modify name constraint stud_name_nn not null;

insert into stud (id, name, addr, tel) values('aaa', '정우성', '우리집', '1111');

select * from stud;

-- primary key로 인해 아이디 중복 Error
insert into stud (id, name, addr, tel) values('aaa', '정남성', '니네집', '2222');

-- 아이디가 없어도 에러
insert into stud (name, addr, tel) values('정남성', '니네집', '2222');

-- 이름이 null 일경우 에러
insert into stud (id, name, addr, tel) values('aaa',  '니네집', '2222');

select * from stud;

insert into stud (id, name, addr) values('bbb',  '정우성', '니네집');
insert into stud (id, name) values('ccc',  '정우성');
insert into stud (id, name, addr) values('ddd',  '정남성', '니네집');

select * from stud;

-----------------------------------------------------------------------------------------------------------------------------------------

-- 외래키
alter table exam add constraint exam_fk foreign key(sid) references stud(id);

select * from user_constraints;

insert into exam (no, title, sid, kor, eng, mat, regdate) values (1, '중간', 'aaa', 77, 87, 84, '2018-05-04');

select * from exam;

-- Error primary key에 존재 하지 않을시
insert into exam (no, title, sid, kor, eng, mat, regdate) values (1, '중간', 'kkk', 77, 87, 84, '2018-05-04');

-- 외래키는 null 이여도상관없음
insert into exam (no, title, kor, eng, mat, regdate) values (2, '중간', 77, 87, 84, '2018-05-04');
select * from exam;


-------------------------------------------------------------------------------------------------------------------------------------------------

-- ▷ check 제한 조건
-- age number constraint test2_age_ck check( age between 0 and 150 )
--alter table test3 add constraint t3_ch_kor check (kor between 0 and 150)
--alter table test3 add constraint t3_ch_kor check (kor >= 0 and  kor <= 100)
--alter table test3 add constraint t3_ch_kor check ( ban in(1,3))    -------반을 1 이나 3 반을 받겠다
alter table exam add constraint title_chk check (title in ('중간', '기말'));

select * from user_constraints;

insert into exam (no, title, sid, kor, eng, mat, regdate) values (3, '중간', 'bbb', 55, 57, 54, '2018-05-04');

-- chk Error
insert into exam (no, title, sid, kor, eng, mat, regdate) values (4, '수시', 'bbb', 55, 57, 54, '2018-05-04');

----------------------------------------------------------------------------------------------------------------------------------------------------------
exam
학과 : id(pk), 학과명

교수 테이블 : id(pk), 교수명(not null), 학과(fk), 전화번호(unique)

stud : 교수 컬럼추가 (fk)

-- 학과 테이블
create table department(
name varchar2(20) constraint department_name_nn primary key
);

select * from user_constraints where table_name = 'DEPARTMENT';

alter table department drop constraint department_name_nn;

alter table department add(id varchar2(20) constraint department_id_id primary key);

select * from user_constraints where table_name = 'DEPARTMENT';

-- 교수 테이블
create table professor(
id varchar2(20) constraint professor_id_pk primary key,
name varchar2(20) constraint professor_name_nn not null,
department varchar2(20),
tel varchar2(50) constraint professor_tel_uni unique
);

-- 왜래키 fk 는 생성시 안들어 가니 따로 빼줍니다.
alter table professor add constraint professor_department_fk foreign key(department) references department(id);

alter table stud add(professor varchar2(20));

alter table stud add constraint stud_professor_fk foreign key (professor) references  professor(id);

select * from user_constraints where table_name = 'DEPARTMENT';
select * from user_constraints where table_name = 'PROFESSOR';
select * from user_constraints where table_name = 'STUD';

-- 출력
select * from stud;
select * from department;
select * from professor;

select * from stud, (select * from professor) t1 where professor = t1.id;

-- 답 -------------------------------------------------------------------------------------------------------------------------------------------------------
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