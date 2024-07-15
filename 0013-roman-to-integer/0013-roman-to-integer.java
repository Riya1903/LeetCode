class Solution {
    public int romanToInt(String s) {
         Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Step 2: Initialize result and length of the string
        int result = 0;
        int length = s.length();

        // Step 3: Traverse the string
        for (int i = 0; i < length; i++) {
            // Get the value of the current character
            int currentVal = romanMap.get(s.charAt(i));

            // Check if the next character exists and is larger (for subtraction cases)
            if (i + 1 < length && romanMap.get(s.charAt(i + 1)) > currentVal) {
                result -= currentVal; // Subtract the current value
            } else {
                result += currentVal; // Add the current value
            }
        }

        return result;
    }
}