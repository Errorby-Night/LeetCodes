# Write your MySQL query statement below
select
    stock_name,
    sum(if(operation='Buy', -price, price)) as capital_gain_loss
from stocks
group by 1;