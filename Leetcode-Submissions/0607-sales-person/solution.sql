# Write your MySQL query statement below


select distinct sp.name
from salesperson sp
left join orders o
on sp.sales_id = o.sales_id and o.com_id = (select com_id from company where name = "RED")
where o.com_id is null;
