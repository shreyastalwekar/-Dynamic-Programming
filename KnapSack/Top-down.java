class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        int dp[][] = new int[n+1][W+1];
         
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
               if(wt[i-1]>j)
                  {
                   dp[i][j] = dp[i-1][j];
                  }
               else
                  {
                   dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                   }
            }
        }
         return dp[n][W];
    } 
}
