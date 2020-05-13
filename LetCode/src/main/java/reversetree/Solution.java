package reversetree;

public class Solution {
    private TreeNode tmp;

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null) {
            invertTree(root.right);
        }
        this.tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        return root;
    }

}