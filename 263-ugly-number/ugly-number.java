class Solution {
    public boolean isUgly(int n) {
         if (n <= 0) return false;
        
        // Keep dividing by 2, 3, or 5 while divisible
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        // If we are left with 1, it's an ugly number
        return n == 1;
    }
}