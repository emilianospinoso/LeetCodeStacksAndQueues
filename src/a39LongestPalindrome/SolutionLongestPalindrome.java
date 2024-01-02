package a39LongestPalindrome;

public class SolutionLongestPalindrome {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("aeLEVELiu"));
    }

    static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);      // Expandir alrededor del centro para palíndromos de longitud impar
            int len2 = expandAroundCenter(s, i, i + 1);  // Expandir alrededor del centro para palíndromos de longitud par

            int maxLen = Math.max(len1, len2); // Encontrar la longitud máxima entre los dos tipos de palíndromos

            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2; // Actualizar el índice de inicio
                end = i + maxLen / 2;         // Actualizar el índice de fin
            }
        }

        return s.substring(start, end + 1); // Devolver la subcadena palindrómica más larga usando los índices de inicio y fin
    }

    // Función auxiliar para expandir alrededor del centro y encontrar la longitud de un palíndromo
    static int expandAroundCenter(String s, int left, int right) {
        // Bucle while que se ejecuta mientras se cumplan tres condiciones:
        // 1. left es mayor o igual a 0: asegura que el índice izquierdo no se desplace más allá del principio de la cadena.
        // 2. right es menor que la longitud de la cadena s: asegura que el índice derecho no se desplace más allá del final de la cadena.
        // 3. El carácter en la posición 'left' es igual al carácter en la posición 'right': verifica si los caracteres en las posiciones izquierda y derecha son iguales, lo que indica que se ha encontrado una expansión de palíndromo.
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Devolver la longitud del palíndromo
    }
}
