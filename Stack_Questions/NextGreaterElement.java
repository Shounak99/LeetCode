//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1/#
package Stack_Questions;
import java.util.*;
public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long[] result=new long[arr.length];
        Stack<Long> stack=new Stack<>();
        //Run a loop from the rear
        for(int i=arr.length-1;i>=0;i--){
            //If the stack is Empty means that element does not have any greater element to its right
            if(stack.isEmpty()){
                stack.push(arr[i]);
                result[i]=-1;
            }
            else{
                //If stack is not empty pop out elements until we find an element greater than it in stack
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                //If after the iteration the stack is empty means the element does not have any greater element
                if(stack.isEmpty()){
                    stack.push(arr[i]);
                    result[i]=-1;
                }
                //Else we have the greater elemnt
                //Also push the current element on the stack
                else{
                    result[i]=stack.peek();
                    stack.push(arr[i]);
                }
            }
        }
        return result;
    } 
}
