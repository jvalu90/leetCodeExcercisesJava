/*
637. Average of Levels in Binary Tree

Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted. 
*/

class Solution {
  public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
       Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
           double avg=0l;
            for(int i=0;i<n;i++){
                 TreeNode curr=q.poll();
                avg=avg+(double)curr.val;
                if(curr.left!=null){q.add(curr.left);}
                if(curr.right!=null){q.add(curr.right);}
            }
            avg=avg/n;
            ans.add(avg);
        }
       return ans; 
    }
}