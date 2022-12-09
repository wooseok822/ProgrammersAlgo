class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int one = common[1] - common[0];
        int two = common[2] - common[1];
        
        if(one == two) {   // 같으면 등차수열
            answer = common[common.length-1] + one;
        }else {             // 다르면 등비수열
            int r = common[1] / common[0];
            answer = common[common.length-1] * r;
        }
        
        return answer;
    }
}
