# Lv.1 총 정리

###        ✏️ SQL

- != 와 <>는 같은 의미이며 성능의 차이는 없다. </br>

```mysql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE 1=1
AND INTAKE_CONDITION != 'Aged' # != 대신 <>도 가능(성능의 차이는 없다)
ORDER BY ANIMAL_ID ASC;
```
