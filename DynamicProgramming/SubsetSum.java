package DynamicProgramming;

public class SubsetSum {
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        Boolean[][] dp=new Boolean[N][sum+1];
        return Boolean.valueOf(helper(N,arr,sum,dp,0));
    }
    static boolean helper(int N,int[] arr,int sum,Boolean[][] dp,int i){
        if(sum==0){
            return true;
        }
       if(i==N){
           return false;
       }
       if(dp[i][sum]==null){
           boolean ans1,ans2;
           if(sum>=arr[i]){
               ans1=helper(N,arr,sum-arr[i],dp,i+1);
           }
           else{
               ans1=helper(N,arr,sum,dp,i+1);
           }
           ans2=helper(N,arr,sum,dp,i+1);
           dp[i][sum]=Boolean.valueOf(ans1||ans2);
       }
      return dp[i][sum].booleanValue();
       
    }
}
