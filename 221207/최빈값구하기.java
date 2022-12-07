class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[1000];
        
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }
        int max = count[0];
        for(int i=1;i<count.length;i++){
            if(max<count[i]){
                max = count[i];
                answer = i;
            }
            
        }
        
        for(int i=0;i<count.length;i++){
            if(count[i] == max && i != answer ){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}
