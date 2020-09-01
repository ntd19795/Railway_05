drop database if exists QL_Bai_Thi_Dau_Vao;
create database QL_Bai_Thi_Dau_Vao;
use QL_Bai_Thi_Dau_Vao;
CREATE TABLE `Department` (
    DepartmentID TINYINT UNSIGNED PRIMARY KEY,
    DepartmentName VARCHAR(50) CHECK (LENGTH(DepartmentName) >= 8)
);

CREATE TABLE Position (
    PositionID SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    PositionName NVARCHAR(50)
);

-- lam` foreign key link (references) voi' 1 cot cua 1 bang khac
CREATE TABLE `Account` (
    AccountID SMALLINT unsigned primary key AUTO_INCREMENT,
    Email VARCHAR(30) check (length(Email) >=8),
    Username CHAR(12) check (length(Username) >=6), -- điều kiện độ dài >= 6
    FullName VARCHAR(50),
    DepartmentID TINYINT UNSIGNED DEFAULT (1),
    PositionID TinyINT UNSIGNED,
    CreateDate DATETIME DEFAULT NOW( ),
    FOREIGN KEY (PositionID) REFERENCES Department (DepartmentID),
    UNIQUE key (Username)
);

CREATE TABLE `Group` (
    GroupID TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(10) ,
    CreatorID TINYINT UNSIGNED,
    CreateDate DATETIME DEFAULT NOW() ,
    FOREIGN KEY (CreatorID)
        REFERENCES department (DepartmentID)
);

CREATE TABLE `GroupAccount` (
    GroupID TINYINT UNSIGNED PRIMARY KEY,
    AccountID SMALLINT UNSIGNED,
    JoinDate DATE
);

CREATE TABLE TypeQuestion (
    TypeID SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    TypeName ENUM('Essay', 'Multiple-Choice')
);

CREATE TABLE CategoryQuestion (
    CategoryID TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    CategoryName VARCHAR(50)
);

CREATE TABLE Question (
    QuestionID SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(1000),
    CategoryID TINYINT UNSIGNED,
    TypeID TINYINT UNSIGNED,
    CreatorID SMALLINT UNSIGNED,
    CreateDate DATEtime DEFAULT NOW()
);

create table Answer (
AnswerID tinyint AUTO_INCREMENT primary key,
Content varchar(1000),
QuestionID smallint,
isCorrect bit default (0) -- 0 sai 1 đúng 
);

CREATE TABLE Exam (
    ExamID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code` SMALLINT UNSIGNED,
    Title VARCHAR(50),
    CategoryID TINYINT UNSIGNED,
    Duration tinyint, -- đơn vị: phút
    CreatorID TINYINT UNSIGNED,
    CreateDate DATETIME DEFAULT NOW()
);

CREATE TABLE ExamQuestion (
    ExamID SMALLINT UNSIGNED,
    QuestionID SMALLINT UNSIGNED
);


-- add data vào bảng
insert into Department(DepartmentID,DepartmentName)
Values
 (1, N'Marketing'),
 (2, N'Bán hàng'),
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
insert into `Group` (GroupName, CreatorID)
Values
('red',1),
('white',2),
('black',3),
('orange',4),
('green',5);

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
('Essay'),
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
('2',1, 1),
(not '2',1, 0),
('3',2,1),
(not'3',2,0);


insert into Exam (Code, Title,CategoryID, Duration, CreatorID)
Values
(101, 'Thi Lần 1', 1, '60',1),
(102, 'Thi Lần 2', 2, '60',2),
(103, 'Thi Lần 3', 3, '60',3),
(104, 'Thi Lần 4', 1, '60',4),
(105, 'Thi Lần 5', 2, '60',5);

insert into ExamQuestion (ExamID, QuestionID)
Values
(1,1),
(2,2),
(3,3),
(4,4),
(5,5);
