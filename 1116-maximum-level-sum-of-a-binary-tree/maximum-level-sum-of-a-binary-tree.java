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
    public int maxLevelSum(TreeNode root) {
        if(root==null)
    return 0;
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    int msum=Integer.MIN_VALUE,l=1,ml=1;
    while(!q.isEmpty()){
        int s=q.size(),lsum=0;
        for(int i=0;i<s;i++){
        TreeNode node=q.poll();
        lsum+=node.val;
        if(node.left!=null)
        q.add(node.left);
        if(node.right!=null)
        q.add(node.right);
        }
        if(lsum>msum){
            msum=lsum;
            ml=l;
        }
        l++;

        
    }
        return ml;
    }
}