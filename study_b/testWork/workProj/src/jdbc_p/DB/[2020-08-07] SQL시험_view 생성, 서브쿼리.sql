시험 테이블 index를 생성 하세요

시험 정보 view를 생성 조회하세요

서브쿼리 방식으로 이름이 두글자 인 학생의 시험 정보를 조회하세요

ex)

요구사항 : test_1 계정에서 실행한다.

 

1. 시험 테이블 index

index 이름 : idx_exam

사용 table : exam

index 컬럼 : pid

 

2.시험 정보 view를 생성/ 조회

test_1 계정 : create view 권한부여

view 이름 : vm_exam

table : exam

조회 내용

시험ID, 학생ID, 제목, 시험일 , 국어, 영어, 총점, 평균

정렬 방식

시험 id 내림차순

 

3. 이름이 2글자인 시험 정보 서브쿼리 이용하여 검색

사용 object : 생성한 vm_exam, stud

출력내용

학생ID, 제목, 시험일 , 국어, 영어, 총점, 평균

 

요구사항에 해당하는 처리요소를 구현한다.



-- 시험테이블 index 생성
create index idx_exam on exam(pid);

-- index 출력
select * from user_indexes;

-- view 생성
create view vm_exam as
select exam.*, kor + eng as tot, (kor + eng) / 2 as avg from  exam
order by id desc;

-- view 출력
select * from user_views;

-- view 로 생성한 가상의 테이블 출력
select * from vm_exam;

-- 서브쿼리를 이용한 이름이 2글자인 사람들의 해당 정보 출력
select pid, title, regdate, kor, eng, tot, avg from vm_exam, (select * from stud
where length(name) = 2) t1
where t1.id = pid;
