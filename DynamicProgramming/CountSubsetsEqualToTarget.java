package DynamicProgramming;

public class CountSubsetsEqualToTarget {
    int mod=1000000007;
    public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    
	    Integer[][] dp=new Integer[n][sum+1];
	    return helper(arr,n,0,sum,dp);
	} 
	public int helper(int[] arr,int n,int i,int sum,Integer[][] dp){
	    if(sum==0){
	        return 1;
	    }
	    if(i>=n){
	        return 0;
	    }
	    int ans1=0;
	    if(dp[i][sum]==null){
	        if(sum>=arr[i]){
	            ans1=helper(arr,n,i+1,sum-arr[i],dp);
	        }
	        int ans2=helper(arr,n,i+1,sum,dp);
	        dp[i][sum]=(ans1+ans2);
	        //System.out.println(dp[n-1][sum]);
	    }
	    return dp[i][sum].intValue()%mod;
	    
	}
}
