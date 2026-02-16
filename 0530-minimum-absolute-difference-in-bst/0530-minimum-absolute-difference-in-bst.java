/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        int minDiff = Integer.MAX_VALUE;
        TreeNode prev = null;
        TreeNode curr = root;
        while(curr != null || !st.isEmpty()){
            while(curr!=null){
            st.push(curr);
            // prev = curr;
            curr = curr.left;
        }
        curr = st.pop();
        if(prev!=null){
        minDiff = (curr.val - prev.val)<minDiff?curr.val - prev.val:minDiff;
         }
         prev=curr;
          curr=curr.right;
        }
        return minDiff;
    }
}