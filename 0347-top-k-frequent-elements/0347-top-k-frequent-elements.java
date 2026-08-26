class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Store unique elements and their frequencies
        int[] elements = new int[n];
        int[] frequency = new int[n];

        int size = 0;
        int count = 1;

        // Count frequency of every element
        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                elements[size] = nums[i - 1];
                frequency[size] = count;
                size++;

                count = 1;
            }
        }

        // Store last element
        elements[size] = nums[n - 1];
        frequency[size] = count;
        size++;

        // Sort according to frequency
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (frequency[i] < frequency[j]) {

                    // Swap frequencies
                    int temp = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = temp;

                    // Swap corresponding elements
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }

        // Take first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = elements[i];
        }

        return result;
    }
}