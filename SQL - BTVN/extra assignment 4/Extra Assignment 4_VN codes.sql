-- code truy van extra assignment 4

-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
select e.Employee_Number, e.Employee_Name, group_concat(es.Skill_Code) as skill_code
from employee_table e
left join employee_skill_table es
	on e.Employee_Number = es.Employee_Number
group by e.Employee_Number
order by e.Employee_Number;

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
select d.*
from department d 
left join employee_table e
	on d.Department_Number = e.Department_Number
where e.Department_Number >=3
group by d.Department_Number
;

-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
select d.*, e.Employee_Number, e.Employee_Name
from department d 
left join employee_table e
	on d.Department_Number = e.Department_Number
order by d.Department_Number, e.Employee_Number;
    
-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
select e.Employee_Number, e.Employee_Name, 
count(es.Employee_Number) as SL_Skills , (Skill_Code) as Skills
from employee_table e
left join employee_skill_table es
	on e.Employee_Number = es.Employee_Number
group by e.Employee_Number
having count(es.Employee_Number) > '1'
order by e.Employee_Number;
