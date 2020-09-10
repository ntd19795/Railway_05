use testingsystem;

-- Question 9: Thống kê số lượng account trong mỗi group
select g.groupid, g.groupname, count(ga.AccountID)
from `group` g
left join groupaccount ga
	on g.groupid = ga.groupid
group by g.groupid
order by g.groupid    
;
-- Question 10: Tìm chức vụ có ít người nhất
select p.PositionID, p.PositionName, count(a.accountid) as SL_ACC
from Position p
left join `account` a	
	on p.PositionID = a.PositionID
group by p.PositionID
having count(a.accountid) = 
(select min(So_ID)
from 
(select count(a.accountid)  as So_ID
from Position p
left join `account` a	
	on p.PositionID = a.PositionID
group by p.PositionID) as min_acc
)

;

-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
-- sai, thiếu các cái positionid = 0
select d.*, p.*, count(a.accountid)
from `account` a
right join department d
	on d.departmentid = a.DepartmentID
right join position p 
	on p.PositionID = a.PositionID
group by p.PositionID, d.DepartmentID
order by d.DepartmentID, p.PositionID
;
-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
-- gợi ý:  dùng cross join
-- tao bang dem so acc cua cac position
-- cross join voi bang department


-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của
-- question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
select q.questionid, q.content, t.typename, c.CategoryName, ac.AccountID as Creator, an.Content as Answers, an.isCorrect as "Right (1) Wrong (0)"
from question q
left join typequestion t 
	on q.typeid = t.typeid
left join categoryquestion c
	on q.CategoryID = c.CategoryID
left join `account` ac
	on ac.AccountID = q.CreatorID
left join answer an
	on an.questionid = q.questionid
order by q.QuestionID;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
select t.*, count(q.questionid)
from typequestion t 
left join question q 
on t.TypeID = q.typeid
group by t.TypeID
order by t.typeid;

-- Question 14:Lấy ra group không có account nào
select g.groupid
from `group`g 
left join groupaccount ga
on g.GroupID = ga.GroupID
group by g.groupid
having count(ga.accountid) is null
;


-- Question 15: Lấy ra group không có account nào
-- Question 16: Lấy ra question không có answer nào

-- Exercise 2: Union
/* Question 17:
a) Lấy các account thuộc nhóm thứ 1
b) Lấy các account thuộc nhóm thứ 2
c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau 
*/

/* Question 18:
a) Lấy các group có lớn hơn 5 thành viên
b) Lấy các group có nhỏ hơn 7 thành viên
c) Ghép 2 kết quả từ câu a) và câu b) 
*/