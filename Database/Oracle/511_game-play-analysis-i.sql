/* Write your PL/SQL query statement below */
SELECT player_id, to_char(MIN(event_date),'YYYY-MM-DD') AS first_login FROM Activity
GROUP BY player_id