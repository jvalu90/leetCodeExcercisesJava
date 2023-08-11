/*
1207. Unique Number of Occurrences

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
*/

import java.util.*;

class Solution1207 {
  public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map = fillMap(arr, map);    
    HashSet<Integer> set = new HashSet<>();
    
    for (Integer value : map.values()) {
      if (set.contains(value)) return false;
      set.add(value);
    }

    return true;
  }

  private HashMap<Integer, Integer> fillMap(int[] arr, HashMap<Integer, Integer> map) {
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }

    return map;
  }
}