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
- Stream을 사용한 strArr 배열 정렬한 후 문자열로 출력(오름차순) </br>
```java
String streamSortASC = Stream.of(strArr).sorted().collect(Collectors.joining());
```
- Stream을 사용한 strArr 배열 정렬한 후 문자열로 출력(내림차순) </br>
```java
String streamSortASC = Stream.of(strArr).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
```
