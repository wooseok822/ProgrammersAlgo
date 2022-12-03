import java.util.*;

class Solution {
    public String solution(String my_string) {
//         String answer = "";
        
//         char[] str = new char[my_string.length()];
//         str = my_string.toCharArray();
        
//         for(int i=0;i<str.length;i++){
//             if(str[i]>='A' && str[i]<='Z'){
//                 str[i] = (char)(str[i] + 32);
//             }
//         }
        
//         Arrays.sort(str);
        
//         return String.valueOf(str);
        
        
        char[] str = my_string.toLowerCase().toCharArray(); // 문자열을 toLowerCase()를 통해 소문자로 변환하고 char 배열로 저장
        
        Arrays.sort(str);  // 정렬
        
        return String.valueOf(str); // 문자열로 변환 후 
    }
}
