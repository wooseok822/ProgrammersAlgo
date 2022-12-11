# Lv.0 총 정리

###        ✏️ 분수의 덧셈

- a/b + c/d = ((b * c) + (d * a)) / (b * d) </br>
- 약분을 반복문을 통해 진행 </br>
```java
class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int bunja = (num1 * denum2) + (num2 * denum1);
        int bunmo = num1 * num2;
        
        for(int i=bunmo;i>= 2;i--){   // 분모의 값부터 나누기 또는 최소공배수를 구해서 해도된다.
            if(bunja % i == 0){
                if(bunmo % i == 0){
                    bunja /= i;
                    bunmo /= i;
                }
            }
        }
        
        answer[0] = bunja;
        answer[1] = bunmo;
        
        return answer;
    }
}
```

###        ✏️ 등수 매기기

- 두 과목의 점수를 나타내는 2차원 배열 score가 있다고 가정하자. 해당 배열의 등수를 배열로 출력하라. </br>
- 
```java
import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] t : score){   // for-each 문으로 반복문
            list.add(t[0] + t[1]);
        }
        list.sort(Comparator.reverseOrder());   // 리스트를 정렬한다. Comparator.reverseOrder()를 통해 내림차순
        
        int[] answer = new int[score.length];
        
        for(int i=0;i<score.length;i++){        
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;    // indexOf를 사용하면 가장 적은 인덱스가 나옴
        }
            
        
        return answer;
    }
}
```

###        ✏️ 연속된 수의 합

- 연속된 숫자 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 반환하라 </br>

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        //ex) 연속된 숫자 3개의 합은 12
        // (x+1) + (x+2) + (x+3) = 3x + 6 = 12
        // 6을 구하기 위해 num * (num + 1) / 2를 해준다
        // start는 x의 값인데 3x + 6 = 12 에서 3x = 6 => x = 2를 나타내기 위해 아래의 식을 사용한다.
        
        int nSum = num * (num + 1) / 2;
        int start = (total - nSum) / num;
        
        for(int i=1;i<=num;i++){
            answer[i-1] = start + i;
        }
        
        return answer;
    }
}
