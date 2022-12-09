// class Solution {
//     public int[] solution(int[][] score) {
//         int[] answer = new int[score.length];
//         int[] sum = new int[score.length];
        
//         for(int i=0;i<score.length;i++){
//             sum[i] = score[i][0] + score[i][1];
//         }
        
//         for(int i=0;i<sum.length;i++){
//             int cnt = 1;
//             for(int j=0;j<sum.length;j++){
//                 if(sum[i]<sum[j]){
//                     cnt++;
//                 }
//             }
//             answer[i] = cnt;
//         }        
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] t : score){   // for-each 문으로 반복문
            list.add(t[0] + t[1]);
        }
        list.sort(Comparator.reverseOrder());   // 리스트를 정렬한다. Comparator.reverseOrder()를 통해 내림차순
        
        int[] answer = new int[score.length];
        
        for(int i=0;i<score.length;i++){        
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;    // indexOf를 사용하면 가장 적은 인덱스가 나오므로 
        }
            
        
        return answer;
    }
}
