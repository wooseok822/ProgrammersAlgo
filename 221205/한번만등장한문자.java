class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) % 97]++;
        }
        
        for(int i=0;i<26;i++){
            if(arr[i] == 1) {
                answer += (char)(97 + i);
            }
        }
        return answer;
    }
}
