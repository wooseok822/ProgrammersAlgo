// class Solution {
//     public int[] solution(int[] emergency) {
//         int[] answer = new int[emergency.length];
//         for(int i=0;i<emergency.length;i++){
//             int count = 1;
//             for(int j=0;j<emergency.length;j++){
//                 if(emergency[i]<emergency[j]) count++;
//             }
//             answer[i] = count;
//         }
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sort_emer = Arrays.copyOf(emergency, emergency.length); // 배열 복사
        Arrays.sort(sort_emer); // 정렬
        
        Map<Integer, Integer> rank = new HashMap<Integer, Integer>();   // int, int 인 해쉬맵 생성 (값, 순위) 매핑
        
        int rankIdx = 1;
        
        for(int i=sort_emer.length;i>0;i--){    // 정렬된 값과 순위를 rank 해쉬 맵에 넣어서 매핑
            rank.put(sort_emer[i-1],rankIdx++);
        }
        
        for(int i=0;i<emergency.length;i++){    // 정렬하지 않은 emergency의 값을 통해 순위 값을 get으로 가져와 그대로 answer 배열에 넣어줌
            answer[i] = rank.get(emergency[i]);
        }   
        
        return answer;
    }
}
