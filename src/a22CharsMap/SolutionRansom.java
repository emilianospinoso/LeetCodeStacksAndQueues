package a22CharsMap;

import java.util.HashMap;
import java.util.Map;

public class SolutionRansom {
    public static void main(String[] args) {
        String ransomNote = "aac";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }


    static public boolean canConstruct(String ransomNote, String magazine) {
        //Magazine is the root, the fuente
        Map<Character, Integer> characters = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            characters.put(ch, characters.getOrDefault(ch, 0) + 1);
        }
        //print;
       /* for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " Value:" + entry.getValue());
        }*/

        //now i am going to look in the map the ocurrences and reduce them.
        for (char ch : ransomNote.toCharArray()) {
            if (characters.getOrDefault(ch, 0) == 0) {
                return false;
            }
            characters.put(ch, characters.get(ch) - 1);
        }
        return true;
    }

}
