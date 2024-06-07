SELECT * FROM northwind.shippers;
SELECT * FROM northwind.products;

INSERT INTO suppliers
(SupplierID, companyname, contactame, contacttitle,
address, city, postalcode, country, phone, fax, homepage)
VALUES (30, "Gebrit's Info",  "Gebrit Tesfay", "Production App Developer", "2315 Shade Valley Rd"
, "Charlotte", "28205", "USA", "704-401-2222", "704-401-3333", "gebritinfo.com");

INSERT INTO products
VALUES (78, "Lobster", 30, 8, 35, 100.00, 20, 5, 5, 0);

SELECT p.productname, s.companyname
FROM products p
JOIN shippers s
ON p.supplierid = s.supplierid;

UPDATE products
SET unitprice = 100.0
WHERE productid = 78;

SELECT productname, unitprice
FROM products
WHERE supplierid = 30;

DELETE FROM products
WHERE productid=78;

DELETE FROM suppliers
WHERE supplierid = 30;