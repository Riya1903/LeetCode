class Solution {
    public int divide(int dividend, int divisor) {
         // Edge cases:
        if (divisor == 0) throw new ArithmeticException("Divisor cannot be zero.");
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
        // Determine the sign of the result.
        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        // Use long to handle overflow and work with positive values.
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        
        int result = 0;
        while (ldividend >= ldivisor) {
            long tempDivisor = ldivisor;
            long multiple = 1;
            
            // Double the divisor until it is less than or equal to the remaining dividend.
            while (ldividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            
            // Subtract the largest found multiple of the divisor from the dividend.
            ldividend -= tempDivisor;
            result += multiple;
        }
        
        // Apply the sign to the result.
        return negative ? -result : result;
    }
    }
