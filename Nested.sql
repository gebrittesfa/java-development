SELECT * FROM northwind.products;
-- Case sensitive- 

SELECT p.productid, p.productname, p.unitprice, s.companyname
FROM products p
LEFT JOIN suppliers s
ON p.SupplierID = s.SupplierID
WHERE p.unitprice > 75
ORDER BY p.productname;



Select * from products where(select * from categories c where c.categoryid=1 );
select * from categories c, products p where c.categoryid=1 and p.categoryid=1;
SELECT ProductID, ProductName, CategoryName
FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID order by Products.ProductName ;
Select * from products;

Select * from actor;