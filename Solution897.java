/*
897. Increasing Order Search Tree

Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
*/

class Solution897 {
  public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

  private TreeNode increasingBST(TreeNode root, TreeNode tail) {
    if (root == null) return tail;
    TreeNode res = increasingBST(root.left, root);
    root.left = null;
    root.right = increasingBST(root.right, tail);
    return res;
  }
}