
create table Orders
(
 bookid int ,
 bookcode varchar(100),
 bookname varchar(100),
 bookauthor varchar(100),
 bookprice int,

)

insert into Orders(bookid,bookcode,bookname,bookauthor,bookprice)
select bookid,bookcode,bookname,bookauthor,bookprice from Customercart
truncate table Customercart;

select * from Customercart

select * from Orders

truncate table Orders

