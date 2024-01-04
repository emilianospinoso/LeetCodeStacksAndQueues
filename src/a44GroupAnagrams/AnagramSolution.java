package a44GroupAnagrams;

import java.util.*;

public class AnagramSolution {

    public static void main(String[] args) {
        List<List<String>> results = new ArrayList<>();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        results = groupAnagrams(strs);
        for (List<String> group : results) {
            System.out.println(group);
        }

    }

    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        List<Map<Character, Integer>> mapList = new ArrayList<>();

        // 1. Ordenar las palabras
        String[] sortedWords = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            sortedWords[i] = new String(charArray);
        }

        Map<String, List<String>> mapita = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            // Obtener la lista actual para la palabra ordenada
            List<String> currentList = mapita.getOrDefault(sortedWords[i], new ArrayList<>());

            // Agregar la palabra original a la lista
            currentList.add(strs[i]);

            // Actualizar el mapa
            mapita.put(sortedWords[i], currentList);
        }

        // Ahora, mapita contiene las listas de palabras anagramáticas
        for (List<String> anagramGroup : mapita.values()) {
            groups.add(anagramGroup);
        }


            return groups;
        }
    }
