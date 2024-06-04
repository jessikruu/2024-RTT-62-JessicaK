select * from orderdetails;
select * from products;

select p.product_name, format(max(quantity_ordered), 2) as max_offer, format(min(quantity_ordered), 2) as min_buy_price, format(round(avg(quantity_ordered), 2), 2) as avg_buy_price
from products p, orderdetails od
where p.id = od.product_id
group by od.product_id;

select p.product_name, format(max(quantity_ordered), 2) as max_offer, format(min(quantity_ordered), 2) as min_buy_price, format(round(avg(quantity_ordered), 2), 3) as avg_buy_price
from products p, orderdetails od
where p.id = od.product_id
group by od.product_id;


