import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        // Base case: if the tempList size equals nums length, we have a permutation
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        // Explore choices by iterating through nums
        for (int num : nums) {
            // Skip if num is already in tempList
            if (tempList.contains(num)) continue;

            // Add num to the current permutation
            tempList.add(num);

            // Continue building the permutation
            backtrack(nums, tempList, result);

            // Backtrack: remove the last added number
            tempList.remove(tempList.size() - 1);
        }
    }
}
