class Solution {
    public String countAndSay(int n) {
        // Base case
        if (n == 1) return "1";
        
        // Start with the base sequence
        String result = "1";
        
        // Generate the sequence iteratively up to n
        for (int i = 2; i <= n; i++) {
            StringBuilder current = new StringBuilder();
            int count = 1;
            
            // Iterate through the previous result
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    // Increment count if the same character repeats
                    count++;
                } else {
                    // Append the count and the character to the new sequence
                    current.append(count).append(result.charAt(j - 1));
                    count = 1; // Reset count for the new character
                }
            }
            
            // Append the last group
            current.append(count).append(result.charAt(result.length() - 1));
            
            // Update the result for the next iteration
            result = current.toString();
        }
        
        return result;
    }
}
