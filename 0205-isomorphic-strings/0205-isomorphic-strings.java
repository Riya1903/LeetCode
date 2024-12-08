class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If the lengths of the strings are not the same, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Use two maps to keep track of character mappings
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if there's a mismatch in mapping from s to t
            if (sToT.containsKey(charS)) {
                if (sToT.get(charS) != charT) {
                    return false;
                }
            } else {
                sToT.put(charS, charT);
            }

            // Check if there's a mismatch in mapping from t to s
            if (tToS.containsKey(charT)) {
                if (tToS.get(charT) != charS) {
                    return false;
                }
            } else {
                tToS.put(charT, charS);
            }
        }

        // If all characters match the mapping criteria, the strings are isomorphic
        return true;
    }
}