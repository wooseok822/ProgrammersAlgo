import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            String[] arr = quiz[i].split(" ");
            answer[i] = verify(arr);  // 수식이 맞는지 검증하는 함수
        }
        return answer;
    }
    
    public String verify(String[] array){
        int value = 0;
        if(array[1].equals("+")){
            value = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
        }else if(array[1].equals("-")){
            value = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
        }
        
        if(value == Integer.parseInt(array[4])) return "O";
        else return "X";
    }
}
