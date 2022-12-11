# Lv.0 총 정리

###        ✏️ Deque

- Deque은 큐의 양쪽으로 엘리먼트의 삽입과 삭제를 수행할 수 있는 자료구조 </br>
- addFirst() : Deque의 앞쪽에 엘리먼트 삽입 </br>
- offerFirst() : Deque의 앞쪽에 엘리먼트 삽입하며 정상적으로 삽입되면 true 리턴 </br>
- addLast() : Deque의 마지막쪽에 엘리먼트 삽입 </br>
- offerLast() : Deque의 마지막쪽에 엘리먼트 삽입하며 정상적으로 삽입되면 true 리턴 </br>
- pollFirst() / removeFirst() : Deque의 앞쪽에 엘리먼트 제거하며 해당 엘리먼트 리턴 </br>
- pollLast() / removeLast() : Deque의 마지막쪽에 엘리먼트 제거하며 해당 엘리먼트 리턴 </br>
- getFirst() / peekFirst() : Deque의 앞쪽 엘리먼트를 제거하지 않고 리턴 </br>
- getLast() / peekLast() : Deque의 앞쪽 엘리먼트를 제거하지 않고 리턴 </br>
- removeFirstOccurrence(Object o) : Deque의 앞쪽부터 탐색하여 o와 동일한 첫 엘리먼트를 제거 </br>
- size() : Deque의 크기 </br>

- Deque 선언
```java
import java.util.Deque;
import java.util.ArrayDeque;

Deque<Integer> dq = new ArrayDeque<>(); // Deque<타입> 명 = new ArrayDeque<>()
```

###        ✏️ 구슬을 나누는 경우의 수

- 1, 2, 3 을 2개 씩 나누는 경우의 수는 (1, 2), (2, 3), (1, 3) 3가지이다. 구슬의 개수가 balls일 때 share개만큼 나눌 수 있는 경우의 수는? </br>
```java
import java.math.*;   // BigInteger를 사용하기 위함 -> Long보다 더 큰 자료형을 사용해야할 때

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = new BigInteger("1");    // answer를 1로 초기화
        if(balls != share){
            BigInteger a = fact(balls - share).multiply(fact(share));   // multiply를 이용해서 곱한다.
            BigInteger b = fact(balls);
        
            answer = b.divide(a); // divide를 이용해 나눈다.
        }
        
        return answer;
    }
    public BigInteger fact(int num){
        BigInteger mul = new BigInteger("1"); // 1로 초기화
        for(long i=1;i<=num;i++){
            mul = mul.multiply(BigInteger.valueOf(i)); // i의 값을 BigInteger 형태로 바꾸어 반복문 안의 i를 다 곱한 값을 mul에 넣어준다.
        }
        
        return mul;
    }
}
```


###        ✏️ 소인수분해

- n을 소인수 분해해 배열로 출력 </br>
```java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList 생성
        
        for(int i=2;i<=n;i++){
            while(n % i == 0){ 
                n /= i;
                list.add(i); // 리스트에 add를 통해 소인수를 추가
            }
        }
        
        // list를 배열로 변환시킬 때 유용!!! (stream().mapToInt(i->i).toArray())
        answer = list.stream().distinct().mapToInt(i->i).toArray();
        // stream을 이용해 list에서 중복되지 않는 숫자들을 배열로 그대로 넣어준다.
        

        return answer;
    }
}
```


###        ✏️ 유한소수 판별하기

- 소수점 아래가 유한개인 소수를 유한소수라 한다. 기약분수로 나타내었을 때 분모의 소인수가 2와 5만 존재해야한다. </br>
```java
class Solution {
    public int solution(int a, int b) {
        int newB = b / gcd(a, b);

        while (newB != 1) {
            if (newB % 2 == 0) {   // 2로 계속 나누기
                newB /= 2;
            } else if (newB % 5 == 0) { // 5로 계속 나누기
                newB /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

