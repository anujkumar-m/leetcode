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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr= curr.next;
            size++;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while(size >= k){
            ListNode start = prev.next;
            prev.next = reverse(start,k);
            prev = start;
            size -= k;
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode head,int index){
        ListNode curr = head;
        ListNode prev = null;

        while (index-- > 0 && curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = curr;
        return prev;
    }
}