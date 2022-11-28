class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        double result = (double)num1/(double)num2 * 1000; //강제형변환
        
        answer=(int)result; //형변환해서 넣어줘야함.
        
        return answer;
    }
}
