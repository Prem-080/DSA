# Write your MySQL query statement below
# Person and Address
# Person.firstName, Person.lasName, Address.city, Address.state

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person as p
LEFT JOIN Address as a
ON p.personId = a.personId;
