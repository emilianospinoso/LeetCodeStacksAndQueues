package a35GoogleInterview;

import java.util.HashMap;
import java.util.Map;

public class GSolution {

    public static void main(String[] args) {
        char[] s = {'H', 'e', 'l', 'l', 'o'};
        reverseString2(s);
    }


    static String reverseString(char[] s) {
        Map<Integer, Character> mapa = new HashMap<>();
        // Llenar el mapa con la posición original de cada caracter
        for (int i = 0; i < s.length; i++) {
            mapa.put(i, s[i]);
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = mapa.get(s.length - i - 1);
        }
        return new String(s);
    }

    static String reverseString2(char[] s) {
        // Iterar hasta la mitad del array
        for (int i = 0; i < s.length / 2; i++) {
            // Intercambiar el elemento actual con su correspondiente en el otro extremo
            char aux = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = aux;
        }

        // Devolver la cadena invertida como un objeto String
        return new String(s);
    }

}

/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
