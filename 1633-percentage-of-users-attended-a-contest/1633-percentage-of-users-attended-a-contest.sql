# Write your MySQL query statement below
SELECT DISTINCT contest_id ,ROUND(COUNT(r.user_id)*100/(SELECT COUNT(*) FROM Users),2) AS percentage
FROM Users u
LEFT JOIN Register r
ON u.user_id = r.user_id
WHERE r.contest_id IS NOT NULL
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;






















