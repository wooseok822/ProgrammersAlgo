class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] trans = new char[my_string.length()];
        trans = my_string.toCharArray();  // String의 toCharArray를 통해 문자형 배열로 변환
        
        char tmp;
        tmp = trans[num1];
        trans[num1] = trans[num2];
        trans[num2] = tmp;
        
        return String.valueOf(trans);   // String의 valueOf를 통해 trans 배열을 String으로 변환
                                        // valueOf는 입력받은 객체를 문자열로 변환시켜 반환시켜주는 함수
        
//         String answer = "";
        
//         for(int i=0;i<trans.length;i++){
//             answer += trans[i];
//         }
        
//         return answer;
    }
}
