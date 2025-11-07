/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ListNode ptr=head;
        while(ptr!=null){
            int a=ptr.val;

            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);

            }
            else{
                hm.put(a,1);
            }
ptr=ptr.next;


        }
ListNode dummy=new ListNode(-1);
ListNode ptr1=dummy;
        ptr=head;
        while(ptr!=null){
            int a = ptr.val;
            if(hm.get(a)==1){
                ptr1.next= new ListNode(a);
                ptr1=ptr1.next;
            }

            ptr=ptr.next;

        }
       
        return dummy.next;
        
    }
}