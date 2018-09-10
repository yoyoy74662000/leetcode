/**
 * Given a 2D board and a word, find if the word exists in the grid.

 The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

 Example:

 board =
 [
 ['A','B','C','E'],
 ['S','F','C','S'],
 ['A','D','E','E']
 ]

 Given word = "ABCCED", return true.
 Given word = "SEE", return true.
 Given word = "ABCB", return false.
 *
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                //找第一個起始值
                if(exist(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, String word, int i, int j, int start){
        if(start >= word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if(board[i][j] == word.charAt(start++)){
            char c = board[i][j];
            board[i][j] = '#';
            boolean res = exist(board, word, i + 1, j, start) ||
                          exist(board, word, i - 1, j, start) ||
                          exist(board, word, i, j + 1, start) ||
                          exist(board, word, i, j - 1, start);
            board[i][j] = c;
            return res;
        }else {
            return false;
        }
    }
}
