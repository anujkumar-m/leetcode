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
        List<Integer> list = new ArrayList<>();
        int currVal = 0, maxCount=0,currCount=0;
    public int[] findMode(TreeNode root) {
        find(root);
        int[] ans = new int[list.size()];
        for(int i= 0 ;i< list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

    public void find(TreeNode root){
        if(root == null) return;
        find(root.left);
        currCount=(root.val==currVal)?currCount+1:1;
        if(maxCount<currCount){
            list.clear();
            list.add(root.val);
           // currVal=root.val;
        }
        else if(currCount == maxCount){
            list.add(root.val);
        }
        currVal = root.val;
        find(root.right);
    }
}