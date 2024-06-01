# Write your MySQL query statement below
SELECT
S.user_id, IFNULL(confirmation_rate, 0) as confirmation_rate
from
Signups as S left join
(SELECT 
    user_id,
    Round((SUM(CASE WHEN action = 'confirmed' THEN 1 ELSE 0 END)/Count(*)),2) AS confirmation_rate
FROM Confirmations
GROUP BY user_id) AS C
on S.user_id=C.user_id;
