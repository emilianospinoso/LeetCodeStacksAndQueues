package a13MajorityElement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainMajority {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 4, 1, 4};
        System.out.println(majorityElement(numbers));
    }

    static int majorityElement(int[] nums) {
        int num = 0;
        int tamFind= nums.length/2;
        Map<Integer, Integer> apparences = new HashMap<>();
        for (Integer numb: nums){
            apparences.put(numb, apparences.getOrDefault(numb,0)+1);
            if(apparences.get(numb)>tamFind){
                return numb;
            }
        }
        return num;
    }
}
