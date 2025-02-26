class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) { // Check if the digit is odd
                return num.substring(0, i + 1); // Return substring up to the odd digit
            }
        }
        return ""; // No odd digit found
    }

}