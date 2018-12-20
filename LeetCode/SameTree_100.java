package leetcode;

import utility.TreeNode;

import java.util.ArrayList;

public class SameTree_100 {
    private ArrayList<Integer> pTree = new ArrayList<>();
    private ArrayList<Integer> qTree = new ArrayList<>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p, pTree);
        traverse(q, qTree);
        return pTree.equals(qTree);
    }

    private void traverse(TreeNode t, ArrayList<Integer> list) {
        if(t !=  null) {
            list.add(t.val);
            traverse(t.left, list);
            traverse(t.right, list);
        } else {
            list.add(null);
        }
    }
}
