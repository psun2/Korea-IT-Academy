insert into member
(id, name, no, height, regdate, birth, hobby)
values
/* regdate �� �ð����� �� �� ���� */
('aaa','ȫ����',10,182.12,'2015-05-07 17:23:45','2002-7-13','�Ͼ�~');


insert into member
(id, name, no, height,  birth)
values
/* regdate �� �ð����� �� �� ���� */
('c8','������ �̻��� �� �׾�',17,'173.56','1996-7-13');

/*inser all*/
insert all
into member (id, name, no, birth) values ('ggg','������',9,'1993-1-2')
into member (id, name, no, birth) values ('ddd','�迬��',12,'1989-06-08')
into member (id, name, no, birth) values ('eee','������',21,'2001-07-23')
into member (id, name, no, birth) values ('fff','����ȣ',3,'1997-11-11')
select * from dual;

update member set regdate ='2020-04-29', hobby = '�ڵ�';

-- update
/* ���ٸ� ǥ���Ҷ� ��ȣ == �� �ƴ� = �� ��� */
update member set hobby = '�Ͼ�~' where id = 'aaa';

update member set hobby = '���ڱ�' where no >= 10 and no <= 20;

update member set hobby = '��ȭ' where no < 10;

-- �ּ�
/* 
    �ּ� ����
            ������
    80���� - 2019/05/08
    90 ~ 95   2019/10/13
    96 ~ 20   2020/03/02
*/

update member set regdate = '2019-05-08' where birth >= '1980-01-01' and birth < '1990-01-01';
update member set regdate = '2019-10-13' where birth >= '1990/1/1' and birth < '1996/1/1';
update member set regdate = '2019-03-02' where birth >= '1996/1/1' and birth < '2021/1/1';

-- ����Ʈ ���� ���̺�� ����
delete from member where id = 'ccc';

-- ���� ����Ű => ctrl + enter
select id,name, birth from member where id = 'ddd';

select id,name, birth from member where id != 'ddd';

select * from member where id != 'ddd';

update member set name = 'ȣ��ȣ��', no = 1, height = 1.0, regdate = '2015-05-05', birth = '1988-08-08', hobby = '�ĸ���'
where id = 'ggg';

update member set name = '', no = 1, height = 1.0, regdate = '', birth = '', hobby = ''
where id = '';