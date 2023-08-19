package BinaryTreeQuestions;

class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null && targetSum-root.val==0){
            return true;
        }
        else if(root.left==null && root.right==null && targetSum-root.val!=0){
            return false;
        }
        boolean left=hasPathSum(root.left,targetSum-root.val);
        boolean right=hasPathSum(root.right,targetSum-root.val);
        return left||right;
    }
    public static  void main(String[] args){
        char chars[] = {'a', 'b', 'c'};
        char c[];
        c=chars;
         for(char entry:c){
             System.out.print(entry);
         }
         PathSum.Main obj=new PathSum.Main();
         obj.something();
         Main.something();
         Demo demo=new Demo() {
             @Override
             public int hashCode() {
                 return super.hashCode();
             }
         } ;

    }
    public static class Main{
       static void something(){

       }
    }

}
 interface Demo{

}