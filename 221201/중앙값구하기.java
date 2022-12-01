import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);  //java.util.Arrays의 sort 함수를 통해 정렬
        
        answer = array[array.length/2];
        
        return answer;
    }
}
