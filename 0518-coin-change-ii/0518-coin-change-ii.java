class Solution {
    public int solve(int[] coins ,int n,int sum,int[][] dp ){
        //base case
        if(sum==0)return 1;
        if(sum<0)return 0;
        if(n==0)return 0;
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }

        int exclude=solve(coins,n-1,sum,dp);
        int include=solve(coins,n,sum-coins[n-1],dp);

        dp[n][sum]= exclude+include;
        return dp[n][sum];
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j]=-1;
            }
        }
        return solve(coins,n,amount,dp);
        
    }
}