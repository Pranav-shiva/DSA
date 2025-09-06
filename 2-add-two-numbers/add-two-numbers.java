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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1=l1,ptr2=l2;
        ListNode d=new ListNode(-1);
        ListNode d1=d;
        int carry=0;
        while(ptr1!=null||ptr2!=null){
            int sum=0;
            if(ptr1!=null&&ptr2==null){
                sum=ptr1.val+carry;
                ptr1=ptr1.next;
            }
            else if(ptr1==null&&ptr2!=null){
                sum=ptr2.val+carry;
                ptr2=ptr2.next;

            }
            else{

             sum=(ptr1.val+ptr2.val+carry);
            ptr1=ptr1.next;
            ptr2=ptr2.next;
            }
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            else{
                carry=0;
            }
            d1.next= new ListNode(sum);
            d1=d1.next;


        }
        if(carry!=0){
            d1.next=new ListNode(carry);
            d1=d1.next;
        }
        d1.next=null;
        return d.next;
    }
}