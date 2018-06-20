/**
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 Example:

 Input: 3
 Output:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 *
 *
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowbegin = 0;
        int rowend = n-1;
        int colbegin = 0;
        int colend = n-1;
        int num = 1;

        while(rowbegin <= rowend && colbegin <= colend){
            for(int i = colbegin; i <= colend; i++){
                matrix[rowbegin][i] = num++;
            }
            rowbegin++;

            for(int i = rowbegin; i <= rowend; i++){
                matrix[i][colend] = num++;
            }
            colend--;

            for(int i = colend; i >= colbegin; i--){
                matrix[rowend][i] = num++;
            }
            rowend--;

            for(int i = rowend; i >= rowbegin; i--){
                matrix[i][colbegin] = num++;
            }
            colbegin++;
        }
        return matrix;
    }

}
