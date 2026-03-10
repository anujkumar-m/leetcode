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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        for(int i = 1; i< left; i++){
            prev= prev.next;
        }
         ListNode start = prev.next;
        ListNode ans = reverse(start,right - left + 1);

        prev.next = ans;
        return dummy.next;
    }

    public ListNode reverse(ListNode head,int index){
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode prev = null;
         while (index-- > 0 && curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = curr;
        return prev;
    }
}