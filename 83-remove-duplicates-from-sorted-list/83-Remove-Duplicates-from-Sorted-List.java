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
        if(head == null) return null;
        ListNode crr = head;
        while(crr.next != null){
            if(crr.val == crr.next.val) {
                crr.next = crr.next.next;
                continue;}
            crr = crr.next;
        }
        return head;
    }
}