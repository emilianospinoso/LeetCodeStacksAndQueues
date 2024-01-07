package a49DFSMatrixs;

public class APathMinimumEffortClimber {

    //Depth First Search
    public static void main(String[] args) {
        int[][] heights = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.println(minimumEffortPath(heights));

    }

    static void findMinPath(int[][] matrix, int x, int y, int r, int c) {
        // Base cases to check if the current cell is out of bounds or not part of the island
        if (x < 0 || x >= r || y < 0 || y >= c) {
            return;
        }
        findMinPath(matrix, x + 1, y, r, c); // down
        findMinPath(matrix, x, y + 1, r, c); // right
        findMinPath(matrix, x - 1, y, r, c); // top
        findMinPath(matrix, x, y - 1, r, c); // left
    }


    static int minimumEffortPath(int[][] heights) {
        int minimumPath = 0;

        int rows = 0;
        int cols = heights[0].length;
        if (rows == 0) {
            return 0;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (heights[i][j] > heights[i][j]) {
                    minimumPath++;
                    findMinPath(heights, i, j, rows, cols);
                }
            }
        }

        return minimumPath;
    }
}
