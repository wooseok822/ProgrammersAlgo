import java.util.Arrays;

class Solution {
    static int answer = 0;
    public int solution(int i, int j, int k) {
        
        for(int z=i;z<=j;z++){
            include(z, k);
        }
        
        return answer;
    }
    
    public void include(int num,int com){
        String str = String.valueOf(num); // 문자열로 변환
        char[] ch = new char[str.length()]; // 문자 배열로 변환
        ch = str.toCharArray();

        for(int z=0;z<ch.length;z++){
            if(Integer.parseInt(ch[z]+"") == com){
                answer++;
            }
        }
    }
}
