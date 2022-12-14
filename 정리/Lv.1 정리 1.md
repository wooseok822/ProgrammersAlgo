# Lv.1 총 정리

###        ✏️ SQL (!=, <>)

- != 와 <> '~이 같지않은' 이라는 의미이며, 성능의 차이는 없다. </br>

```mysql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE 1=1
AND INTAKE_CONDITION != 'Aged' # != 대신 <>도 가능(성능의 차이는 없다)
ORDER BY ANIMAL_ID ASC;
```

###        ✏️ SQL (상위 추출)

- MySql에서는 LIMIT, Oracle에서는 ROWNUM을 활용한다. </br>

```sql
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME ASC
LIMIT 1    # LIMIT 0,3 은 위에서부터 0 ~ 3까지 
```

```sql
SELECT NAME
FROM (SELECT *
     FROM ANIMAL_INS
     ORDER BY DATETIME)
WHERE ROWNUM < 2
```

###        ✏️ SQL (NULL)

- MySql에서 NULL값을 활용하기 위해서 사용하는 구문 </br>

```sql
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL # NAME 컬럼에 NULL이 아닌 것들 추출 (NULL을 뽑으려면 IS NULL 사용)
ORDER BY ANIMAL_ID;
```


###        ✏️ SQL (case를 사용한 count)

- table_1 테이블에서 col_1 컬럼의 값이 123인 것의 개수를 카운트 </br>
```sql
SELECT COUNT(CASE WHEN col_1 = '123' THEN 1 END)
FROM table_1
```

- table_1 테이블에서 col_1 컬럼의 값이 123과 321인 것의 개수를 카운트 </br>
```sql
SELECT COUNT(CASE WHEN col_1 = '123' THEN 1 END), COUNT(CASE WHEN col_1 = '321' THEN 1 END)
FROM table_1 
```

###        ✏️ SQL (MAX)

- 해당 컬럼에서 가장 큰 값 (예를 들어 price의 가격이 가장 비싼 값) </br>
```sql
SELECT MAX(PRICE) AS MAX_PRICE
FROM PRODUCT
```

###        ✏️ SQL (BETWEEN / YEAR)

- USER_INFO 테이블에서 AGE가 20이상 29 이하이며 JOINED 날짜가 2021년인 데이터의 개수 카운트 </br>
```sql
SELECT COUNT(*) USERS
FROM USER_INFO
WHERE AGE BETWEEN 20 AND 29
AND JOINED LIKE '2021%'
```
```sql
SELECT COUNT(*) USERS
FROM USER_INFO
WHERE AGE >= 20 AND AGE <=29
AND YEAR(JOINED) = '2021'    # 년도를 출력, 월은 MONTH, 일은 DAY
```


