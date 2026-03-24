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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode c=new TreeNode(val);
        TreeNode crr=root;
        if(root==null)
        return c;
        while(true){
            if(crr.val<val){
                if(crr.right==null){
                crr.right=c;
                break;
                }
                else{
                    crr=crr.right;

                }
            }
            else{
                if(crr.left==null)
                {
                    crr.left=c;
                    break;
                }
                else{
                    crr=crr.left;
                }
            }
        }
        return root;
    }
}