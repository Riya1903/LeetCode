class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0; // Sum of digits at even indices
        int oddSum = 0;  // Sum of digits at odd indices

        // Iterate through the string
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; // Convert char to integer
            
            // Check if the index is even or odd
            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        // Compare the sums
        return evenSum == oddSum;
    }
}
