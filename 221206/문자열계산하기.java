class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split(" ");  // 공백을 기준으로 split해 배열로 저장
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        answer = Integer.parseInt(arr[0]); // 첫 번째 숫자 저장
        
        for(int i=1;i<arr.length;i++){
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }else if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        
        return answer;
    }
}
