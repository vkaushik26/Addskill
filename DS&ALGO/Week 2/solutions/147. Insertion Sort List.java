/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
         if(head == null) return null;
        ListNode newHead = new ListNode(head.val);
        head = head.next;
        while(head!=null) {
            ListNode temp = newHead;
            ListNode newIns = new ListNode(head.val);
            ListNode prev = null;
            ListNode iter = newHead;
            while(iter!=null && iter.val < newIns.val) {
                prev = iter;
                iter = iter.next;
            }
            if(prev == null) {
                newIns.next = iter;
                newHead = newIns;
            }else {
                prev.next = newIns;
                newIns.next = iter;
            } 
            head = head.next;
        }  
        return newHead;
    }
}
