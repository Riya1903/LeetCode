import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hashmap to group anagrams using the sorted string as the key
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            // Convert the sorted character array back to a string
            String sortedStr = new String(charArray);

            // Add the original string to the corresponding group in the hashmap
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
