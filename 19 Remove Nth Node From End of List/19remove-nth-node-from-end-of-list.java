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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        temp = head;
        int currindex = 0;
        if(len == n) return head.next;
        while (temp!=null) {
            if(currindex == len - n - 1) {
                temp.next = temp.next.next;
                break;


            }
            currindex++;
            temp = temp.next;
        }
        return head;
        
    }
}