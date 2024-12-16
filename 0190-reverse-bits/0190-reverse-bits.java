public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // Extract the least significant bit of n
            int bit = n & 1;
            // Shift the bit to its reversed position
            result = (result << 1) | bit;
            // Right shift n to process the next bit
            n >>= 1;
        }
        return result;
    }
}
