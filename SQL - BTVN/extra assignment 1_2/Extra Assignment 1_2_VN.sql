drop database if EXISTS `QL Fresher`;
create database `QL Fresher`;
use `QL Fresher`;

-- điểm min 0 max 20/ 50: chưa học code cái này?
CREATE TABLE `Trainee` (
    TraineeID TINYINT AUTO_INCREMENT NOT NULL,
    Full_name NVARCHAR(50) NOT NULL,
    Birth_date DATE,
    Gender ENUM('M', 'F', 'Unknow'),
    ET_IQ DECIMAL(4 , 2 ) unsigned check (ET_IQ<=20),
    ET_Gmath DECIMAL(4 , 2 ) unsigned check (ET_Gmath <=20),
    ET_English DECIMAL(4 , 2 ) unsigned check (ET_English <=50),
    Training_Class TINYINT,
    Evaluation_Notes NVARCHAR(300),
    VTI_Account VARCHAR(20) NOT NULL UNIQUE KEY,
    PRIMARY KEY (TraineeID)
);


-- bai 2
CREATE TABLE `ID` (
    ID TINYINT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50),
    Code char (5), -- 5 ký tự là alphanumberic - chữ cái và chữ số
    ModifiedDate DATEtime
);

-- bai 3
CREATE TABLE `ID management` (
    ID TINYINT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50),
    Birthdate DATE,
    Gender bit , -- 0 male 1 female null là mặc định k cần viết
    IsDeletedFlag bit DEFAULT (0) -- 0 activating 1 deactivated
);