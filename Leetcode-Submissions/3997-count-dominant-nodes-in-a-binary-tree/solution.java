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
    int answer = 0;
    public int countDominantNodes(TreeNode root) {
        TreeNode  dummy = root;
        dfs(dummy);
        return answer;
    }
    private int dfs(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int mL = dfs(root.left);
        int mR = dfs(root.right);
        int rMax = Math.max(root.val, Math.max(mL, mR));

        if(rMax == root.val) answer++;
        return rMax;
    }
}
