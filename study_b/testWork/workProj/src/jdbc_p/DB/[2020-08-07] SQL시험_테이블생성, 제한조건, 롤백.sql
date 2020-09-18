1. �л� ���̺�� ���� ���̺��� �����ϼ���

 

�л����̺�(stud)

id(id) : ����(20byte) PK

�̸�(name) : ����(50byte) not null

 

�������̺�(exam)

id(id): ����

�л�id(pid) : ����(20byte) FK

����(title) : ����(50byte)

������(regdate) : ��¥

����(kor) : ����

����(eng) : ����

 

2. �л� ������ ���������� �Է��ϼ���

id �̸�

aaa ����

bbb ����

ccc ����

ddd ������

eee �����

 

3. ���������� �Է� �� rollback ��Ű�� ���������� ����ϼ���

rollback �� ��ȸ

id �л�ID ���� ������ ���� ����

1 aaa �߰� 18/05/04 67 78

2 bbb �߰� 18/05/04 57 58

3 ccc �߰� 18/05/04 97 98

4 ddd �߰� 18/05/04 77 71

5 aaa �߰� 18/05/04 87 82

5 aaa �⸻ 18/07/10 57 52

6 bbb �⸻ 18/07/10 97 92

7 ccc �⸻ 18/07/10 87 82

8 eee �⸻ 18/07/10 67 62

 

rollback �� ��ȸ

1 aaa �߰� 18/05/04 67 78

2 bbb �߰� 18/05/04 57 58

3 ccc �߰� 18/05/04 97 98

4 ddd �߰� 18/05/04 77 71

 

4. ���� ������ ����(test_1) �� ������ ���̺��� ����ϼ���

��³��� : table_name, tablespace_name

 



-- �л� ���̺�
create table stud(
id varchar2(20) constraint stud_id_pk primary key,
name varchar2(50) constraint stud_name_nn not null
);

-- exam ���̺�
create table exam(
id number(5),
pid varchar2(20) constraint exam_pid_fk references stud(id),
title varchar2(50),
regdate date,
kor int,
eng int
);

-- ���� �Է� �л�
insert all
into stud (id, name) values ('aaa', '����')
into stud (id, name) values ('bbb', '����')
into stud (id, name) values ('ccc', '����')
into stud (id, name) values ('ddd', '������')
into stud (id, name) values ('eee', '�����')
select * from dual;

-- ���� �Է� exam
insert into exam (id, pid, title, regdate, kor, eng) values (1, 'aaa', '�߰�', '18/05/04', 67, 78);
insert into exam (id, pid, title, regdate, kor, eng) values (2, 'bbb', '�߰�', '18/05/04', 57, 58);
insert into exam (id, pid, title, regdate, kor, eng) values (3, 'ccc', '�߰�', '18/05/04', 97, 98);
insert into exam (id, pid, title, regdate, kor, eng) values (4, 'ddd', '�߰�', '18/05/04', 77, 71);
commit;

insert into exam (id, pid, title, regdate, kor, eng) values (5, 'aaa', '�߰�', '18/05/04', 87, 82);
insert into exam (id, pid, title, regdate, kor, eng) values (5, 'aaa', '�⸻', '18/07/10', 57, 52);
insert into exam (id, pid, title, regdate, kor, eng) values (6, 'bbb', '�⸻', '18/07/10', 97, 92);
insert into exam (id, pid, title, regdate, kor, eng) values (7, 'ccc', '�⸻', '18/07/10', 87, 82);
insert into exam (id, pid, title, regdate, kor, eng) values (8, 'eee', '�⸻', '18/07/10', 67, 62);

-- ���
select * from exam;

-- �ѹ�
rollback;

-- �ѹ� �� ���
select * from exam;

-- ���� ������ ����(test_1) �� ������ ���̺��� ����ϼ���
select table_name, tablespace_name from all_all_tables where owner = 'TEST_1';
