//Link to Problem-https://leetcode.com/problems/implement-queue-using-stacks/
package Stack_Questions;
import java.util.*;
public class QueueUsingStack {
    Stack<Integer> s1,s2;//Use two stack one store elements as you add them in queue and one is used as storage when popping
    public QueueUsingStack() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        if(s1.size()==1){
            return s1.pop();
        }
        //Remove elements from stack1 until its size is 1 and store all of them in stack 2
        while(s1.size()!=1){
            System.out.print(s1.peek());
            s2.push(s1.pop());
        }
        System.out.print(s1.peek());
        int t=s1.pop();// This will be the front element of the queue to be popped out
        //Push remaining elements back in queue
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return t;
    }
    
    public int peek() {
         if(empty()){
            return -1;
        }
        if(s1.size()==1){
            return s1.peek();
        }
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        int t=s1.pop();
           s1.push(t);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
     
        return t;
    }
    
    public boolean empty() {
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
}
