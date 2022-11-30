import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int memory = 0;
        int max=sides[0];
        int sum=0;
        
        for(int i=1;i<3;i++){ //가장 긴 변의 값과 인덱스 저장
                if(max<sides[i]){
                    max = sides[i];
                    memory = i;
                }
        }
        
        for(int i=0;i<3;i++){ //가장 긴 변을 제외한 나머지 두 변의 합
            if(memory == i) continue;
            
            sum += sides[i];    
        }
        
        if(sum>max){
            answer = 1;
        }else {
            answer = 2;
        }
        
        return answer;
        
       // Arrays.sort(sides); // 배열을 Arrays.sort를 통해 정렬해 가장 긴 변을 찾는 방법
        
       // return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}
