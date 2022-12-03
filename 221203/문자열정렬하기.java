import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] str = new char[my_string.length()];
        str = my_string.toCharArray();
        
        for(int i=0;i<str.length;i++){
            if(str[i]>='A' && str[i]<='Z'){
                str[i] = (char)(str[i] + 32);
            }
        }
        
        Arrays.sort(str);
        
        return String.valueOf(str);
    }
}
