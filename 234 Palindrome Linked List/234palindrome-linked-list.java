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
    public boolean isPalindrome(ListNode head) {
        boolean flag = true;
        ListNode end = head;
        int len = 0;
        while (end != null) {
            end = end.next;
            len++;   
        }
        ListNode mid = head;
        int k = 0;
        while (k < len / 2) {
            mid = mid.next;
            k++;
        }
        // reverse later half of the linked list (well equate it then)
        ListNode prev = null;
        ListNode curr = mid;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //prev is now reverse of second half of ll
        //equate 
        ListNode start = head;
        for (int i = 0; i < len / 2; i++) {
            if (start.val != prev.val) {
                flag = false;
                break;

            }
            start = start.next;
            prev = prev.next;
        }
        return flag;


        
    }
}