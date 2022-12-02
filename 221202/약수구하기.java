import java.util.*;

class Solution {
    public List solution(int n) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        
        return list;
        
        //만약 int[]로 반환한다면,
        //return list.stream().mapToInt(x -> x).toArray();
        
        //또는
        //return IntStream.rangeClosed(1,n).filter(i->n%i==0).toArray();
    }
}
