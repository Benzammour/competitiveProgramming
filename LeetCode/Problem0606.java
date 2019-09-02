class Problem0606 {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        
        String res = t.val + "";
        
        if (t.left != null)
            res += "(" + tree2str(t.left) + ")";
        else if (t.right != null)    
            res += "()";
    
        if (t.right != null)
            res += "(" + tree2str(t.right) + ")";
        
        return res;
    }
}