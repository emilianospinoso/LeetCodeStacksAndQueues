package a35GoogleInterview;

public class SubMatrixCoung {

    public static void main(String[] args) {
        int[][] mat = {{1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}};
        System.out.println(numSubmat(mat));
    }

    static int numSubmat(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // Matriz para almacenar la longitud del rectángulo más grande hasta cada celda
        int[][] dp = new int[m][n];

        // Contador total de submatrices con unos
        int conteoTotal = 0;

        // Paso 1: Inicializar la primera fila y columna de la matriz dp
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    // Cada celda representa la longitud del rectángulo más grande hasta esa celda
                    dp[i][j] = (j == 0) ? 1 : dp[i][j - 1] + 1;
                    int longitudActual = dp[i][j];

                    // Paso 2: Contar submatrices rectangulares con el lado derecho en la celda actual
                    for (int k = i; k >= 0 && mat[k][j] == 1; k--) {
                        longitudActual = Math.min(longitudActual, dp[k][j]);
                        conteoTotal += longitudActual;
                    }
                }
            }
        }

        // Paso 3: Devolver el conteo total de submatrices con unos
        return conteoTotal;
    }
}


/*
Given an m x n binary matrix mat, return the number of submatrices that have all ones.

Example 1:
Input: mat = [[1,0,1],
              [1,1,0],
              [1,1,0]]
Output: 13
Explanation:
There are 6 rectangles of side 1x1.
There are 2 rectangles of side 1x2.
There are 3 rectangles of side 2x1.
There is 1 rectangle of side 2x2.
There is 1 rectangle of side 3x1.
Total number of rectangles = 6 + 2 + 3 + 1 + 1 = 13.
 */