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
    public ListNode swapNodes(ListNode head, int k) {
        int n = getSize(head);

        ListNode first = find(head,k);
        ListNode second = find(head,(n-k+1));
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
    public int getSize(ListNode head){
        ListNode curr = head;

        int count = 0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }
    public ListNode find(ListNode head,int k){
        ListNode curr = head;
        for(int i = 0;i < k-1 ;i++){
            curr = curr.next;
        }
        return curr;
    }
}