class Solution {
    public int solution(int num, int k) {
//         int answer = 0;
//         String str_num = String.valueOf(num);
//         char[] ch_num = new char[str_num.length()];
//         ch_num = str_num.toCharArray();
        
//         for(int i=0;i<ch_num.length;i++){
//             if(Integer.parseInt(""+ch_num[i])==k){
//                 answer = i + 1;
//                 break;
//             }else {
//                 answer = -1;
//             }
//         }
//         return answer;
        
        String str_num = String.valueOf(num);
        
        if(str_num.indexOf(String.valueOf(k))<0){
            return str_num.indexOf(String.valueOf(k));  //String의 indexOf를 통해 해당 문자의 인덱스를 찾는다. 없으면 -1이 반환된다.
        }else{
            return str_num.indexOf(String.valueOf(k)) + 1;
        }
        
    }
}
