class Solution {
    public String solution(int age) {
        String result = "";
        String answer = String.valueOf(age);  // 문자열로 변환
        char[] arr = answer.toCharArray();    // 하나하나 배열로 변환
    
        for(int i=0;i<arr.length;i++){
            result += (char)(97 + Integer.parseInt(arr[i]+"")); // 정수로 변환 후 아스키코드값을 이용해 문자형으로 강제변환
        }
        
        return result;
    }
}
