class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[101];
        int idx = 1;
        int i = 1;
        while (i <= 100){ // 배열에 값을 다 넣음
            if(idx % 3 == 0 || include(idx) == 1) {  // 3의 배수거나 3이 포함되어있으면 idx를 올리고 반복문 다시 실행
                idx++;
                continue;
            }
            num[i++] = idx++;
        }
        answer = num[n];
        return answer;
    }
    
    public int include(int number){   // 3이 포함되어있는지 확인
        String num_str = String.valueOf(number);
        
        if(num_str.contains("3")) return 1;
        else return 0;
    }
}
