class Solution {
    public int solution(String s) {
        int answer = 0;       
        String[] arr = s.split(" ");
        int recent_value = 0;        
        
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals("Z")){
                answer += Integer.parseInt(arr[i]);
                recent_value = Integer.parseInt(arr[i]);
            }else {
                answer -= recent_value;
            }
        }
        
        return answer;
      
      // 스택을 이용해서도 풀 수 있다 => Z가 아니면 push하고 Z면 pop를 통해 가장 위값을 꺼낸다. 그리고 반복문으로 스택에 있는 값들을 더한다.
    }
}
