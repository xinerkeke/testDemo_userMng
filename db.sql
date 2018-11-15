---------create admin-----------
create table t_admin
(
adminCode  varchar(30) not null,
passwd  varchar(30),
primary key (adminCode)
);

---------create user-----------
create table t_user
(
u_id  varchar(11) not null,
u_name  varchar(20),
u_sex varchar(10) not null,
u_tel char(11),
u_addr varchar(255),
primary key (u_id)
);
