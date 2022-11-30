class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int idx=0;
        
        for(int i=1;i<=n;i+=2){
            answer[idx++] = i;    
        }
        
        return answer;
    }
}


/*
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
        // IntStream의 rangeClosed는 0부터 n까지 값을 생성해주고 filter를 통해 홀수인 값만 생성한다. 후에 toArray() 함수를 통해 배열로 변환한다.
    }
}
*/
