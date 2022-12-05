class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        int[] arr = new int[array.length];
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<array.length;i++){
            arr[i] = Math.abs(array[i] - n);
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
                answer = array[i];
            }else if(arr[i] == min){
                answer = Math.min(answer,array[i]);
            }
        }
        
        return answer;
    }
}
