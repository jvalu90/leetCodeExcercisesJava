/*
1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree

Given two binary trees original and cloned and given a reference to a node target in the original tree.

The cloned tree is a copy of the original tree.

Return a reference to the same node in the cloned tree.

Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.
*/

class Solution1379 {
    TreeNode res;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original != null){
            getTargetCopy(original.left, cloned.left, target);
            if(original == target){
                res = cloned;
            }
            getTargetCopy(original.right, cloned.right, target);
        }
        return res;
    }
}