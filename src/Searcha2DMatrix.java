/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 *
 *
 */


// time : O(logn * m)
// space : O(n)

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int row = matrix.length , col = matrix[0].length;
        int start = 0, end = row * col -1;
        while(start <= end){
            int mid = (end - start) / 2 + start;
            int value = matrix[mid / col][mid % col];
            if (value == target){
                return true;
            }else if(value < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
