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
    public TreeNode invertTree(TreeNode root) {
        
        //recursive solution
        
//         if(root == null)
//             return null;
        
//         TreeNode temp = root.left;
//         root.left = root.right;
//         root.right = temp;
        
//         invertTree(root.left);
//         invertTree(root.right);
        
//         return root;
        
        //Iterative solution
        if(root == null)
            return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            TreeNode queueNode = queue.poll();
            TreeNode temp = queueNode.left;
            queueNode.left = queueNode.right;
            queueNode.right = temp;
            
            if(queueNode.left!=null)
                queue.add(queueNode.left);
            if(queueNode.right != null)
                queue.add(queueNode.right);
            
        }
        
        return root;
    }
}
