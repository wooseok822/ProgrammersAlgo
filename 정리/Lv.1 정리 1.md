# Lv.1 총 정리

###        ✏️ SQL (!=, <>)

- != 와 <>는 같은 의미이며 성능의 차이는 없다. </br>

```mysql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE 1=1
AND INTAKE_CONDITION != 'Aged' # != 대신 <>도 가능(성능의 차이는 없다)
ORDER BY ANIMAL_ID ASC;
```

###        ✏️ SQL (상위 추출)

- MySql에서는 LIMIT, Oracle에서는 ROWNUM을 활용한다. </br>

```mysql
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME ASC
LIMIT 1    # LIMIT 0,3 은 위에서부터 0 ~ 3까지 
```

```Oracle
SELECT NAME
FROM (SELECT *
     FROM ANIMAL_INS
     ORDER BY DATETIME)
WHERE ROWNUM < 2
```
