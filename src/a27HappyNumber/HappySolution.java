package a27HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class HappySolution {

    public static void main(String[] args) {

        System.out.println(isHappy(2));
    }


    static boolean isHappy(int n) {
        Set<Integer> results = new HashSet<>();

        while (n != 1) {
            int sum = 0;
            String numberString = Integer.toString(n);

            for (int i = 0; i < numberString.length(); i++) {
                char c = numberString.charAt(i);
                int digit = Character.getNumericValue(c);
                sum += digit * digit;
            }

            System.out.println("Current sum: " + sum);

            if (!results.add(sum)) {
                System.out.println("Detected a loop with " + sum);
                return false;
            }

            n = sum;
        }

        // Si llegamos aquí, el número es feliz
        return true;
    }
}
