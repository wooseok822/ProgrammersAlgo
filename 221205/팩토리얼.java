class Solution {
    public int solution(int n) {
        int answer = 1;

        while(fact(answer)<=n){
            answer++;
        }
        
        return answer-1;
    }
    
    public int fact(int value){
        if(value == 1){
            return 1;
        } 
        else{
            return value * fact(value - 1); // 재귀함수 사용
        }
    }

}
