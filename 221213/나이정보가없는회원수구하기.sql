SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE AGE IS NULL

# 만약 tmp1컬럼의 값이 11인 것의 개수를 세려면
# count(case when tmp1 = '11' then 1 end)
# 로 하면 되고 tmp1컬럼의 값이 22인 것의 개수도 세려면
# count(case when tmp1 = '11' then 1 end), count(case when tmp1 = '22' then 1 end)
# 로 하면 된다.
