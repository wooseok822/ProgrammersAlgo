# Lv.0 총 정리

###        ✏️ StringBuilder

- String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식을 사용하  기 때문에 속도가 빠르며 부하가 적다. </br>
- StringBuilder sb = new StringBuilder(); 를 통해 선언하고 append를 통해 문자열을 더한다. </br>
- StringBuilder의 인스턴스인 sb의 문자열을 출력하기 위해서는 toString()을 쓴다. </br>
- StringBuilder는 sb.reverse() 처럼 문자열을 거꾸로 출력할 수도 있다. </br>


###        ✏️ Java Stream

- https://wakestand.tistory.com/419 (Java Stream reference link) </br>
- Stream을 사용해 0 ~ n까지 홀수인 값 배열 출력</br>
```java
IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
```
- Stream을 사용해 1 ~ n까지 값 중 i의 배수인 값 개수 출력</br>
```java
(int) IntStream.rangeClosed(1,n).filter(i -> n % i == 0).count();
```
- Stream을 사용해 strArr 배열 정렬한 후 문자열로 출력(오름차순) </br>
```java
String streamSortASC = Stream.of(strArr).sorted().collect(Collectors.joining());
```
- Stream을 사용해 strArr 배열 정렬한 후 문자열로 출력(내림차순) </br>
```java
String streamSortASC = Stream.of(strArr).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
```
- Stream을 사용해 str문자열 중 문자들을 빈공간으로 대체하고 정수들을 배열로 정렬시켜 출력 </br>
```java
Arrays.stream(str.replaceAll("[A-Z|a-z]","").split("")).sorted().mapToInt(Integer::parseInt).toArray();
```
- Stream을 사용해 정수에서 3,6,9가 포함된 개수 반환 </br>
```java
(int) Arrays.stream(String.valueOf(num).split("")).map(Integer::parseInt).filter(i -> i==3||i==6||i==9).count()
```
- Stream을 사용해 1부터 n까지의 숫자 중 합성수의 개수 </br>
```java
(int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(j -> j % i == 0).count() > 2).count()
```
- Stream을 사용해 list를 배열로 변환해 arr 배열에 넣기 </br>
```java
arr = list.stream().distinct().mapToInt(i->i).toArray();
```

###        ✏️ String

- str1.equals(str2) : str1과 str2의 문자열이 동일한지 비교한 결과값 리턴 </br>
- str1.indexOf("a") : str1에서 특정 문자(a)가 시작되는 인덱스 리턴 </br>
- str1.length() : str1의 길이 리턴 </br>
- str1.substring(2,4) : str1에서 2,3 인덱스에 해당하는 문자열을 뽑아 리턴 </br>
- str1.toUpperCase() : str1의 문자를 모두 대문자로 변경 </br>
- str1.toLowerCase() : str1의 문자를 모두 소문자로 변경 </br>
- str1.concat(str2) : str1의 문자열과 str2의 문자열을 합칠 때 사용 </br>
- str1.startWith("a") : str1이 지정된 문자(a)로 시작하는지 참거짓으로 리턴 </br>
- str1.endWith("a") : str1이 지정된 문자(a)로 끝나는지 참거짓으로 리턴 </br>
- str1.replaceAll("abc","def") : str1에서 문자열 abc를 def로 변경 </br>
  <첫 번째 인자에 정규식 가능: replaceAll("[대체하고 싶은 문자들]", "대체할 문자") > </br>
- str1.replace("#","%") : str1에 특정 문자(#)을 지정한 문자(%)로 변경 </br>
- str1.split("/") : str1에서 지정한 문자(/)를 기준으로 나눈 후 배열로 리턴 </br>
- str1.trim() : 문자열의 시작과 끝에 있는 공백을 없애준다. 중간은 예외 </br>
- str1.compareTo(str2) : str1와 str2을 앞에서 순차적으로 비교하다가 틀린 부분이 있으면 값을 반환한다. 예를 들어 str1이 a, str2가 b인 경우 -1이 반환되는데 이는 a의 아스키코드와 b의 아스키코드를 뺀 값이다. </br>
- str1.contains(str2) : str1에 str2가 포함되는지 참거짓으로 리턴 </br>
- str1.charAt(idx) : str1의 지정한 인덱스(idx)의 문자 반환 </br>
- String.valueOf(num) : 정수를 문자열로 바꾸고 싶을 때 사용 </br>
- char[] strArr = str1.toCharArray() : 문자열 str1을 Char형 배열(strarr)에 저장 </br>
- String.valueOf(strArr) : char형 배열을 문자열로 변환 (입력받은 객체를 문자열로 변환시켜 반환) </br>

**replace와 replaceAll의 차이점** </br>
replace는 첫 번째 인자값에 문자열이 들어가고 replace는 첫 번째 인자값에 정규식이 들어간다. </br>
예를 들어 str = "aabbcc" </br>
str.replace("ab","t")      // atbcc </br>
str.replaceAll("[ab]","t") // ttttcc </br>

**활용**
str.replaceAll("[A-Z|a-z]","") : str 문자열 중 A부터 Z, a부터 z까지 문자들을 제거 </br>
str.replaceAll("[^0-9]","") : str 문자열 중 0부터 9를 제외한 나머지들을 제거</br>
str.replaceAll("[^0-9]"," ").split(" ") : str 문자열 중 0부터 9를 제외한 나머지들을 공백으로 대체하고 공백을 기준으로 잘라서 배열로 

**응용 문제**
1. str에서 중복되는 문자는 제거해서 result에 출력
```java
for(int i=0;i<str.length();i++){
  if(!result.contains(String.valueOf(str.charAt(i)))){
    result += str.charAt(i);
  }
}
```


###        ✏️ 문자(숫자)를 정수로 바꾸려는 경우

- 특정문자(숫자)에서 - '0'을 빼준다. (ex. str1.charAt(idx) - '0') </br>
- Integer.parseInt(문자열)을 통해 정수로 변환한다. (ex.Integer.parseInt("" + str1.charAt(idx))) </br>


###        ✏️ 배열(Array) 정렬 및 복사

- 배열 복사
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = Arrays.copyOf(arr1, arr1.length); // Arrays.copyOf(배열, 배열길이)
```
- Arrays.sort() </br>
- java.util.Arrays 클래스를 사용하면 배열을 정렬, 복제, List로 변환하는 등의 작업을 쉽게 처리 가능하다.</br>
- Arrays.sort(arr) : arr의 배열을 오름차순으로 정렬 </br>
- Arrays.sort(arr, Comparator.reverseOrder()) : arr의 배열을 내림차순으로 정렬 </br>
- Arrays.sort(arr, Collections.reverseOrder()): arr의 배열을 내림차순으로 정렬 </br>


###        ✏️ Comparable / Comparator

- 내림차순이나 원하는 정렬 조건을 설정하기 위해 Comparable 인터페이스의 compareTo() 메서드를 원하는 조건으로 오버라이드하거나 Comparator를 구현한 Class 내의 compare() 메서드를 원하는 정렬 조건으로 오버라이드 할 수 있다. </br>
- java.util.Arrays 클래스를 사용하면 배열을 정렬, 복제, List로 변환하는 등의 작업을 쉽게 처리 가능하다.</br>
```java
class CustomComparator implements Comparator<String> {
  @Override
  public int compare(String o1, String o2){
    return o2.compareTo(o1); //내림차순
    }
 }
 
 String[] str = new String[] {"A", "C", "B"};
 Arrays.sort(str, new CustomComparator());
```

