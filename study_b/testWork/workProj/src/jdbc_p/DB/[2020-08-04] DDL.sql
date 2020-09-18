insert into test1 (id, name, email, height, birth, regdate, hobby) values(12, 'aa', 'aaa@aaa.com', 169.6, '1992-03-20', '2020-04-28 15:30:20', '프로젝트하기');
-- name -> char 이므로 byte수를 무조건 맞추어 공백이 들어 갑니다.
-- hobby -> nvarchar 는 byte가 아닌 글자수로 표기되어, 글자수를 받습니다.
-- 한글 UTF-8 의 인코딩 방식에서는 3byte입니다.
-- varchar2는 글자수가 아닌 byte 입니다.

-- column 추가
-- alter table 테이블명 add(컬럼명 자료형);
alter table test1 add(spec varchar2(20));

-- column 수정
alter table test1 modify(id varchar2(40));
-- 데이터가 있어 수정되지 않음

-- 데이터를 지운뒤
delete from test1;

-- 다시 column 수정을 하면 정상적으로 바뀝니다.
alter table test1 modify(id varchar2(40));

-- 변경 확인
select * from user_tab_columns where table_name = 'TEST1';

-- column명 변경
alter table test1 rename column id to pid;

-- column 삭제
alter table test1 drop column spec;

-- table 삭제
drop table test1;

select * from tab;

----------------------------------------------------------------------------------------------------------------------------------------------------

시험 테이블을 정의하세요 exam 
no, title, sid, kor, eng, mat, regdate
시험번호, 제목, 학생id, 국어, 영어, 수학, 시험일
숫자 문자, 문자 --- 숫자 --- 날짜(date)

create table exam(
no number(10),
title varchar2(20),
sid varchar2(20),
kor number(3,2),
eng number(3,2),
mat number(3,2),
regdate date
);

alter table exam modify(no number(4));
alter table exam modify(kor number(3));
alter table exam modify(eng number(3));
alter table exam modify(mat number(3));
