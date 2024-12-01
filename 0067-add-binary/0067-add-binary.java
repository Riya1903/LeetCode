    class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Loop through the strings from the end to the beginning
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0; // Get binary digit or 0 if index is out of bounds
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry; // Add digits and carry
            carry = sum / 2; // Update carry
            result.append(sum % 2); // Append the current bit to the result

            i--;
            j--;
        }

        // The result is built in reverse order, so reverse it before returning
        return result.reverse().toString();
    }
}

