class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx=0;
        int[] list = new int[n/2];
        
        for(int i=1;i<=n;i++){
            if(i%2==0){ //짝수면 배열 리스트에 추가
                list[idx]=i;
                idx++;
            }
        }
 
        for(int i=0;i<list.length;i++){ //배열길이는 length, 문자열 길이는 length()
            answer+=list[i];
        }
        
        return answer;
    }
}
