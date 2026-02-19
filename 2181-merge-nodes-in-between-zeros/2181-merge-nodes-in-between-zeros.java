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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = new ListNode(-1);
        ListNode ans = curr;
        int sum = 0;
        boolean zero = false;
        while(head != null){
            if(head.val == 0){
                zero = !zero;
            }
            if(zero == true){
                sum+=head.val;
            }
            else{
                zero = !zero;
                curr.next = new ListNode(sum);
                sum = 0;
                curr = curr.next;
            }
            head=head.next;
        }
       return ans.next; 
    }
}