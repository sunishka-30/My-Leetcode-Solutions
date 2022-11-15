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
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        int left = getLeftHt(root);
        int right = getRightHt(root);
        
        if(left==right) return ((1<<left) - 1);
        
        else return 1 + countNodes(root.left) + countNodes(root.right);
    }
    static int getLeftHt(TreeNode root)
    {   int ht = 0;
        while(root!=null)
        { ht++;
          root = root.left;
            
        }
     return ht;
    }
     static int getRightHt(TreeNode root)
    {   int ht = 0;
        while(root!=null)
        { ht++;
          root = root.right;
            
        }
     return ht;
    }
}