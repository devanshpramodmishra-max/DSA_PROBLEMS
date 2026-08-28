class Solution {
    public int totalFruit(int[] fruits) {

        int[] freq = new int[fruits.length];
        int left = 0;
        int max = 0;
        int distinct = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit
            if (freq[fruits[right]] == 0) {
                distinct++;
            }

            freq[fruits[right]]++;

            // More than 2 fruit types
            while (distinct > 2) {

                freq[fruits[left]]--;

                if (freq[fruits[left]] == 0) {
                    distinct--;
                }

                left++;
            }

            // Update maximum window size
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}