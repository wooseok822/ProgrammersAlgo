class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(num1==num2){ //같으면 1
            answer = 1;
        }else { //다르면 -1 (!= 를 써도됨.)
            answer = -1;
        }
        
        return answer;
    }
}
