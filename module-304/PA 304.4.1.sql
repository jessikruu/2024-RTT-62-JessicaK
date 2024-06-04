select p.product_name as 'Name', pl.product_line as 'Product Line', p.buy_price as 'Buy Price' 
from products p, productlines pl
where p.productline_id = pl.id
order by p.buy_price desc;

select * from products;

select * from productlines;

select * from customers;

select contact_firstname as 'First Name', contact_lastname as 'Last Name', city as 'City'
from customers
order by contact_lastname;

select * from orders;

select distinct status
from orders
order by status asc;

select * from payments;

select * 
from payments
where payment_date >= '2005-01-01'
order by payment_date desc; 

select * from employees;

select * from offices;

select lastname, firstname, email, job_title
from employees e, offices o
where o.id = e.office_id
	and o.id = 1
order by lastname;

select * from products;
select * from productlines;

select p.product_name, pl.product_line, p.product_scale, p.product_vendor
from products p, productlines pl
order by pl.id = 7 desc, pl.id = 1 asc, p.product_name ;