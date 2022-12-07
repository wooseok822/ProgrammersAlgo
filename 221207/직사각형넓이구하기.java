class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int y1 = 0;
        int x2 = 0;
        for(int i=1;i<dots.length;i++){
            if(dots[0][0] == dots[i][0]){
                y1 = dots[i][1];
            }else if(dots[0][1] == dots[i][1]){
                x2 = dots[i][0];
            }
        }
        
        int w = Math.abs(dots[0][1] - y1);
        int h = Math.abs(dots[0][0] - x2);
        
        answer = w * h;
        
        return answer;
    }
}
