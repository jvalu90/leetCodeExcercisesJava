/*
2215. Find the Difference of Two Arrays

Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

    answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
    answer[1] is a list of all distinct integers in nums2 which are not present in nums1.

Note that the integers in the lists may be returned in any order.
*/

import java.util.*;

class Solution2215 {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<Integer> ans1 = new ArrayList<Integer>();
    List<Integer> ans2 = new ArrayList<Integer>();
    Set<Integer> set1 = new HashSet<Integer>();
    Set<Integer> set2 = new HashSet<Integer>();        
        
    for(int n : nums1) set1.add(n);
    for(int n : nums2) set2.add(n);
    
    for (int n : set1){
      if(!set2.contains(n)){
        ans1.add(n);
      }
    }
    
    for (int n : set2){
      if(!set1.contains(n)){
        ans2.add(n);
      }
    }

    return List.of(ans1, ans2);
  }
}