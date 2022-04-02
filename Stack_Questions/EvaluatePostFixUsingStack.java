//https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1/#
package Stack_Questions;
import java.util.*;
class EvaluatePostFixUsingStack{
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)>='0' && S.charAt(i)<='9'){
                stack.push((int) (S.charAt(i)-'0'));
            }
            else if(S.charAt(i)=='+'){
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num1+num2);
            }
            else if(S.charAt(i)=='-'){
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num2-num1);
            }
            else if(S.charAt(i)=='*'){
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num1*num2);
            }
            else if(S.charAt(i)=='/'){
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num2/num1);
            }
        }
        return stack.pop();
    }
}