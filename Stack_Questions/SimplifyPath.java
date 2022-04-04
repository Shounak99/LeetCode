package Stack_Questions;
import java.util.*;
public class SimplifyPath {
    public String simplifyPath(String path) {
        //1 Normal test case
        // "/foo/../test/../test//foo/bar/./baz => /foo/bar/baz"
        //"/../../../foo => ../../foo"
        //Check if path starts with slash at first
        boolean hasSlash=path.charAt(0)=='/';
        //Split the path using '/' as delimiter
        List<String> splitPath=Arrays.asList(path.split("/"));
        List<String> filteredPath=new ArrayList<>();
        //Here ""-> "/" so in the filtered path we remove / and . because they are of no use 
        for(String token:splitPath){
            if(!token.equals("") && !token.equals(".")){
                filteredPath.add(token);
            }
        }
        List<String> stack=new ArrayList<>();
        //If the original path started with / we add an empty string to stack
        if(hasSlash){
            stack.add("");
        }
        
        for(String token:filteredPath){
            //If we encunter double dots then we have 2 cases
            //1. if the stack is currently empty or the previous element of stack is a double dot
            // means we ought to keep the double in the final path
            //2. If the current token does not equal "" that means the current .. points to parent directory
            // therefore we pop out the previous element from the stack
            if(token.equals("..")){
            if(stack.size()==0||stack.get(stack.size()-1).equals("..")){
                stack.add(token);
            }
            else if(!stack.get(stack.size()-1).equals("")){
                stack.remove(stack.size()-1);
            }
            }
            
            else{
                stack.add(token);
            }
        }
        
        if(stack.size()==1 && stack.get(0).equals("")) return "/";
        return String.join("/",stack);
        
    }
}
