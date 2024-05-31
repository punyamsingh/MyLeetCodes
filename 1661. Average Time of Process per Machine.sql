# Write your MySQL query statement below
select A.machine_id, 
ROUND(AVG(B.timestamp - A.timestamp),3) as processing_time
from Activity A 
join Activity B 
on A.process_id=B.process_id 
and A.machine_id=B.machine_id 
and A.timestamp<B.timestamp
group by A.machine_id;
