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
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode d = new ListNode(-1);
        ListNode ans = d;
        int sum = 0, c = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += c;
            ans.next = new ListNode(sum % 10);
            c = sum / 10;
            sum = 0;
            ans = ans.next;
        }
        if (c > 0)
            ans.next = new ListNode(c);
        d = reverse(d.next);

        return d;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode revNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return revNode;
    }
}