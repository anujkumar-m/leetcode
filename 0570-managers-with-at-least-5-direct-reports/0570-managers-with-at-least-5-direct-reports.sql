# Write your MySQL query statement below
select e.name from Employee e inner join Employee a on e.id = a.managerId group by a.managerId having count(e.department) >=5 #and a.managerId is not null;