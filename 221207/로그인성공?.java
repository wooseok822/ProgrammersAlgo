class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int flag = 0;
        
        for(int i=0;i<db.length;i++){
            if(db[i][0].equals(id_pw[0])){
                flag = 1;
                if(db[i][1].equals(id_pw[1])){
                    flag = 2;
                    break;
                }
            }
        }
        
        if(flag == 0){
            answer = "fail";
        }else if(flag == 1){
            answer = "wrong pw";
        }else if(flag == 2){
            answer = "login";
        }
        
        return answer;
    }
}
