/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    class pair{
        Node node;
        int val;
        public pair(Node node ,int val ){
            this.node=node;
            this.val=val;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<pair> q=new LinkedList<>();
        Map<Integer,Integer> hm=new TreeMap<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.remove();
            Node node=p.node;
            int val=p.val;
            hm.put(val,node.data);
            if(node.left!=null)
            q.add(new pair(node.left,val-1));
            if(node.right!=null)
            q.add(new pair(node.right,val+1));
        }
        ans.addAll(hm.values());
        return ans;

    }
}