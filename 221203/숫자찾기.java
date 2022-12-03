class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str_num = String.valueOf(num);
        char[] ch_num = new char[str_num.length()];
        ch_num = str_num.toCharArray();
        
        for(int i=0;i<ch_num.length;i++){
            if(Integer.parseInt(""+ch_num[i])==k){
                answer = i + 1;
                break;
            }else {
                answer = -1;
            }
        }
        return answer;
    }
}
