package a49DFSMatrixs;

public class AAIslands {

    //Depth First Search

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println(numIslands(grid));
    }

    // Helper method to mark the current island as visited
    static void markCurrentIsland(char[][] matrix, int x, int y, int r, int c) {
        // Base cases to check if the current cell is out of bounds or not part of the island
        if (x < 0 || x >= r || y < 0 || y >= c || matrix[x][y] != '1') {
            return; // Skip if out of bounds or not part of the island
        }
        matrix[x][y] = '2'; // Mark the current cell as visited

        // Recursively explore neighboring cells
        markCurrentIsland(matrix, x + 1, y, r, c); // down
        markCurrentIsland(matrix, x, y + 1, r, c); // right
        markCurrentIsland(matrix, x - 1, y, r, c); // top
        markCurrentIsland(matrix, x, y - 1, r, c); // left
    }

    // Main method to count the number of islands
    static int numIslands(char[][] grid) {
        int numberOfIslands = 0;

        int rows = grid.length;
        if (rows == 0) {
            return 0; // No islands if the grid is empty
        }

        int cols = grid[0].length;

        // Loop through each cell in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the cell is part of an unvisited island, mark the island and count it
                if (grid[i][j] == '1') {
                    markCurrentIsland(grid, i, j, rows, cols);
                    numberOfIslands += 1;
                }
            }
        }
        return numberOfIslands; // Return the total number of islands
    }
}
