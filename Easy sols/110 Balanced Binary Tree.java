class Solution {
    public boolean result = true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return(result);
    }
    public int maxDepth(TreeNode root){
        if(result!= true){
            return 0;
        }
        if(root == null){
            return 0;
        }
        int leftNum = maxDepth(root.left);
        int rightNum = maxDepth(root.right);
        if(Math.abs(leftNum-rightNum)>1){
            result = false;
        }
        return 1 + Math.max(leftNum,rightNum);
    }
}