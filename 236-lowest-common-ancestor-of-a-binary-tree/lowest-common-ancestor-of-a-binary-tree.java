/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean path(TreeNode root, TreeNode p , ArrayList<TreeNode> arr){
        if(root==null)
        return false;
                arr.add(root);
        if(root==p)
        return true;
       if( path(root.left,p,arr)|| path(root.right,p,arr))
       return true;
               arr.remove(arr.size()-1);
               return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> arr1=new ArrayList<>();
                ArrayList<TreeNode> arr2=new ArrayList<>();
                path(root,p,arr1);
                path(root,q,arr2);
                HashSet<TreeNode> hs=new HashSet<>();
                TreeNode ans=root;
                for(int i=0;i<arr1.size();i++){
                    hs.add(arr1.get(i));
                }
                for(int i=0;i<arr2.size();i++){
                    if(hs.contains(arr2.get(i)))
                    ans=arr2.get(i);
                }
                              return ans;


    }
}