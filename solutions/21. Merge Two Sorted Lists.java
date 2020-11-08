/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode current= h;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                current.next=l1;
                l1=l1.next;
            }
            else
            {
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1!=null){
            current.next=l1;
            l1=l1.next;
        }
        if(l2!=null){
            current.next=l2;
            l2=l2.next;
        }
        if(h!=null)
        {
            h=h.next;
        }
        
        return h;
    }
}
