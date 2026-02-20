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
    // int carry=0;
    public int getSize(ListNode head){
    ListNode curr = head;
    int count=0;
    while(curr != null){
        count++;
        curr = curr.next;
    }
    return count;
}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = getSize(l1);
        int len2 = getSize(l2);
        while(len1<len2){
            l1 = new ListNode(0,l1);
            len1++;
        }
        while(len2<len1){
            l2 = new ListNode(0,l2);
            len2++;
        }
        int carry[] = new int[1];
        ListNode ans = addNum(l1,l2,carry);
        return carry[0]>0? new ListNode(carry[0]  , ans): ans;
    }

    public ListNode addNum(ListNode l1, ListNode l2,int[] carry){
        if(l1 == null) return null;
        ListNode nextNode = addNum(l1.next,l2.next,carry);
        int total = l1.val+l2.val+carry[0];
        carry[0] = total/10;
        return new ListNode(total%10,nextNode);
    }


}