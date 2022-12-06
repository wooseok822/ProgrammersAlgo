import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        Deque<Integer> dq = new ArrayDeque<>(); // 덱을 활용 Deque<타입> 명 = new ArrayDeque<>() 
        
        for(int i=0;i<numbers.length;i++){
            dq.addLast(numbers[i]);
        }
        
        for(int i=1;i<k;i++){
            int cur = dq.pollFirst();
            dq.addLast(cur);
            int nxt = dq.pollFirst();
            dq.addLast(nxt);
        }
        
        answer = dq.pollFirst();
        
        return answer;
    }
}
