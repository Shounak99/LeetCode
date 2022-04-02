// A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
// A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
// Note: Follow 0 based indexing.
// Input:
// N = 3
// M[][] = {{0 1 0},
//          {0 0 0}, 
//          {0 1 0}}
// Output: 1
// Explanation: 0th and 2nd person both
// know 1. Therefore, 1 is the celebrity. 
package Stack_Questions;
import java.util.*;
public class Celebrity_Problem {
    static int celebrity(int M[][], int n)
    {
    	// code here
    	int celebrity=-1;
    	Stack<Integer> people=new Stack<>();
        //Stacking up all the people
    	for(int i=M.length-1;i>=0;i--){
    	    people.push(i);
    	}
        //Run a loop until stack is empty
    	while(!people.isEmpty()){
            //Pop out first person
    	    int p1=people.pop();
            //if stack becomes empty after popping out the last candidate then break;
    	    if(people.isEmpty()){
    	        celebrity=p1;//This could be out potential celebrity
    	        break;
    	    }
            //Pop out second person
    	    int p2=people.pop();
            //Check if first person know does not know second person
    	    if(M[p1][p2]==0){
    	        people.push(p1);//Push p1 back
    	    }
            //Check if p2 does not know p1
    	   else if(M[p2][p1]==0){
    	        people.push(p2);//push p2 back
    	    }
    	}
    	if(celebrity==-1){
    	    return -1;
    	}
        //Check if the potential celebrity obtained is actually a celebrity
    	for(int j=0;j<M.length;j++){
    	    if(j!=celebrity && (M[celebrity][j]==1||M[j][celebrity]==0)){
    	        return -1;
    	    }
    	}
    	return celebrity;}}
}
