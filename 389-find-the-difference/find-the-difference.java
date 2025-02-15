class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        
        // XOR all characters in both s and t
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return (char) result;
    }
}
    

