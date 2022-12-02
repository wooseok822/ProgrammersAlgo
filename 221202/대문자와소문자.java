class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)>='a'&&my_string.charAt(i)<='z'){
                answer += (char)(my_string.charAt(i) - 32); // 아스키코드로 32만큼 차이나며, (char)를 통해 강제형변환
            }else {
                answer += (char)(my_string.charAt(i) + 32);
            }
        }
        return answer;
    }
}
