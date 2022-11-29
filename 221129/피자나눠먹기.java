class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 7 == 0){ //나머지가 딱 떨어지면 몫
            answer = n / 7;
        }else { //나머지가 0이 아니면 몫에 1 더하기
            answer = n / 7 + 1;
        }
        return answer;
    }
}
