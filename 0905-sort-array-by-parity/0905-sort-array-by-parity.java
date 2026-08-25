class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            // Left side should contain even numbers
            if (nums[i] % 2 == 0) {
                i++;
            }

            // Right side should contain odd numbers
            else if (nums[j] % 2 != 0) {
                j--;
            }

            // nums[i] is odd and nums[j] is even
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
        }

        return nums;
    }
}