//https://practice.geeksforgeeks.org/problems/sort-a-stack/1#
package Stack_Questions;
import java.util.*;
public class SortStackUsingRecursion {
    public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(!s.isEmpty()){
		    int value=s.pop();
		    s=sort(s);
		    insert(s,value);
		}
		return s;
	}
	public void insert(Stack<Integer> s,Integer value){
	    if(s.isEmpty()){
	        s.push(value);
	        return ;
	    }
	    if(!s.isEmpty() && s.peek()<=value){
	        s.push(value);
	        return ;
	    }
	    if(!s.isEmpty() && s.peek()>value){
	        int temp=s.pop();
	        insert(s,value);
	        s.push(temp);
	    }
	}
}
