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
    int maxSum = -1001;
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        maxSum = root.val;
        int val = find_maxSum(root);
        return maxSum;
    }

    int find_maxSum(TreeNode root){
        if(root == null) return 0;
        int lsum = find_maxSum(root.left);
        int rsum = find_maxSum(root.right);
        maxSum = Math.max(lsum, 0) + Math.max(rsum, 0) + root.val > maxSum ? Math.max(lsum, 0) + Math.max(rsum, 0) + root.val : maxSum;
        return Math.max(Math.max(lsum + root.val, rsum + root.val), root.val);
    }
}
