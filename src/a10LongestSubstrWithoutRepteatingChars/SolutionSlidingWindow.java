package a10LongestSubstrWithoutRepteatingChars;

import java.util.HashMap;
import java.util.Map;

public class SolutionSlidingWindow {
    /*
    Given a string s, find the length of the longest substring without repeating characters.
        Example 1:  Input: s = "abcabcbb"    Output: 3
    Explanation: The answer is "abc", with the length of 3.
     */
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    static int lengthOfLongestSubstring(String s) {
        // Use a map to store the count of each character in the current window
        Map<Character, Integer> chars = new HashMap();

        // Pointers for the sliding window
        int left = 0;
        int right = 0;

        // Variable to store the result (length of the longest substring without repeating characters)
        int res = 0;

        // Iterate through the string from the beginning to the end
        while (right < s.length()) {
            // Get the character at the right pointer
            char r = s.charAt(right);

            // Update the count of the character in the map
            chars.put(r, chars.getOrDefault(r, 0) + 1);

            // Check for repeating characters
            while (chars.get(r) > 1) {
                // Move the left pointer forward and update the count in the map
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left++;
            }

            // Update the result with the maximum length encountered so far
            res = Math.max(res, right - left + 1);

            // Move the right pointer forward
            right++;
        }

        // Return the length of the longest substring without repeating characters
        return res;
    }
}


