class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return(0);
        }
        return(Math.max(max(root.left),max(root.right))+1);
    }
    public int max(TreeNode root){
        if(root == null){
            return(0);
        }
        int l = max(root.left)+1;
        int r = max(root.right)+1;
        return(Math.max(l,r));
    }
    
}