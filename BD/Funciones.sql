use businnes;
USE business;

-- MIN
SELECT 
MIN(salary) AS "Minimo salario"
FROM employee;


SELECT 
MIN(first_name) AS "Nombre minimo"
FROM employee; 


-- MAX
SELECT 
MAX(salary) AS "Maximo salario"
FROM employee;

-- COUNT
SELECT 
COUNT(salary) AS "Total conteo de salarios"
FROM employee; 

-- COUNT + DISTINCT
SELECT
COUNT(DISTINCT(salary)) AS "Total de conteno de salarios"
FROM employee;

-- AVG
SELECT 
AVG (salary) AS "salario promedio"
FROM employee; 

-- Promedio de fechas


-- SUM 
SELECT 
SUM(salary) AS "total de suma de salaraios"
FROM employee; 