import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        //String str_order = "" + order; //""를 더해도 문자열로 변환이 가능하다.
        
        String str_order = String.valueOf(order);
        for(int i=0;i<str_order.length();i++){
            if(str_order.charAt(i) == '3' || 
               str_order.charAt(i) == '6' || 
               str_order.charAt(i) == '9'){
                answer++;
            }
        }
        return answer;
        
        //return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i->i==3||i==6||i==9).count();
        //order값을 문자열로 바꾸고 split으로 잘라서 Arrays.stream으로 배열로 바꾸고 map을 통해 배열 하나하나 정수로 바꾼 것을 필터로 걸러준 후 count를 센다.
    }
}
