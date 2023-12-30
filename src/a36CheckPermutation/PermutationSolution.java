package a36CheckPermutation;

import a26SummaryRange.SumarySolution;

import java.util.HashMap;
import java.util.Map;

public class PermutationSolution {
    /*
    Given 2 String check if one String is a permutation of the other
     */
    public static void main(String[] args) {
        String s1 = "agustina";
        String s2 = "a";
        System.out.println(isPermutation(s1, s2));
    }

    static boolean isPermutation(String s1, String s2) {
        // Caso especial: ambas cadenas son vacías
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convertir a minúsculas para ignorar la distinción entre mayúsculas y minúsculas
        // s1 = s1.toLowerCase();
        // s2 = s2.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        // Contar caracteres en la primera cadena
        for (Character ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Verificar la segunda cadena
        for (Character ch : s2.toCharArray()) {
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
