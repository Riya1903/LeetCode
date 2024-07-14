class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        
        int sum = 1; // start with 1 because 1 is a divisor of any number
        // Loop from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // If i is a divisor, add both i and num / i to the sum
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        
        // Return true if sum of divisors equals the number
        return sum == num;
    }
}