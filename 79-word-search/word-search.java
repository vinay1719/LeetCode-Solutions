class Solution {
    public boolean exist(char[][] board, String word) {

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(backtracking(i, j, 0, board, word)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backtracking(int i, int j, int k, char[][] board, String word){
        if(k == word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(k)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        if(backtracking(i+1,j,k+1,board, word) || backtracking(i-1,j,k+1,board, word) || backtracking(i,j+1,k+1,board, word) || backtracking(i,j-1,k+1,board, word)){
            return true;
        }
        board[i][j] = temp;
        return false;
    }
}