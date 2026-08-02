-- Write your PostgreSQL query statement below

select d.name as Department, e.name as Employee, e.salary as Salary from Employee e join Department d on e.departmentId = d.id where(e.departmentId, e.salary) in (select departmentid , max(salary) from Employee group by departmentId)