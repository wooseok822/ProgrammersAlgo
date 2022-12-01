// class Solution {
//     public int solution(int n) {
//         int answer = 2;
        
//         for(int i=1;i<=n/2;i++){
//             if(i * i == n){
//                 answer = 1;
//                 break;
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public int solution(int n) {
        
        if(n % Math.sqrt(n) == 0){   //Math 라이브러리의 sqrt를 통해 제곱근을 구하고 이를 n과 나누어서 나머지가 0 이면 n은 제곱수
            return 1;
        }else return 2;
    }
}
