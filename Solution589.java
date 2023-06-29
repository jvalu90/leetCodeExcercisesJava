/*
589. N-ary Tree Preorder Traversal

Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
*/

class Solution589 {
  public void req(Node root, List<Integer> tree)
    {
        tree.add(root.val);
        for (Node child : root.children)
        {
            if (child != null)
                req(child, tree);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> tree = new ArrayList<>();
        if (root != null) req(root, tree);
        return tree;
    }
}