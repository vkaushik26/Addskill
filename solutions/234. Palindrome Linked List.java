/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        int size = getSize(head);
        if(head==null || head.next==null)
            return true;
        ListNode fast=head,slow=head,prev=null,temp=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        if(size%2==1)
            slow=slow.next;
        while(prev!=null && slow!=null){
            if(prev.val!=slow.val)
                return false;
            prev=prev.next;
            slow=slow.next;
        }
        if(slow==null && prev==null)
            return true;
        return false;
    }
    
    public int getSize(ListNode node){
        int size=0;
        while(node!=null){
            size++;
            node=node.next;
        }
        return size;
        
    }
}
