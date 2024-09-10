class Solution {
    public int lengthOfLastWord(String s) {
         // Trim trailing spaces
        s = s.trim();
        // Split the string by spaces
        String[] words = s.split(" ");
        // Get the last word
        String lastWord = words[words.length - 1];
        // Return the length of the last word
        return lastWord.length();
    }
}