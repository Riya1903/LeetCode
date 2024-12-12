import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            // Determine how many words fit into the current line
            int count = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                if (count + 1 + words[last].length() > maxWidth) break;
                count += 1 + words[last].length();
                last++;
            }

            // Build the current line
            StringBuilder line = new StringBuilder();
            int numWords = last - index;
            int numSpaces = maxWidth - count + (numWords - 1);

            if (last == words.length || numWords == 1) {
                // Last line or a line with only one word - left-justified
                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        line.append(" ");
                    }
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                // Fully-justified line
                int spacesBetweenWords = numSpaces / (numWords - 1);
                int extraSpaces = numSpaces % (numWords - 1);

                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        for (int j = 0; j < spacesBetweenWords; j++) {
                            line.append(" ");
                        }
                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            result.add(line.toString());
            index = last;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] words1 = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth1 = 16;
        System.out.println(solution.fullJustify(words1, maxWidth1));

        String[] words2 = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth2 = 16;
        System.out.println(solution.fullJustify(words2, maxWidth2));

        String[] words3 = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth3 = 20;
        System.out.println(solution.fullJustify(words3, maxWidth3));
    }
}
