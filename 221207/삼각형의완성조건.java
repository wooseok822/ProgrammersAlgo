class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int fir = Math.max(sides[0],sides[1]);
        int sec = Math.min(sides[0],sides[1]);
        
        for(int i=fir;i>=1;i--){
            if(i+sec>fir){
                answer++;
            }
        }
        
        for(int i=fir+1;i<sec+fir;i++){
            answer++;
        }
        
        return answer;
    }
}
