// class Solution {
//     public String solution(String letter) {
//         String answer = "";
//         String before = "";
        
//         for(int i=0;i<letter.length();i++){       
//             if(letter.charAt(i) == ' '){
//                 answer += trans(before);
//                 before = "";
//             }else if(i == letter.length() - 1){
//                 before += letter.charAt(i);
//                 answer += trans(before);
//             }
//             else {
//                 before += letter.charAt(i);
//             }
            
//         }
//         return answer;
//     }
    
//     public String trans(String bf){
//         if(bf.equals(".-")) return "a";
//         else if(bf.equals("-...")) return "b";
//         else if(bf.equals("-.-.")) return "c";
//         else if(bf.equals("-..")) return "d";
//         else if(bf.equals(".")) return "e";
//         else if(bf.equals("..-.")) return "f";
//         else if(bf.equals("--.")) return "g";
//         else if(bf.equals("....")) return "h";
//         else if(bf.equals("..")) return "i";
//         else if(bf.equals(".---")) return "j";
//         else if(bf.equals("-.-")) return "k";
//         else if(bf.equals(".-..")) return "l";
//         else if(bf.equals("--")) return "m";
//         else if(bf.equals("-.")) return "n";
//         else if(bf.equals("---")) return "o";
//         else if(bf.equals(".--.")) return "p";
//         else if(bf.equals("--.-")) return "q";
//         else if(bf.equals(".-.")) return "r";
//         else if(bf.equals("...")) return "s";
//         else if(bf.equals("-")) return "t";
//         else if(bf.equals("..-")) return "u";
//         else if(bf.equals("...-")) return "v";
//         else if(bf.equals(".--")) return "w";
//         else if(bf.equals("-..-")) return "x";
//         else if(bf.equals("-.--")) return "y";
//         else if(bf.equals("--..")) return "z";
//         else return "";
//     }
// }

import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> morse = new HashMap<>(){  // 해쉬맵 생성 및 put을 통해 값을 넣는다.
            {
                put(".-","a");
                put("-...","b");
                put("-.-.","c");
                put("-..","d");
                put(".","e");
                put("..-.","f");
                put("--.","g");
                put("....","h");
                put("..","i");
                put(".---","j");
                put("-.-","k");
                put(".-..","l");
                put("--","m");
                put("-.","n");
                put("---","o");
                put(".--.","p");
                put("--.-","q");
                put(".-.","r");
                put("...","s");
                put("-","t");
                put("..-","u");
                put("...-","v");
                put(".--","w");
                put("-..-","x");
                put("-.--","y");
                put("--..","z");
            }
        };
        
        String[] letters = letter.split(" ");  // 문자열의 split을 통해 배열로 저장
        for(String str:letters){               // for-each 문을 통해 반복문
            answer += morse.get(str);          // get을 통해 매핑된 값을 가져온다.
        }
        
        return answer;
    }
}
