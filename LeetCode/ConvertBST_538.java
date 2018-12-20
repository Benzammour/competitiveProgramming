// #######################################
// Still buggy.
// #######################################
class ConvertBST_538 {
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            Integer tempLeft = null;
            Integer tempRight = null;
            Integer tempRoot = root.val;
            
            if (root.left != null) {
                tempLeft = root.left.val;
                
                if (tempRoot > tempLeft) {
                    root.left.val += tempRoot;
                } else if (tempRoot < tempLeft) {
                    root.val += tempLeft;
                }
            }
            
            if (root.right != null) {
                tempRight = root.right.val;
                
                if (tempRoot > tempRight) {
                    root.right.val += tempRoot;
                } else if (tempRoot < tempRight) {
                    root.val += tempRight;
                }
            }
            
            if (root.left != null && root.right != null) {
                if (tempLeft > tempRight) {
                    root.right.val += tempLeft;
                } else if (tempLeft < tempRight) {
                    root.left.val += tempRight;
                }
            }
        }
        
        if (root.left != null) {
            convertBST(root.left);
        }
        
        if (root.right != null) {
            convertBST(root.right);
        }
        return root;
    }
}