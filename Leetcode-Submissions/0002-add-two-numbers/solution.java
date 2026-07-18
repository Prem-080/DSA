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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp1 = l1, temp2 = l2;
        int sum = temp1.val + temp2.val;
        temp1 = temp1.next;
        temp2 = temp2.next;

        ListNode res = new ListNode(sum % 10);
        carry = sum / 10;

        ListNode dummy = res;
        while (temp1 != null || temp2 != null) {

            if (temp1 != null && temp2 != null) {

                sum = temp1.val + temp2.val + carry;
                temp1 = temp1.next;
                temp2 = temp2.next;
                res.next = new ListNode(sum % 10);
                carry = sum / 10;
                res = res.next;
                // System.out.println(sum % 10);
            } else {
                if (temp1 == null) {
                    //add temp2 values;
                    sum = temp2.val + carry;
                    temp2 = temp2.next;
                    res.next = new ListNode(sum % 10);
                    carry = sum / 10;
                    res = res.next;
                    // System.out.println(sum % 10);
                } else {
                    //add temp1 values;
                    sum = temp1.val + carry;
                    temp1 = temp1.next;
                    res.next = new ListNode(sum % 10);
                    carry = sum / 10;
                    res = res.next;
                    // System.out.println(sum % 10);
                }
            }
        }
        if(carry > 0){
            res.next = new ListNode(carry);
        }
        return dummy;
    }
}
