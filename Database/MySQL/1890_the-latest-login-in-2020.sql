# Write your MySQL query statement below
SELECT user_id as user_id, max(time_stamp) as last_stamp FROM Logins
    WHERE time_stamp between '2020-01-01' and '2021-01-01'
GROUP BY user_id
ORDER BY last_stamp DESC