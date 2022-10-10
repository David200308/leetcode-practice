/* Write your PL/SQL query statement below */
SELECT name AS Employee FROM Employee e1
WHERE salary > (SELECT salary FROM Employee e2 where e1.managerId = e2.id);