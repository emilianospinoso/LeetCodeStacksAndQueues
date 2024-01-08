package a49DFSMatrixs;

public class APathMinimumEffortClimber {

    //Depth First Search
    public static void main(String[] args) {
        int[][] heights = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.println(minimumEffortPath(heights));

    }

    static int minimumEffortPath(int[][] heights) {
        // Obtener el número de filas y columnas de la matriz
        int rows = heights.length;
        int cols = heights[0].length;

        // Definir las direcciones posibles: derecha, abajo, izquierda, arriba
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // Inicializar los extremos para la búsqueda binaria
        int left = 0;
        int right = Integer.MAX_VALUE;

        // Búsqueda binaria para encontrar el esfuerzo mínimo
        while (left < right) {
            // Calcular el punto medio
            int mid = left + (right - left) / 2;

            // Crear una matriz de visitados para cada iteración
            boolean[][] visited = new boolean[rows][cols];

            // Llamar a la función DFS para verificar si es posible llegar al destino
            if (dfs(heights, 0, 0, rows, cols, directions, visited, mid)) {
                // Si es posible, ajustar la búsqueda hacia la izquierda
                right = mid;
            } else {
                // Si no es posible, ajustar la búsqueda hacia la derecha
                left = mid + 1;
            }
        }

        // Devolver el esfuerzo mínimo encontrado
        return left;
    }

    // Función DFS para explorar rutas posibles y verificar si es posible llegar al destino con un esfuerzo dado
    static boolean dfs(int[][] heights, int x, int y, int rows, int cols, int[][] directions, boolean[][] visited, int effort) {
        // Caso base: llegar al destino
        if (x == rows - 1 && y == cols - 1) {
            return true;
        }

        // Marcar la celda actual como visitada
        visited[x][y] = true;

        // Iterar sobre las direcciones posibles
        for (int[] direction : directions) {
            int newX = x + direction[0];
            int newY = y + direction[1];

            // Verificar límites y si la celda no ha sido visitada
            if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && !visited[newX][newY]) {
                // Calcular el esfuerzo actual
                int currentEffort = Math.abs(heights[newX][newY] - heights[x][y]);

                // Verificar si el esfuerzo actual es menor o igual al esfuerzo permitido
                if (currentEffort <= effort) {
                    // Llamada recursiva para continuar la exploración
                    if (dfs(heights, newX, newY, rows, cols, directions, visited, effort)) {
                        return true; // Si es posible llegar al destino, retornar verdadero
                    }
                }
            }
        }

        return false; // Si no es posible llegar al destino, retornar falso
    }
}