# Write your MySQL query statement below
select c.name as Customers from(select id, name from Customers) c left join
(select id, customerId from Orders)o on c.id = o.customerId where o.customerId is null;