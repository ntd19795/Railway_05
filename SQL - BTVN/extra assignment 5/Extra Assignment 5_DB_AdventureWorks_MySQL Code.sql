use adventureworks;
/* Exercise 1: Subquery
 Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name
của ProductSubcategory là 'Saddles'. */

-- viet theo kieu subquery
with PS_name_is_Saddles as 
(select ProductSubcategoryID 
from productsubcategory
where `Name` = 'Saddles')
select `name` as Product_name
from product
where ProductSubcategoryID = (select ProductSubcategoryID from PS_name_is_Saddles)
;

-- viet theo kieu join
select p.`name`, ps.`Name` as ProductSubcategoryName 
from product p
join productsubcategory ps
on p.ProductSubcategoryID = ps.ProductSubcategoryID
where ps.`Name` = 'Saddles' ;

/*  Question 2: Thay đổi câu Query 1 để lấy được kết quả sau
Kết quả sẽ như sau:
Name
----------------------------
Water Bottle - 30 oz.
Mountain Bottle Cage2
Road Bottle Cage
LL Bottom Bracket
ML Bottom Bracket
HL Bottom Bracket
(6 row(s) affected)  */

-- viet theo kieu subquery
with PS_name_is_Saddles as 
(select ProductSubcategoryID 
from productsubcategory
where `Name` like 'Bo%')
select `name` as Product_name
from product
where ProductSubcategoryID in (select ProductSubcategoryID from PS_name_is_Saddles)
;
-- viet theo kieu join
select p.`name`, ps.`Name` as ProductSubcategoryName
from product p
join productsubcategory ps
on p.ProductSubcategoryID = ps.ProductSubcategoryID
where  p.`name` like  ('%Bo%');

/* 
Question 3:
Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring
Bike (nghĩa là ProductSubcategoryID = 3)
Hướng dẫn: sử dụng hàm MIN() trong subquery để trả về ListPrice thấp nhất
Kết quả sẽ như sau:
Name
--------------------------
Touring-3000 Blue, 54
Touring-3000 Blue, 58
Touring-3000 Blue, 62
………
Touring-3000 Yellow, 62
Touring-3000 Blue, 44
Touring-3000 Blue, 50
(10 row(s) affected)
*/

with min_price as
(select min(p.ListPrice)
from product p
left join productsubcategory ps
on p.ProductSubcategoryID = ps.ProductSubcategoryID
where ps.`name` = 'Touring Bikes')

select productid, `name`
from product
where ListPrice = (select * from min_price)
;


;



