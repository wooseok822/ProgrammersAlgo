class Solution {
    static int[] dx = {0,1,0,-1}; //d r u l
    static int[] dy = {-1,0,1,0};
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int w = board[0]/2;
        int h = board[1]/2;

        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("left")){
                int nx = answer[0] + dx[3];
                int ny = answer[1] + dy[3];
                if(nx<=w && nx>=-w && ny<=h && ny>=-h){
                    answer[0] = nx;
                    answer[1] = ny;
                }
            }else if(keyinput[i].equals("right")){
                int nx = answer[0] + dx[1];
                int ny = answer[1] + dy[1];
                if(nx<=w && nx>=-w && ny<=h && ny>=-h){
                    answer[0] = nx;
                    answer[1] = ny;
                }
            }else if(keyinput[i].equals("up")){
                int nx = answer[0] + dx[2];
                int ny = answer[1] + dy[2];
                if(nx<=w && nx>=-w && ny<=h && ny>=-h){
                    answer[0] = nx;
                    answer[1] = ny;
                }
            }else if(keyinput[i].equals("down")){
                int nx = answer[0] + dx[0];
                int ny = answer[1] + dy[0];
                if(nx<=w && nx>=-w && ny<=h && ny>= -h){
                    answer[0] = nx;
                    answer[1] = ny;
                }
            }
            System.out.println(answer[0]+" "+answer[1]);
        }
        
        return answer;
    }
}
