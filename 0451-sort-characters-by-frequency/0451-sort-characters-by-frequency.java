class Solution {
    public String frequencySort(String s) {

        // Store frequency of ASCII characters
        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();

        // Pick the highest frequency character each time
        for (int times = s.length(); times >= 1; times--) {

            for (int i = 0; i < 128; i++) {

                if (freq[i] == times) {

                    for (int j = 0; j < times; j++) {
                        result.append((char) i);
                    }
                }
            }
        }

        return result.toString();
    }
}