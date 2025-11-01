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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy=new ListNode(-1);
         ListNode ptr=head,ptr1=dummy;
        HashSet<Integer> hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);

        }
        while(ptr!=null){
            if(!hs.contains(ptr.val)){
                ptr1.next=new  ListNode(ptr.val);
                ptr1=ptr1.next;
              
            }
            ptr=ptr.next;
        }
        return dummy.next;
    }
}