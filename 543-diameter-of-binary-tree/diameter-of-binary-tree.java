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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        calcDepth(root);
        return max;
    }

    public int calcDepth(TreeNode root){
        if(root == null)
            return 0;
        int l = calcDepth(root.left);
        int r = calcDepth(root.right);

        max = Math.max(max, l+r);
        return 1 + Math.max(l, r);
    }
}