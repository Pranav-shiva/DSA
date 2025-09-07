/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        LinkedList<Integer> ll=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            Node h=arr[i];
            while(h!=null){
                ll.add(h.data);
                h=h.next;
            }
        }
        Collections.sort(ll);
          Node dummy = new Node(0); 
        Node curr = dummy;

        for (int val : ll) {
            curr.next = new Node(val);
            curr = curr.next;
        }

        return dummy.next;
    
    }
}