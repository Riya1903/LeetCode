class Solution {
    public boolean isHappy(int n) {
        // Set to store the numbers that have been seen
        Set<Integer> seen = new HashSet<>();
        
        // Loop until we reach 1 or find a cycle
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        
        // If we reach 1, then it's a happy number
        return n == 1;
    }
    
    // Helper function to compute the sum of squares of digits of a number
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit * digit;
        }
        return sum;
    }
}
