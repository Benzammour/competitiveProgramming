// Problem 701: Insert into a Binary Search Tree
public class Problem0701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        } else if (root.right != null && root.val < val) {
            insertIntoBST(root.right, val);
        } else if (root.left != null && root.val > val) {
            insertIntoBST(root.left, val);
        } else if (root.val < val) {
            root.right = new TreeNode(val);
            return root;
        } else if (root.val > val) {
            root.left = new TreeNode(val);
            return root;
        }
        
        return root;
    }
}