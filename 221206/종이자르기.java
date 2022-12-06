class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        answer = M * N - 1;   // DP, M으로 자르면 N은 그만큼 더 잘라야하기 때문에 곱해주고 1을 빼준다.
        return answer;
    }
}
