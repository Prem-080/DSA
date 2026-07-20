# Write your MySQL query statement below


select customer_id
from customer c
group by c.customer_id
having count(distinct product_key) = (select count(*) from product)
;
