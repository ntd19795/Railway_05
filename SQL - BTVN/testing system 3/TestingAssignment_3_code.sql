--  Q3: lấy ra id của phòng ban "Sale"
select DepartmentID
from department
where departmentname = 'sale';

-- Question 4: lấy ra thông tin account có full name dài nhất
select *
from account
where length(fullname) = ( select max(length(fullname)) from account);

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3
-- departmentid = 3 có mỗi 1 thằng.
select *
from `account`
having departmentid = 3;

-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT 
    groupname
FROM
    `group`
WHERE
    createdate < '2019-12-20';

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời

select questionid
from answer
group by questionid 
having count(answers) >= 4;

select * from answer;

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
select examid 
from exam
where duration >= '60' and createdate < '2019-12-20';

-- Question 9: Lấy ra 5 group được tạo gần đây nhất
select *
from `group`
ORDER BY createdate DESC
limit 5;

-- Question 10: Đếm số nhân viên thuộc department có id = 2
select count(accountid)
from `account`
where DepartmentID = 2;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
select *
from `account`
where fullname like 'D%o' ;
-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
delete from exam WHERE CreateDate < '2019-12-20'; -- khong chay duoc, bao loi k xoa dc parent row (foreign key gi gi do)

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
DELETE from `question` where `content` like  'Câu hỏi%'; -- chạy không có tác dụng
select * from question;
commit;
rollback;

-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và
-- email thành loc.nguyenba@vti.com.vn
update `account`
set fullname = 'Nguyễn Bá Lộc', email = 'loc.nguyenba@vti.com.vn'
WHERE accountid = 5;
select accountid, fullname, email -- check da update dc chua
 from account
 where accountid = 5
 ;

-- Question 15: update account có id = 5 sẽ thuộc group có id = 4
update `group`
set groupid = '4'
where creatorid = '5'; -- lenh nay phai dung unsafe mode moi chay dc

select * from `group`
;