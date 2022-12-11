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

