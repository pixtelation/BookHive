create table Customercart
(
 bookid int ,
 bookcode varchar(100),
 bookname varchar(100),
 bookauthor varchar(100),
 bookprice int,

)
select * from Customercart

alter table Customercart
alter column bookprice int;

select sum(bookprice)from Customercart  

truncate table Customercart

insert into Customercart (bookid,bookcode,bookname,bookauthor,bookprice) values('1','hgd','hts','vc','250')
