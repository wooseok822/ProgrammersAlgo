class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx = 1;
        while(true){
            if( 6 * idx % n == 0){
                answer = idx;
                break;
            }
            idx++;
        }
        return answer;
    }
}
