/*
226. Invert Binary Tree

Given the root of a binary tree, invert the tree, and return its root.
*/

class Solution226 {
  public TreeNode invertTree(TreeNode root) {
    if(root==null) return root;
    
    invertTree(root.right);
    invertTree(root.left);
    
    TreeNode temp=root.left;
    root.left=root.right;
    root.right=temp;
    return root;
  }
}