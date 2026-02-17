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
    class Pair{
        TreeNode node;
        int val;
        public Pair(TreeNode node,int val){
            this.node=node;
            this.val=val;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> hm=new TreeMap<>();
        if(root==null)
        return ans;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.remove();
            TreeNode node=p.node;
            int val=p.val;
            hm.put(val,node.val);
            if(node.left!=null)
            q.add(new Pair(node.left,val+1));
            if(node.right!=null)
            q.add(new Pair(node.right,val+1));


        }
        ans.addAll(hm.values());
        return ans;
        
        
    }
}