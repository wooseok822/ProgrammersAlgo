class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = lines[0][0];
        int max = lines[0][1];
        int pl = 0 - min;
        for(int i=1;i<3;i++){    // 0부터 배열의 인덱스가 시작되므로 -로 시작되는 점들을 0까지 밀어주기 위해 pl을 구한다.
            if(lines[i][0]<min){
                min = lines[i][0];
                pl = 0 - min;
            }
            if(lines[i][1]>max){
                max = lines[i][1];
            }
        }
        
        for(int i=0;i<3;i++){  // 좌표의 시작을 0으로 하기 위함.
            lines[i][0] += pl;
            lines[i][1] += pl;
        }
        min += pl;
        max += pl;
        
        int[] map = new int[min + max + 1];
        
        for(int i=0;i<3;i++){   // 선이면 ++를 통해 값을 증가
            for(int j=lines[i][0]+1;j<=lines[i][1];j++){
                map[j]++;
            }
        }
        
        for(int i=0;i<map.length;i++){   // 2 이상이면 겹치는 선
            if(map[i] >= 2) answer++;
        }

        return answer;
    }
}
