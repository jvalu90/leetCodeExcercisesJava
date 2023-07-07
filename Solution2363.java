/*
2363. Merge Similar Items

You are given two 2D integer arrays, items1 and items2, representing two sets of items. Each array items has the following properties:

    items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
    The value of each item in items is unique.

Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.

Note: ret should be returned in ascending order by value.
*/

import java.util.*;

class Solution2363 {
  public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
    List<List<Integer>> response = new ArrayList<>();
    int[] bucket = new int[1001];
    
    for (int[] item : items1) {
      bucket[item[0]] += item[1];
    }

    for (int[] item : items2) {
      bucket[item[0]] += item[1];
    }

    for (int i = 0; i < bucket.length; i++) {
      List<Integer> itemL = new ArrayList<>();
      if (bucket[i] != 0) {
        itemL.add(i);
        itemL.add(bucket[i]);
      }

      response.add(itemL);
    }

    return response;
  }

}