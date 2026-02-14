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
    Map<Integer,Integer> map = new HashMap<>();
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ; i < preorder.length; i++){
            map.put(inorder[i],i);
        }
            return inTree(preorder,0,preorder.length-1);
    }
    public TreeNode inTree(int[] preorder,int start,int end){
        if(start>end) return null;
        int preValue = preorder[preIndex++];
        int index = map.get(preValue);
        TreeNode root = new TreeNode(preValue);
        root.left = inTree(preorder,start,index-1);
        root.right = inTree(preorder,index+1,end);
    return root;
    }
}