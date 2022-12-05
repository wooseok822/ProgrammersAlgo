class Solution {
    static int answer = 0;
    public int solution(int[] array) {
        
        for(int i=0;i<array.length;i++){
            String str = String.valueOf(array[i]);
            count(str);
        }    
        
        return answer;
    }
    
    public void count(String str){
        char[] ch = new char[str.length()];
        ch = str.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            if(ch[i] - '0' == 7) answer++;
        }
    }
}
