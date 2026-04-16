class Solution {
    int ROWS, COLS;
    char VISITED = '#';

    public boolean exist(char[][] board, String word) {
        boolean res = false;
        ROWS = board.length;
        COLS = board[0].length;
        for(int i=0; i<ROWS; i++) {
            for(int j=0; j<COLS; j++) {
                if(board[i][j] == word.charAt(0)) {
                    res = bt(board, word, 0, i, j);
                    if (res) return true;
                }
            }
        }
        return res;
    }

    public boolean bt(char[][] board, String word, int k, int row, int col ) {
        // we have finished matching
        if (word.length() == k)
            return true;
        
        // boundary condition
        if(row <0 || col <0 || row >= ROWS || col >= COLS)
            return false;

        char temp = board[row][col];
        if(word.charAt(k) != board[row][col] || board[row][col] == VISITED )
            return false;

        board[row][col] = VISITED;
        // recure selecting one of the paths
        boolean match = bt(board, word, k+1, row+1, col )
        || bt(board, word, k+1, row-1, col )
        || bt(board, word, k+1, row, col-1 )
        || bt(board, word, k+1, row, col+1 );

        // backtrack - mark it as not visited
        board[row][col] = temp;

        return match;
        
    }
}
