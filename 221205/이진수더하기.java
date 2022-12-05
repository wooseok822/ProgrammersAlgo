class Solution {
    public String solution(String bin1, String bin2) {      
        return Integer.toString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2),2);
    } 
}

// Integer.parseInt(문자열,2)를 하면 2진수를 10진수 정수로 바꿔준다.
// Integer.toString(값, 2)를 하면 값을 2진수로 바꿔준다.
