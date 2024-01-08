package a50BinarySearch;

public class FIndNumberInMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrixBinarySearch(matrix, target));
    }


    static boolean searchMatrixBinarySearch(int[][] matrix, int target) {
        // Check if the matrix is null or empty
        // or if the first row is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Get the number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Initialize pointers for the top and bottom rows
        int top = 0;
        int bot = rows - 1;

        // Perform binary search on rows to find potential row
        while (top <= bot) {
            int row = (top + bot) / 2;

            if (target > matrix[row][cols - 1]) {
                // If target is greater than the last element in the row,
                // narrow the search to the bottom half
                top = row + 1;
            } else if (target < matrix[row][0]) {
                // If target is smaller than the first element in the row,
                // narrow the search to the top half
                bot = row - 1;
            } else {
                // Target may exist in this row, break the loop
                break;
            }
        }

        // Check if the target is not within the matrix
        if (!(top <= bot)) {
            return false;
        }

        // Binary search within the potential row
        int row = (top + bot) / 2;
        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target > matrix[row][mid]) {
                // If target is greater than the middle element,
                // narrow the search to the right half
                left = mid + 1;
            } else if (target < matrix[row][mid]) {
                // If target is smaller than the middle element,
                // narrow the search to the left half
                right = mid - 1;
            } else {
                // Target found
                return true;
            }
        }

        // Target not found
        return false;
    }

    static boolean searchMatrixON2(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
