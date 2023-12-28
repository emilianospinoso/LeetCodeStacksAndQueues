package a24wordPatternd2HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionWith2HMaps {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }


    static boolean wordPattern(String pattern, String s) {
        Map<Character, String> mapChar = new HashMap<>();
        Map<String, Character> mapString = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);

            if (mapChar.containsKey(c)) { //check the first hashmap.
                if (!mapChar.get(c).equals(words[i])) {
                    return false;
                }
            }
            if (mapString.containsKey(words[i])) {
                if (mapString.get(words[i]) != c) {
                    return false;
                }
            }
            mapChar.put(c, words[i]);
            mapString.put(words[i], c);
        }
        return true;
    }
}
