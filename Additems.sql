create table Additems
(
 bookid int not null identity(1, 1),
 bookname varchar(100),
 bookauthor varchar(100),
 bookprice varchar(100),

 primary key(bookid)
)

drop table Additems;

select * from Additems
truncate table Additems;

insert into Additems(bookid,bookname,bookauthor,bookprice) values('1','Harry Potter','Abhishek Mehta','650');

delete from Additems where bookid=2