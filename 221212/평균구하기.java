// class Solution {
//     public double solution(int[] arr) {
//         double answer = 0;
//         double sum = 0;
        
//         for(int i=0;i<arr.length;i++){
//             sum += arr[i];
//         }
        
//         answer = sum / arr.length;
        
//         return answer;
//     }
// }

import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {

        return (double) Arrays.stream(arr).average().orElse(0); 
        // 배열의 평균을 Arrays.stream(배열).average()를 통해 구하고 orElse는 average 값이 있으면 해당 값을 리턴하고 없으면 0을 리턴한다는 의미
    }
}
