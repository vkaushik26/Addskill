/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        int count = 0,i = 0;
        
        if(head==null)
            return head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int[] nums = new int[count];
        temp = head;
        while(temp!=null){
            nums[i] = temp.val;
            temp = temp.next;
            i++;
        }
        temp = head;
        Arrays.sort(nums);
        i = 0;
        while(temp!=null){
            temp.val = nums[i];
            i++;
            temp = temp.next;
        }
        return head; 
    }
}
