/*
2341. Maximum Number of Pairs in Array

You are given a 0-indexed integer array nums. In one operation, you may do the following:

    Choose two integers in nums that are equal.
    Remove both integers from nums, forming a pair.

The operation is done on nums as many times as possible.

Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

class Solution2341 {
  public int[] numberOfPairs(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] response = new int[2];
    for (int i = 0; i < nums.length; i++) {
      Integer count = map.containsKey(nums[i]) ? map.get(nums[i]) : 0;
      map.put(nums[i], count + 1);
    }

    List<Integer> listKeys = new ArrayList<Integer>(map.values());
        
    for(int i = 0; i < listKeys.size(); i++){
      if (listKeys.get(i) % 2 != 0){
        response[1]++;
      }            
        
      response[0] += listKeys.get(i)/2;            
    }

    return response;
  }
}