create database examples;


select country, count(*) as country_cnt, max(credit_limit) as max_credit_limit, min(credit_limit) as min_credit_limit, avg(credit_limit) as avg_credit_limit
from customers
group by country
having max_credit_limit > 50000
limit 5;


select * 
from customers
where contact_firstname like 'P%';
-- percentage symbol is a wildcard, it will find all nmes starting w P and any number of characters after it 
select * 
from customers
where contact_firstname like '%er';
-- works w the percentage at the front and ending w 'er'
select * 
from customers
where contact_firstname like '%tt%';
-- shows anyone w tt in their name


select * 
from customers
where credit_limit between 50000 and 60000;

select current_date();
select month(current_date());
select year(current_date());


select * from customers where country in ( 'USA', 'Australia', 'France');
select * from customers where country = 'USA' and country = 'Australia' and country = 'France';

SELECT * FROM customers  WHERE address_line2 IS NULL;
SELECT * FROM customers  WHERE address_line2 IS NOT NULL;
-- NULL does not work with = or !=. Must use it in this way, IS NULL or IS NOT NULL

select employee_id, salary
from employees INNER JOIN salaries on employee_id = employee_id
where salary >= 75000;
-- this question is on the kba, the ambiguous is employee_id, it nees to be specified which table it's from/in


-- inner join example
select employee_id, salary
from employees e INNER JOIN salaries s on e.employee_id = s.employee_id
where salary >= 75000;
-- this is the correct way, it would be valid 

select * from customers;

-- union example
select * from employees where firstname like 'A%'
union
select * from employees where firstname like 'G%'
union
select * from employees where lastname like 'B%';

-- union all will include the results, but won't 'de-dupe' the results. it will just include everything
select * from employees where firstname like 'A%'
union
select * from employees where firstname like 'G%'
union all
select * from employees where lastname like 'B%';

-- subqueries (can only select one item, won't work if you choose 2+)
-- i want to see the list of products which have never been sold
select * 
from products p
where p.id not in (select product_id from orderdetails);

select *, 
	(select count(*) 
	from orderdetails od 
	where od.product_id = p.id ) as product_count
from products p
order by product_count desc;

select product_id from orderdetails;

select * from (
select * 
from products p
where p.product_name like '19%') a
where productline_id


