/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void pa(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer>arr){
     if(root==null)
     return;
     arr.add(root.data);
     if(root.left==null&&root.right==null)
     ans.add(new ArrayList<>(arr));
     else{
         pa(root.left,ans,arr);
         pa(root.right,ans,arr);
     }
        arr.remove(arr.size() - 1);
       
    }
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        pa(root,ans,arr);
        return ans;
        
    }
}