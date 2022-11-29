class Solution {
    public String solution(String my_string) {
// #1 방식
//         String answer = "";
        
//         for(int i=my_string.length()-1;i>=0;i--){
//             answer+=my_string.charAt(i);
//         }
//         return answer;
        
        StringBuilder sb = new StringBuilder();  //스트링빌더 생성
        
        sb.append(my_string);                    //스트링빌더에 my_string 추가
        sb.reverse();                            //reverse 함수를 통해 거꾸로 넣기
        
        return sb.toString();                    //출력 시 toString() 함수를 통해 형변환
    }
}
