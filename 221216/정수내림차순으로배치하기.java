import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        
        Arrays.sort(str, Comparator.reverseOrder());   // Comparator.reverseOrder() 를 사용한 내림차순 정렬
        
        //String sort_str = Arrays.toString(str); // [8, 7, 3, 2, 1, 1] Arrays.toString(배열)을 하면 배열값들을 저장한 배열로 반환
        String sort_str = String.join("", str);   // 문자열 배열의 값들을 문자열로 변환하기 위해서는 String.join("", 배열) 활용!!! "" 대신 "/"를 넣으면 /가 중간에 들어감.
        
        answer = Long.parseLong(sort_str);
            
        return answer;
    }
}
