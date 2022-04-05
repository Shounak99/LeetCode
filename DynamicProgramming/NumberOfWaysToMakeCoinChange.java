package DynamicProgramming;
import java.util.*;
public class NumberOfWaysToMakeCoinChange {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    int[] dp=new int[n+1];
		dp[0]=1;
		for(int i=0;i<denoms.length;i++){
			for(int j=denoms[i];j<=n;j++){
				dp[j]+=dp[j-denoms[i]];
			}
		}
		return dp[n];
  }

}
