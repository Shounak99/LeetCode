//https://leetcode.com/problems/valid-parentheses/
package Stack_Questions;
import java.util.*;
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //If stack is empty and we encounter closing brackets return false
            if(stack.isEmpty() && (ch==')'||ch=='}'||ch==']')){
                return false;
            }
            //If at any point of time we encounter opening brackets push them
            else if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }

            else {
                //If we find correct combination of openig and closing pop
                if(ch=='}' && stack.peek()=='{'){
                stack.pop();
            }
            //else return false
                  else if(ch=='}' && stack.peek()!='{'){
                      return false;
                  }
            if(ch==')' && stack.peek()=='('){
                stack.pop();
            }
                  else if(ch==')' && stack.peek()!='(') {
                      return false;
                  }
             if(ch==']' && stack.peek()=='['){
                stack.pop();
            }
                  else if(ch==']' && stack.peek()!='['){
                      return false;
                  }
        }}
        //return false if stack is still not empty 
        return stack.isEmpty();
    }
}
