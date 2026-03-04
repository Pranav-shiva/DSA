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
        int ver;
        public pair(Node node,int ver){
            this.node=node;
            this.ver=ver;
            
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<pair> q=new LinkedList<>();
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.remove();
            Node n=p.node;
            
            if(!hm.containsKey(p.ver))
            hm.put(p.ver,n.data);
            if(n.left!=null)
            q.add(new pair(n.left,p.ver-1));
            if(n.right!=null){
                q.add(new pair(n.right,p.ver+1));
            }
        }
    arr.addAll(hm.values());
    return arr;
        
    }
}