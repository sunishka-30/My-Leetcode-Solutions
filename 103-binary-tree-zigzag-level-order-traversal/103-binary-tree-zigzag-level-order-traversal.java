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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty())
        {
            List<Integer> res = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                 if(q.peek().right!=null)
                    q.add(q.peek().right);
                if(flag==true)
                {
                    res.add(q.poll().val);
                }
                else{
                    res.add(0,q.poll().val);
                }
                
            }
            
            flag=!flag;
            ans.add(res);
        }
        
        return ans;
    }
}