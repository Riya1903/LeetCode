class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        // Numbers ending in 0 are not palindromes unless the number is 0
        if (x != 0 && x % 10 == 0) {
            return false;
        }
        
        int reversed = 0;
        int original = x;
        
        // Reversing the second half of the number and comparing with the first half
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // Check if the original number is the same as the reversed number
        // or if the original number without its last digit is the same as the reversed number
        return x == reversed || x == reversed / 10;
    }
    
}