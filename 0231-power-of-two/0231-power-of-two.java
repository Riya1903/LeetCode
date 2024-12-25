class Solution {
    public boolean isPowerOfTwo(int n) {
        // A power of two must be greater than 0 and satisfy n & (n - 1) == 0
        return n > 0 && (n & (n - 1)) == 0;
    }
}
