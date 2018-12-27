/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * [[1,3,1],
   [1,5,1],
   [4,2,1]]
 *
 */

// time : O(n * m)
// space : O(1)

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j != 0) grid[i][j] += grid[i][j - 1];
                if (i != 0 && j == 0) grid[i][j] += grid[i - 1][j];
                if (i != 0 && j != 0) {
                    grid[i][j] = grid[i][j] + Math.min(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
public class MinimumPathSum2 {
    public int minPathSum(int[][] grid) {
        return dfs(0,0,grid);
    }

    public int dfs(int i, int j, int[][] grid){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }

        if(i<grid.length-1 && j<grid[0].length-1){
            int r1 = grid[i][j] + dfs(i+1, j, grid);
            int r2 = grid[i][j] + dfs(i, j+1, grid);
            return Math.min(r1,r2);
        }

        if(i<grid.length-1){
            return grid[i][j] + dfs(i+1, j, grid);
        }

        if(j<grid[0].length-1){
            return grid[i][j] + dfs(i, j+1, grid);
        }

        return 0;
    }
}