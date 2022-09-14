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
    int ans=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[]freq = new int[10];
        cntPalin(root,freq);
        return ans;
    }
    
    void cntPalin(TreeNode root, int[]freq)
    {
        if(root==null)
            return;
        freq[root.val]+=1;
        if(root.left==null && root.right==null)
        {
            if(isPalin(freq))
                ans++;
        }
        
        cntPalin(root.left,freq);
        cntPalin(root.right,freq);
        freq[root.val]-=1;
    }
    
    boolean isPalin(int[]freq)
    {
        int oddFreq=0;
        for(int i=0;i<=9;i++)
        {
            if(freq[i]%2!=0)
                oddFreq++;
            if(oddFreq>1)
                return false;
        }
        return true;
    }
}
