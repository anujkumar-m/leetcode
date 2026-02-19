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
    public void reorderList(ListNode head) {
        ListNode mid = middle(head);
        ListNode start = head;
        ListNode temp = head;
        ListNode firstHalf = head;
        ListNode secondHalf = reverse(mid.next);
        mid.next = null;

        while (firstHalf != null && secondHalf != null) {
            ListNode fNext = firstHalf.next;
            ListNode sNext = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = fNext;

            firstHalf = fNext;
            secondHalf = sNext;
        }
    }
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
    if(head == null  || head.next == null) return head;
    ListNode revNode = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return revNode;
}
}