class Solution {  
    public String solution(String my_string) {
        String answer = "";
        
//         for(int i=0;i<my_string.length();i++){
//             int flag = 0;
//             for(int j=0;j<answer.length();j++){
//                 if(answer.charAt(j) == my_string.charAt(i)) {
//                     flag = 1;
//                     break;
//                 }
//                 else flag = 0;
//             } 
//                 if(flag == 0) {
//                     answer += my_string.charAt(i);
//                 }
//         }
      
       for(int i=0;i<my_string.length();i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){  // 포함되어있지 않으면 answer에 추가
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}




