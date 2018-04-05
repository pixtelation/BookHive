create table Adminlogin
(
username varchar (30),
pass varchar(50),

Primary key (username)
)



insert into Adminlogin(username,pass) values('admin','admin123');
select * from Adminlogin