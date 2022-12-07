class Solution {
    static int[] dy = {-1,-1,0,1,1,1,0,-1};
    static int[] dx = {0,1,1,1,0,-1,-1,-1};
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1){
                    for(int k=0;k<8;k++){
                        int ny = i + dy[k];
                        int nx = j + dx[k];
                        if(ny>=0 && nx>=0 && ny<board.length && nx<board[0].length){
                            if(board[ny][nx] == 0){
                                board[ny][nx] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 0) answer++;
            }
        }

        return answer;
    }
}
