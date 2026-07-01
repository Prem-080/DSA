# Write your MySQL query statement below
SELECT DISTINCT p2.email as Email
FROM Person as p1
JOIN Person p2
ON p2.email = p1.email and p2.id != p1.id
WHERE p2.email IS NOT NULL;

-- SELECT email AS Email
-- FROM Person
-- GROUP BY email
-- HAVING COUNT(*) > 1;
