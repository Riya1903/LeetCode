class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            // If the remainder is 2, it's impossible to represent n as sum of distinct powers of 3
            if (n % 3 == 2) {
                return false;
            }
            n /= 3; // Reduce n by dividing it by 3
        }
        return true;
    }
    
}