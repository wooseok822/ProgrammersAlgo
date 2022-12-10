# Lv.0 총 정리

###        ✏️ List

- List는 배열의 가장 큰 차이는 배열은 크기가 정해져 있지만 List는 크기가 정해져 있지 않고 동적으로 변한다. </br>
- List의 자료형에는 ArrayList, Vector, LinkedList 등의 자료형이 있다. </br>
- ArrayList를 사용하기 위해선 java.util.ArrayList를 import 해야한다. </br>
- ArrayList<Integer> arrlist = new ArrayList<>() : ArrayList 선언 </br>
- arrlist.add("123") : List에 add를 통해 값(123)을 넣는다. </br>
- arrlist.add(1,"33") : List의 2번째 위치에 add를 통해 값(33)을 넣는다. </br>
- arrlist.size() : List의 크기를 리턴 </br>
- arrlist.get(0) : List의 첫 번째 값을 출력(123) </br>
- arrlist.contains("44") : List에 해당 값(44)가 있는지 참거짓으로 리턴 </br>
- arrlist.remove("33") : List에 해당 값(33)을 삭제 </br>
- arrlist.remove(0) : List에 해당 인덱스(0) 값을 삭제 </br>
- String result = String.join(",", arrlist) 를 통해 구분자(,)를 삽입해 하나의 문자열로 출력 </br>
- arrlist.sort(Comparator.naturalOrder()) : 오름차순으로 정렬 (내림차순: reverseOrder()), java.util.Comparator를 import 해야한다.


###        ✏️ Java Stream

- https://wakestand.tistory.com/419 (Java Stream reference link) </br>
- Stream을 사용한 0 ~ n까지 홀수인 값 배열 출력</br>
```java
IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
```
- Stream을 사용한 1 ~ n까지 값 중 i의 배수인 값 개수 출력</br>
```java
(int) IntStream.rangeClosed(1,n).filter(i -> n % i == 0).count();
```



###        ✏️ HashMap

- HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션 </br>
- Map은 Key와 Value로 구성된 Entry 객체를 저장하는 구조 (Key와 Value는 모두 객체) </br>
- Value는 중복 저장이 되지만 Key는 중복 저장 될 수 없다. </br>
- HashMap은 Hashing을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보인다. </br>
- java.util.Map / java.util.HashMap을 import해주어야 한다. </br>
- 선언 (HashMap<자료형, 자료형> 이름 = new HashMap<>(); </br>
```java
HashMap<Integer, String> map = new HashMap<>();
```
- 값 넣기 </br>
```java
map.put(1, "사과");
map.put(2, "포도");
```
- 값 삭제 </br>
```java
map.remove(1); // key 값 제거 (key: 1)
map.clear(); // 모든 Value 제거
```
- 값 가져오기 (map.get(Object key)) </br>
```java
map.get(1); // key 값이 1인 Value 가져오기
```

- Set / Collection 객체로 리턴  </br>
```java
Map<String, Integer> map = new HashMap<>();
map.put("apple", 1);
map.put("banana", 2);
Set<String> keys = map.keySet();
for (String key : keys) {
  System.out.println(key);
}

Collection<Integer> values = map.values();
for (Integer value : values) {
  System.out.println(value)
}
```
