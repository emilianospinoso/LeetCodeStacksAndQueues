package a07MockInterview;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
       // System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
       // System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));    // Output: 3
    }
    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int start = 0, end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the substring, move the starting pointer
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            // Update the length of the current substring
            maxLength = Math.max(maxLength, end - start + 1);

            // Store the index of the current character
            charIndexMap.put(currentChar, end);
        }
        return maxLength;
    }
}
