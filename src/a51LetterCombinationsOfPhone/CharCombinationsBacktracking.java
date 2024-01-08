package a51LetterCombinationsOfPhone;

import java.util.*;

public class CharCombinationsBacktracking {
    public static void main(String[] args) {
        List<String> result = letterCombinations("2345");
        System.out.println(result);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return combinations;
        }

        // Mapeo de dígitos a letras correspondientes
        String[] digitMapping = {
                "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        // Inicializar la lista de combinaciones con la primera letra correspondiente al primer dígito
        for (char letter : digitMapping[Character.getNumericValue(digits.charAt(0))].toCharArray()) {
            combinations.add(String.valueOf(letter));
        }

        // Iterar sobre los dígitos restantes
        for (int i = 1; i < digits.length(); i++) {
            String currentLetters = digitMapping[Character.getNumericValue(digits.charAt(i))];
            List<String> newCombinations = new ArrayList<>();

            // Combinar cada letra del dígito actual con todas las combinaciones existentes
            for (String combination : combinations) {
                for (char letter : currentLetters.toCharArray()) {
                    newCombinations.add(combination + letter);
                }
            }

            // Actualizar la lista de combinaciones
            combinations = newCombinations;
        }

        return combinations;
    }
}
