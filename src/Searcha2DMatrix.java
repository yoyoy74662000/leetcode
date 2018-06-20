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
public class Searcha2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}


public class Searcha2DMatrix3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int rows = matrix.length, cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            if(matrix[i][cols-1] >= target){
                int[] arr = matrix[i];
                for(int j=0;j<arr.length;j++){
                    if(arr[j] == target){
                        return true;
                    }
                }
                break;
            }
        }

        return false;
    }
}