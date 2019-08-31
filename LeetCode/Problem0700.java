// Problem 700: Search in a Binary Search Tree
public class Problem0700 {
	public TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val) {            
            return root;
        }
        if (root.val < val && root.right != null) {
            return searchBST(root.right, val);
        }
        if (root.left != null) { // root.val > val
            return searchBST(root.left, val);
        }
        
        return null;
    }
}
