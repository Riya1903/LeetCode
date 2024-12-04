class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        // Initialize variables to store the number of ways to reach the previous two steps
        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int allWays = 0;
        
        // Calculate the number of ways to reach each step from 3 to n
        for (int i = 3; i <= n; i++) {
            allWays = oneStepBefore + twoStepsBefore; // The number of ways to reach the current step
            twoStepsBefore = oneStepBefore; // Update for the next iteration
            oneStepBefore = allWays;       // Update for the next iteration
        }
        
        return allWays;
    }
}
