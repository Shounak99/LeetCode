package DynamicProgramming;

public class PartitionSum {
    public boolean canPartition(int[] nums) {
    int sum=0;
        if(nums.length==1){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
        }
        if(sum%2!=0){
            return false;
        }
        Boolean[][] dp=new Boolean[nums.length+1][sum/2+1];
        
        return helper(nums,sum/2,0,dp);
}
public boolean helper(int[] nums,int sum,int i,Boolean[][] dp){
    if(sum==0){
        return true;
    }
    if(i==nums.length){
        return false;
    }
    
    
    if(dp[i][sum]==null){
        boolean ans1;
        if(sum>=nums[i])
        ans1=helper(nums,sum-nums[i],i+1,dp);
        else
            ans1=helper(nums,sum,i+1,dp);
        boolean ans2=helper(nums,sum,i+1,dp);
        dp[i][sum]=Boolean.valueOf(ans1||ans2);
    }
    return dp[i][sum].booleanValue();
    
    
}
}
