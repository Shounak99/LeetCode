package BinaryTreeQuestions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> levelOrder(TreeNode root){
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        q.add(null);
        list.add(root.val);
        while(!q.isEmpty() && q.peek()!=null){
            TreeNode currNode=q.remove();
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
            if(q.peek()==null){
                q.remove();
                list.add(q.peek().val);
                q.add(null);
            }

        }
        return list;
    }
}
