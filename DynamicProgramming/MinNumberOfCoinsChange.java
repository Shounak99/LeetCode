package DynamicProgramming;
import java.util.*;
public class MinNumberOfCoinsChange {
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        // Write your code here.
            int[] dp=new int[n+1];
            Arrays.fill(dp,Integer.MAX_VALUE);
            dp[0]=0;
            int compare=0;
            for(int i=0;i<denoms.length;i++){
                for(int amount=denoms[i];amount<=n;amount++){
                    if(denoms[i]<=amount){
                        if(dp[amount-denoms[i]]==Integer.MAX_VALUE){
                            compare=dp[amount-denoms[i]];
                        }
                        else{
                            compare=1+dp[amount-denoms[i]];
                        }
                        
                        dp[amount]=Math.min(dp[amount],compare);
                }
            }
            }
        return dp[n]==Integer.MAX_VALUE?-1:dp[n];
      } 
}
