/*
2610. Convert an Array Into a 2D Array With Conditions

You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

    The 2D array should contain only the elements of the array nums.
    Each row in the 2D array contains distinct integers.
    The number of rows in the 2D array should be minimal.

Return the resulting array. If there are multiple answers, return any of them.

Note that the 2D array can have a different number of elements on each row.
*/

class Solution2610 {
  public List<List<Integer>> findMatrix(int[] v) {
    Map<Integer, Integer> um = new HashMap<>();
    for (int i : v) {
      um.put(i, um.getOrDefault(i, 0) + 1);
    }

    List<List<Integer>> ans = new ArrayList<>();
    while (!um.isEmpty()) {
      List<Integer> temp = new ArrayList<>();
      List<Integer> toErase = new ArrayList<>();
      for (Map.Entry<Integer, Integer> entry : um.entrySet()) {
        int f = entry.getKey();
        int s = entry.getValue();
        temp.add(f);
        s--;
        if (s == 0) {
          toErase.add(f);
        }

        um.put(f, s);
      }

      ans.add(temp);
      for (int i : toErase) {
        um.remove(i);
      }
    }

    return ans;
  }
}