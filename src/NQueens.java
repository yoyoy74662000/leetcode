public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        if (n == 0) {
            return results;
        }
        List<Integer> cols = new ArrayList<>();
        dfsHelper(results, cols, n);
        return results;
    }

    ////////
    private static void dfsHelper(List<List<String>> results, List<Integer> cols, int n) {
        if (cols.size() == n) {
            results.add(drawChessboard(cols));
            return;
        }
        for (int colIndex = 0; colIndex < n; colIndex++) {
            if (!isValid(cols, colIndex)) {
                continue;
            }
            cols.add(colIndex);
            dfsHelper(results, cols, n);
            cols.remove(cols.size() - 1);
        }
    }
    ////////
    // rwoIndex + col.get(rowIndex) == row + column (右上左下)
    // rowIndex - col.get(rowIndex) == row - column (右下左上)
    // cols.get(rowIndex) == column -> 使否使用過
    ////////

    private static boolean isValid(List<Integer> cols, int column) {
        int row = cols.size();
        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            // 檢查這個col是否有在前面cols[]內被選用過
            if (cols.get(rowIndex) == column) {
                return false;
            }
            if (rowIndex + cols.get(rowIndex) == row + column) {
                return false;
            }
            // 檢查左上，右下
            if (rowIndex - cols.get(rowIndex) == row - column) {
                return false;
            }
        }
        return true;
    }

    //////////
    // cols [0,2,1]
    // 拿 0 出來， for loop: Q . .
    // 拿 2 出來， for loop: . . Q
    //////////
    private static List<String> drawChessboard(List<Integer> cols) {
        List<String> chessboard = new ArrayList<>();
        for (int i = 0; i < cols.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < cols.size(); j++) {
                sb.append(j == cols.get(i) ? 'Q' : '.');
            }
            chessboard.add(sb.toString());
        }
        return chessboard;
    }
}
