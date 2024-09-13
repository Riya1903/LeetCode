class Solution {
    public int uniquePaths(int m, int n) {
         int a = m + n - 2;
        int b = Math.min(m - 1, n - 1);  // Use the smaller one for efficiency
        
        // Calculate the combination a choose b
        return combination(a, b);
    }

    private int combination(int a, int b) {
        // Calculate a! / (b! * (a - b)!) in a simplified way to prevent overflow
        long result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * (a - i + 1) / i;
        }
        return (int) result;
    }
}