class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt_n = Math.sqrt(n);   //sqrt와 pow는 double형으로 반환됨.
        if(n % sqrt_n == 0){
            answer = (long)Math.pow(sqrt_n+1, 2);
        }else answer = -1;
        
        return answer;
    }
}
