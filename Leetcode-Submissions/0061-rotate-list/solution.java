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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        
        int n = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            n++;
        }

        if(k % n == 0) return head;
        int i = n - k % n;
        
        //make it circular
        tail.next = head;

        // find new tail
        for(int j = 0; j < i - 1; j++){
            head = head.next;
        }
        ListNode newHead = head.next;
        head.next = null;

        return newHead;
        
    }
}
