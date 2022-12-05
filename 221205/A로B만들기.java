// class Solution {
//     public int solution(String before, String after) {
//         int answer = 1;
//         int[] before_count = new int[26];
//         int[] after_count = new int[26];
        
//         for(int i=0;i<before.length();i++){
//             before_count[before.charAt(i)%97]++;
//         }
        
//         for(int i=0;i<after.length();i++){
//             after_count[after.charAt(i)%97]++;
//         }
        
//         for(int i=0;i<26;i++){
//             if(before_count[i] != after_count[i]){
//                 answer = 0;
//                 break;
//             }
//         }
        
//         return answer;
//     }
// }

import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] befores = before.toCharArray(); // char 배열로 변환
        char[] afters = after.toCharArray();
        
        Arrays.sort(befores); // 배열 정렬
        Arrays.sort(afters);
        
        return new String(befores).equals(new String(afters)) ? 1 : 0; // new String으로 문자열로 만들고 비교
    }
}
