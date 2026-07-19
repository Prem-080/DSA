SELECT e1.name as Employee
FROM employee e1
JOIN employee e2 on e1.managerId = e2.id
where e1.salary > e2.salary;

