���� ���̺� index�� ���� �ϼ���

���� ���� view�� ���� ��ȸ�ϼ���

�������� ������� �̸��� �α��� �� �л��� ���� ������ ��ȸ�ϼ���

ex)

�䱸���� : test_1 �������� �����Ѵ�.

 

1. ���� ���̺� index

index �̸� : idx_exam

��� table : exam

index �÷� : pid

 

2.���� ���� view�� ����/ ��ȸ

test_1 ���� : create view ���Ѻο�

view �̸� : vm_exam

table : exam

��ȸ ����

����ID, �л�ID, ����, ������ , ����, ����, ����, ���

���� ���

���� id ��������

 

3. �̸��� 2������ ���� ���� �������� �̿��Ͽ� �˻�

��� object : ������ vm_exam, stud

��³���

�л�ID, ����, ������ , ����, ����, ����, ���

 

�䱸���׿� �ش��ϴ� ó����Ҹ� �����Ѵ�.



-- �������̺� index ����
create index idx_exam on exam(pid);

-- index ���
select * from user_indexes;

-- view ����
create view vm_exam as
select exam.*, kor + eng as tot, (kor + eng) / 2 as avg from  exam
order by id desc;

-- view ���
select * from user_views;

-- view �� ������ ������ ���̺� ���
select * from vm_exam;

-- ���������� �̿��� �̸��� 2������ ������� �ش� ���� ���
select pid, title, regdate, kor, eng, tot, avg from vm_exam, (select * from stud
where length(name) = 2) t1
where t1.id = pid;
