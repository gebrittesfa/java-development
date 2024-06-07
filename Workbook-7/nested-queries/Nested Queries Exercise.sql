SELECT product name, unitprice
FROM products
WHERE unitprice =
(SELECT MAX(unitprice)
FROM products);

SELECT orderid, shipname, shipaddress
FROM orders
WHERE shipvia =
 (SELECT shipperid
FROM shippers
WHERE companyname = "Federal Shipping");


SELECT orderid
FROM order details
WHERE productid = 
(SELECT productid
FROM products
WHERE productname =  “Sasquatch Ale”);


SELECT companyname
From customers
WHERE customerid =
(SELECT customerid
FROM orders
WHERE orderid=  10266);



