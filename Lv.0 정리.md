# Lv.0 총 정리

###        ✏️ StringBuilder

- String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식을 사용하  기 때문에 속도가 빠르며 부하가 적다. </br>
- StringBuilder sb = new StringBuilder(); 를 통해 선언하고 append를 통해 문자열을 더한다. </br>
- StringBuilder의 인스턴스인 sb의 문자열을 출력하기 위해서는 toString()을 쓴다. </br>
- StringBuilder는 sb.reverse() 처럼 문자열을 거꾸로 출력할 수도 있다. </br>


###        ✏️ Java Stream

- https://wakestand.tistory.com/419 (Java Stream reference link) </br>
- Stream을 사용한 0 ~ n까지 홀수인 값 배열 출력</br>
```java
IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
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
- str1.replaceAll("abc","def") : str1에서 문자열 abc를 def로 변경 (첫 번째 인자에 정규식 가능) </br>
- str1.replace("#","%") : str1에 특정 문자(#)을 지정한 문자(%)로 변경 </br>
- str1.split("/") : str1에서 지정한 문자(/)를 기준으로 나눈 후 배열로 리턴 </br>
- str1.trim() : 문자열의 시작과 끝에 있는 공백을 없애준다. 중간은 예외 </br>
- str1.compareTo(str2) : str1와 str2을 앞에서 순차적으로 비교하다가 틀린 부분이 있으면 값을 반환한다. 예를 들어 str1이 a, str2가 b인 경우 -1이 반환되는데 이는 a의 아스키코드와 b의 아스키코드를 뺀 값이다. </br>
- str1.contains(str2) : str1에 str2가 포함되는지 참거짓으로 리턴 </br>
- str1.charAt(idx) : str1의 지정한 인덱스(idx)의 문자 반환 </br>

*** replace와 replaceAll의 차이점 *** </br>
replace는 첫 번째 인자값에 문자열이 들어가고 replace는 첫 번째 인자값에 정규식이 들어간다. </br>
예를 들어 str = "aabbcc" </br>
str.replace("ab","t")      // atbcc </br>
str.replaceAll("[ab]","t") // ttttcc
