select customer_name, phone, address_line1 from customers;

select * from employees where job_title = 'Sales Rep' order by firstname;

select * from offices;

select distinct country from offices;

select count(*) from offices where country = 'USA';

-- i want to see all employees that work in an office in the USA
SELECT e.* 
FROM employees e, offices o
WHERE e.office_id = o.id
	AND o.country = 'USA';
    
-- lets start looking at what is in the various tables
SELECT * FROM orders;
SELECT * FROM orderdetails;

-- calculate the total price 
SELECT od.*, (quantity_ordered * price_each) as total_price
FROM orderdetails od
where order_id = 10103
order by order_line_number;

-- added in name parameter
SELECT od.*, (quantity_ordered * price_each) as total_price, p.product_name
FROM orderdetails od, products p
where order_id = 10103
	and p.id = od.product_id
order by order_line_number;

-- added order date
SELECT od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date
FROM orderdetails od, products p, orders o
where order_id = 10103
	and p.id = od.product_id
    and o.id = od.order_id
order by order_line_number;


-- adding customer names
SELECT od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date, c.customer_name
FROM orderdetails od, products p, orders o, customers c
where order_id = 10103
	and p.id = od.product_id
    and o.id = od.order_id
    and o.customer_id = c.id
order by order_line_number;

