-- Homework 1
-- Question 0.1
-- I want to see the count of the number of products in each product line

select * from productlines;
select * from products;
-- 0.1
select productline_id, count(*)
from products group by productline_id;

-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.   I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name

select * from employees;
select * from customers;

select sales_rep_employee_id, count(*)
from customers group by sales_rep_employee_id;