public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] ans=new int[A];
        for(int[] query:B){
            int s=query[0]-1;
            int e=query[1]-1;
            int p=query[2];
            ans[s]+=p;
            if(e+1<A){
                ans[e+1]-=p;
            }

        }
        for(int i=1;i<A;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}