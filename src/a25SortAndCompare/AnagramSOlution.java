package a25SortAndCompare;

import java.util.Arrays;

public class AnagramSOlution {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(str1);
        System.out.println(str2);
        return true;
    }


}
