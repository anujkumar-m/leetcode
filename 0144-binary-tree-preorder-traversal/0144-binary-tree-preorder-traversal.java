
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }
    void preOrder(TreeNode curr){
        if(curr == null) return;
        list.add(curr.val);
        preOrder(curr.left);
        preOrder(curr.right);
    }
}