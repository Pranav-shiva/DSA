/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node ptr1=head1,ptr2=head2;
        HashSet<Node> hs=new HashSet<>();
        while(ptr1!=null){
            hs.add(ptr1);
            ptr1=ptr1.next;
        }
        while(ptr2!=null){
            if(hs.contains(ptr2))
            return ptr2;
            ptr2=ptr2.next;
        }
        return null;
    }
}