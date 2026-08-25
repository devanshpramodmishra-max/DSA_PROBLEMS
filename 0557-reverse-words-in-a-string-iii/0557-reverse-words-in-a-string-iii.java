class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder(s);

        int start = 0;

        for (int i = 0; i <= result.length(); i++) {

            // End of a word
            if (i == result.length() || result.charAt(i) == ' ') {

                int left = start;
                int right = i - 1;

                // Reverse the current word
                while (left < right) {
                    char temp = result.charAt(left);
                    result.setCharAt(left, result.charAt(right));
                    result.setCharAt(right, temp);

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        return result.toString();
    }
}