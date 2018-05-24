/**
 * Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

 Note that it is the kth smallest element in the sorted order, not the kth distinct element.

 Example:

 matrix = [
 [ 1,  5,  9],
 [10, 11, 13],
 [12, 13, 15]
 ],
 k = 8,

 return 13.

 *
 */


// time: O(nlog(max-min)) / O(klogn), where 1<=k<=n^2
// space: O(1) 因為沒有遞歸 / O(n)



// Binary Search Way:
// Binary search way is better when max-min is small.
public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        if(k==1) return matrix[0][0];
        int n = matrix.length;
        if(k==n*n) return matrix[n-1][n-1];
        int min = matrix[0][0], max = matrix[n-1][n-1];
        while(min <= max) {
            int mid = min + (max - min) / 2;
            int count = countLessEqual(matrix, mid);
            if(count < k) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;
    }

    private int countLessEqual(int[][] matrix, int target) {
        int count = 0;
        int x = matrix.length-1, y = 0;
        while(x>=0 && y<matrix.length) {
            if(matrix[x][y] <= target) {
                y++;
                count += x+1;
            } else {
                x--;
            }
        }
        return count;
    }
}


// Min Heap Way:
// Min heap way is better when k is small.
public class KthSmallestElementinaSortedMatrix2 {
    public int kthSmallest(int[][] matrix, int k) {
        if(k==1) return matrix[0][0];
        int n = matrix.length;
        if(k==n*n) return matrix[n-1][n-1];
        List<Cell> list = new ArrayList<>(n);
        for(int i=0; i<n; i++) { // O(n)
            list.add(new Cell(i, 0, matrix[i][0]));
        }
        PriorityQueue<Cell> heap = new PriorityQueue<>(list); // O(n) -> sift down
        for(int i=1; i<k; i++) {
            Cell cell = heap.poll();
            if(cell.y+1<n)
                heap.add(new Cell(cell.x, cell.y+1, matrix[cell.x][cell.y+1]));
        }
        return heap.peek().val;
    }

    class Cell implements Comparable<Cell>{
        int x;
        int y;
        int val;
        Cell(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }
        @Override
        public int compareTo(Cell cell) {
            return Integer.compare(val, cell.val);
        }
    }
}