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
        if(head == null || head.next == null ) return null;
        int count = 0;
        int k = getSize(head);
        if(k==n)return head.next;
        ListNode curr = head;
        while(count != k-n-1){
            curr = curr.next;
            count++;
        }
        curr.next = curr.next.next;
        return head;
    }
    public int getSize(ListNode head){
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr=curr.next;
        }
        return count;
    }
}