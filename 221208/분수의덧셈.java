class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int bunja = (num1 * denum2) + (num2 * denum1);
        int bunmo = num1 * num2;
        
        for(int i=bunmo;i>= 2;i--){   // 분모의 값부터 나누기
            if(bunja % i == 0){
                if(bunmo % i == 0){
                    bunja /= i;
                    bunmo /= i;
                }
            }
        }
        
        answer[0] = bunja;
        answer[1] = bunmo;
        
        return answer;
    }
}
