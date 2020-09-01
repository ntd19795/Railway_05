drop database if EXISTS `QL Fresher`;
create database `QL Fresher`;
use `QL Fresher`;

-- điểm min 0 max 20/ 50: chưa học code cái này?
Create table `Trainee`(
TraineeID tinyint auto_increment not null,
Full_name nvarchar (50) not null,
Birth_date date,
Gender ENUM ('M','F','Unknow'),
ET_IQ decimal (4,2),
ET_Gmath decimal (4,2),
ET_English decimal (4,2),
Training_Class TINYINT,
Evaluation_Notes nvarchar(300), 
VTI_Account varchar(20) not null unique key,
primary key (TraineeID)
);

Create table `ID` (
ID tinyint AUTO_INCREMENT primary key,
Name varchar (50),
Code decimal (5,0),
ModifiedDate date
);
-- enum không thêm bit vào sau đc?
Create table `ID management` (
ID tinyint AUTO_INCREMENT primary key,
Name varchar (50),
Birthdate date,
Gender enum ('0','1','null') ,
IsDeletedFlag enum ('0','1')
);