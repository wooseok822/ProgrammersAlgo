# SELECT COUNT(*) AS USERS
# FROM USER_INFO
# WHERE AGE BETWEEN 20 AND 29
# AND JOINED LIKE '2021%';

SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE AGE >= 20 AND AGE <=29
AND YEAR(JOINED) = 2021;
