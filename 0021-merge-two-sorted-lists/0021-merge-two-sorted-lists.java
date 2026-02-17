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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode cur1= list1;
        ListNode cur2= list2;
        ListNode head=null;
        ListNode tail=null;
        if(cur1.val<=cur2.val) {
            head=cur1;
            tail=cur1;
            cur1 = cur1.next;
            }
        else {
            head=cur2;
            tail=cur2;
            cur2 = cur2.next;
        }
        while(cur1!=null && cur2!=null){
                if(cur1.val<=cur2.val){
                    tail.next=cur1;
                    tail=tail.next;
                    cur1=cur1.next;
                }
            else{
                    tail.next=cur2;
                    tail=tail.next;
                    cur2=cur2.next;
            }
        }
        if(cur1!=null) tail.next=cur1;
        if(cur2!=null) tail.next=cur2;
        
        return head;
    }
}