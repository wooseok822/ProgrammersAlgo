class Solution {
    public String[] solution(String my_str, int n) throws Exception {
        int size = 0;
        if(my_str.length()%n==0){
            size = (my_str.length()/n);
        }else {
            size = (my_str.length()/n) + 1;
        }
      
        String[] answer = new String[size];
        for(int i=0;i<size;i++){      // 문자열 배열을 초기화해주지 않으면 null이 들어가기 때문에 꼭 해주어야한다!!!
            answer[i] = "";
        }
    
        for(int i=0;i<size;i++){          
            for(int j=i*n;j<i*n+n;j++){
                if(my_str.length()<=j) break;
                else {
                    answer[i] += my_str.charAt(j);
                }
            }
        }
        return answer;
    }
}
