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
    public boolean isBalanced(TreeNode root) {
        int[] x = bfs(root);
        return x[1] == 1 ? true: false;
    }

    int[] bfs(TreeNode root){
        if(root == null) return new int[] {0, 1};
        int[] ldep = bfs(root.left);
        int[] rdep = bfs(root.right);
        boolean isbalanced = false;
        if(Math.abs(ldep[0] - rdep[0]) <= 1 && ldep[1] == 1 && rdep[1] == 1) isbalanced = true;

        return new int[] {1 + Math.max(ldep[0] , rdep[0]), isbalanced ? 1 : 0};
    }
}
