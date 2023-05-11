/*
590. N-ary Tree Postorder Traversal

Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
*/

class Solution {
  public List<Integer> postorder(Node root) {
        return postorder(root, new ArrayList<>());
    }
  private List<Integer> postorder(Node curr, List<Integer> nodes) {
    if(curr == null) return nodes;
    
    for(Node node : curr.children) postorder(node, nodes);
    nodes.add(curr.val);
    
    return nodes;
  }
}