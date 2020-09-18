-- sequence 생성
create sequence exam_id
start with 100 -- 시작번호
increment by 1; -- 증가량

-- 생성된 sequence 확인
select * from user_sequences;

insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '중간', 'bbb', '2020-05-08', 57, 88);

-- 현재 시퀀스의 번호 보기 (nextval을 한번도 사용 안했을시 들어가 있는게 없으므로 currval 을 볼 수 없음)
select exam_id.currval from dual;

-- sequence 삭제
drop sequence exam_id;

-- 제거된 sequence 확인
select * from user_sequences;



insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '중간', 'bbb', '2015-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '기말', 'aaa', '2014-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '중간', 'ccc', '2013-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '기말', 'ddd', '2012-05-08', 57, 88);


delete exam where id = 102; 

select * from exam;

-- 위의 커리문과 id가 겹침.... 
-- 위의 커리문에서는 id 값만 가지고 했으므로,
-- 밑에서 nextval 에서 currval이 바뀌지 않습니다.
-- 102 ~ 105 가 겹침
insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '중간', 'bbb', '2017-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '기말', 'aaa', '2017-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '중간', 'ccc', '2017-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '기말', 'ddd', '2017-05-08', 57, 88);

-- 시퀀스 교체
alter sequence exam_id 
start with 200; -- start sequence 는 교체 불가

-- 지웠다가 다기 만들어야 합니다.
drop sequence exam_id;

create sequence exam_id
start with 200
increment by 2;

-- sequence increment 변경
alter sequence exam_id
increment by 1;

select * from user_sequences;

-- insert all 사용시 id 값이 다 겹쳐 나오게 됩니다.
insert all
into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '중간', 'bbb', '1999-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '기말', 'aaa', '1999-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '중간', 'ccc', '1999-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '기말', 'ddd', '1999-05-08', 57, 88)
select * from dual;

-- insert all 사용시 id 값이 다 겹쳐 나오게 됩니다.
insert all
into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '중간', 'bbb', '1900-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '기말', 'aaa', '1900-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '중간', 'ccc', '1900-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '기말', 'ddd', '1900-05-08', 57, 88)
select * from dual;

delete exam where id = 211;