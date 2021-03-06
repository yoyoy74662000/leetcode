/**
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

 A region is captured by flipping all 'O's into 'X's in that surrounded region.

 Example:

 X X X X
 X O O X
 X X O X
 X O X X

 After running your function, the board should be:

 X X X X
 X X X X
 X X X X
 X O X X

 Explanation:

 Surrounded regions shouldn’t be on the border,
 which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
 */

// time: O(n*m)
// space: O(n)

public class SurroundedRegions {
    public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0) return;

        int m = board.length - 1; // row 長度
        int n = board[0].length -1; // col 長度
        // row 邊界
        for(int i = 0; i <= m; i++){ //最左右兩邊
            if(board[i][0] == 'O'){
                dfs(board, i, 0);
            }
            if(board[i][n] == 'O'){
                dfs(board, i, n);
            }
        }
        // col 邊界
        for(int i = 0; i <= n; i++){ //最上下兩邊
            if(board[0][i] == 'O'){
                dfs(board, 0, i);
            }
            if(board[m][i] == 'O'){
                dfs(board, m, i);
            }
        }
        // 遍歷Ｏ變成Ｘ
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if(board[i][j] == '1'){
                    board[i][j] = 'O';
                }
            }
        }

    }
    //  這裡就是dfs
    private void dfs(char[][] board, int i, int j){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O' ){
            return;
        }
        board[i][j] = '1';
        dfs(board, i, j+1);
        dfs(board, i, j-1);
        dfs(board, i+1, j);
        dfs(board, i-1, j);
    }
}
