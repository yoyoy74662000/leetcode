/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 *
 */


// time : O(logn * m)
// space : O(n)

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int row = matrix.length , col = matrix[0].length;
        int start = 0; //0
        int end = row * col -1; //11
        while(start <= end){
            int mid = (end - start) / 2 + start; //5
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
