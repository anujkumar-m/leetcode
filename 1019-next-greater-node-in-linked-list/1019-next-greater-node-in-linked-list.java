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
    public int[] nextLargerNodes(ListNode head) {
        int n = getSize(head);
        int []arr =new int[n];
        int  i =0;
        while(head!=null){
            arr[i++]= maxVal(head);
            head = head.next;
        }
        return arr;
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

    public int maxVal(ListNode head){
        int currVal = head.val;
        ListNode curr = head;
        while(curr!=null){
            if(currVal<curr.val){
                return curr.val;
            }
            else{
                curr=curr.next;
            }
        }
        return 0;
    }
}