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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     if(head.next==null||right==left){
        return head;
     }
     
     ListNode dummy =new ListNode(0,head);

     ListNode p=dummy;

     for(int i=1;i<left;i++){
         p=p.next;
     }

     ListNode c=p.next;

     ListNode f=c.next;

     for(int i=0;i<right-left;i++){
        c.next=f.next;
        f.next=p.next;
        p.next=f;
        f=c.next;
     }
     return dummy.next;
    }
}