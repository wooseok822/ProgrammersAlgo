// class Solution {
//     static int answer = 0;
    
//     public int solution(String my_string) {
//         String num = "";
        
//         for(int i=0;i<my_string.length();i++){
//             if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9'){  // 숫자인 경우 문자열에 숫자 추가
//                 num += my_string.charAt(i);
//                 if(i == my_string.length()-1){   // 마지막 인덱스가 숫자로 끝난 경우
//                      trans(num);
//                      num = "";
//                 }
//             }else{
//                 if(num!=""){
//                     trans(num);
//                     num = "";
//                 }
//             }    
//         }
        
//         return answer;
//     }
    
//     public void trans(String str){  // 문자열을 숫자로 변환 후 더해준다.
//         int number = Integer.parseInt(str);
//         answer += number;
//     }
// }

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] str = my_string.replaceAll("[^0-9]"," ").split(" ");
        // replaceAll을 통해 0~9가 아닌 문자들을 공백으로 대체하고 이를 기준으로 split해서 배열에 저장한다.
        
        for(String num : str){ // for-each문을 통해 값에 접근
            System.out.println(num);
            if(!num.equals("")) { // 빈 공간이 아니면 int로 변형시켜 더함
                answer += Integer.parseInt(num);
            }
        }

        return answer;
    }
}
