import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i % j == 0){
                    count++;
                    if(count >= 3){
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
      
      // (int) IntStream.rangeClosed(1,n).filter(i -> (int) IntStream.rangeClosed(1,i).filter(j -> i % j == 0).count() > 2).count();
      // 이중스트림 사용
    }
}
