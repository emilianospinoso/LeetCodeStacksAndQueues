package a48LongestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
    static int longestConsecutive(int[] nums) {
        // Crea un conjunto (HashSet) para almacenar los números únicos
        Set<Integer> num_set = new HashSet<Integer>();

        // Agrega todos los números del array al conjunto
        for (int num : nums) {
            num_set.add(num);
        }

        // Variable para almacenar la longitud de la secuencia consecutiva más larga
        int longestStreak = 0;

        // Itera a través de los números únicos en el conjunto
        for (int num : num_set) {
            // Verifica si el número anterior (num-1) no está presente en el conjunto
            if (!num_set.contains(num - 1)) {
                // Inicia una nueva secuencia desde el número actual
                int currentNum = num;
                int currentStreak = 1;

                // Incrementa el número actual y la longitud de la secuencia mientras existan números consecutivos
                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Actualiza la longitud de la secuencia más larga
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        // Devuelve la longitud de la secuencia consecutiva más larga
        return longestStreak;
    }

}
