// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
        
//         for(int i=0;i<my_string.length();i++){
//             if(my_string.charAt(i) == 'a' 
//                || my_string.charAt(i) == 'e' 
//                || my_string.charAt(i) == 'i' 
//                || my_string.charAt(i) == 'o' 
//                || my_string.charAt(i) == 'u') continue;
            
//             answer+=my_string.charAt(i);
//         }
        
//         return answer;
//     }
// }

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        answer = my_string.replaceAll("[aeiou]","");   //replaceAll("[대체하고 싶은 문자들]","대체하고 싶은 문자")

        return answer;
    }
}
