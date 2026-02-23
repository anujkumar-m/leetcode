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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootSerialization= seralize(root);
        String subRootSerialization= seralize(subRoot);
        return rootSerialization.contains(subRootSerialization);
        
    }
    public String seralize(TreeNode root){
        if(root == null) return "N";
        return "(" + root.val + ","+seralize(root.left)+","+seralize(root.right)+")" ;
        }
}