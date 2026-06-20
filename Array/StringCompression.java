class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0; // position to write compressed result
        int i = 0;

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive occurrences
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if greater than 1
            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}