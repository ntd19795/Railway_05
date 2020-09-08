
USE Fresher_management;
-- Q1: INSERT data
/* Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,
nhóm chúng thành các tháng sinh khác nhau */
select *, month(birth_date), count(traineeid)
from trainee
group by month(birth_date);

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau:
-- tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
select full_name, Birth_date, gender
from trainee
where char_length(Full_Name) = (select max(char_length(full_name)) from trainee);

/* Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là
-- những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
--		 ET_IQ + ET_Gmath>=20
--		 ET_IQ>=8
--		 ET_Gmath>=8
--		 ET_English>=18 */
select * 
from trainee
where
(ET_IQ + ET_Gmath) >= '20' and
et_iq >= 8 and
et_gmath >= 8 and
et_english >= 18
;
-- Question 5: xóa thực tập sinh có TraineeID = 3
delete from trainee
where traineeid = 3;
select * from trainee; -- check

/* Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". 
Hãy cập nhật thông tin vào database */
commit;
update trainee
set Trainning_Class = 'VTI002'
where TraineeID = '5';
