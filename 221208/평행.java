class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[] inclination = new double[6];   // 기울기를 담는 배열
        int idx = 0;
        for(int i=0;i<dots.length;i++){
            for(int j=i+1;j<dots.length;j++){
                inclination[idx++] = (double)(dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);   // 기울기 공식
            }
        }
        
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++)
                {
                    if(inclination[i] == inclination[j]) {  // 하나라도 기울기가 같으면 1을 반환
                        answer = 1;
                        break;
                    }
                }            
        }        
        return answer;
    }
}
