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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode res = head.next;
        ListNode temp = new ListNode(-1, head);
        while (temp.next != null && temp.next.next != null) {
            ListNode adj1 = temp.next;
            ListNode adj2 = adj1.next;

            adj1.next = adj2.next;
            adj2.next = adj1;
            temp.next = adj2;

            temp = adj1;
        }
        return res;

    }
}
