/* Write your PL/SQL query statement below */
SELECT Department.name AS Department, Employee.name AS Employee, Salary FROM Employee
JOIN Department ON Department.id = Employee.departmentId
WHERE (Employee.departmentId, Salary) IN (SELECT departmentId, MAX(salary) FROM Employee GROUP BY departmentId);