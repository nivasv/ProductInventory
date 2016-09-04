create table UserCredential 
(
UserID int NOT NULL AUTO_INCREMENT,
Username varchar(50) NOT NULL,
Password varchar(50) NOT NULL,
UserRole varchar(50) NOT NULL,
PRIMARY KEY (UserID),
UNIQUE (UserName)
);

insert into UserCredential(UserName,Password,UserRole) values ("admin","password","it_manager");
insert into UserCredential(UserName,Password,UserRole) values ("order1","password","order_personnel");
insert into UserCredential(UserName,Password,UserRole) values ("order2","password","order_personnel");
insert into UserCredential(UserName,Password,UserRole) values ("order3","password","order_personnel");
insert into UserCredential(UserName,Password,UserRole) values ("order4","password","order_personnel");
insert into UserCredential(UserName,Password,UserRole) values ("order5","password","order_personnel");

create table Orderlogin_Audit
(
LogID int NOT NULL AUTO_INCREMENT,
UserName varchar(50) NOT NULL,
LogTime varchar(20) NOT NULL,
LogDate varchar(20) NOT NULL,
Activity varchar(10) NOT NULL,
PRIMARY KEY (LogID)
);


create table Orderentry_Audit
(
LogID int NOT NULL AUTO_INCREMENT,
UserName varchar(50) NOT NULL,
OrderNumber varchar(20) NOT NULL,
OrderTime varchar(20) NOT NULL,
OrderDate varchar(20) NOT NULL,
PRIMARY KEY (LogID)
);


create table Ordershipment_Audit
(
LogID int NOT NULL AUTO_INCREMENT,
OrderNumber varchar(20) NOT NULL,
ShipmentTime varchar(20) NOT NULL,
ShipmentDate varchar(20) NOT NULL,
PRIMARY KEY (LogID)
);
