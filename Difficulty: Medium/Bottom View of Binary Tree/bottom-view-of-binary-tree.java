

//User function Template for Java


class Solution
{
    static class Info{
        Node node;
        int hd;
        Info(Node node, int hd ){
            this.hd=hd;
            this.node=node;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    { 
        HashMap<Integer,Node> hm=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<Info> q=new LinkedList<>();
        int max=0,min=0;
        q.add(new Info(root,0));
        while(!q.isEmpty()){
            Info curr=q.remove();
                hm.put(curr.hd,curr.node);
            
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
        }
       for(int i= min;i<=max;i++){
            arr.add(hm.get(i).data);
          
        }
        return arr;
        
        // Code here
    }
}