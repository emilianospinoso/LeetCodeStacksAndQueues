import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class NumeratorDenominator {


    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4,2));
    }
    static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        // Determine the sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Convert to long to handle potential overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Append the integer part
        result.append(num / den);

        long remainder = num % den;

        if (remainder == 0) {
            // If there's no fractional part, return the result
            return result.toString();
        }

        // Append the decimal point
        result.append(".");

        // Map to store the position of each remainder
        Map<Long, Integer> remainderMap = new HashMap<>();

        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                // Found a repeating pattern
                int startIndex = remainderMap.get(remainder);
                String nonRepeatingPart = result.substring(0, startIndex);
                String repeatingPart = result.substring(startIndex);
                return nonRepeatingPart + "(" + repeatingPart + ")";
            }

            remainderMap.put(remainder, result.length());

            // Perform long division
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }

        return result.toString();
    }
}
/*
Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
If the fractional part is repeating, enclose the repeating part in parentheses.
If multiple answers are possible, return any of them.
It is guaranteed that the length of the answer string is less than 104 for all the given inputs.
Example 1:
Input: numerator = 1, denominator = 2
Output: "0.5"
 */