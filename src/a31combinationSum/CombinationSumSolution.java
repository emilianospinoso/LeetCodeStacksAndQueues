package a31combinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumSolution {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = combinationSum(candidates, target);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    static void backtrack(
            int remain,
            LinkedList<Integer> comb,
            int start, int[] candidates,
            List<List<Integer>> results) {

        // Caso base: se alcanzó el objetivo, añadir la combinación actual a los resultados
        if (remain == 0) {
            // Hacer una copia profunda de la combinación actual y añadirla a los resultados
            results.add(new ArrayList<Integer>(comb));
            return;
        } else if (remain < 0) {
            // Excede el objetivo, detener la exploración.
            return;
        }

        // Iterar sobre los candidatos desde la posición "start"
        for (int i = start; i < candidates.length; ++i) {
            // Paso hacia adelante: añadir el número actual a la combinación
            comb.add(candidates[i]);
            // Llamada recursiva: explorar con la reducción del objetivo y la nueva combinación
            backtrack(remain - candidates[i], comb, i, candidates, results);
            // Retroceder: quitar el último número para probar otras combinaciones
            comb.removeLast();
        }
    }

    // Método principal para calcular combinaciones que sumen al objetivo
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Lista que almacenará los resultados finales
        List<List<Integer>> results = new ArrayList<>();
        // Lista que representa la combinación actual durante el proceso de backtracking
        LinkedList<Integer> comb = new LinkedList<>();

        // Llamada inicial al método de backtracking
        backtrack(target, comb, 0, candidates, results);

        // Devolver la lista de resultados
        return results;
    }


}
