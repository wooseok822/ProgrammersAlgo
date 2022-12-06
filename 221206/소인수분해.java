import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList 생성
        
        for(int i=2;i<=n;i++){
            while(n % i == 0){ 
                n /= i;
                list.add(i); // 리스트에 add를 통해 소인수를 추가
            }
        }
        
        // list를 배열로 변환시킬 때 유용!!! (stream().mapToInt(i->i).toArray())
        answer = list.stream().distinct().mapToInt(i->i).toArray();
        // stream을 이용해 list에서 중복되지 않는 숫자들을 배열로 그대로 넣어준다.
        

        return answer;
    }
}
