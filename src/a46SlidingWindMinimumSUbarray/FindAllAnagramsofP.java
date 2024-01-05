package a46SlidingWindMinimumSUbarray;

import java.util.*;

public class FindAllAnagramsofP {

    public static void main(String[] args) {
        List<Integer> resultado = new ArrayList<>();
        String s = "cbaebabacd";
        String p = "abc";
        resultado = findAnagrams(s, p);
        for (Integer in : resultado) {
            System.out.println(in);
        }
    }

    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> quantity = new ArrayList<>();
        int right = p.length();
        HashMap<Character, Integer> patternsMap = new HashMap<>();//Reference.
        HashMap<Character, Integer> auxMap = new HashMap<>(); //Store values.-

        //Populate the Reference map and the first auxMap
        for (int i = 0; i < p.length(); i++) {
            patternsMap.put(p.charAt(i), patternsMap.getOrDefault(p.charAt(i), 0) + 1);
            auxMap.put(s.charAt(i), auxMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int left = 0; left < s.length()-(p.length()); left++) {
            if (auxMap.equals(patternsMap)) {
                quantity.add(left);
            }

            auxMap.put(s.charAt(right), auxMap.getOrDefault(s.charAt(right), 0) + 1);
            auxMap.put(s.charAt(left),auxMap.get(s.charAt(left))-1);
            if(auxMap.get(s.charAt(left))==0){
                auxMap.remove(s.charAt(left));
            }
            right += 1;
        }
        return quantity;
    }
}
