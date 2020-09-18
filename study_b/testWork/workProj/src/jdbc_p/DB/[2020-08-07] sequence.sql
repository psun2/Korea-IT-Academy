-- sequence ����
create sequence exam_id
start with 100 -- ���۹�ȣ
increment by 1; -- ������

-- ������ sequence Ȯ��
select * from user_sequences;

insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�߰�', 'bbb', '2020-05-08', 57, 88);

-- ���� �������� ��ȣ ���� (nextval�� �ѹ��� ��� �������� �� �ִ°� �����Ƿ� currval �� �� �� ����)
select exam_id.currval from dual;

-- sequence ����
drop sequence exam_id;

-- ���ŵ� sequence Ȯ��
select * from user_sequences;



insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '�߰�', 'bbb', '2015-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '�⸻', 'aaa', '2014-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '�߰�', 'ccc', '2013-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '�⸻', 'ddd', '2012-05-08', 57, 88);


delete exam where id = 102; 

select * from exam;

-- ���� Ŀ������ id�� ��ħ.... 
-- ���� Ŀ���������� id ���� ������ �����Ƿ�,
-- �ؿ��� nextval ���� currval�� �ٲ��� �ʽ��ϴ�.
-- 102 ~ 105 �� ��ħ
insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�߰�', 'bbb', '2017-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�⸻', 'aaa', '2017-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�߰�', 'ccc', '2017-05-08', 57, 88);
insert into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�⸻', 'ddd', '2017-05-08', 57, 88);

-- ������ ��ü
alter sequence exam_id 
start with 200; -- start sequence �� ��ü �Ұ�

-- �����ٰ� �ٱ� ������ �մϴ�.
drop sequence exam_id;

create sequence exam_id
start with 200
increment by 2;

-- sequence increment ����
alter sequence exam_id
increment by 1;

select * from user_sequences;

-- insert all ���� id ���� �� ���� ������ �˴ϴ�.
insert all
into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�߰�', 'bbb', '1999-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�⸻', 'aaa', '1999-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�߰�', 'ccc', '1999-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values (exam_id.nextval, '�⸻', 'ddd', '1999-05-08', 57, 88)
select * from dual;

-- insert all ���� id ���� �� ���� ������ �˴ϴ�.
insert all
into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '�߰�', 'bbb', '1900-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '�⸻', 'aaa', '1900-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '�߰�', 'ccc', '1900-05-08', 57, 88)
into exam (id, title, pid, regdate, kor, eng) values ((select max(id) +1 from exam), '�⸻', 'ddd', '1900-05-08', 57, 88)
select * from dual;

delete exam where id = 211;