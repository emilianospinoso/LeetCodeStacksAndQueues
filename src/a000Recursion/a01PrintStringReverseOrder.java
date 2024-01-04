package a000Recursion;

public class a01PrintStringReverseOrder {
    public static void main(String[] args) {
        char[] hola = {'h', 'o', 'l', 'a'};

        // Llamamos a la función para invertir la cadena
        reverseString(hola);

        // Imprimimos la cadena invertida
        System.out.println(hola);
    }

    // Función principal para invertir una cadena
    static void reverseString(char[] s) {
        // Iniciamos el proceso llamando a la función helper con los índices extremos
        helper(s, 0, s.length - 1);
    }

    // Función auxiliar para invertir la cadena utilizando recursión
    static void helper(char[] s, int left, int right) {
        // Condición base: si left es mayor o igual a right, no hay más que hacer
        if (left >= right) return;

        // Intercambiamos los caracteres en las posiciones left y right
        char tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;
        left++;
        right--;

        // Llamada recursiva con los nuevos valores de left y right
        helper(s, left, right);
    }


}
