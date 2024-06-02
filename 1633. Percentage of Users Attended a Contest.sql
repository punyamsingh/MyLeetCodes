# Write your MySQL query statement below
select
    Register.contest_id, ROUND(COUNT(DISTINCT(Register.user_id))/COUNT(DISTINCT(Users.user_id))*100,2) as percentage
from
    Register, Users
group by
    contest_id
order by
    percentage DESC, Register.contest_id ASC;
