
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
 //O(n) time and space, worst case for space is 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> store = new Stack<TreeNode>();
        ArrayList<Integer> res = new ArrayList();
        if(root == null)return res;
        store.push(root);
        while(store.size()>0){
            TreeNode curr = store.pop();
            if(curr == null)continue;
            res.add(curr.val);
            store.push(curr.right);
            store.push(curr.left);
        }
        return res;
    }
}