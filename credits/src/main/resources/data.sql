DROP TABLE IF EXISTS tbl_credit;

CREATE TABLE tbl_credit (id INT AUTO_INCREMENT PRIMARY KEY , amount numeric , duration numeric , tax numeric , quota numeric , customer_Name varchar (250));

INSERT INTO tbl_credit (amount, duration, tax, quota, customer_Name) VALUES (2000000,12, 12.8, 2000, 'Laura Melisa Palomino');
INSERT INTO tbl_credit (amount, duration, tax, quota, customer_Name) VALUES (8000000, 6, 15.89, 110000, 'Luisa Maria Arias ');
INSERT INTO tbl_credit (amount, duration, tax, quota, customer_Name) VALUES (12000000, 10, 12, 230000, 'Sebastian Peña');
INSERT INTO tbl_credit (amount, duration, tax, quota, customer_Name) VALUES (5000000, 8, 2, 450000, 'Juan Martin Bernal');