-- Write your PostgreSQL query statement below

select name from SalesPerson where sales_id not in (select sales_id from Orders where com_id IN (select com_id from Company where name = 'RED'))