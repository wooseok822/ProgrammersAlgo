class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = -1;
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int result = numbers[i] * numbers[j];
                if(max < result){
                    max = result;
                }
            }
        }
        
        answer = max;
        
        return answer;
    }
}
