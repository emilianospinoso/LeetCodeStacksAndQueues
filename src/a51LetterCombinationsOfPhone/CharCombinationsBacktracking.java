package a51LetterCombinationsOfPhone;

import java.util.*;

public class CharCombinationsBacktracking {
    // Lista para almacenar las combinaciones
    private static List<String> combinations = new ArrayList<>();
    // Mapa que asocia cada dígito con las letras correspondientes
    private static Map<Character, String> letters = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    // Cadena de dígitos de entrada
    private static String phoneDigits;

    public static void main(String[] args) {
        // Llama a la función principal y muestra el resultado
        List<String> result = letterCombinations("23");
        System.out.println(result);
    }

    // Función principal que inicia el proceso de backtracking
    public static List<String> letterCombinations(String digits) {
        // Reinicia la lista de combinaciones antes de cada llamada
        combinations.clear();

        // Si la entrada está vacía, devuelve la lista de combinaciones actual
        if (digits.length() == 0) {
            return combinations;
        }

        // Inicia el backtracking con un camino vacío y un índice de inicio de 0
        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }

    // Función de backtracking recursiva
    private static void backtrack(int index, StringBuilder path) {
        // Si el camino tiene la misma longitud que los dígitos, se tiene una combinación completa
        if (path.length() == phoneDigits.length()) {
            combinations.add(path.toString());
            return; // Backtrack
        }

        // Obtiene las letras asociadas al dígito actual y recorre ellas
        String possibleLetters = letters.get(phoneDigits.charAt(index));
        for (char letter : possibleLetters.toCharArray()) {
            // Agrega la letra al camino actual
            path.append(letter);
            // Mueve al siguiente dígito
            backtrack(index + 1, path);
            // Backtrack eliminando la letra antes de pasar al siguiente
            path.deleteCharAt(path.length() - 1);
        }
    }
}
