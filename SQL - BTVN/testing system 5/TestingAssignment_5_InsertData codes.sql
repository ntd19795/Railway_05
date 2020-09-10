
-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
create view Employees_Of_Sale_Department as
select d.*, a.accountid, a.username, a.fullname
from department d
left join `account` a
	on d.DepartmentID = a.DepartmentID;
	-- check xem đúng chưa
	SELECT * from Employees_Of_Sale_Department;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
create view Acc_Tham_gia_Nhieu_group_nhat as
select accountid, count(groupid) as SL_Group_Tham_gia
from groupaccount
group by accountid
having count(groupid) = (select max(SL_acc)
						 from (
								select count(groupid)  as SL_acc
								from groupaccount
								group by accountid
								) as Max_acc
						 )
;

SELECT * from Acc_Tham_gia_Nhieu_group_nhat;
select * from `groupaccount`;
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
-- được coi là quá dài) và xóa nó đi


-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
create view list_of_departments_with_the_most_employees as
with SL_account
as ( select count(a.accountid) as slacc
from department d
left join `account` a
	on d.DepartmentID = a.DepartmentID
group by d.DepartmentID
	)
select d.*, count(a.accountid)
from department d
left join `account` a
	on d.DepartmentID = a.DepartmentID
group by d.DepartmentID
having count(a.accountid) = (select max(slacc) from SL_account);
SELECT * from list_of_departments_with_the_most_employees;

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
create view Nguyen_s_questions as
select a.accountid as Creator_ID, a.fullname as Creator_Name, q.QuestionID, q.Content as Question_Content
from `account` a 
join question q
on a.accountid = q.creatorid
where a.fullname like 'Nguyen%'
;

SELECT * from Nguyen_s_questions;
