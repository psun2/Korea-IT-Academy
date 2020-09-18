insert into member
(id, name, no, height, regdate, birth, hobby)
values
/* regdate 는 시간까지 쓸 수 있음 */
('aaa','홍성혁',10,182.12,'2015-05-07 17:23:45','2002-7-13','하아~');


insert into member
(id, name, no, height,  birth)
values
/* regdate 는 시간까지 쓸 수 있음 */
('c8','김지민 이새끼 너 죽어',17,'173.56','1996-7-13');

/*inser all*/
insert all
into member (id, name, no, birth) values ('ggg','이주혁',9,'1993-1-2')
into member (id, name, no, birth) values ('ddd','김연섭',12,'1989-06-08')
into member (id, name, no, birth) values ('eee','김현준',21,'2001-07-23')
into member (id, name, no, birth) values ('fff','장정호',3,'1997-11-11')
select * from dual;

update member set regdate ='2020-04-29', hobby = '코딩';

-- update
/* 같다를 표시할때 등호 == 가 아닌 = 로 사용 */
update member set hobby = '하아~' where id = 'aaa';

update member set hobby = '잠자기' where no >= 10 and no <= 20;

update member set hobby = '영화' where no < 10;

-- 주석
/* 
    주석 구간
            가입일
    80년대생 - 2019/05/08
    90 ~ 95   2019/10/13
    96 ~ 20   2020/03/02
*/

update member set regdate = '2019-05-08' where birth >= '1980-01-01' and birth < '1990-01-01';
update member set regdate = '2019-10-13' where birth >= '1990/1/1' and birth < '1996/1/1';
update member set regdate = '2019-03-02' where birth >= '1996/1/1' and birth < '2021/1/1';

-- 딜리트 프롬 테이블명 조건
delete from member where id = 'ccc';

-- 실행 단축키 => ctrl + enter
select id,name, birth from member where id = 'ddd';

select id,name, birth from member where id != 'ddd';

select * from member where id != 'ddd';

update member set name = '호이호이', no = 1, height = 1.0, regdate = '2015-05-05', birth = '1988-08-08', hobby = '파리리'
where id = 'ggg';

update member set name = '', no = 1, height = 1.0, regdate = '', birth = '', hobby = ''
where id = '';