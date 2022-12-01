class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i) >= '1' && my_string.charAt(i) <= '9'){     // 숫자인 경우
                //answer += my_string.charAt(i)-'0'; // 해당 문자에서 '0' 을 빼면 숫자로 변환됨.
                answer += Integer.parseInt("" + my_string.charAt(i)); // Integer의 parseInt를 쓰려면 괄호 안이 문자열이여야 한다. 그래서 ""를 더해준다.)
            }
        }
        return answer;
    }
}
