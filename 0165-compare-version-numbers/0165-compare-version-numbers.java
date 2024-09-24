class Solution {
    public int compareVersion(String version1, String version2) {
         // Split both version strings by '.'
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        // Get the maximum length of both version arrays
        int maxLength = Math.max(v1.length, v2.length);
        
        // Compare each revision number
        for (int i = 0; i < maxLength; i++) {
            // Parse the current revision for both versions, treating missing revisions as 0
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            
            // Compare the current revisions
            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
        }
        
        // If all revisions are equal, return 0
        return 0;
    }
}