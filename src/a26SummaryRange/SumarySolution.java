package a26SummaryRange;

import java.util.ArrayList;
import java.util.List;

public class SumarySolution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 6, 7};
        System.out.println(summaryRanges(nums));
    }


    static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int aux = i;

            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (nums[aux] == nums[i]) {
                ranges.add(String.valueOf(nums[aux]));
            } else {
                ranges.add(nums[aux] + "->" + nums[i]);
            }
            i++;
        }
        return ranges;
    }
}
