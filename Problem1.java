// Time Complexity: O(K)
// Space Complexity: O(1)
// Passed Leetcode

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
    public int kthSmallest(TreeNode root, int k) {
        
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        stack.add(root);
        int count = 0;
        while (stack.size() > 0)
        {
            TreeNode node = stack.get(stack.size() - 1);
            
            if (node.left != null)
            {
                stack.add(node.left);
                node.left = null;
            } else {
                stack.removeLast();
                count++;
                if (count == k) 
                    return node.val;
                
                if (node.right != null)
                {
                    stack.add(node.right);
                    node.right = null;
                    
                }
            }
            
            
            
        }
        return -1;
        
    }
}