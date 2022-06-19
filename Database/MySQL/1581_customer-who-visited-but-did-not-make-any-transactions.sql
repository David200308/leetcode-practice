# Write your MySQL query statement below
SELECT customer_id as customer_id, COUNT(Visits.visit_id) - COUNT(Transactions.visit_id) as count_no_trans from Visits
LEFT JOIN Transactions ON Visits.visit_id = Transactions.visit_id
GROUP BY customer_id
HAVING count_no_trans > 0