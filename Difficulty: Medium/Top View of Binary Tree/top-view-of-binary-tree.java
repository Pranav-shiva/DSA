/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    class pair{
        Node node;
        int verticle;
        public pair(Node node,int verticle){
            this.node=node;
            this.verticle=verticle;
            
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.remove();
            Node node=p.node;
            int verticle=p.verticle;
            if(!map.containsKey(verticle)){
                map.put(verticle,node.data);
            }
            if(node.left!=null){
                q.add(new pair(node.left,verticle-1));
            }
            if(node.right!=null){
                q.add(new pair(node.right,verticle+1));
            }
        }
        ans.addAll(map.values());
        return ans;
        
    }
}