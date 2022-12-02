import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<Integer>(); // 리스트 생성
        
        for(int i=0;i<numlist.length;i++){
            if(numlist[i] % n == 0){ // 배수는 리스트에 추가
                list.add(numlist[i]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i); // list의 get을 통해 접근
        }

        return answer;
      
      //return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}
