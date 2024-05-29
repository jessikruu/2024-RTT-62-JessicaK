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

-- this is a new query
-- i want to see the sum of the total cost for all line items for order 10103
-- the sum() function is called an aggregate function
SELECT sum(quantity_ordered * price_each) as total_order_cost,
	max(quantity_ordered) as max_quantity_ordered,
    min(quantity_ordered) as min_quantity_ordered,
    avg(quantity_ordered * price_each) as average_line_item_cost,
    avg(quantity_ordered) as avg_quantity_ordered
FROM orderdetails od
WHERE order_id = 10103;

-- * = all colums, for ex select * orderdetails means select all columns from order details 

-- i want to see the total order cost for all orders --- groupby function
SELECT * FROM orderdetails;

SELECT order_id, sum(quantity_ordered * price_each) as total_order_cost ,
	min(quantity_ordered) as min_qty_ordered,
    count(*) as number_of_products
from orderdetails
group by order_id;


-- the total amount each customer has spent
-- step one was to join the customer ttable and the order table
-- we also limited our columns in the result set so the date was more consumable by the human brain
-- put an order by on this so we could see all of the customer orders together
select c.customer_name, o.id as order_id
from customers c, orders o
where c.id = o.customer_id
order by c.customer_name;

-- step 2 we need to continue joining over to the order details
-- we added a second column to the order by so we could see the products in each order id
select c.customer_name, o.id as order_id, od.product_id
from customers c, orders o, orderdetails od
where c.id = o.customer_id
	and o.id = od.order_id
order by c.customer_name, order_id;

-- step 3 to join to the order details and we added the line item cost calculation
--  it's at this step now that we can visualize the data in the database and think about how we can do a group by on it 
select c.customer_name, o.id as order_id, od.product_id, quantity_ordered, price_each, (quantity_ordered * price_each) as line_item_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
	and o.id = od.order_id
order by c.customer_name, order_id;

-- step 4 is add the group by
-- we removed the extra columns that were not in the group by from the select
-- we also remved the extra columns from the order by
-- bc we're grouping by the customer id, we can also get the cust name bc the customer name record is singular and grouped by
select c.id, c.customer_name, sum(quantity_ordered * price_each) as total_customer_spent
from customers c, orders o, orderdetails od
where c.id = o.customer_id
	and o.id = od.order_id
group by c.id
order by total_customer_spent desc;

-- to expand the original questions to see the sum of each order for each customer
-- we have now added an order by for the order id, so we can see the total cost for each order for all customers
-- we can now include the order id in the select column bc it is in the group by
select c.id, c.customer_name, sum(quantity_ordered * price_each) as total_order_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
	and o.id = od.order_id
group by c.id, o.id
order by c.customer_name;

-- adding additional complexity -- only want to see orders that are over $50k
-- by adding 'having' it allows us to filter the aggregate results and we can not do this in the where clause bc the aggregate result hasn't been calculated 
-- at the time the database is considering the where clause
select c.id, c.customer_name, sum(quantity_ordered * price_each) as total_order_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
	and o.id = od.order_id
group by c.id, o.id
having total_order_cost > 50000
order by c.customer_name;