drop database if exists QL_Bai_Thi_Dau_Vao;
create database QL_Bai_Thi_Dau_Vao;
use QL_Bai_Thi_Dau_Vao;
CREATE TABLE `Department` (
    DepartmentID TINYINT unsigned primary key ,
    DepartmentName VARCHAR(50)
);

CREATE TABLE Position (
    PositionID SMALLINT unsigned primary key AUTO_INCREMENT,
    PositionName VARCHAR(50)
);
-- lam` foreign key link (references) voi' 1 cot cua 1 bang khac'
CREATE TABLE `Account` (
    AccountID SMALLINT unsigned primary key AUTO_INCREMENT,
    Email VARCHAR(30),
    Username CHAR(12) ,
    FullName VARCHAR(50),
    DepartmentID TINYINT unsigned,
    PositionID SMALLINT unsigned,
    CreateDate DATE,
    foreign key (PositionID) references department (DepartmentID),
    UNIQUE key (Username)
);

CREATE TABLE `Group` ( 
    GroupID TINYINT unsigned primary key,
    GroupName VARCHAR(50),
    CreatorID TINYINT unsigned ,
    CreateDate DATE,
    foreign key (CreatorID) references department (DepartmentID)
);

CREATE TABLE `GroupAccount` (
    GroupID TINYINT unsigned primary key,
    AccountID SMALLINT unsigned primary key,
    JoinDate DATE
);

CREATE TABLE TypeQuesttion (
    TypeID SMALLINT unsigned primary key AUTO_INCREMENT,
    TypeName enum ('Essay', 'Multiple-Choice')
);

CREATE TABLE CategoryQuestion (
    CategoryID TINYINT unsigned primary key AUTO_INCREMENT,
    CategoryName VARCHAR(50)
);

CREATE TABLE Question (
    QuestionID SMALLINT unsigned primary key AUTO_INCREMENT,
    Content VARCHAR(1000),
    CategoryID TINYINT unsigned,
    TypeID TINYINT unsigned,
    CreatorID SMALLINT unsigned,
    CreateDate DATE
);

create table Answer (
AnswerID tinyint AUTO_INCREMENT,
Content varchar(1000),
QuestionID smallint,
isCorrect ENUM('Dung','Sai') ,
primary key (QuestionId, AnswerID)
);

CREATE TABLE Exam (
    ExamID tinyINT unsigned AUTO_INCREMENT,
    `Code` SMALLINT unsigned,
    Title VARCHAR(50),
    CategoryID TINYINT unsigned,
    Duration varchar (5),
    CreatorID TINYINT unsigned,
    CreateDate DATETIME
);

CREATE TABLE ExamQuestion (
    ExamID SMALLINT unsigned,
    QuestionID SMALLINT unsigned
);


-- add data vào bảng
insert into Department(DepartmentID,DepartmentName)
Values
 (1, N'Marketing'),
 (2, N'Sale'),
 (3, N'Bảo vệ'),
 (4, N'Nhân sự'),
 (5, N'Kỹ thuật');

insert into Position (PositionName)
Values
(n'Trường phòng'),
(n'Phó phòng'),
(n'Nhân viên Chính thức'),
(n'Thử việc'),
(n'Thực tập');

-- 3
insert into Account (Email, Username, FUllName, DepartmentID, PositionID, CreateDate)
Values
('abcxyz@gmail.com', 'abcxyz', 'Abc Xyz', 1, 1, 20200901),
('abcxyz2@gmail.com', 'abcxyz2', 'Abc Xyz2', 2, 2, 20200902),
('abcxyz3@gmail.com', 'abcxyz3', 'Abc Xyz3', 3, 3, 20200903),
('abcxyz4@gmail.com', 'abcxyz4', 'Abc Xyz4', 4, 4, 20200904),
('abcxyz5@gmail.com', 'abcxyz5', 'Abc Xyz5', 5, 5, 20200905);

-- 4
insert into `Group` (GroupName, CreatorID, CreateDate)
Values
('red',1,20200901),
('white',2,20200901),
('black',3,20200901),
('orange',4,20200901),
('green',5,20200901);

-- 5
insert into GroupAccount (GroupID, AccountID, JoinDate)
VALUES
(1,1,20200901),
(2,2,20200901),
(3,3,20200901),
(4,4,20200901),
(5,5,20200901);

insert into TypeQuestion (TypeName)
VALUEs
('Essey'),
('Multiple-Choice');

insert into CategoryQuestion (CategoryName)
Values
('Java'),
('NET'),
('SQL'),
('Postman'),
('Ruby');

insert into Question (Content, CategoryID, TypeID, CreatorID, CreateDate)
Values
(n'1+1 bằng mấy', 1,1,1,20200901),
(n'2+1 bằng mấy', 1,1,1,20200901),
(n'3+1 bằng mấy', 1,1,1,20200901),
(n'4+1 bằng mấy', 1,1,1,20200901),
(n'5+1 bằng mấy', 1,1,1,20200901);

insert into Answer (Content, QuestionID, isCorrect)
values
('2',1, Dung),
(not '2', Sai),
('3',2,Dung),
(not '3', 2, Sai);

insert into Exam (Code, Title,CategoryID, Duration, CreatorID, CreateDate)
Values
(101, 'Thi Lần 1', 1, '1h',1,20200901),
(102, 'Thi Lần 2', 2, '1h',2,20200901),
(103, 'Thi Lần 3', 3, '1h',3,20200901),
(104, 'Thi Lần 4', 1, '1h',4,20200901),
(105, 'Thi Lần 5', 2, '1h',5,20200901);

insert into ExamQuestion (ExamID, QuestionID)
Values
(1,1),
(2,2),
(3,3),
(4,4),
(5,5);
