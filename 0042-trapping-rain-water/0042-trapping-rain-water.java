class Solution {
    public int trap(int[] nums) {
        int ans = 0;

        int[] lmax = new int[nums.length];
        int[] rmax = new int[nums.length];

        // Store maximum element on the left
        lmax[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            lmax[i] = Math.max(lmax[i - 1], nums[i - 1]);
        }

        // Store maximum element on the right
        rmax[nums.length - 1] = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], nums[i + 1]);
        }

        // Calculate trapped water
        for (int i = 1; i < nums.length - 1; i++) {
            int water = Math.min(lmax[i], rmax[i]) - nums[i];

            if (water > 0) {
                ans += water;
            }
        }

        return ans;
    }
}