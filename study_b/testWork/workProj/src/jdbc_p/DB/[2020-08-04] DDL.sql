insert into test1 (id, name, email, height, birth, regdate, hobby) values(12, 'aa', 'aaa@aaa.com', 169.6, '1992-03-20', '2020-04-28 15:30:20', '������Ʈ�ϱ�');
-- name -> char �̹Ƿ� byte���� ������ ���߾� ������ ��� ���ϴ�.
-- hobby -> nvarchar �� byte�� �ƴ� ���ڼ��� ǥ��Ǿ�, ���ڼ��� �޽��ϴ�.
-- �ѱ� UTF-8 �� ���ڵ� ��Ŀ����� 3byte�Դϴ�.
-- varchar2�� ���ڼ��� �ƴ� byte �Դϴ�.

-- column �߰�
-- alter table ���̺�� add(�÷��� �ڷ���);
alter table test1 add(spec varchar2(20));

-- column ����
alter table test1 modify(id varchar2(40));
-- �����Ͱ� �־� �������� ����

-- �����͸� �����
delete from test1;

-- �ٽ� column ������ �ϸ� ���������� �ٲ�ϴ�.
alter table test1 modify(id varchar2(40));

-- ���� Ȯ��
select * from user_tab_columns where table_name = 'TEST1';

-- column�� ����
alter table test1 rename column id to pid;

-- column ����
alter table test1 drop column spec;

-- table ����
drop table test1;

select * from tab;

----------------------------------------------------------------------------------------------------------------------------------------------------

���� ���̺��� �����ϼ��� exam 
no, title, sid, kor, eng, mat, regdate
�����ȣ, ����, �л�id, ����, ����, ����, ������
���� ����, ���� --- ���� --- ��¥(date)

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
