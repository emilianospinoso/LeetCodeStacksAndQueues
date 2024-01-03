package a43ThreeSum3Sum;

import java.util.*;

public class ThreeSUmSolution {

    public static void main(String[] args) {
        List<List<Integer>> results = new ArrayList<>();
        int[] values = {-1, 0, 1, 2, -1, -4};
        results = threeSum(values);
        System.out.println("Results--------------------------");
        for (List<Integer> pairs : results) {
            System.out.println(pairs);
        }

    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lista = new ArrayList<>();

        // Ordenar el arreglo
        Arrays.sort(nums);

        // Mapa para almacenar los números y sus frecuencias
        Map<Integer, Integer> numMap = new HashMap<>();

        // Llenar el mapa con los números y sus frecuencias
        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        // Iterar sobre el arreglo
        for (int i = 0; i < nums.length - 2; i++) {
            // Saltar duplicados
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Utilizar dos punteros
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == 0) {
                    // Agregar el triplete a la lista de resultados
                    lista.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Saltar duplicados
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Avanzar punteros
                    left++;
                    right--;
                } else if (currentSum < 0) {
                    // Incrementar el puntero izquierdo para aumentar la suma
                    left++;
                } else {
                    // Decrementar el puntero derecho para reducir la suma
                    right--;
                }
            }
        }

        return lista;
    }
}
