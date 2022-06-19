# Write your MySQL query statement below
SELECT Users.name, sum(Transactions.amount) AS balance

FROM Users
    LEFT JOIN Transactions
        on Users.account = Transactions.account
    GROUP by Transactions.account

HAVING balance > 10000;