class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start with the first string as the initial prefix
        String prefix = strs[0];
        
        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix length until it matches the start of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
