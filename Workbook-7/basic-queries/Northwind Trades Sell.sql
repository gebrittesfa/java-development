SELECT COUNT(*)
FROM suppliers;

SELECT SUM(salary)
FROM employees;

SELECT MIN(unitprice)
FROM products;

SELECT MAX(unitprice)
FROM products;

SELECT SupplierID, COUNT(*) AS TotalSuppliedItems 
FROM products 
GROUP BY SupplierID;

SELECT supplierid, COUNT(quantityperunit)
FROM products
GROUP BY supplierid;

SELECT categoryid, AVG(unitprice)
FROM products
GROUP BY CategoryID;

SELECT supplierid, COUNT (quantityperunit)
FROM products
GROUP BY supplierid
HAVING COUNT (quantityperunit) >=5;

SELECT productid, productname,
SUM(unitprice*unitsinstock) AS "Inventory Value"
FROM products
GROUP BY productid
ORDER BY "Inventory Value" DESC, productname;



