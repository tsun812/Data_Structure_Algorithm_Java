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
//O(n) time and space, worst case for space is each node only has left or right child.
 //iterative solution
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> store = new Stack();
        ArrayList<Integer> res = new ArrayList();
        TreeNode prev = null;
        if(root == null)return res;
        while(root != null || store.size() > 0){
            while(root!= null){
                store.push(root);
                root = root.left;
            }
            root = store.pop();
            //prev 是上一个迭达打印的值
            if(root.right == null || root.right == prev){
                res.add(root.val);
                prev = root;
                root = null;
            }
            else{
                store.push(root);
                root = root.right;
            }
        }
           return res;
    }
     
}