package a32ReverseWords;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsSolution {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        s.trim();
        List<String> words = new ArrayList<>();
        words = List.of(s.split(" "));
        for (int i = words.size()-1; i >= 0; i--) {
            reverse.append(words.get(i));
            reverse.append(" ");
        }
        return reverse.toString();
    }
}
