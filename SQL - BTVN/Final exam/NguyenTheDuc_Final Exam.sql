-- 1. Tạo table với các ràng buộc và kiểu dữ liệu
-- Thêm ít nhất 3 bản ghi vào table


DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;
COMMIT;

CREATE TABLE GiangVien (
magv TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
hoten VARCHAR(50) NOT NULL,
luong  FLOAT
);

CREATE TABLE  SinhVien (
masv TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
hoten VARCHAR(50) NOT NULL,
namsinh DECIMAL(4,0),
quequan VARCHAR(50) NOT NULL
);

CREATE TABLE DeTai (
madt TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
tendt VARCHAR(50) NOT NULL,
kinhphi FLOAT , 
NoiThucTap VARCHAR(50) NOT NULL
);

CREATE TABLE HuongDan (
id TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
masv TINYINT UNSIGNED NOT NULL,
madt TINYINT UNSIGNED null,
magv TINYINT UNSIGNED null,
ketqua VARCHAR(50) NOT NULL,
FOREIGN KEY(masv) REFERENCES SinhVien(masv) ON DELETE CASCADE,
FOREIGN KEY(madt) REFERENCES DeTai(madt),
FOREIGN KEY(magv) REFERENCES GiangVien(magv)
);

insert into GiangVien (hoten, luong) values ('Margaretta McGenn', '529.55');
insert into GiangVien (hoten, luong) values ('Cyrill Crinidge', '578.15');
insert into GiangVien (hoten, luong) values ('Farra Beevens', '760.17');
insert into GiangVien (hoten, luong) values ('Alison Scholes', '363.93');
insert into GiangVien (hoten, luong) values ('Wandis Downing', '532.70');
insert into GiangVien (hoten, luong) values ('Rivalee Ivanishev', '778.36');
insert into GiangVien (hoten, luong) values ('Rosanne Lasham', '466.11');
insert into GiangVien (hoten, luong) values ('Sheilakathryn Akess', '113.30');
insert into GiangVien (hoten, luong) values ('Morgana Abramzon', '476.78');
insert into GiangVien (hoten, luong) values ('Barbee Grandin', '740.69');

insert into SinhVien (hoten, namsinh, quequan) values ('Lilian Wybrew', 2001, 'Louredo');
insert into SinhVien (hoten, namsinh, quequan) values ('Micheil Congreve', 2007, 'Maojia');
insert into SinhVien (hoten, namsinh, quequan) values ('Zollie Keirle', 2001, 'El Fureidīs');
insert into SinhVien (hoten, namsinh, quequan) values ('Georgetta Hubbard', 1988, 'Malusac');
insert into SinhVien (hoten, namsinh, quequan) values ('Jeri Lockart', 1996, 'Ferreiras');
insert into SinhVien (hoten, namsinh, quequan) values ('Yvor Muscroft', 1999, 'Pomacocha');
insert into SinhVien (hoten, namsinh, quequan) values ('Florance Everwin', 1992, 'Mounlapamôk');
insert into SinhVien (hoten, namsinh, quequan) values ('Liuka Devlin', 2008, 'Metallostroy');
insert into SinhVien (hoten, namsinh, quequan) values ('Ealasaid Gentle', 1989, 'Chikan');
insert into SinhVien (hoten, namsinh, quequan) values ('Francoise Tilliards', 2008, 'Panyam');

insert into DeTai (tendt, kinhphi, NoiThucTap) values ('CongNgheSinhHoc', '952.83', 'Sebasang');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('Product Management', '931.50', 'Acandí');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('Research and Development', '362.70', 'Guangli');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('Training', '831.93', 'Wichit');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('Human Resources', '340.50', 'Ortiga');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('Marketing', '329.59', 'Narvacan');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('Support', '257.30', 'Chichaoua');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('Marketing', '445.32', 'Puutuga');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('CongNgheSinhHoc', '612.93', 'Thanh Ba');
insert into DeTai (tendt, kinhphi, NoiThucTap) values ('Business Development', '655.29', 'Daoqiao');

