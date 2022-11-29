class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length]; //배열 생성
        int idx=0;
        
        for(int i=num_list.length-1;i>=0;i--){ //뒤에 인덱스부터 넣어주기
            answer[idx]=num_list[i]; 
            idx++;
        }
        
        return answer;
    }
}
