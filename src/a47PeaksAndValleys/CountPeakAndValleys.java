package a47PeaksAndValleys;

import java.util.ArrayList;
import java.util.List;

public class CountPeakAndValleys {

    public static void main(String[] args) {
        // Ejemplo de llamada a la función y salida
        List<Integer> result = new ArrayList<>();
        int[] heights = new int[]{2, 3, 1, 4, 3};
        getPeaksAndValleys(heights);
        for (Integer n : result) {
            System.out.println(n);
        }
    }

    // Función para encontrar un pico o valle en una lista de números
    // Devuelve la posición del pico o valle, o -1 si no se encuentra ninguno
    // Función para encontrar picos y valles en una lista de números
    // Devuelve una lista con las posiciones de picos y valles, o una lista vacía si no se encuentran
    public static List<Integer> getPeaksAndValleys(int[] nums) {
        // Comprobación especial: la lista debe tener al menos 3 elementos
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        // Listas para almacenar las posiciones de picos y valles
        List<Integer> peaks = new ArrayList<>();
        List<Integer> valleys = new ArrayList<>();

        // Recorre la lista desde el segundo elemento hasta el penúltimo
        for (int i = 1; i < nums.length - 1; i++) {
            // Compara el elemento actual con sus vecinos inmediatos
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                // Es un pico
                peaks.add(i); // Almacena la posición del pico
            } else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                // Es un valle
                valleys.add(i); // Almacena la posición del valle
            }
        }

        // Combina las listas de picos y valles y devuelve el resultado
        List<Integer> peaksAndValleys = new ArrayList<>();
        peaksAndValleys.addAll(peaks);
        peaksAndValleys.addAll(valleys);

        return peaksAndValleys;
    }
}
