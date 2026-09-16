class Solution {
    public int Cost(int[] cost,int i,int[] dp){
        if(i>=cost.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int singlejump=cost[i]+Cost(cost,i+1,dp);
        int doublejump=cost[i]+Cost(cost,i+2,dp);
        dp[i]= Math.min(singlejump,doublejump);
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        //isme hame bs cost naam ka array diya hai
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(Cost(cost,0,dp),Cost(cost,1,dp));
    }
    //basically i stores the value that us stair pe aane mein mere kitne rupe lag rhe hai 
}