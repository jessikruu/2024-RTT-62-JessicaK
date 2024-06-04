SELECT order_id, SUM(quantity_ordered) as Qty,
    IF(MOD(SUM(quantity_ordered),2),'Odd', 'Even') as oddOrEven
FROM    orderdetails
GROUP BY    order_id
ORDER BY    order_id; 

select * from orderdetails;
select * from orders;

SELECT TRUNCATE(1.555,1);

SELECT product_id, round(AVG(quantity_ordered * price_each)) as avg_order_value
FROM orderDetails
GROUP BY product_id;


