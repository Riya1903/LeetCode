class Solution {
    public int mySqrt(int x) {
        // Special case for 0 and 1
        if (x == 0 || x == 1) {
            return x;
        }

        // Binary search range: [1, x / 2]
        int left = 1, right = x / 2, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // To prevent overflow, compare mid * mid with x using division
            if (mid <= x / mid) {
                result = mid; // mid is a potential result
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return result;
    }
}
