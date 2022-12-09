class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        //ex) 연속된 숫자 3개의 합은 12
        // (x+1) + (x+2) + (x+3) = 3x + 6 = 12
        // 6을 구하기 위해 num * (num + 1) / 2를 해준다
        // start는 x의 값인데 3x + 6 = 12 에서 3x = 6 => x = 2를 나타내기 위해 아래의 식을 사용한다.
        
        int nSum = num * (num + 1) / 2;
        int start = (total - nSum) / num;
        
        for(int i=1;i<=num;i++){
            answer[i-1] = start + i;
        }
        
        return answer;
    }
}
