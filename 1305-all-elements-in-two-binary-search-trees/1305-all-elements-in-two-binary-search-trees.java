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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
       
        List<Integer> list = new ArrayList<>();
             
        
        traverse(root1 , list);
        traverse(root2 , list);
        Collections.sort(list);
        return list;
    }
    
    void traverse(TreeNode node , List<Integer> list)
    {
    
         if (node == null)
            return;
 
        // first recur on left subtree
        traverse(node.left , list);
 
        list.add(node.val);
        // then recur on right subtree
        traverse(node.right , list);
 
        // now deal with the node
        
       
    }
   
}