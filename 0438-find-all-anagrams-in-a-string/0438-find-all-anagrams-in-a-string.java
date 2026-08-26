class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] freq = new int[26];

        // Store frequency of characters in p
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while (right < s.length()) {

            // Current character entering the window
            char ch = s.charAt(right);

            if (freq[ch - 'a'] > 0) {
                count--;
            }

            freq[ch - 'a']--;
            right++;

            // Window size becomes bigger than p
            if (right - left > p.length()) {
                char remove = s.charAt(left);

                if (freq[remove - 'a'] >= 0) {
                    count++;
                }

                freq[remove - 'a']++;
                left++;
            }

            // All characters matched
            if (count == 0) {
                result.add(left);
            }
        }

        return result;
    }
}