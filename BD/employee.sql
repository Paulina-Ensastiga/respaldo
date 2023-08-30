USE business;

-- Sentencias select basicas
SELECT * FROM bonus;
SELECT * FROM employee;
SELECT * FROM title;

-- SELECT + ALIAS
SELECT 
first_name AS "Nombre",
last_name AS "Apellido"
FROM employee;

-- Obtener a las personas con apellido Obama
SELECT 
last_name
FROM employee
WHERE Obama;

-- Obtener personas que no se apelliden "Vivek"
SELECT 
*
FROM employee
WHERE first_name != "Vivek";

-- Obtener employees con salario de mayor a menor
SELECT 
* 
FROM employee
ORDER BY salary ASC; 

-- Obtener employoees con first_name de menor a mayor (alfabeticamente)
SELECT * FROM employee
ORDER BY first_name DESC, salary ASC; 

-- ----------------------
-- IN 
-- ------------------------

SELECT * FROM employee
Where employee_id IN (3, 5, 6, 7);

-- -----------
-- BETWEEN
-- ----------

SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT
SELECT * FROM employee
LIMIT 4;

-- OFFSET
SELECT * FROM employee
LIMIT 2 OFFSET 3;

--
-- LIKE
-- No es case sensitive

--

SELECT * FROM employee
WHERE first_name LIKE BINARY "v%k";

-- Forzamos el case sensitive en LIKE

SELECT * FROM employee
WHERE first_name LIKE "%1%";

-- Actualizar a Barrack
-- Cambiar first_name = "Luna"alter

UPDATE employee
SET 
first_name = "Luna"
WHERE employee_id = 7; 

-- Insert 
-- Yareri
-- 90000 Salario
-- CEO
-- Executive

INSERT INTO 
employee
(first_name, last_name, salary, join_date, department)
VALUES
("Yareri", "Arcos", 900000, "2023-07-13", "Executive Board");


 




