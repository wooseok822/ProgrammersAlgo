import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        // Arrays.stream(numlist) 배열을 선언하고 boxed()를 통해 가공하고 collect(Collectors.toList())를 통해 List 타입으로 반환
        
        list.sort((o1, o2) -> {   // 정렬
            int o1s = Math.abs(o1 - n);
            int o2s = Math.abs(o2 - n);
            
            if(o1s == o2s){
                if(o1 > o2) return -1;
                else if(o1 < o2) return 1;
            } else {
                return o1s - o2s;
            }
                return 0;
            
        });
        
        answer = list.stream().mapToInt(Integer :: intValue).toArray();
        // list.stream() 선언 mapToInt를 통해 정수로 변환해 toArray()로 배열로 반환
        
        
        return answer;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] numList, int n) {
//         return Arrays.stream(numList)
//                 .boxed()
//                 .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
//                 .mapToInt(Integer::intValue)
//                 .toArray();
//     }
// }
