import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String spell_str = "";
        Arrays.sort(spell);  // spell 정렬 후 spell_str에 저장
        for(int i=0;i<spell.length;i++){
            spell_str+=spell[i];
        }
        for(int i=0;i<dic.length;i++){
            char[] dic_c = new char[dic[i].length()];
            dic_c = dic[i].toCharArray(); // 문자열을 문자 배열로 변환
            Arrays.sort(dic_c); // 정렬
            if(spell_str.equals(String.valueOf(dic_c))){ // 문자열로 변환 후 비교
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}
