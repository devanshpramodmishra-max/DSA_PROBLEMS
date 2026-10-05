class Solution {

    public int solve(int[] nums, int i, int prev, int[][] dp) {

        if (i == nums.length) {
            return 0;
        }

        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        // Exclude
        int exclude = solve(nums, i + 1, prev, dp);

        // Include
        int include = 0;

        if (prev == -1 || nums[i] > nums[prev]) {
            include = 1 + solve(nums, i + 1, i, dp);
        }

        dp[i][prev + 1] = Math.max(include, exclude);

        return dp[i][prev + 1];
    }

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        int[][] dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(nums, 0, -1, dp);
    }
}