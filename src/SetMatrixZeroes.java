/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 * Example 1:

 Input:
 [
 [1,1,1],
 [1,0,1],
 [1,1,1]
 ]
 Output:
 [
 [1,0,1],
 [0,0,0],
 [1,0,1]
 ]
 Example 2:

 Input:
 [
 [0,1,2,0],
 [3,4,5,2],
 [1,3,1,5]
 ]
 Output:
 [
 [0,0,0,0],
 [0,4,5,0],
 [0,3,1,0]
 ]
 */

// time : O(n * m)
// space : O(1)


public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean row = false;
        boolean col = false;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i == 0) row = true;
                    if(j == 0) col = true;
                }
            }
        }

        for(int i = 1; i < m; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 1; j < n; j++){
            if(matrix[0][j] == 0){
                for(int i = 0; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(row){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

        if(col){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
