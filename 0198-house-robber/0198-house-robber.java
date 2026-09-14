class Solution {
    public int solve(int[] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int include=nums[i]+solve(nums,i+2,dp);
        int exclude=0+solve(nums,i+1,dp);
        dp[i]=Math.max(include,exclude);
        return dp[i];
    }
    public int rob(int[] nums) {
        int i=0;
        int[] dp =new int[nums.length];
        while(i<nums.length){
            dp[i]=-1;
            i++;
        }
        return solve(nums,0,dp);
    }
}