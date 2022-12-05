class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] before_count = new int[26];
        int[] after_count = new int[26];
        
        for(int i=0;i<before.length();i++){
            before_count[before.charAt(i)%97]++;
        }
        
        for(int i=0;i<after.length();i++){
            after_count[after.charAt(i)%97]++;
        }
        
        for(int i=0;i<26;i++){
            if(before_count[i] != after_count[i]){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}
