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
    int max = 0;
    public int maxDepth(TreeNode root) {
        int l = 0, r = 0;
        if(root == null) return 0;
        TreeNode temp = root;
        dfs(root, temp, 0);
        return max;
    }
    void dfs(TreeNode root,TreeNode temp, int depth){
        if(root == null) return;
        depth++;
        max = depth > max ? depth : max;
        dfs(root.left,temp, depth);
        if(temp == root) depth = 1;
        dfs(root.right,temp, depth);

    }
    
}
