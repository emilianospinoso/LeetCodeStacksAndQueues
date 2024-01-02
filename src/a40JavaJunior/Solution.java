package a40JavaJunior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 4, 6, 7};
        List<Integer> myList = getNotDuplicated(array);
        System.out.println("--------------ONLY NOT REPEATED---------");
        for (int i : myList) {
            System.out.println(i);
        }
    }

    static List<Integer> getNotDuplicated(int[] array) {
        List<Integer> lista = new ArrayList<>();
        Map<Integer, Integer> mapa = new HashMap<>();
        for (Integer num : array) {
            mapa.put(num, mapa.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            System.out.println("Number:" + entry.getKey() + " Value:" + entry.getValue());
            if (entry.getValue() < 2) {
                lista.add(entry.getKey());
            }
        }
        return lista;
    }
}
