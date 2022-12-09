class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[101];
        int idx = 1;
        int i = 1;
        while (i <= n){
            if(idx % 3 == 0 || String.valueOf(idx).contains("3")) { // 3으로 나누어지거나 3이 포함되어있는지 확인
                idx++;
                continue;
            }
            num[i++] = idx++;
        }
        answer = num[n];
        return answer;
    }

}
