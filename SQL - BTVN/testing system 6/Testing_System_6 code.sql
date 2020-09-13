-- Exercise 1: Tiếp tục với Database Testing System
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các
-- account thuộc phòng ban đó
drop procedure Get_account_from_department;
delimiter $$ 
create procedure Get_account_from_department (in tenphongban nvarchar(30))
	begin
		select a.accountid, a.Email, a.username, a.FullName, CreateDate
        from `department` d
        join `account` a on a.DepartmentID = d.DepartmentID
        where departmentname = tenphongban
	    ;
        
	end $$
delimiter ;

call Get_account_from_department ('Bán hàng');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
delimiter $$ 
create procedure AccountNumber_in_each_group ()
	BEGIN 
		select g.groupid, count(g.AccountID)  
		from groupaccount g
        group by GroupID
        order by GroupID 
	    ;
	end $$
delimiter ;
call AccountNumber_in_each_group;
select count(AccountID)
		from groupaccount
        group by GroupID
        order by GroupID 
        ;
        
-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
-- trong tháng hiện tại
delimiter $$ 
create procedure Questions_Created_in_current_month ()
	begin
		with CauHoiThangNay as
		(select questionid as ID_Cauhoi, typeid
		from question
		where month(createdate) = month(now())
		)
		select typeid, count(ID_Cauhoi)
		from CauHoiThangNay
		group by typeid
		;
	end
	$$
Delimiter ;

call Questions_Created_in_current_month;

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
delimiter $$
create procedure TypeQuestion_has_the_most_question()
	begin
		with SL_Question as
		(select count(questionid) as SLQuestion
		from question
		group by typeid)
		select typeid, count(questionid)
		from question
		group by typeid
		having count(questionid) in (select max(SLQuestion) from SL_Question)
	;
	end $$
delimiter ;

call TypeQuestion_has_the_most_question;



-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
delimiter $$
create procedure Name_of_TypeQuestion_has_the_most_question()
	begin
		with SL_Question as
		(select count(q.questionid) as SLQuestion
		from question q
		group by q.typeid)
        
		select t.TypeName, count(q.questionid)
		from question q
        join typequestion t
			on q.typeid = t.typeid
		group by q.typeid
		having count(q.questionid) = (select max(SLQuestion) from SL_Question) ;
	end $$
delimiter ;
call Name_of_TypeQuestion_has_the_most_question;


/* Question 6: Viết 1 store cho phép người dùng 
nhập vào 1 chuỗi 
và trả về (out) GROUP có tên 
						chứa chuỗi của người dùng nhập vào  (like '%Nguoidungnhapvao%')
hoặc (or) trả về user có USERNAME chứa chuỗi của người dùng nhập vào (like '%Nguoidungnhapvao%')
*/
drop procedure TimUsername_hoac_group;

delimiter $$
create PROCEDURE TimUsername_hoac_group (in Nguoidungnhapvao varchar(50))
	begin
		select username
        from `account`
		where username like concat( '%' , Nguoidungnhapvao , '%' );
        
        select groupname
        from `group`
        where groupname like concat('%', Nguoidungnhapvao , '%');
    end $$
delimiter ;
call TimUsername_hoac_group ('a');
-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và -- đáp án dùng declare gì gì đó chưa học
-- trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ (what????)
-- Sau đó in ra kết quả tạo thành công



-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice - 
-- để thống kê câu hỏi essay hoặc (or) multiple-choice nào có content dài nhất --chuưa ok lắm, sẽ làm lại. 
																				-- đáp án có if then gì gì đó rất cao siêu 
drop procedure Essay_or_Multiple_choice;
delimiter $$
create procedure Essay_or_Multiple_choice (in UserInput enum('Essay','Multiple-Choice'))
begin
with Essay_questions as 
    (select q.questionid as Q_ID , q.content as Q_Content, q.typeid as T_ID
    from question q
    join typequestion t
		on q.typeid = t.typeid
    where t.TypeName = 'Essay')
    select Q_ID, Q_Content, length(Q_Content)
    from Essay_questions
    where T_ID = (select typeid from typequestion where typename = 'Essay' )
		and length(Q_Content) = (select max(length(Q_Content))
								from Essay_questions);

with Multiple_Choice_questions as 
    (select q.questionid as Q_ID , q.content as Q_Content, q.typeid as T_ID
    from question q
    join typequestion t
		on q.typeid = t.typeid
    where t.TypeName = 'Multiple-Choice')
    select Q_ID, Q_Content, length(Q_Content)
    from Multiple_Choice_questions
    where T_ID = (select typeid from typequestion where typename = 'Multiple-Choice' )
		and length(Q_Content) = (select max(length(Q_Content))
								from Multiple_Choice_questions);
    
end $$
delimiter ;
call Essay_or_Multiple_choice ('Essay');
call Essay_or_Multiple_choice ('Multiple-Choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
delimiter $$
create procedure XoaExamBangExamID (in nguoidungnhapvao tinyint )
begin 
delete from exam 
where examid = nguoidungnhapvao;
end $$
delimiter ;
call XoaExamBangExamID (11);
-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử
-- dụng store ở câu 9 để xóa)
delimiter $$
create procedure XoaExam3NamTruocBangExamID (in nguoidungnhapvao tinyint )
begin 
delete from exam 
where examid = nguoidungnhapvao and ;
end $$
delimiter ;


-- Sau đó in số lượng record đã remove từ các table liên quan trong khi
-- removing
-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
-- chuyển về phòng ban default là phòng ban chờ việc
-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay2
-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")