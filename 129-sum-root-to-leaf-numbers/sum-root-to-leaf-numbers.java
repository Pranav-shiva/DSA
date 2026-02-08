/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int dfs(TreeNode root,int crr){
        if(root==null)
        return 0;
        crr=crr*10+root.val;
        if(root.right==null&&root.left==null)
        return crr;
       return dfs(root.right,crr)+dfs(root.left,crr);
    }
    public int sumNumbers(TreeNode root) {
        int crr=0;
        return dfs(root,crr);
        
    }
}