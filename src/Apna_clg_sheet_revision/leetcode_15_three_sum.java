package Apna_clg_sheet_revision;

import java.util.*;

public class leetcode_15_three_sum {
    static void main() {

    }


// this is the bute force approach
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        // A Set of Lists handles uniqueness automatically in Java
        Set<List<Integer>> s = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> trip = Arrays.asList(nums[i], nums[j], nums[k]);
                        // Sorting ensures that [1, -1, 0] and [0, 1, -1]
                        // are treated as the same triplet
                        Collections.sort(trip);

                        if (!s.contains(trip)) {
                            s.add(trip);
                            ans.add(trip);
                        }
                    }
                }
            }
        }
        return ans;
    }

}
