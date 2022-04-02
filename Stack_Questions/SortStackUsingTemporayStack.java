//https://practice.geeksforgeeks.org/problems/sort-a-stack/1/
package Stack_Questions;
import java.util.*;
public class SortStackUsingTemporayStack {
    public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> temp=new Stack<>();
		while(!s.isEmpty()){
		    Integer value=s.pop();
            //If the stack is not empty and top stack value less than current value then we push the value in stack
		    if(!temp.isEmpty() && temp.peek().intValue()<=value.intValue()){
		        temp.push(value);
		    }
		    else{
                //Pop out elements from temporary stack until top stack stack is less than value or it becomes empty
		        while(!temp.isEmpty() && temp.peek().intValue()>value.intValue()){
		            s.push(temp.pop());
		            
		        }
                //Pushing the value after finding its appropriate place
		        temp.push(value);
		    }
		}
		return temp;
	}
}
