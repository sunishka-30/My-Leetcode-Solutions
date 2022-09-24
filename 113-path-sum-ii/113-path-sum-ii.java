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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root,targetSum,ans,new ArrayList<>());
        return ans;
    }
    
    void dfs(TreeNode root, int sum, List<List<Integer>> ans,List<Integer> res )
    {
        if(root==null)
            return;
        res.add(root.val);
    
        
        if(root.left==null && root.right==null)
        {
            if(sum==root.val)
            ans.add(new ArrayList<>(res));
            return;
        }
        
        if(root.left!=null)
        {
            dfs(root.left,sum-root.val,ans,res);
            res.remove(res.size()-1);
        }
        
        if(root.right!=null){
        dfs(root.right, sum-root.val,ans,res);
        res.remove(res.size()-1);
        }
        
    }
}