/*
2418. Sort the People

You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.
*/
import java.util.*;

class Solution2418 {
  public String[] sortPeople(String[] names, int[] heights) {
    Map<Integer, String> map = new HashMap<>();
    String[] res = new String[heights.length];
    int i=0;
    
    while(map.size() < heights.length){
      if(!map.containsKey(heights[i])){
        map.put(heights[i],names[i]);
      }
            i++;
    }
    
    Arrays.sort(heights);
    for(int j=heights.length-1;j>=0;j--){
      res[j] = map.get(heights[heights.length-j-1]);
    }
    
    return res;
  }
}