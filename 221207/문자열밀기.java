import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String cur_str ="";
        Deque<String> dq = new ArrayDeque<>();
        
        for(int i=0;i<A.length();i++){
            dq.addLast(""+A.charAt(i));
        }
        if(A.equals(B)) return 0;
        
        for(int i=1;i<A.length();i++){
            // 오른쪽으로 밀기
            String cur = dq.pollLast(); 
            dq.addFirst(cur);
            // 민 문자열을 cur_str에 저장
            for(int j=0;j<dq.size();j++){
                String a = dq.pollFirst();
                cur_str += a;
                dq.addLast(a);
            }
            // 민 문자열과 B를 비교
            if(B.equals(cur_str)){
                answer = i;
                break;
            }else { // 초기화
                cur_str = "";
            }
        }
        
        return answer;
    }
}
