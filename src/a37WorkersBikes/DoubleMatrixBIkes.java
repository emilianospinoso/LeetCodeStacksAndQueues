package a37WorkersBikes;
public class DoubleMatrixBIkes {
    public static void main(String[] args) {
        int[][] workers = {{0, 0}, {2, 4}};
        int[][] bikes = {{1, 2}, {3, 3}};

        // Llama a la función para asignar bicicletas y muestra el resultado
        System.out.println(assignBikes(workers, bikes));
    }

    // Arreglo para rastrear si una bicicleta ya ha sido asignada
    static boolean visited[] = new boolean[10];

    // Variable para almacenar la suma mínima de distancias encontrada
    static int smallestDistanceSum = Integer.MAX_VALUE;

    // Función para calcular la distancia de Manhattan entre un trabajador y una bicicleta
    static int findDistance(int[] worker, int[] bike) {
        return Math.abs(worker[0] - bike[0]) + Math.abs(worker[1] - bike[1]);
    }

    // Función principal para encontrar la suma mínima de distancias usando backtracking
    static void minimumDistanceSum(int[][] workers, int workerIndex, int[][] bikes, int currDistanceSum) {
        // Verifica si ya se asignaron todas las bicicletas
        if (workerIndex >= workers.length) {
            // Si es así, actualiza la suma mínima si la suma actual es menor
            smallestDistanceSum = Math.min(smallestDistanceSum, currDistanceSum);
            return;
        }

        // Si la suma actual de distancias ya es mayor o igual a la suma mínima encontrada,
        // se detiene la exploración de esta combinación de trabajadores y bicicletas
        if (currDistanceSum >= smallestDistanceSum) {
            return;
        }

        // Itera sobre todas las bicicletas disponibles
        for (int bikeIndex = 0; bikeIndex < bikes.length; bikeIndex++) {
            // Si la bicicleta está disponible
            if (!visited[bikeIndex]) {
                // Marca la bicicleta como visitada
                visited[bikeIndex] = true;

                // Llama recursivamente para el siguiente trabajador
                minimumDistanceSum(workers, workerIndex + 1, bikes,
                        currDistanceSum + findDistance(workers[workerIndex], bikes[bikeIndex]));

                // Desmarca la bicicleta para probar con otras combinaciones
                visited[bikeIndex] = false;
            }
        }
    }

    // Función principal para asignar bicicletas y devolver la suma mínima de distancias
    static int assignBikes(int[][] workers, int[][] bikes) {
        // Inicia el proceso de búsqueda con backtracking
        minimumDistanceSum(workers, 0, bikes, 0);

        // Devuelve la suma mínima de distancias encontrada
        return smallestDistanceSum;
    }
}

