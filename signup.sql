create table signup
(
username varchar(20),
email varchar(50),
firstname varchar(50),
lastname varchar(50),
pass int,
confirmpass int,
country varchar(50),
addr varchar(50)

Primary key(username)
)


select * from signup

insert into REG(username,email,firstname,lastname,pass,confirmpass,country,addr) values('abhi','abhishekmehta50#gmail.com','Abhishek','Mehta','22720546','22720546','India','2 Saha Lane Mukta Ram Babu Street');

truncate table signup



drop table signup