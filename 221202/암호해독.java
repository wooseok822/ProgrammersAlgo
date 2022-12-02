class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i=code;i<=cipher.length();i+=code){
            answer += cipher.charAt(i-1);
            //answer += cipher.substring(i-1,i); //substring을 통해 자르는 방법
        }
        return answer;
    }
}
