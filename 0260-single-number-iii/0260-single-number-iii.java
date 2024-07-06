class Solution {
    public int[] singleNumber(int[] nums) {
        // Step 1: XOR all numbers to get the XOR of the two unique numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find a set bit in the xor result
        int setBit = xor & -xor;

        // Step 3: Partition the numbers into two groups and XOR each group
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & setBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        // Step 4: The result is the two unique numbers
        return new int[] {num1, num2};
    }
}