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
        ListNode cur = new ListNode(-1);
        ListNode ans = cur;
        int carry = 0;
    int sum = 0;
        while(l1 != null  || l2 !=null){
                if(l1!=null){
                    sum= l1.val ;
                    l1 = l1.next;
                }
                if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
                }
                sum+=carry;
                carry=0;
                if(sum <= 9){
                    ans.next = new ListNode(sum);
                }
                else {
                    carry = sum/10;
                    sum = sum%10;
                    ans.next = new ListNode(sum);
                }
                ans = ans.next;
                sum = 0;
        }
       ans.next = carry==0?null:new ListNode(carry);
       return cur.next;
    }
}