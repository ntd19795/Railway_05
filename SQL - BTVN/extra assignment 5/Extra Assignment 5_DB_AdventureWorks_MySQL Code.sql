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
where ProductSubcategoryID in (select ProductSubcategoryID from PS_name_is_Saddles)
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
(select min(p.ListPrice) as minprice, ps.ProductSubcategoryID as PS_ID
from product p
left join productsubcategory ps
on p.ProductSubcategoryID = ps.ProductSubcategoryID
where ps.`name` = 'Touring Bikes')

select productid, `name`
from product
where ProductSubcategoryID = (select PS_ID from min_price) and ListPrice = (select minprice from min_price)
;

/* 
Exercise 2: JOIN nhiều bảng
Question 1: Viết query lấy danh sách tên country và province được lưu trong
AdventureWorks2008sample database.
Kết quả sẽ như sau: (181 row(s) affected)
 */
select c.`name` as Country, s.`name` as Province
from countryregion c
right join stateprovince s on c.CountryRegionCode = s.CountryRegionCode
;

/* Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country
Germany và Canada
Chú ý: sủ dụng sort order và column headings -> là gì?
20 row(s) affected
 */

select c.`name` as Country, s.`name` as Province
from countryregion c
right join stateprovince s on c.CountryRegionCode = s.CountryRegionCode
where c.`name` in ('Germany', 'canada')
;

/*
Question 3:
SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột
BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã sale
được bao nhiêu người trong năm nay)
Hướng dẫn: Join SalesOrderHeader và SalesPerson để hạn chế kết quả non-Internet = lấy kq những thằng mua online
orders (order được xử lý trên Internet có OnlineOrderFlag = 1 và cột SalesPersonID =
null)
*/
-- SalesOrderID, OrderDate, SalesPersonID from salesorderheader
-- SalesPersonID as BusinessEntityID, Bonus, SalesYTD from salesperson
select s.SalesOrderID, s.OrderDate, s.SalesPersonID, sp.SalesPersonID as BusinessEntityID, sp.Bonus, sp.SalesYTD
from salesorderheader s
join salesperson sp
on s.SalesPersonID = sp.SalesPersonID
where s.OnlineOrderFlag <> '1' and s.SalesPersonID <> 'null'
;
select * from HumanResources.Employee;
/*
Question 4:
Sử dụng câu query, thêm cột JobTitle (Tittle trong employee?) and xóa cột SalesPersonID và
BusinessEntityID.
Hướng dẫn:
Join với bảng HumanResources.Employee -- làm gì có bảng này?

SalesOrderID OrderDate Jobtitle Bonus SalesYTD

(3806 row(s) affected) chịu, lấy đâu ra lắm thế!!??
*/

select s.SalesOrderID, s.OrderDate, s.SalesPersonID, e.Title as JobTitle, sp.Bonus, sp.SalesYTD
from salesorderheader s
join salesperson sp
on s.SalesPersonID = sp.SalesPersonID
join employee e 
on s.SalesPersonID = e.EmployeeID
where s.OnlineOrderFlag <> '1' and s.SalesPersonID <> 'null'