import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] num = String.valueOf(n).split("");
        
        for(String a : num){
            answer += Integer.parseInt(a);
        }
        
        return answer;
    }
}
