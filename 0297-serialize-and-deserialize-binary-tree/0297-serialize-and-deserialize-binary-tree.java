/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder serial = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                serial.append("null ");
                continue;
            }

            serial.append(curr.val).append(" ");

            queue.offer(curr.left);
            queue.offer(curr.right);
        }
        return serial.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0)
            return null;
        String temp[] = data.split(" ");
        if (temp[0].equals("null"))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(temp[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < temp.length) {
            TreeNode curr = queue.poll();
            if (!temp[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(temp[i]));
                queue.offer(curr.left);
            }
            i++;
            if (i < temp.length && !temp[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(temp[i]));
                queue.offer(curr.right);
            }
            i++;
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));