insert into HuongDan (masv, madt, magv, ketqua) values (2, 1, 1, 'unleash efficient convergence');
insert into HuongDan (masv, madt, magv, ketqua) values (8, 1, 6, 'expedite magnetic action-items');
insert into HuongDan (masv, madt, magv, ketqua) values (7, null, 5, 'unleash dot-com e-markets');
insert into HuongDan (masv, madt, magv, ketqua) values (10, 2, 8, 'mesh back-end action-items');
insert into HuongDan (masv, madt, magv, ketqua) values (3, 6, 9, 'scale integrated communities');
insert into HuongDan (masv, madt, magv, ketqua) values (6, null, 4, 'deploy 24/7 e-business');
insert into HuongDan (masv, madt, magv, ketqua) values (5, 4, 4, 'incentivize back-end channels');
insert into HuongDan (masv, madt, magv, ketqua) values (4, 6, 8, 'integrate robust portals');
insert into HuongDan (masv, madt, magv, ketqua) values (1, 10, 10, 'enhance extensible portals');
insert into HuongDan (masv, madt, magv, ketqua) values (9, 1, 10, 'streamline world-class bandwidth');


-- 2. Viết lệnh để
-- a) Lấy tất cả các sinh viên chưa có đề tài hướng dẫn

SELECT 
    s.masv AS SinhVienChuaCoDeTai
FROM
    sinhvien s
        LEFT JOIN
    huongdan h ON s.masv = h.masv
WHERE
    madt IS NULL;

-- b) Lấy ra số sinh viên nghiên cứu đề tài ‘CONG NGHE SINH HOC’
WITH MDT AS
(SELECT 
    d.madt AS Ma_De_Tai
FROM
    detai d
        LEFT JOIN
    huongdan h ON h.madt = d.madt
WHERE
    d.tendt = 'CongNgheSinhHoc')
SELECT 
    s.masv AS SinhVienCongNgheSinhHoc
FROM
    sinhvien s
        LEFT JOIN
    huongdan h ON h.masv = s.masv
WHERE
    h.madt IN (SELECT 
            *
        FROM
            MDT);

-- 3. Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm:
-- mã số, họ tên và tên đề tài
-- (Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")
DROP VIEW IF EXISTS SinhVienInfo;
CREATE VIEW SinhVienInfo AS
    SELECT 
        s.masv,
        s.hoten,
        CASE
            WHEN h.madt IS NULL THEN 'Chưa có'
            ELSE d.tendt
        END Ten_De_Tai
    FROM
        huongdan h
            RIGHT JOIN
        detai d ON h.madt = d.madt
            RIGHT JOIN
        sinhvien s ON s.masv = h.masv
;
-- check
SELECT 
    *
FROM
    SinhVienInfo;

-- 4. Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900
-- thì hiện ra thông báo "năm sinh phải > 1900"
DROP TRIGGER IF EXISTS KhongChoSinhVienGiaVaoHoc;
DELIMITER $$
CREATE TRIGGER KhongChoSinhVienGiaVaoHoc
Before insert on SinhVien
for each row
begin 
	if new.namsinh <= 1900
    then signal SQLSTATE '12345'
	set MESSAGE_TEXT = 'Năm sinh Phải > 1900';
	end if;
end $$
delimiter ; 
-- CHECK 
insert into SinhVien (hoten, namsinh, quequan) values ('crancoise Tilliard', 1999, 'Anyam');


-- 5. Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ xóa tất cả thông
-- tin trong table HuongDan liên quan tới sinh viên đó

-- on delete cascade ở dòng 36
-- check: 
COMMIT;
DELETE FROM sinhvien 
WHERE
    masv = '11';
SELECT 
    *
FROM
    huongdan
WHERE
    masv = 11;


