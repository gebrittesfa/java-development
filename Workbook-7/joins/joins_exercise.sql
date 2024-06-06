SELECT p.productname,
p.unitprice, c.categoryname
FROM products p
INNER JOIN categories c
ON p.categoryid = c.categoryid
ORDER BY p.categoryname, p.productname;

SELECT p-productid, p. productname, p.unitprice, s. companyname
FROM products p
LEFT JOIN suppliers s
ON p.SupplierID = s. SupplierID
WHERE p.unitprice > 75
ORDER BY p. productname;

SELECT p-productid, p. productname, p.unitprice,
c.category, s. companyname
FROM products p
INNER JOIN category c
ON p.categoryid = c.categoryID
INNER JOIN suppliers s
ON p.supplierID = s.SupplierID
ORDER BY p.ProductName;

SELECT p.productname, c.categoryname
FROM products p
JOIN categories c
ON p.CategoryID = c.CategoryID
WHERE p.uniteprice =
(SELECT max(unitprice)
FROM products);

SELECT o.orderid, o.shipname, o.shipaddress,
s.companyname
FROM orders o
LEFT JOIN shippers s
ON o.shipvia = s.ShipperID
WHERE o.shipcountry = "Germany";

SELECT o.orderid, o.shipname, o.shipaddress,
s.companyname
FROM orders o
JOIN orderdetails od
ON o.orderid = od.orderid
JOIN products p
ON p.productid = od.productid
WHERE p.productname = "Sasquatch Ale";
