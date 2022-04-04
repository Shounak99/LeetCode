package DynamicProgramming;
import java.util.*;
public class MaxSumWithoutAdjacent {
    int findMaxSum(int arr[], int n) {
        // code here
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return helper(arr,n,0,dp);
    }
    int helper(int[] arr,int n,int i,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]==-1){
            dp[i]=Math.max(arr[i]+helper(arr,n,i+2,dp),helper(arr,n,i+1,dp));
        }
        return dp[i];
    }
}
