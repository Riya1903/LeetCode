class Solution {
    public String intToRoman(int num) {
        // Define the symbols and their corresponding values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // StringBuilder to store the result
        StringBuilder roman = new StringBuilder();
        
        // Iterate through each value-symbol pair
        for (int i = 0; i < values.length; i++) {
            // While num is greater than or equal to the current value
            while (num >= values[i]) {
                // Append the symbol to the result
                roman.append(symbols[i]);
                // Subtract the value from num
                num -= values[i];
            }
        }
        
        // Return the final Roman numeral string
        return roman.toString();
    
    }
}