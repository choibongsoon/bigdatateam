show user;
select * from tab;

-- 예제로 만들기!!!!
create table stuinfo(
snum char(10) constraint stuinfo_pk primary key,
sname varchar2(12) not null,
sex char(3) check (sex in ('남','여'))
);

create table subject(
subjectcode char(10) primary key,
subjectname char(30) not null
);

create table takeclass(
snum char(10) references stuinfo(snum),
subjectcode char(10) references subject(subjectcode),
grade int,
applydate date default sysdate,
constraint takeclass_pk primary key(snum,subjectcode)
);

insert into stuinfo values('20101234','최봉순','남');
insert into stuinfo values('20101134','이수정','여');
insert into stuinfo values('20101278','이주연','여');
insert into stuinfo values('20101904','김현범','남');
insert into stuinfo values('20108734','최현우','남');
insert into subject values('1109496','알고리즘');
insert into subject values('1104832','컴퓨터구조');
insert into subject values('1109231','자료구조');
insert into subject values('1101006','자바프로그래밍');
insert into subject values('1100864','C언어');
insert into takeclass values('20101234','1109496',90,default);
insert into takeclass values('20101234','1109231',67,default);
insert into takeclass values('20101234','1101006',77,default);
insert into takeclass values('20101134','1104832',93,default);
insert into takeclass values('20101134','1109231',67,default);
insert into takeclass values('20101134','1101006',88,default);
insert into takeclass values('20101278','1109496',92,default);
insert into takeclass values('20101278','1109231',78,default);
insert into takeclass values('20101278','1101006',40,default);
insert into takeclass values('20101904','1109231',85,default);
insert into takeclass values('20101904','1101006',50,default);
insert into takeclass values('20101904','1100864',67,default);
insert into takeclass values('20108734','1109496',90,default);
insert into takeclass values('20108734','1100864',67,default);
commit;
