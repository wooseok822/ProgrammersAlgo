class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        
        int p_cnt = 0;
        int y_cnt = 0;
        
        for(int i=0;i<str.length;i++){
            if(str[i] == 'p' || str[i] == 'P') p_cnt++;
            else if(str[i] == 'y' || str[i] == 'Y') y_cnt++;
        }

        return p_cnt == y_cnt ? true : false;
    }
}


// s = s.toUpperCase();

// return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count(); 문자열을 chars()를 통해 문자로 바꾸고 필터 활용 후 개수세기
