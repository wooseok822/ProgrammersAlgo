import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int count = 0;
        int idx = 0;
        
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                count++;
            }
        }
        
        answer = new int[count];
        
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                answer[idx++] = my_string.charAt(i) - '0';
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
      
      //return Arrays.stream(my_string.replaceAll("[A-Z|a-z]","").split("")).sorted().mapToInt(Integer::parseInt).toArray();
      //Arrays의 stream을 통해 replaceAll로 문자들을 빈공간으로 대체하고 sorted를 통해 정렬 후 mapToInt로 정수로 변환한 후 배열로 반환
      
      //my_string = my_string.replaceAll("[^0-9]",""); //my_string에 0~9 빼고 다 빈 공간으로 대체
    }
}
