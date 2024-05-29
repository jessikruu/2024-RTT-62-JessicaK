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





