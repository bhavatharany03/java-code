package Leetcode75;

public class searchinBST {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        // Value is greater than root's value, search in the right subtree
        if (root.val < val) {
            return searchBST(root.right, val);
        }

        // Value is less than root's value, search in the left subtree
        return searchBST(root.left, val);
    }
}

