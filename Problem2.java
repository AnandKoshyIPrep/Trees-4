// Time Complexity: O(M) M is the ancestor
// Space Complexity: O(1)
// Passed Leetcode

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode prev = root;
        TreeNode root1 = root;
        while (root1 == root)
        {
            prev = root;
            if (p.val == root.val || q.val == root1.val)
                return prev;
            if (p.val < root.val)
                root = root.left;
            else 
                root = root.right;
            
            if (q.val < root1.val)
                root1 = root1.left;
            else
                root1 = root1.right;
        }
        
        return prev;
    }
}