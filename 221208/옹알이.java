class Solution {
    public int solution(String[] babbling) {
        int answer = 0;   
        
        for(int i=0;i<babbling.length;i++){    // ""으로 대체하게 되면 wyeoo 같은 경우 ye가 사라지고 woo로 되어서 조건에 부합해지기 때문에 " "으로 대체
            babbling[i] = babbling[i].replace("aya"," ");
            babbling[i] = babbling[i].replace("ye"," ");
            babbling[i] = babbling[i].replace("woo"," ");
            babbling[i] = babbling[i].replace("ma"," ");
        }
        
        for(int i=0;i<babbling.length;i++){
            babbling[i] = babbling[i].replaceAll(" ","");  // 빈칸을 ""로 바꿈
        }
        
        for(int i=0;i<babbling.length;i++){   // 빈칸의 개수가 옹알이를 할 수 있는 문자열
            if(babbling[i].equals("")) answer++;
        }
        return answer;
    }
}
