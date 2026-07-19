# Write your MySQL query statement below

select DATE_FORMAt(trans_date, '%Y-%m') as month, 
country, 
count(*) AS trans_count,
sum(state = 'approved') AS approved_count, 
sum(amount) AS trans_total_amount, 
sum(case when state = 'approved' then amount
    else 0
    end
) AS approved_total_amount

from transactions
group by DATE_FORMAt(trans_date, '%Y-%m'), country;


