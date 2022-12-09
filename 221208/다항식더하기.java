class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x_value = 0;
        int value = 0;
        String[] arr = polynomial.split(" ");
        int cnt = 0;
        
        for(String aa : arr){
            if(aa.equals("x")) cnt++;
        }
        
        for(String a : arr){
            if(a.contains("x")){
                a = a.replace("x","");
                if(!a.equals(""))
                    x_value += Integer.parseInt(a);
            }else if (a.equals("+")){
                
            }else {
                value += Integer.parseInt(a);
            }
        }
        x_value += cnt;
        if(value !=0 ) {
            if(x_value == 0){
                answer = String.valueOf(value);
            }else {
                
                    if(x_value == 1){
                        answer = "x"+ " "+ "+"+ " "+value;
                    }else {
                        answer = x_value+"x"+" "+"+"+" "+value;
                    }
                
            }           
        }
        else {
            if(x_value != 0){
                if(x_value == 1) answer = "x";
                else answer = x_value+"x";
            }else {
                answer = String.valueOf(value);
            }
        }
        
        return answer;
    }
}
