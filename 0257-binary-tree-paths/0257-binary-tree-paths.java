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
    List<String> lst = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        path(root,"");
        return lst;
    }
    public void path(TreeNode root,String str){
        if(root.left == null && root.right == null) lst.add(str+root.val);
        //if(root.left == null || root.right == null) return;
        if(root.left!=null)path(root.left,str+root.val+"->");
        if(root.right!=null)path(root.right,str+root.val+"->");
    }
}