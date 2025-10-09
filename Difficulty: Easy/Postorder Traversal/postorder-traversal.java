/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
                    ArrayList<Integer>ans=new ArrayList<Integer>();

    public ArrayList<Integer> postOrder(Node root) {
        // code here
        if(root==null)
        return ans;
        postOrder(root.left);
        postOrder(root.right);
        ans.add(root.data);
        return ans;
    }
}