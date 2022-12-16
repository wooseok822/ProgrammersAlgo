class Solution {
    public int[] solution(long n) {     
        String[] num = String.valueOf(n).split("");       
        int[] answer = new int[num.length];
        int idx = num.length - 1;
        
        for(int i=0;i<num.length;i++){
            answer[i] = Integer.parseInt(num[idx--]);
        }
        
        return answer;
    }
}
