class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n % slice == 0){ // 0으로 나누어 떨어지면 몫
            answer = n / slice;
        }else {             // 0으로 나누어 떨어지지 않으면 몫 + 1
            answer = n / slice + 1;
        }
        
        return answer;
    }
}
