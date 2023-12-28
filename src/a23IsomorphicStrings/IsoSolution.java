package a23IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsoSolution {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> characters = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if ( characters.getOrDefault(s1[i],' ')!= ' '
                && characters.getOrDefault(s1[i],' ') != t1[i]) {
                return false;
            }
            characters.put(s1[i], t1[i]);
        }
        return true;
    }
}