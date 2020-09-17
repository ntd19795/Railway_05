-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
-- trước 1 năm trước


-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
-- "Sale" cannot add more user"



-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user

drop trigger Eachgrouplimit5users;
delimiter $$
create trigger Eachgrouplimit5users2
Before insert on groupaccount
for each row
begin 
	if new.groupid in (select groupid from groupaccount group by groupid having count(accountid) >= 5)
    then signal SQLSTATE '12345'
	set MESSAGE_TEXT = 'The amount of user in this group has reached the limit';
	end if;
end $$
delimiter ; 

insert into `groupaccount` (groupid, accountid,joindate)
value ('1', '111', '2019-03-05');

-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question


-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
-- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
-- tin liên quan tới user đó


-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
-- Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
-- vào departmentID thì sẽ được phân vào phòng ban "waiting Department"


-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
-- question, trong đó có tối đa 2 đáp án đúng.


-- Question 8: Viết trigger sửa lại dữ liệu cho đúng:
-- Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
-- Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database


-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
delimiter $$
create trigger KhongDuocXoaCauHoiMoiTao2Ngay
before delete on exam
for each row

begin


end $$
delimiter ;


-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các    -- viét 2 cái trigger
-- question khi question đó chưa nằm trong exam nào --> 
-- -> lọc ra thằng nào examid có giá trị (not null) -> nếu questionid moi' = question id chỗ examid not null -> lỗi 
-- Thực hiện: sửa data cho có chố examid = null. Lỗi k null dc do ở trên setup -> sửa k để cho examid làm primary key mà là unique key, và cho phép nó null
/* đặt 1 biến cho questionid
select  questionid đã có trong exam (join bảng examquestion vào)
đặt điều kiện nếu questionid mới (khi update/ delete) khác biến mới đặt, thì k update dc
*/
drop trigger if EXISTS BlockUpdateOrDeleteQuestionsHadBeenSetOnExams;

delimiter $$
create trigger BlockUpdateOrDeleteQuestionsHadBeenSetOnExams
before update on question
for each row
begin 
	DECLARE Questionid_already_set_on_exam tinyint; -- có thể update nếu questionid mới giống cái này
    select q.questionid into Questionid_already_set_on_exam from question q
		join examquestion e on q.QuestionID = e.QuestionID
	where e.examid is not null; -- nghĩa là chỗ question đã có trong exam
        
    if NEW.q.QuestionID =  Questionid_already_set_on_exam
    then signal SQLSTATE '12345'
		 set MESSAGE_TEXT = 'can not update or delete this data' ;
    end if;
        
end $$
delimiter ; 
   
update question
set Content = '1'
where questionid ='5' ;

-- Question11: không có

-- Question 12: Lấy ra thông tin exam trong đó:
-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
-- Duration > 60 thì sẽ đổi thành giá trị "Long time"

select examid, `code`, title, CategoryID, CreatorID, CreateDate, 
	case
		when duration <= 30 then 'Short time'
        when  duration <= 60 then 'Medium time'
        else  'Long time'
    end DurationType
from exam
;

-- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
-- là the_number_user_amount và mang giá trị được quy định như sau:
-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
-- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher
select groupid,
	case
		when count(accountid) <= 5 then 'few'
        when count(accountid) <= 20 then 'normal'
        else 'higher'
	end the_number_user_amount
from groupaccount
group by groupid
 ;


-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
-- không có user thì sẽ thay đổi giá trị 0 thành "Không có User"
select d.departmentid, 
	case
		when count(a.accountid) = 0 then 'Không có user'
		else count(a.accountid)
	end 'number_account'

from department d
left join `account` a
	on a.departmentid = d.departmentid
group by d.departmentid 
;
