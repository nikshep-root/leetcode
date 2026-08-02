-- Write your PostgreSQL query statement below

select (select distinct salary as SecondHighestSalary from Employee order by salary desc limit 1 offset 1)