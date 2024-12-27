import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique elements
        HashSet<Integer> seen = new HashSet<>();
        
        // Iterate through the array
        for (int num : nums) {
            // If the number is already in the set, return true
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            seen.add(num);
        }
        
        // If no duplicates were found, return false
        return false;
    }
}
